package Oops.AbstractClassesMethods.ProductClassAsAbstract;

public class ShoppingApp {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        
        cart.addProduct(new ElectronicsProduct("Laptop", 1200.00));
        cart.addProduct(new ClothingProduct("T-Shirt", 20.00));
        cart.addProduct(new BookProduct("Java Programming", 30.00));

        cart.displayProducts();
        System.out.println("Total Price: $" + cart.calculateTotalPrice());
    }
}
