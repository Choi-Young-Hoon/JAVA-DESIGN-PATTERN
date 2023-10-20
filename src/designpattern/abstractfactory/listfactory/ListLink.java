package designpattern.abstractfactory.listfactory;

import designpattern.abstractfactory.factory.Link;

public class ListLink extends Link {
    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return "<li><a href=\"" + super.url + "\">" + super.caption + "</a></li>\n";
    }
}
