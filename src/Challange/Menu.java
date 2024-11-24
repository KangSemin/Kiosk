package Challange;

import java.util.List;

public class Menu {

    private Category category;
    private List<MenuItem> items;

    public Menu(Category category, List<MenuItem> items) {
        this.category = category;
        this.items = items;

        items.forEach(item -> item.setCategory(category)); // items의 카테고리를 메뉴와 동일하게 변경
    }

    public Category getCategory() {
        return category;
    }

    public List<MenuItem> getItems() {
        return items;
    }

    public MenuItem getItemById(int index) {
        return items.get(index-1);
    }

}