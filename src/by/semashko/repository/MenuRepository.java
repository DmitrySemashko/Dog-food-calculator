package by.semashko.repository;

import by.semashko.model.Product;

import java.util.ArrayList;
import java.util.List;

public class MenuRepository {

    private List<Product> products;

    public MenuRepository() {
        products = new ArrayList<>();
    }


    public List<Product> create() {
        products.add(new Product("Рубец", 17));
        products.add(new Product("Мясо", 40));
        products.add(new Product("Субпродукты", 10));
        products.add(new Product("Печень", 5));
        products.add(new Product("Кости", 15));
        products.add(new Product("Овощи,фрукты,ягоды", 13));
        return products;
    }
}
