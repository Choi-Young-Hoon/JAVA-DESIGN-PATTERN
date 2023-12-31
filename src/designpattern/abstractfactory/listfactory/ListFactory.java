package designpattern.abstractfactory.listfactory;

import designpattern.abstractfactory.factory.Factory;
import designpattern.abstractfactory.factory.Link;
import designpattern.abstractfactory.factory.Page;
import designpattern.abstractfactory.factory.Tray;

public class ListFactory extends Factory {

    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
