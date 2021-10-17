package cz.sda.decorator;

public class LoggingShop implements Shop {

    private final Shop shop;

    public LoggingShop(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void addToBasket(String item) {
        System.out.println("log: adding " + item + " to basket");
        shop.addToBasket(item);
    }

    @Override
    public void removeFromBasket(String item) {
        System.out.println("log: removing " + item + " from basket");
        shop.removeFromBasket(item);
    }

    @Override
    public void purchase() {
        System.out.println("log: purchasing");
        shop.purchase();
    }
}
