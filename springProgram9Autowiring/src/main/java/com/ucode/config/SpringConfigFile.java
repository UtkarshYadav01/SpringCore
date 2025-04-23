package com.ucode.config;

import com.ucode.beans.Address;
import com.ucode.beans.Student;
import com.ucode.beans.Subjects;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class SpringConfigFile {

    @Bean
    public Address createAddrObj(){
        Address address = new Address();
        address.setHouseNo(123);
        address.setCity("Pune");
        address.setPinCode(12312);
        return address;
    }

    @Bean
    public Subjects createSubjObj(){
        Subjects subjects = new Subjects();
        ArrayList<String> list = new ArrayList<>();
        list.add("java");
        list.add("Python");
        list.add("C++");
        subjects.setSubjects(list);
        return subjects;
    }

    @Bean
    public Student createStdObj(){
        Student student = new Student();
        student.setName("Bittu");
        student.setRollNo(102);
        //student.setAddress(createAddrObj());// manual dependency injection
        return student;
    }
}
