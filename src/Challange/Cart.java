package Challange;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Cart {

    //Singleton
    private static final Cart _instance = new Cart();



    private Cart() {
    }

    public static Cart instance() {
        return _instance;
    }
    //


    private static final List<MenuItem> cartItems = new ArrayList<>();
    private static float total = 0;

    public int count() {
        return cartItems.size();
    }

    public void clear() {
        cartItems.clear();
        renew();
    }

    public List<MenuItem> getCartItems() {
        return cartItems;
    }

    public void add2Cart(MenuItem item) {
        cartItems.add(item);
        renew();
    }

    public void removeItem(MenuItem item) {
        cartItems.remove(item);
        renew();
    }

    public void removeAllItem() {
        cartItems.clear();
        renew();
    }

    public float getTotal() {
        return total;
    }

    public float getDiscountedPrice(float discountRate)
    {
        return total * (1-discountRate);
    }

    private void renew()
    {
        total = 0;
        for (MenuItem item : cartItems) {
            total += item.getPrice();
        }
    }


}
