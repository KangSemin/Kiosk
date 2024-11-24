package Refactoring.Challange;

public enum Discount {
    군인(0.4f),
    미필(0.2f),
    공익(0.1f),
    면제(0.05f),
    짐승(0.02f);

    private final float rate;

    Discount(float rate) {
        if (rate < 0 || rate > 1) {
            throw new IllegalArgumentException("할인율은 0에서 1 사이여야 합니다.");
        }
        this.rate = rate;
    }

    public float getRate() {
        return rate;
    }

    public static float getRateByOption(int option) {
        if (option < 1 || option > values().length) {
            throw new IllegalArgumentException("올바르지 않은 할인 옵션입니다.");
        }
        return values()[option - 1].rate;


    }

    @Override
    public String toString() {
        return String.format("%s (%.0f%% 할인)", name(), rate * 100);
    }
}
