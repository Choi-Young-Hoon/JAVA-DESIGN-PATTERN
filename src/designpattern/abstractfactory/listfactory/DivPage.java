package designpattern.abstractfactory.listfactory;

import designpattern.abstractfactory.factory.Item;
import designpattern.abstractfactory.factory.Page;

public class DivPage extends Page {
    public DivPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<!DOCTYPE html>\n");
        stringBuilder.append("<html><head><title>");
        stringBuilder.append(super.title);
        stringBuilder.append("</title><style>\n");
        stringBuilder.append("div.TRAY { padding:0.5em; margin-left:5em; border:1px solid black; }\n");
        stringBuilder.append("div.LINK { padding:0.5em; background-color: lightgray; }\n");
        stringBuilder.append("</style></head><body>\n");
        stringBuilder.append("<h1>");
        stringBuilder.append(super.title);
        stringBuilder.append("</h1>\n");
        for (Item item : super.content) {
            stringBuilder.append(item.makeHTML());
        }
        stringBuilder.append("<h1><address>");
        stringBuilder.append(super.author);
        stringBuilder.append("</address>\n");
        stringBuilder.append("</body></html>\n");
        return stringBuilder.toString();
    }
}
