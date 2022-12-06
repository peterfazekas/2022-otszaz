package hu.store.model.domain;

import java.util.Map;
import java.util.stream.Collectors;

public class Cart {

    private final int id;
    private final Map<String, Long> goods;
    private final int totalValue;

    public Cart(int id, Map<String, Long> goods, int totalValue) {
        this.id = id;
        this.goods = goods;
        this.totalValue = totalValue;
    }

    public int getId() {
        return id;
    }

    public Map<String, Long> getGoods() {
        return goods;
    }

    public int getTotalValue() {
        return totalValue;
    }

}