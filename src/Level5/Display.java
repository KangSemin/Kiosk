package Level5;
import java.util.List;

public class Display {

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
            coloredPrint(m.getCategory(), Color.GREEN);
            System.out.printf("\n");
        }
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
    }


    public static void drawLine()
    {
        coloredPrint("===========================================================================",Color.CYAN);
        System.out.printf("\n");
    }

    private static void drawPartition()
    {
        coloredPrint("|",Color.RED);
    }
    private static void coloredPrint(String text, Color color)
    {
        System.out.printf("%s%s%s ",color.code,text,Color.RESET.code);

    }

}
