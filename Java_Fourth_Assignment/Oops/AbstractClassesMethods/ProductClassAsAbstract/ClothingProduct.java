package Oops.AbstractClassesMethods.ProductClassAsAbstract;

class ClothingProduct extends Product {
    private double price;

    public ClothingProduct(String name, double price) {
        super(name);
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return "Clothing: " + name;
    }
}
