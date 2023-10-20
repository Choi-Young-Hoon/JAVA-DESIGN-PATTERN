package designpattern.builder;

import designpattern.builder.builder.Builder;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        this.builder.makeTitle("Greeting");
        this.builder.makeString("일반적인 인사");
        this.builder.makeItems(new String[] {
                "How are you?",
                "Hello",
                "Hi",
        });
        this.builder.makeString("시간대별 인사");
        this.builder.makeItems(new String[]{
                "Good morning",
                "Good afternoon",
                "Good evening",
        });
        this.builder.close();
    }
}
