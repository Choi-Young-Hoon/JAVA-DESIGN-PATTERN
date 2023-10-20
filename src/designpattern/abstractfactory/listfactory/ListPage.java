package designpattern.abstractfactory.listfactory;

import designpattern.abstractfactory.factory.Item;
import designpattern.abstractfactory.factory.Page;

public class ListPage extends Page {
    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<!DOCTYPE html>\n");
        stringBuilder.append("<html><head><title>");
        stringBuilder.append(super.title);
        stringBuilder.append("</title></head>");
        stringBuilder.append("<body>\n");
        stringBuilder.append("<h1>");
        stringBuilder.append(super.title);
        stringBuilder.append("</h1>\n");
        stringBuilder.append("<ul>\n");
        for (Item item : super.content) {
            stringBuilder.append(item.makeHTML());
        }
        stringBuilder.append("</ul>\n");
        stringBuilder.append("<hr><address>");
        stringBuilder.append(super.author);
        stringBuilder.append("</address>\n");
        stringBuilder.append("</body></html>\n");
        return stringBuilder.toString();
    }
}
