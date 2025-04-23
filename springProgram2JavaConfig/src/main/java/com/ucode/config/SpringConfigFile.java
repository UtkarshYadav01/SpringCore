package com.ucode.config;

import com.ucode.beans.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:student.properties") // Load properties from the file
public class SpringConfigFile {

    @Value("${student.name}")
    private String name;

    @Value("${student.rollno}")
    private int rollno;

    @Value("${student.email}")
    private String email;

    @Bean
    public Student stdId1() {
        Student std = new Student();
        std.setName("B2");
        std.setRollno(213);
        std.setEmail("B2@Email");
        return std;
    }
    @Bean
    public Student stdId2() {
        Student std = new Student();
        std.setName(name);
        std.setRollno(rollno);
        std.setEmail(email);
        return std;
    }

    @Bean("beanName")
    public Student stdId34() {
        Student std = new Student();
        std.setName(name);
        std.setRollno(1000);
        std.setEmail(email);
        return std;
    }

}
