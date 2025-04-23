package com.ucode.controllers;

import com.ucode.DBCon.DbConnection;
import com.ucode.model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@WebServlet("/loginForm")
public class LoginController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");

        String myEmail = req.getParameter("email1");
        String myPassword = req.getParameter("pass1");

        try {
            Connection con = DbConnection.getConnection();

            String select_sql_query = "SELECT * FROM register WHERE email = ? AND password = ?";
            PreparedStatement ps = con.prepareStatement(select_sql_query);
            ps.setString(1, myEmail);
            ps.setString(2, myPassword);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                User user = new User();
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));
                user.setCity(rs.getString("city"));

                HttpSession session = req.getSession();
                session.setAttribute("session",user);

                RequestDispatcher rd = req.getRequestDispatcher("/profile.jsp");
                rd.forward(req, resp);
            } else {
                out.println("<h3 style='color:red'>Email id and password didn't matched </h3>");
                RequestDispatcher rd = req.getRequestDispatcher("/login.html");
                rd.include(req, resp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
