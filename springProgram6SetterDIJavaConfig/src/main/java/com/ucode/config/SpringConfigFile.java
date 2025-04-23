package com.ucode.config;

import com.ucode.beans.Address;
import com.ucode.beans.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
    public Student createStdObj(){
        Student student = new Student();
        student.setName("Bittu");
        student.setAddress(createAddrObj());
        student.setRollNo(102);
        return student;
    }
}
