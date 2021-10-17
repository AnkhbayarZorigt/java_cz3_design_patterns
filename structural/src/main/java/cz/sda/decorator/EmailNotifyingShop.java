package cz.sda.decorator;

public class EmailNotifyingShop implements Shop {

    private final Shop shop;

    public EmailNotifyingShop(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void addToBasket(String item) {
        shop.addToBasket(item);
    }

    @Override
    public void removeFromBasket(String item) {
        shop.removeFromBasket(item);
    }

    @Override
    public void purchase() {
        shop.purchase();
        System.out.println("Sending email: Successful purchase");
    }
}
