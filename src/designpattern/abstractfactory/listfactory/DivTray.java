package designpattern.abstractfactory.listfactory;

import designpattern.abstractfactory.factory.Item;
import designpattern.abstractfactory.factory.Tray;

public class DivTray extends Tray {
    public DivTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<p><b>");
        stringBuilder.append(caption);
        stringBuilder.append("</b></p>\n");
        stringBuilder.append("<div class=\"TRAY\">");
        for (Item item : super.tray) {
            stringBuilder.append(item.makeHTML());
        }
        stringBuilder.append("</div>\n");
        return stringBuilder.toString();
    }
}
