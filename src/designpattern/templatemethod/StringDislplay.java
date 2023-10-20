package designpattern.templatemethod;

public class StringDislplay extends AbstractDisplay {
    private String string;

    public StringDislplay(String string) {
        this.string = string;
    }

    @Override
    public void open() {
        this.printLine();
    }

    @Override
    public void print() {
        System.out.println("|" + this.string + "|");
    }

    @Override
    public void close() {
        this.printLine();
    }

    public void printLine() {
        System.out.print("+");
        for (int i = 0; i < this.string.length(); i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
