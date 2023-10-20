package designpattern.factorymethod.factory;

import designpattern.factorymethod.product.Product;

public abstract class Factory {
    public final Product create(String owner) {
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }

    public abstract Product createProduct(String owner);
    protected abstract void registerProduct(Product product);
}
