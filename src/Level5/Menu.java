package Level5;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private String category;
    private List<MenuItem> items;

    public Menu(String category, List<MenuItem> items) {
        this.category = category;
        this.items = items;
    }

    public String getCategory() {
        return category;
    }

    public List<MenuItem> getItems() {
        return items;
    }

    public MenuItem getItemById(int index) {
        return items.get(index-1);
    }

    public void addItem(MenuItem item) {
        this.items.add(item);
    }

    public void addItem(String name, float price, String description) {
        this.items.add(new MenuItem(name, price, description));
}

}