package Refactoring.Challange;
import java.util.List;
import java.util.Scanner;

public class Kiosk {

    private List<Menu> menu;
    private int currentMenu;
    private int currentItem;
    private final Scanner sc;
    private final Cart cart;

    public Kiosk(List<Menu> menu) {
        this.menu = menu;
        this.sc = new Scanner(System.in);
        this.cart = Cart.instance();
    }

    public void start() {
        System.out.println("Starting Kiosk");

        while (true) {
            displayMenu(); //카테고리의 목록을 출력합니다.

            if (cartHasItems()) { //카트에 menuitem이 있다면, 주문 목록을 출력합니다.
                Display.printOrderMenu(menu.size() + 1, menu.size() + 2);
            }

            currentMenu = sc.next().charAt(0) - '0';
            if (isExit(currentMenu)) {
                return;
            }//돌아가기에 해당하는 숫자가 입력됐을 시, return

            if (!isValidMenuSelection(currentMenu)) {
                continue;
            } //범위 외 숫자가 입력됐을 시, 건너뛰기

            handleMenuSelection();
        }
    }


    private void displayMenu() {
        Display.drawLine();
        Display.printMenu(menu);
        Display.drawLine();
    }

    private boolean cartHasItems() {
        return cart.count() > 0;
    }

    private boolean isExit(int selection) {
        return selection == 0;
    }

    private boolean isValidMenuSelection(int selection) {
        return selection > 0 && selection <= menu.size() + (cartHasItems() ? 2 : 0);
    }

    private void handleMenuSelection() {

        if (currentMenu <= menu.size()) {
            displayItems();
        } else if (currentMenu == menu.size() + 1) {
            handleCart();
        } else {
            cart.clear();


        }
    }

    private void displayItems() {
        Display.drawLine();
        Display.printItems(menu.get(currentMenu - 1).items());
        System.out.println("0. Back");
        Display.drawLine();
        currentItem = sc.nextInt();

        if (currentItem == 0) return;

        if (isValidItemSelection(currentItem)) {
            Display.printItem(menu.get(currentMenu - 1).getItemById(currentItem));
            if (confirmAddToCart()) {
                cart.add2Cart(menu.get(currentMenu - 1).getItemById(currentItem));
            }
        }
    }

    private boolean isValidItemSelection(int itemSelection) {
        return itemSelection > 0 && itemSelection <= menu.get(currentMenu - 1).items().size();
    }

    private boolean confirmAddToCart() {
        System.out.println("Add to cart? 1. Yes 2. No");
        return sc.nextInt() == 1;
    }

    private void handleCart() {
        Display.printPurchase(cart.getCartItems(), cart.getTotal());

        currentItem = sc.next().charAt(0) - '0';
        if (currentItem == 1) {
            Display.discountMenu();
            currentItem = sc.next().charAt(0) - '0';

            if (isValidDiscountSelection(currentItem)) {
                Display.completePurchase(cart.getDiscountedPrice(Discount.getRateByOption(currentItem)));
                cart.clear();
            }
        }
    }

    private boolean isValidDiscountSelection(int discountSelection) {
        return discountSelection > 0 && discountSelection <= Discount.values().length;
    }
}

