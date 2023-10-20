package designpattern.builder.builder;

public class TextBuilder extends Builder {
    private StringBuilder stringBuilder = new StringBuilder();

    @Override
    public void makeTitle(String title) {
        this.stringBuilder.append("==============");
        this.stringBuilder.append("[");
        this.stringBuilder.append(title);
        this.stringBuilder.append("]\n\n");
    }

    @Override
    public void makeString(String str) {
        this.stringBuilder.append("*");
        this.stringBuilder.append(str);
        this.stringBuilder.append("\n\n");
    }

    @Override
    public void makeItems(String[] items) {
        for (String str : items) {
            this.stringBuilder.append(".");
            this.stringBuilder.append(str);
            this.stringBuilder.append("\n");
        }
        this.stringBuilder.append("\n");
    }

    @Override
    public void close() {
        this.stringBuilder.append("==============");
    }

    public String getTextResult() {
        return this.stringBuilder.toString();
    }
}
