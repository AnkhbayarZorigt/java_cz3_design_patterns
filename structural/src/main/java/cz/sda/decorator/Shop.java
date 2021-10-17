package cz.sda.decorator;

public interface Shop {

    void addToBasket(String item);

    void removeFromBasket(String item);

    void purchase();
}
