package com.ucode.main;

import com.ucode.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Student std1 = (Student) context.getBean("stdId1");
        Student std2 = (Student) context.getBean("stdId2");
        //Student std2 =  context.getBean(Student.class);
        System.out.println(std1);
        System.err.println(std2.toString());

    }
}
