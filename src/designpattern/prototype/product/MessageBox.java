package designpattern.prototype.product;

import designpattern.prototype.Manager;

public class MessageBox implements Product {
    private char decochar;

    public MessageBox(char decochar) {
        this.decochar = decochar;
    }

    @Override
    public void use(String s) {
        int decolen = 1 + s.length() + 1;
        for (int i = 0; i < decolen; i++) {
            System.out.print(this.decochar);
        }
        System.out.println();

        System.out.println(this.decochar + s + this.decochar);

        for (int i = 0; i < decolen ; i++) {
             System.out.print(this.decochar);
        }
        System.out.println();
    }
}
