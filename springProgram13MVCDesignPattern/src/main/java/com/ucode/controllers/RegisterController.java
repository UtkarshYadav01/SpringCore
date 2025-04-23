package com.ucode.controllers;

import com.ucode.DBCon.DbConnection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

@WebServlet("/regForm")
public class RegisterController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");

        String myName = req.getParameter("name1");
        String myEmail = req.getParameter("email1");
        String myPassword = req.getParameter("pass1");
        String myCity = req.getParameter("city1");

        try {
            Connection con = DbConnection.getConnection();

            String insert_sql_query = "INSERT INTO register VALUES(?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(insert_sql_query);
            ps.setString(1, myName);
            ps.setString(2, myEmail);
            ps.setString(3, myPassword);
            ps.setString(4, myCity);

            int i = ps.executeUpdate();
            if (i > 0) {
                out.println("<h3 style='color:green'>Registered successfully</h3>");
                RequestDispatcher rd = req.getRequestDispatcher("/login.html");
                rd.include(req, resp);
            } else {
                out.println("<h3 style='color:red'>User not Registered due to some error</h3>");
                RequestDispatcher rd = req.getRequestDispatcher("/register.html");
                rd.include(req, resp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
