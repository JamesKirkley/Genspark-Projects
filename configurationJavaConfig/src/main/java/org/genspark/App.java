package org.genspark;


import org.genspark.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {

    public static void main(String[] args) {

        AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        student obj = (student) context.getBean(student.class);
        System.out.println(obj);
        obj.toString();
        context.close();


    }
}
