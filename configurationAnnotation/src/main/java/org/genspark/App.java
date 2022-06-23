package org.genspark;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {

    public static void main(String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
        student obj = (student) context.getBean("student");
        System.out.println(obj);
        obj.toString();
        context.close();


    }
}
