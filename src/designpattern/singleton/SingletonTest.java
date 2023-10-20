package designpattern.singleton;

public class SingletonTest {
    public static void run() {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        if (instance1 == instance2) {
            System.out.println("instance1 == instance2");
        }

    }
}
