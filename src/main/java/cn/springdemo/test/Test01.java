package cn.springdemo.test;

import cn.springdemo.HelloSpring;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {

    @Test
    public void test() {
        HelloSpring helloSpring = new HelloSpring();
        helloSpring.setMessage("呵呵呵");
        helloSpring.print();

    }

    @Test
    public void test02() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        //IoC 控制反转
        HelloSpring helloSpring = (HelloSpring) context.getBean("helloSpring");
        helloSpring.print();

    }





}
