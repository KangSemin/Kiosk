package Refactoring.Challange;

import java.util.List;

public class Menu {
    private final Category category;
    private final List<MenuItem> items;

    public Menu(Category category, List<MenuItem> items) {
        this.category = category;
        this.items = items;
        items.forEach(item -> item.setCategory(category)); // 카테고리 설정
    }

    public Category getCategory() {
        return category;
    }

    public List<MenuItem> getItems() {
        return items;
    }

    public MenuItem getItemById(int index) {
        if (index < 1 || index > items.size()) {
            throw new IndexOutOfBoundsException("잘못된 메뉴 항목 선택입니다.");
        }
        return items.get(index - 1); // 1-based index
    }
}