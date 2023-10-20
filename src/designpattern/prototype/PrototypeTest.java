package designpattern.prototype;

import designpattern.prototype.product.MessageBox;
import designpattern.prototype.product.Product;
import designpattern.prototype.product.UnderlinePen;

public class PrototypeTest {
    public static void run() {
        Manager manager = new Manager();
        UnderlinePen underPen = new UnderlinePen('-');
        MessageBox mBox = new MessageBox('*');
        MessageBox sBox = new MessageBox('/');

        manager.register("strong message", underPen);
        manager.register("warning box", mBox);
        manager.register("slash box", sBox);

        // 생성 및 사용
        Product p1 = manager.create("strong message");
        p1.use("Hello World");

        Product p2 = manager.create("warning box");
        p2.use("Hello World");

        Product p3 = manager.create("slash box");
        p3.use("Hello World");
    }
}
