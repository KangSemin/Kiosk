package Level3;

import java.util.ArrayList;
import java.util.List;

public class Main {





    public static void main(String[] args){
        List<MenuItem> menu= new ArrayList<>();
        menu.add(new MenuItem("ShackBurger",6.9f,"토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menu.add(new MenuItem("ShackBurger2",6.9f,"토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menu.add(new MenuItem("ShackBurger3",6.9f,"토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menu.add(new MenuItem("ShackBurger4",6.9f,"토마토, 양상추, 쉑소스가 토핑된 치즈버거"));

        Kiosk kiosk = new Kiosk(menu);
        kiosk.Start();

    }


    private void Init()
    {

    }

}
