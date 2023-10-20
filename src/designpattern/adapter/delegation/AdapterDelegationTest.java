package designpattern.adapter.delegation;

public class AdapterDelegationTest {
    public static void run() {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}
