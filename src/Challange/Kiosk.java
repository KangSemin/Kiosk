package Challange;

import java.util.List;
import java.util.Scanner;

public class Kiosk {

    private List<Menu> menu;
    private int currentMenu;
    private int currentItem;


    Scanner sc = new Scanner(System.in);
    Cart cart = Cart.instance();

    public Kiosk(List<Menu> menu) {
        this.menu = menu;
    }

    public void Start() {
        MenuItem item = null;
        System.out.printf("Starting Kiosk\n");

        do {

            displayMenu();

            //cart에 메뉴가 있을 경우, ordermenu 출력
            if(cart.count()>0)
                Display.printOrderMenu(menu.size()+1,menu.size()+2);

            currentMenu = sc.nextInt();

            if (currentMenu == 0) return;
            else if (!(currentMenu <= menu.size()+(cart.count()>0?2:0) && currentMenu > 0)) continue;
            //입력값이 허용 범위 외에 있을 경우 continue


            if(currentMenu <=menu.size()) //메뉴 선택
                displayItems();
            else if(currentMenu == menu.size()+1) // 카트 확인
            {   //주문 화면 출력
                Display.printPurchase(cart.getCartItems(),cart.getTotal());
                currentItem = sc.nextInt();
                if(currentItem !=1) continue;
                else Display.discountMenu();

                currentItem = sc.nextInt();
                if(currentItem > Discount.values().length || currentItem<=0 ) continue;
                Display.completeParchase( cart.getDiscountedPrice(Discount.getRateInOrdinal(currentItem)) );
                return;
            }
            else cart.clear(); // 주문 취소

            currentItem = sc.nextInt();
            if (!(currentItem > 0 && currentItem <= menu.get(currentMenu-1).getItems().size())) continue;
            else Display.printItem(menu.get(currentMenu-1).getItemById(currentItem));

            if(sc.nextInt()==1) cart.add2Cart(menu.get(currentMenu-1).getItemById(currentItem));


        } while(true);

    }

    private void displayMenu() {
        Display.drawLine();
        Display.printMenu(menu);
        Display.drawLine();
    }

    private void displayItems() {
        Display.drawLine();
        Display.printItems(menu.get(currentMenu - 1).getItems());
        System.out.printf("0. back\n");
        Display.drawLine();
    }
}
