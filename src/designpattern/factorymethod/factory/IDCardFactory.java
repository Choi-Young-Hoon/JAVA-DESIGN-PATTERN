package designpattern.factorymethod.factory;

import designpattern.factorymethod.product.IDCard;
import designpattern.factorymethod.product.Product;

public class IDCardFactory extends Factory {

    @Override
    public Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + "을 등록했습니다.");
    }
}
