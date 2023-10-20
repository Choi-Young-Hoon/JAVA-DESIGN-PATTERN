package designpattern.builder;

import designpattern.builder.builder.HTMLBuilder;
import designpattern.builder.builder.TextBuilder;
import org.w3c.dom.Text;

public class BuilderTest {
    public static void run() {
        TextBuilder textBuilder = new TextBuilder();
        Director director = new Director(textBuilder);
        director.construct();
        String result = textBuilder.getTextResult();
        System.out.println(result);

        HTMLBuilder htmlBuilder = new HTMLBuilder();
        Director director1 = new Director(htmlBuilder);
        director1.construct();
        String fileName = htmlBuilder.getHTMLResult();
        System.out.println("HTML 파일 " + fileName + "이 작성되었습니다.");
    }
}
