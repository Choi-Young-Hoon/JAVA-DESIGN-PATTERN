package designpattern.builder.builder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class HTMLBuilder extends Builder {
    private String fileName = "untitled.html";
    private StringBuilder stringBuilder = new StringBuilder();

    @Override
    public void makeTitle(String title) {
        fileName = title + ".html";
        this.stringBuilder.append("<!DOCTYPE html>\n");
        this.stringBuilder.append("<html>\n");
        this.stringBuilder.append("<head><title>");
        this.stringBuilder.append(title);
        this.stringBuilder.append("</title></head>");
        this.stringBuilder.append("<body>\n");
        this.stringBuilder.append("<h1>");
        this.stringBuilder.append(title);
        this.stringBuilder.append("</h1>\n\n");
    }

    @Override
    public void makeString(String str) {
        this.stringBuilder.append("<p>");
        this.stringBuilder.append(str);
        this.stringBuilder.append("</p>\n\n");
    }

    @Override
    public void makeItems(String[] items) {
        this.stringBuilder.append("<ul>\n");
        for (String str : items) {
            this.stringBuilder.append("<li>");
            this.stringBuilder.append(str);
            this.stringBuilder.append("</li>\n");
        }
        this.stringBuilder.append("</ul>\n\n");
    }

    @Override
    public void close() {
        this.stringBuilder.append("</body>");
        this.stringBuilder.append("</html>");
        try {
            Writer writer = new FileWriter(this.fileName);
            writer.write(this.stringBuilder.toString());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getHTMLResult() {
        return this.fileName;
    }
}
