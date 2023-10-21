package designpattern.bridge.display;

import designpattern.bridge.impl.DisplayImpl;

public class CountDisplay extends Display {
    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void multiDisplay(int count) {
        super.open();
        for (int i = 0; i < count; i++) {
            super.print();
        }
        super.close();
    }
}
