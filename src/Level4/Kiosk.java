package Level4;

import java.util.List;
import java.util.Scanner;

public class Kiosk {

    List<Menu> menus ;

    public Kiosk(List<Menu> menu){
        this.menus = menu;
    }


    public void Start()
    {
        Scanner sc = new Scanner(System.in);

        while(true) {


            //카테고리 목록 출력
            System.out.println("[ MENUES ]");
            int i = 0;
            for (Menu menu : menus){
                System.out.printf("%d. %s\n",++i,menu.categoty);
            }
            System.out.println("0. EXIT");
            //

            //출력할 카테고리 번호 입력
            int c = sc.nextByte();

            //입력값에 따른 로직
            if(c == 0)
                break;
            else if(c >0 && c <= menus.size()) //c가 유효한 카테고리 번호를 가리킬 때 진입
            {
                i=0;
                for (MenuItem items: menus.get(c-1).menuItems ) //카테고리 내 모든 메뉴 출력
                    System.out.printf("%d. %-15s | %.1f | %s \n",++i, items.name, items.price, items.description );
                System.out.println("0. BACK");
            }
            else continue; //c가 카테고리 번호를 넘어갈 때 continue

            //카테고리 내 메뉴 번호를 입력
            int d = sc.nextByte();


            if (d == 0) break; //d가 0일 때 프로그램 종료
            else if(d<=menus.get(c-1).menuItems.size() && d>0)
            {
                MenuItem m = menus.get(c-1).menuItems.get(d-1);
                System.out.printf("선택한 메뉴: %-10s | %.1f | %-30s \n", m.name, m.price, m.description);
            }
            //
        }



    }


}
