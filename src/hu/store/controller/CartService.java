package hu.store.controller;

import hu.store.model.domain.Cart;

import java.util.List;

public class CartService {

    private final List<Cart> carts;

    public CartService(List<Cart> carts) {
        this.carts = carts;
    }

    /**
     * 2. feladat
     */
    public int getCartNumber() {
        return carts.size();
    }

    /**
     * 3. feladat
     */
    public long getGoodsNumberInChart(int id) {
        return getCartById(id).countItemsInCart();
    }

    private Cart getCartById(int id) {
        return carts.stream()
                .filter(i -> i.getId() == id)
                .findAny()
                .get();
    }
}
