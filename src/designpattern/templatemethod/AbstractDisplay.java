package designpattern.templatemethod;

public abstract class AbstractDisplay {
    public abstract void open();
    public abstract void print();
    public abstract  void close();

    // display()는 AbstractDisplay class 에서 구현하는 메소드
    public final void display() {
        this.open();
        for (int i = 0; i < 5; i++) {
            this.print();
        }
        this.close();
    }
}
