package Level1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        while (true) {
            System.out.println("[ SHAKESHACK MENU ]");
            System.out.println("ShackBurger | 6.9f | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
            System.out.println("SmokeShack | 6.9f | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
            System.out.println("Cheeseburger | 6.9f | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거\"");
            System.out.println("Hamburger | 6.9f | 비프패티를 기반으로 야채가 들어간 기본버거");
            System.out.println("Enter '0' to exit.");
            if (new Scanner(System.in).nextInt() == 0)
                break;

        }
    }
}
