package com.ucode.main;

import com.ucode.config.SpringConfigFile;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        //ApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
        System.out.println(context.getBean("student"));
    }
}
