package designpattern.bridge.impl;

public class StringDisplayImpl extends DisplayImpl {
    private String string;

    public StringDisplayImpl(String string) {
        this.string = string;
    }

    @Override
    public void rawOpen() {
        this.printLine();
    }

    @Override
    public void rawPrint() {
        System.out.println("|" + this.string + "|");
    }

    @Override
    public void rawClose() {
        this.printLine();
    }

    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < this.string.length(); i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
