package Level4;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {


        Kiosk kiosk = new Kiosk(Init());
        kiosk.Start();

    }


    private static List<Menu> Init() {
        List<Menu> menus = new ArrayList<>();
        List<MenuItem> menuItems = new ArrayList<>();

        menuItems.add(new MenuItem("ShackBurger", 6.9f, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("ShackBurger2", 6.9f, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("ShackBurger3", 6.9f, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("ShackBurger4", 6.9f, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menus.add(new Menu("BURGER", menuItems));

        menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("PepsiZero", 2.0f, "아 제로라 먹는 게 아니라 맛있어서 먹는거라고~"));
        menuItems.add(new MenuItem("Coke", 2.0f, "코카콜라 맛있다 맛있으면 또 먹지 딩동댕동댕"));
        menuItems.add(new MenuItem("Apple Juice", 2.5f, "질리지 않니 오렌지 이젠 사과의 시대야."));
        menuItems.add(new MenuItem("Milk", 1.5f, "키도 크고 뼈도 단단해져요"));
        menuItems.add(new MenuItem("Tropicana Sparkling", 5.9f, "사과 톡톡톡 트로피카나 사과 톡톡톡 트로피카나 사과 톡톡톡 트로피카나 사과 톡톡톡 트로피카나 사과 톡톡톡 트로피카나 사과 톡톡톡 트로피카나 사과 톡톡톡 트로피카나 사과 톡톡톡 트로피카나 사과 톡톡톡 트로피카나 사과 톡톡톡 트로피카나 사과 톡톡톡 트로피카나 사과 톡톡톡 트로피카나 사과 톡톡톡 트로피카나 사과 톡톡톡 트로피카나 사과 톡톡톡 트로피카나 사과 톡톡톡 트로피카나 사과 톡톡톡 트로피카나 사과 톡톡톡 트로피카나 "));
        menus.add(new Menu("DRINK", menuItems));

        menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("Icecream",0.5f,"500으로 행복을 누리던 그 때의 소프트콘"));
        menuItems.add(new MenuItem("Pickle",0.2f,"아삭하고 새콤한 디?저트"));
        menuItems.add(new MenuItem("Bingsu",3.0f,"가끔은 우유빙수보다 근본빙수가 생각 날 때가 있죠"));
        menuItems.add(new MenuItem("Waffle",1.0f,"생크림 삭 발라먹는 근본 맛도리 와플"));
        menus.add(new Menu("DESSERT", menuItems));

        menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("Onion Ring",2.3f,"먹으면 맛은 있지만 막상 사먹는 사람은 그리 많이 보지 못한 양파링"));
        menuItems.add(new MenuItem("Nugget",2.7f,"한때는 병아리로 만들었다는 괴담이 있던 치킨너겟"));
        menuItems.add(new MenuItem("CheeseStick",2.4f,"꼴랑 두 조각 주면서 왜 이리 비싸냐고요? ㄹㅇㅋㅋ"));
        menuItems.add(new MenuItem("French fries",2.4f,"감튀 없이 햄버거 어케먹을건데"));
        menus.add( new Menu("SIDES", menuItems));


        return menus;
    }

}
