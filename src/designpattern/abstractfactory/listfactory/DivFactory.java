package designpattern.abstractfactory.listfactory;

import designpattern.abstractfactory.factory.Factory;
import designpattern.abstractfactory.factory.Link;
import designpattern.abstractfactory.factory.Page;
import designpattern.abstractfactory.factory.Tray;

public class DivFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new DivLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new DivTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new DivPage(title, author);
    }
}
