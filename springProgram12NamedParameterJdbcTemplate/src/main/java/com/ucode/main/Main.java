package com.ucode.main;

import com.ucode.beans.Student;
import com.ucode.mappers.StudentRowMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
        ApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");
        NamedParameterJdbcTemplate npJdbcTemplate = context.getBean(NamedParameterJdbcTemplate.class);

//-----------------------INSERT OPERATION------------------------------------
        /*HashMap<String, Object> map = new HashMap<>();
        map.put("Key_rollNo", 101);
        map.put("Key_name", "Utkarsh");
        map.put("Key_marks", 99.8f);

        String insert_sql_query = "INSERT INTO student VALUES(:Key_rollNo, :Key_name, :Key_marks)";
        int update = npJdbcTemplate.update(insert_sql_query, map);
        if (update > 0) {
            System.out.println("insertion success");
        } else {
            System.out.println("insertion failed");
        }*/
//-----------------------UPDATE OPERATION------------------------------------
        /*HashMap<String, Object> map = new HashMap<>();
        map.put("Key_rollNo", 101);
        map.put("Key_name", "Utkarsh");

        String update_sql_query = "UPDATE student SET std_roll= :Key_rollNo WHERE std_name= :Key_name";
        int update = npJdbcTemplate.update(update_sql_query, map);
        if (update > 0) {
            System.out.println("insertion success");
        } else {
            System.out.println("insertion failed");
        }*/
//-----------------------DELETE OPERATION------------------------------------
        /*HashMap<String, Object> map = new HashMap<>();
        map.put("Key_rollNo", 105);
        String delete_sql_query = "DELETE FROM student WHERE std_roll=:Key_rollNo";
        int update = npJdbcTemplate.update(delete_sql_query, map);
        if (update > 0) {
            System.out.println("deletion  success");
        } else {
            System.out.println("deletion failed");
        }*/
//-----------------------SELECT OPERATION 1 -----------------------------------
        /*String select_sql_query = "SELECT * FROM student";
        List<Student> studentList = npJdbcTemplate.query(select_sql_query, (rs, rowNum) -> {
            Student std = new Student();
            std.setRollNo(rs.getInt("std_roll"));
            std.setName(rs.getString("std_name"));
            std.setMarks(rs.getFloat("std_marks"));
            return std;
        });
        studentList.forEach(System.out::println);*/
//-----------------------SELECT OPERATION 2 -----------------------------------
        /*not complete
        HashMap<String, Object> map = new HashMap<>();
        map.put("Key_rollNo", 101);
        String select_sql_query = "SELECT * FROM student WHERE std_roll= :Key_rollNo";
        List<Student> studentList = npJdbcTemplate.query(select_sql_query,)
        studentList.forEach(System.out::println);*/
//-----------------------SELECT OPERATION 3 -----------------------------------
        /*not complete
        HashMap<String, Object> map = new HashMap<>();
        map.put("Key_rollNo", 103);
        String select_sql_query = "SELECT * FROM student WHERE std_roll= :Key_rollNo";
        npJdbcTemplate.queryForObject(select_sql_query,map,new BeanPropertyRowMapper<>());
        //System.out.print(stdStudent);*/
    }
}
