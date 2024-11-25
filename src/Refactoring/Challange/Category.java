package Refactoring.Challange;

public enum Category {
    BURGER("햄버거"),
    DRINK("음료"),
    DESSERT("디저트"),
    SIDES("사이드 메뉴");

    private final String displayName;

    Category(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }
}

