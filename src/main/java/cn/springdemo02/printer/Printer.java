package cn.springdemo02.printer;

import cn.springdemo02.ink.GreyInk;
import cn.springdemo02.paper.TextPaper;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Printer {
    // 面向接口编程
    private Ink ink;
    private Paper paper ;

    public Ink getInk() {
        return ink;
    }

    public void setInk(Ink ink) {
        this.ink = ink;
    }

    public Paper getPaper() {
        return paper;
    }

    public void setPaper(Paper paper) {
        this.paper = paper;
    }

    public void print(String str ) {
        System.out.println("使用" + ink.getColor(255,55,255) + "颜色打印");
        for ( int i = 0 ; i < str.length() ; i ++ ) {
            paper.putInChar( str.charAt(i) );
        }
        System.out.println( paper.getContent() );

    }

    @Test
    public void testPrint() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        Printer printer = (Printer) context.getBean("printer");
        String str = "Originally [Netflix's Java] libraries and frameworks were built in-house. I'm very proud to say, as of early 2019, we've moved our platform almost entirely over to Spring Boot.”";
        printer.print(str);
    }

    @Test
    public void test() {
        Printer printer = new Printer();
        printer.setInk(new GreyInk());
        printer.setPaper(new TextPaper());
        printer.print("哈哈哈哈哈哈");

    }


}
