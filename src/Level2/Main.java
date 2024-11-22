package Level2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        List<MenuItem> menu = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        menu.add(new MenuItem("ShackBurger", 6.9f, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menu.add(new MenuItem("ShackBurger2", 6.9f, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menu.add(new MenuItem("ShackBurger3", 6.9f, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menu.add(new MenuItem("ShackBurger4", 6.9f, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));

        while (true) {

            int i = 1;

            System.out.println("[ SHAKESHACK MENU ]");
            for (MenuItem item : menu) {
                System.out.printf("%d. %-15s | %f | %s \n", i++, item.getName(), item.getPrice(), item.getDescription());
            }
            System.out.println("0. EXIT");

            int a = sc.nextInt();

            if (a == 0) break;
            else if (a <= menu.size())
            {
                System.out.printf("\u001B[34m선택한 메뉴: %-10s | %f | %-30s \n", menu.get(a - 1).getName(), menu.get(a - 1).getPrice(), menu.get(a - 1).getDescription());
            }


        }

    }

}
