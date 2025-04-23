package com.ucode.main;

import com.ucode.beans.Student;
import com.ucode.config.SpringConfigFile;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);

        Student std1 = (Student) context.getBean("stdId1");
        Student std2 = (Student) context.getBean("stdId2");
        System.out.println(std1);
        System.err.println(std2.toString());

        Student std3 = context.getBean("beanName",Student.class);
        System.out.println(std3);
    }
}
