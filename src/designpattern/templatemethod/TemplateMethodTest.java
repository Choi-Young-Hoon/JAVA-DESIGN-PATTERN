package designpattern.templatemethod;

public class TemplateMethodTest {
    public static void run() {
        AbstractDisplay chDisplay = new CharDisplay('H');
        AbstractDisplay stringDisplay = new StringDislplay("Hello World");

        chDisplay.display();
        stringDisplay.display();
    }
}
