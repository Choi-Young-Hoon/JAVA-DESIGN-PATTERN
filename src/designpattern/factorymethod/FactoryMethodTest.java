package designpattern.factorymethod;

import designpattern.factorymethod.factory.Factory;
import designpattern.factorymethod.factory.IDCardFactory;
import designpattern.factorymethod.product.Product;

public class FactoryMethodTest {
    public static void run() {
        Factory factory = new IDCardFactory();
        Product card1 = factory.createProduct("YOUNG HOON");
        Product card2 = factory.createProduct("CHOI");
        Product card3 = factory.createProduct("HONG GIL DONG");
        card1.use();
        card2.use();
        card3.use();
    }
}
