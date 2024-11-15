package Oops.AbstractClassesMethods.ProductClassAsAbstract;

class ElectronicsProduct extends Product {
    private double price;

    public ElectronicsProduct(String name, double price) {
        super(name);
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return "Electronics: " + name;
    }
}
