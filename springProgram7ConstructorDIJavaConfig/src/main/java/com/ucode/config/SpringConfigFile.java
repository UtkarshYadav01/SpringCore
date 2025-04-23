package com.ucode.config;

import com.ucode.beans.Address;
import com.ucode.beans.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigFile {

    @Bean
    public Address createAddrObj(){
        Address address = new Address(200,"Agra",3423);
        return address;
    }

    @Bean
    public Student createStdObj(){
        Student student = new Student(103,"Utkarsh",createAddrObj());
        return student;
    }
}
