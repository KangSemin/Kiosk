package Refactoring.Challange;

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

    public static void printMenu(List<Menu> menu) {
        int i = 0;
        for (Menu m : menu) {
            System.out.printf("%d. ", ++i);
            coloredPrint(m.category().name(), Color.GREEN);
            System.out.println();
        }
        coloredPrint("0. Exit\n", Color.RED);
    }

    public static void printItems(List<MenuItem> menu) {
        int c = 1;
        for (MenuItem item : menu) {
            System.out.printf("%d. ", c++);
            coloredPrint(item.getName(), Color.GREEN);
            printPriceAndDescription(item);
        }
    }

    public static void printItem(MenuItem item) {
        drawLine();
        coloredPrint("Selected Item: ", Color.BLUE);
        coloredPrint(item.getName(), Color.GREEN);
        printPriceAndDescription(item);
        drawLine();
        coloredPrint("Would you like to add this item to the cart?\n", Color.YELLOW);
        yesOrNo();
    }

    public static void printOrderMenu(int a, int b) {
        coloredPrint(a + ". Orders    ", Color.GREEN);
        drawPartition();
        coloredPrint("Check the cart and proceed with the order.", Color.YELLOW);
        System.out.println();
        coloredPrint(b + ". Cancel    ", Color.GREEN);
        drawPartition();
        coloredPrint("Cancel the ongoing order.\n", Color.YELLOW);
        drawLine();
    }

    public static void printPurchase(List<MenuItem> menus, float price) {
        drawLine();
        coloredPrint("[ Orders ]", Color.PURPLE);
        System.out.println();
        printItems(menus);
        drawLine();
        coloredPrint("[ Total ]", Color.PURPLE);
        System.out.println();
        coloredPrint("W ", Color.YELLOW);
        coloredPrint(String.valueOf(price), Color.GREEN);
        System.out.println();
        drawLine();
        coloredPrint("Do you want to confirm the order?", Color.RED);
        System.out.println();
        drawLine();
        yesOrNo();
    }

    public static void discountMenu() {
        int i = 1;
        drawLine();
        coloredPrint("Please enter discount information.", Color.PURPLE);
        System.out.println();
        drawLine();
        for (Discount discount : Discount.values()) {
            coloredPrint(i++ + ". " + discount.name(), Color.GREEN);
            printDiscountRate(discount);
        }
        drawLine();
    }

    public static void completePurchase(float price) {
        coloredPrint("The order is complete.", Color.PURPLE);
        System.out.print("Total amount: W ");
        coloredPrint(String.valueOf(price), Color.YELLOW);
        System.out.println(".");
    }

    public static void yesOrNo() {
        coloredPrint("1. Confirm ", Color.BLUE);
        drawPartition();
        coloredPrint("2. Cancel ", Color.RED);
        System.out.println();
        drawLine();
    }

    public static void drawLine() {
        coloredPrint("===========================================================================", Color.CYAN);
        System.out.println();
    }

    private static void drawPartition() {
        coloredPrint("|", Color.CYAN);
    }

    private static void coloredPrint(String text, Color color) {
        System.out.printf("%s%s%s ", color.code, text, Color.RESET.code);

    }

    private static void printPriceAndDescription(MenuItem item) {
        for (int i = 0; i < 15 - item.getName().length(); i++) System.out.print(" ");
        drawPartition();
        System.out.print("W ");
        coloredPrint(String.valueOf(item.getPrice()), Color.PURPLE);
        drawPartition();
        coloredPrint(item.getDescription(), Color.YELLOW);
        System.out.println();
    }

    private static void printDiscountRate(Discount discount) {
        for (int j = 0; j < 10 - discount.name().length(); j++) System.out.print(" ");
        drawPartition();
        coloredPrint(discount.getRate() * 100 + "%", Color.RED);
        System.out.println();
    }
}
