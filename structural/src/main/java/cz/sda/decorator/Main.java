package cz.sda.decorator;

public class Main {
    public static void main(String[] args) {
        Shop shop = new LoggingShop(new EmailNotifyingShop(new EShop()));

        //        shop.addToBasket("PS4");
        //        shop.addToBasket("Far Cry 6");
        //        shop.removeFromBasket("PS4");
        //        shop.addToBasket("PS5");
        shop.purchase();
    }
}
