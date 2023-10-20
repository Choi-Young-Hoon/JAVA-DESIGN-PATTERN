package designpattern.prototype.product;

public interface Product extends Cloneable {
    public abstract void use(String s);

    public default Product createCopy() {
        Product product = null;
        try {
            product = (Product)this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return product;
    }
}
