package Refactoring.Challange;


public class MenuItem {
    private final String name;
    private final float price;
    private final String description;
    private Category category;

    public MenuItem(String name, float price, String description) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("이름은 필수 항목입니다.");
        }
        if (price < 0) {
            throw new IllegalArgumentException("가격은 0 이상이어야 합니다.");
        }
        if (description == null) {
            throw new IllegalArgumentException("설명은 필수 항목입니다.");
        }
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        if (category == null) {
            throw new IllegalArgumentException("카테고리는 null일 수 없습니다.");
        }
        this.category = category;
    }

    @Override
    public String toString() {
        return String.format("%s (W %.2f): %s", name, price, description);
    }
}
