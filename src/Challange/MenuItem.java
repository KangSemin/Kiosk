package Challange;

public class MenuItem{

    private String name;
    private float price;
    private String description;
    private Category category;

    MenuItem(String name, float price, String description) {
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
        this.category = category;
    }
}