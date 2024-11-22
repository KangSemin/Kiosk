package Level4;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    public String categoty="";
    public List<MenuItem> menuItems = new ArrayList<>();

    public Menu(String categoty) {
        this.categoty = categoty;
    }

    public Menu(String categoty, List<MenuItem> menuItems) {
        this.categoty = categoty;
        this.menuItems = menuItems;
    }


}
