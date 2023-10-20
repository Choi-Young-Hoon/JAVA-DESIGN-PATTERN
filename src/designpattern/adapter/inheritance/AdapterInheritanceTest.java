package designpattern.adapter.inheritance;


public class AdapterInheritanceTest {
    public static void run() {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}
