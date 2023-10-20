package designpattern.abstractfactory.listfactory;

import designpattern.abstractfactory.factory.Item;
import designpattern.abstractfactory.factory.Tray;

public class ListTray extends Tray {
    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<li>\n");
        stringBuilder.append(super.caption);
        stringBuilder.append("\n<ul>\n");
        for (Item item : super.tray) {
            stringBuilder.append(item.makeHTML());
        }
        stringBuilder.append("</ul>\n");
        stringBuilder.append("</li>\n");
        return stringBuilder.toString();
    }
}
