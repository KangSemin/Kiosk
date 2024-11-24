package Refactoring.Challange;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    // Singleton 패턴
    private static final Cart _instance = new Cart();

    private Cart() {
    }

    public static Cart instance() {
        return _instance;
    }

    // 카트 항목들
    private final List<MenuItem> cartItems = new ArrayList<>();
    private float total = 0;

    // 카트에 담긴 항목 수 반환
    public int count() {
        return cartItems.size();
    }

    // 카트 초기화
    public void clear() {
        cartItems.clear();
        recalculateTotal();
    }

    // 카트 항목들 반환
    public List<MenuItem> getCartItems() {
        return new ArrayList<>(cartItems);
    }

    // 카트에 항목 추가
    public void add2Cart(MenuItem item) {
        cartItems.add(item);
        recalculateTotal();
    }

    // 카트에서 항목 제거
    public void removeItemFromCart(MenuItem item) {
        cartItems.remove(item);
        recalculateTotal();
    }

    // 모든 항목 제거
    public void removeAllItems() {
        cartItems.clear();
        recalculateTotal();
    }

    // 총 금액 반환
    public float getTotal() {
        return total;
    }

    // 할인 적용 후 가격 계산
    public float getDiscountedPrice(float discountRate) {
        return total * (1 - discountRate);
    }

    // 총 금액 갱신
    private void recalculateTotal() {
        total = (float) cartItems.stream().mapToDouble(MenuItem::getPrice).sum();
    }
}
