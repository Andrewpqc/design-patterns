package framework;

public abstract class Factory {
    public abstract Product createProduct(String owner);

    public abstract void registerProduct(Product p);

    public final Product create(String owner) {
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }
}
