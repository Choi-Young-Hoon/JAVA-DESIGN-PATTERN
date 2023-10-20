package designpattern.singleton;

public class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton() {
        System.out.println("Singleton Instance 생성");
    }

    public static Singleton getInstance() {
        return instance;
    }
}
