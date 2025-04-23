package com.ucode.main;

import com.ucode.beans.Student;
import com.ucode.config.SpringConfigFile;
import com.ucode.mappers.StudentRowMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
        ApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");
        JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);

//-----------------------INSERT OPERATION------------------------------------
      /*String std_roll = "103";
        String std_name = "Samarth";
        float std_marks = 43f;

        String insert_sql_query = "INSERT INTO student VALUES(?,?,?)";
        int update = jdbcTemplate.update(insert_sql_query, std_roll, std_name, std_marks);
        if (update > 0) {
            System.out.println("insertion success");
        } else {
            System.out.println("insertion failed");
        }*/
//-----------------------UPDATE OPERATION------------------------------------
        /*float marks = 98.3f;
        int rollNo = 108;
        String update_sql_query = "UPDATE student SET std_marks=? WHERE std_roll=?";
        int update = jdbcTemplate.update(update_sql_query, marks, rollNo);
        if (update > 0) {
            System.out.println("updation  success");
        } else {
            System.out.println("updation failed");
        }*/
//-----------------------DELETE OPERATION------------------------------------
        /*int rollNo = 108;
        String delete_sql_query = "DELETE FROM student WHERE std_roll=?";
        int update = jdbcTemplate.update(delete_sql_query, rollNo);
        if (update > 0) {
            System.out.println("deletion  success");
        } else {
            System.out.println("deletion failed");
        }*/
//-----------------------SELECT OPERATION 1 -----------------------------------
        //String select_sql_query = "SELECT * FROM student";
        //1.*** Implementation class ***
        /*List<Student> studentList = jdbcTemplate.query(select_sql_query, new StudentRowMapper());*/

        //2.*** Anonymous class ***
        /*List<Student> studentList = jdbcTemplate.query(select_sql_query, new RowMapper<>() {

            @Override
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                Student std = new Student();
                std.setRollNo(rs.getInt("std_roll"));
                std.setName(rs.getString("std_name"));
                std.setMarks(rs.getFloat("std_marks"));
                return std;
            }
        });*/

        //3.*** lambda expression ***
        /*List<Student> studentList = jdbcTemplate.query(select_sql_query, (rs, rowNum) -> {
            Student std = new Student();
            std.setRollNo(rs.getInt("std_roll"));
            std.setName(rs.getString("std_name"));
            std.setMarks(rs.getFloat("std_marks"));
            return std;
        });
        studentList.forEach(System.out::println);*/
//-----------------------SELECT OPERATION 2 -----------------------------------
        /*int rollNo = 108;
        String select_sql_query = "SELECT * FROM student WHERE std_roll=?";
        List<Student> studentList = jdbcTemplate.query(select_sql_query, (rs, rowNum) -> {
            Student std = new Student();
            std.setRollNo(rs.getInt("std_roll"));
            std.setName(rs.getString("std_name"));
            std.setMarks(rs.getFloat("std_marks"));
            return std;
        }, rollNo);
        studentList.forEach(System.out::println);*/
//-----------------------SELECT OPERATION 3 -----------------------------------
        int rollNo = 103;
        String select_sql_query = "SELECT * FROM student WHERE std_roll=?";
        Student stdStudent = jdbcTemplate.queryForObject(select_sql_query, (rs, rowNum) -> {
            Student std = new Student();
            std.setRollNo(rs.getInt("std_roll"));
            std.setName(rs.getString("std_name"));
            std.setMarks(rs.getFloat("std_marks"));
            return std;
        }, rollNo);
        System.out.print(stdStudent);
    }
}
