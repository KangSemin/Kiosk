package Challange;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Kiosk kiosk = new Kiosk(setMenus());
        kiosk.Start();
    }

    private static List<Menu> setMenus()
    {

        List<Menu> menus = new ArrayList<>();
        List<MenuItem> items = new ArrayList<>();

        items.add(new MenuItem("ShackBurger",6.9f,"토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        items.add(new MenuItem("SmokeShack",8.9f,"베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        items.add(new MenuItem("Cheeseburger",6.9f,"포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        items.add(new MenuItem("Hamburger",5.9f,"비프패티를 기반으로 야채가 들어간 기본버거"));
        menus.add(new Menu(Category.BURGER,items));
        items = new ArrayList<>();

        items.add(new MenuItem("Coke",2.0f,"코카콜라 맛있다 맛있으면 또 먹지 딩동댕동댕"));
        items.add(new MenuItem("Apple Juice",2.5f,"질리지 않니 오렌지 이젠 사과의 시대야."));
        items.add(new MenuItem("Milk",1.5f,"키도 크고 뼈도 단단해져요"));
        items.add(new MenuItem("Tropicana Sparkling",5.9f,"사과 톡톡톡 트로피카나 사과 톡톡톡 트로피카나 사과 톡톡톡 트로피카나 사과 톡톡톡 트로피카나 사과 톡톡톡 트로피카나 사과 톡톡톡 트로피카나 사과 톡톡톡 트로피카나 사과 톡톡톡 트로피카나 사과 톡톡톡 트로피카나 사과 톡톡톡 트로피카나 사과 톡톡톡 트로피카나 사과 톡톡톡 트로피카나 사과 톡톡톡 트로피카나 사과 톡톡톡 트로피카나 사과 톡톡톡 트로피카나 사과 톡톡톡 트로피카나 사과 톡톡톡 트로피카나 사과 톡톡톡 트로피카나 "));
        menus.add(new Menu(Category.DRINK,items));
        items = new ArrayList<>();

        items.add(new MenuItem("Icecream",0.5f,"500으로 행복을 누리던 그 때의 소프트콘"));
        items.add(new MenuItem("Pickle",0.2f,"아삭하고 새콤한 디?저트"));
        items.add(new MenuItem("Bingsu",3.0f,"가끔은 우유빙수보다 근본빙수가 생각 날 때가 있죠"));
        items.add(new MenuItem("Waffle",1.0f,"생크림 삭 발라먹는 근본 맛도리 와플"));
        menus.add(new Menu(Category.DESSERT,items));
        items = new ArrayList<>();

        items.add(new MenuItem("Onion Ring",2.3f,"먹으면 맛은 있지만 막상 사먹는 사람은 그리 많이 보지 못한 양파링"));
        items.add(new MenuItem("Nugget",2.7f,"한때는 병아리로 만들었다는 괴담이 있던 치킨너겟"));
        items.add(new MenuItem("CheeseStick",2.4f,"꼴랑 두 조각 주면서 왜 이리 비싸냐고요? ㄹㅇㅋㅋ"));
        items.add(new MenuItem("French fries",2.4f,"감튀 없이 햄버거 어케먹을건데"));
        menus.add(new Menu(Category.SIDES,items));

        return menus;
    }
}
