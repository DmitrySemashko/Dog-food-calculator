package by.semashko.model;

import java.util.List;

public class Menu {
    List<Product>products;

    public Menu(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
