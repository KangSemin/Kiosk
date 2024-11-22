package Level3;

import java.util.*;

public class Kiosk {

    List<MenuItem> menu ;

    public Kiosk(List<MenuItem> menu){
        this.menu = menu;
    }


    public void Start()
    {
        Scanner sc = new Scanner(System.in);

        while(true) {

            int i = 1;

            System.out.println("[ SHAKESHACK MENU ]");
            for (MenuItem item : menu) {
                System.out.printf("%d. %-15s | %f | %s \n", i++, item.getName(), item.getPrice(), item.getDescription());
            }
            System.out.println("0. EXIT");

            int a = sc.nextInt();
            if (a == 0) break;
            else if(a<=menu.size()) System.out.printf("선택한 메뉴: %-10s | %f | %-30s \n", menu.get(a - 1).getName(), menu.get(a - 1).getPrice(), menu.get(a - 1).getDescription());

        }



    }


}
