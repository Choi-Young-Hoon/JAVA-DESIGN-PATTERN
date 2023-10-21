package designpattern.bridge.display;

import designpattern.bridge.impl.DisplayImpl;

public class RandomCountDisplay extends CountDisplay {
    public RandomCountDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void randomDisplay() {
        int randCount = (int) (Math.random() * 10);
        super.multiDisplay(randCount);
    }
}
