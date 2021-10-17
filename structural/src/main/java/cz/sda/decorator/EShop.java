package cz.sda.decorator;

import java.util.ArrayList;
import java.util.List;

public class EShop implements Shop {

    private final List<String> basket = new ArrayList<>();

    @Override
    public void addToBasket(String item) {
        basket.add(item);
    }

    @Override
    public void removeFromBasket(String item) {
        basket.remove(item);
    }

    @Override
    public void purchase() {
        if (basket.isEmpty()) {
            throw new IllegalStateException("Cannot purchase nothing");
        } else {
            System.out.println("You have purchased " + basket);
        }
    }
}
