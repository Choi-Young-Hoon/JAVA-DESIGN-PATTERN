package designpattern.adapter.delegation;

// Instnace를 사용한 Adapter 패턴의 구현

public class PrintBanner implements Print {
    private Banner banner;

    public PrintBanner(String string) {
        this.banner = new Banner(string);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
