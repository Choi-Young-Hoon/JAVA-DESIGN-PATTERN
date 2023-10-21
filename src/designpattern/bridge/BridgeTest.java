package designpattern.bridge;

import designpattern.bridge.display.CountDisplay;
import designpattern.bridge.display.Display;
import designpattern.bridge.display.RandomCountDisplay;
import designpattern.bridge.impl.FileDisplayImpl;
import designpattern.bridge.impl.StringDisplayImpl;

public class BridgeTest {
    public static void run() {
        Display display1 = new Display(new StringDisplayImpl("Hello, Korea"));
        Display display2 = new CountDisplay(new StringDisplayImpl("Hello World"));
        CountDisplay countDisplay = new CountDisplay(new StringDisplayImpl("Hello, Universe."));
        RandomCountDisplay randomDisplay = new RandomCountDisplay(new StringDisplayImpl("Hello Random"));
        RandomCountDisplay randomReadFileDisplay = new RandomCountDisplay(new FileDisplayImpl("bridge.txt"));

        display1.display();
        display2.display();
        countDisplay.display();
        countDisplay.multiDisplay(3);

        randomDisplay.randomDisplay();
        randomReadFileDisplay.randomDisplay();
    }
}
