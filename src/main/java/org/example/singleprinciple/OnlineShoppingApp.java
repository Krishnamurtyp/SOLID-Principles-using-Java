package org.example.singleprinciple;

import java.util.ArrayList;
import java.util.List;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

class ShoppingCart {
    private List<Product> items = new ArrayList<>();

    public void addProduct(Product product) {
        items.add(product);
    }

    public double calculateTotal() {
        return items.stream().mapToDouble(Product::getPrice).sum();
    }
}

class OrderProcessor {
    public void processOrder(ShoppingCart cart, String paymentMethod) {
        // Process the order, charge payment, update inventory, etc.
        System.out.println("Order processed with payment method: " + paymentMethod);
    }
}


public class OnlineShoppingApp {
    public static void main(String[] args) {
        Product laptop = new Product("Laptop", 999.99);
        Product headphones = new Product("Headphones", 79.99);

        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(laptop);
        cart.addProduct(headphones);

        OrderProcessor processor = new OrderProcessor();
        processor.processOrder(cart, "Credit Card");

        System.out.println("Total cost: $" + cart.calculateTotal());

    }
}
