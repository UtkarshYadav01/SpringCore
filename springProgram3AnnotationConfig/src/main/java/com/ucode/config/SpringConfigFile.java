package com.ucode.config;

import com.ucode.beans.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:student.properties") // Load properties from the file
//@ComponentScan("com.ucode.beans")
//@ComponentScan({"com.ucode.beans"})
@ComponentScan(basePackages = {"com.ucode.beans"})
public class SpringConfigFile {

}
