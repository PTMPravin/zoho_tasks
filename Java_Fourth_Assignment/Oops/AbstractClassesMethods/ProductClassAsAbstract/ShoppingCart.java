package Oops.AbstractClassesMethods.ProductClassAsAbstract;

import java.util.ArrayList;
import java.util.List;

class ShoppingCart {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayProducts() {
        for (Product product : products) {
            System.out.println(product.getDescription() + " - $" + product.getPrice());
        }
    }

    public double calculateTotalPrice() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }
}