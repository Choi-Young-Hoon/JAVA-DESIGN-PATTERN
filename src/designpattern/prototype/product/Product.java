package designpattern.prototype.product;

public abstract class Product implements Cloneable {
    public abstract void use(String s);

    public Product createCopy() {
        Product product = null;
        try {
            product = (Product)clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return product;
    }
}
