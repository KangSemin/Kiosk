package Level5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {

    private List<Menu> menu;
    private int currentMenu;
    private int currentItem;

    Scanner sc = new Scanner(System.in);

    public Kiosk(List<Menu> menu) {
        this.menu = menu;
    }

    public void Start() {
        MenuItem item = null;
        System.out.printf("Starting Kiosk\n");

        do {

            displayMenu();

            currentMenu = sc.nextInt();
            if (currentMenu == 0) return;
            else if (!(currentMenu <= menu.size() && currentMenu > 0)) continue;

            displayItem();

            currentItem = sc.nextInt();
            if (!(currentItem > 0 && currentItem <= menu.get(currentMenu-1).getItems().size())) continue;
            else Display.printItem(menu.get(currentMenu-1).getItemById(currentItem));


        } while(true);

    }

    private void displayMenu() {
        Display.drawLine();
        Display.printMenu(menu);
        System.out.printf("0. exit\n");
        Display.drawLine();
    }

    private void displayItem() {
        Display.drawLine();
        Display.printItems(menu.get(currentMenu - 1).getItems());
        System.out.printf("0. back\n");
        Display.drawLine();
    }
}
