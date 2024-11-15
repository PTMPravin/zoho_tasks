package Oops.AbstractClassesMethods.ProductClassAsAbstract;

public class BookProduct extends Product {
    private double price;

    public BookProduct(String name, double price) {
        super(name);
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return "Book: " + name;
    }
}
