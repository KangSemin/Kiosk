package Challange;

import java.util.List;

public class Display {

    //색ㅅ깔
    private enum Color {
        BLACK("\u001B[30m"),
        BLUE("\u001B[34m"),
        CYAN("\u001B[36m"),
        GREEN("\u001B[32m"),
        PURPLE("\u001B[35m"),
        RED("\u001B[31m"),
        RESET("\u001B[0m"),
        WHITE("\u001B[37m"),
        YELLOW("\u001B[33m");

        private final String code;

        Color(String code) {
            this.code = code;
        }
    }


    public static void printMenu(List<Menu> menu)
    {
        int i = 0;

        for (Menu m : menu) {
            System.out.printf("%d. ", ++i);
            coloredPrint(m.getCategory().name(), Color.GREEN);
            System.out.printf("\n");
        }
        coloredPrint("0. exit\n",Color.RED);
    }

    public static void printItems(List<MenuItem> menu)
    {
        int c=1;
        for(MenuItem item : menu) {

            System.out.printf("%d. ",c++);
            coloredPrint(item.getName(), Color.GREEN);
            for (int i = 0; i < 15 - item.getName().length(); i++) System.out.printf(" ");
            drawPartition();
            System.out.printf("W ");
            coloredPrint(String.valueOf(item.getPrice()), Color.PURPLE);
            drawPartition();
            coloredPrint(item.getDescription(), Color.YELLOW);
            System.out.printf("\n");
        }
    }

    public static void printItem(MenuItem item)
    {
        drawLine();
        coloredPrint("선택한 메뉴 : ",Color.BLUE);
        coloredPrint(item.getName(), Color.GREEN);
        drawPartition();
        System.out.printf("W ");
        coloredPrint(String.valueOf(item.getPrice()), Color.PURPLE);
        drawPartition();
        coloredPrint(item.getDescription(), Color.YELLOW);
        System.out.printf("\n");
        drawLine();
        coloredPrint("위 메뉴를 카트에 담으시겠습니까?\n",Color.YELLOW);
        yesOrNo();
    }

    public static void printOrderMenu(int a,int b)
    {

        coloredPrint(a +". Orders    ",Color.GREEN);
        drawPartition();
        coloredPrint("장바구니를 확인 후 주문합니다.",Color.YELLOW);
        System.out.println();
        coloredPrint(b+". Cancel    ",Color.GREEN);
        drawPartition();
        coloredPrint("진행중인 주문을 취소합니다.\n",Color.YELLOW);
        drawLine();

    }

    public static void printPurchase(List<MenuItem> menus,float price)
    {
        drawLine();
        coloredPrint("[ Orders ]",Color.PURPLE);
        System.out.println();

        printItems(menus);
        drawLine();
        coloredPrint("[ Total ]",Color.PURPLE);
        System.out.println();

        coloredPrint("W ",Color.YELLOW);
        coloredPrint(price+"",Color.GREEN);
        System.out.println();
        drawLine();
        coloredPrint("위와 같이 주문하시겠습니까?",Color.RED);
        System.out.println();
        drawLine();
        yesOrNo();
    }

    public static void discountMenu()
    {
        int i=1;
        drawLine();
        coloredPrint("할인 정보를 입력해주세요.",Color.PURPLE);
        System.out.println();
        drawLine();
        for (Discount discount : Discount.values()) {

            coloredPrint(i++ +". "+ discount.name(),Color.GREEN);
            for(int j=0;j<10-discount.name().length();j++) System.out.printf(" ");
            drawPartition();
            coloredPrint(discount.getRate() * 100+"%",Color.RED );
            System.out.println();

        }
        drawLine();
    }

    public static void completeParchase(float price)
    {
        coloredPrint("주문이 완료되었습니다. ",Color.PURPLE);

        System.out.print("금액은 W ");
        coloredPrint(String.valueOf(price), Color.YELLOW);
        System.out.println("입니다.");

    }

    public static void yesOrNo()
    {
        coloredPrint("1. 확인 ",Color.BLUE);
        drawPartition();
        coloredPrint("2. 취소 ",Color.RED);
        System.out.println();
        drawLine();
    }

    public static void drawLine()
    {
        coloredPrint("===========================================================================",Color.CYAN);
        System.out.println();
    }

    private static void drawPartition()
    {
        coloredPrint("|",Color.CYAN);
    }

    private static void coloredPrint(String text, Color color)
    {
        System.out.printf("%s%s%s ",color.code,text,Color.RESET.code);
    }

}
