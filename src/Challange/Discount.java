package Challange;

public enum Discount {
    군인(0.4f),      // 30% 할인
    미필(0.2f),      // 20% 할인
    공익(0.1f),      // 10% 할인
    면제(0.05f),     // 5% 할인
    짐승(0.02f);     // 2% 할인

    private final float rate; // 할인율

    // 생성자
    Discount(float rate) {
        this.rate = rate;
    }

    // 할인율을 반환
    public float getRate() {
        return rate;
    }


    public static float getRateInOrdinal(int a)
    {
        for(Discount discount : Discount.values())
        {
            if(discount.ordinal()==a-1) return discount.rate;
        }
        return 0;
    }
}

