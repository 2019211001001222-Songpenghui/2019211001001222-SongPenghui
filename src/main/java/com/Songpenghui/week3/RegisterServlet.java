package com.Songpenghui.week3;

import javax.servlet.*;
import javax.servlet.http.*;
import java.beans.Statement;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

//automatic -new --> servlet
public class RegisterServlet extends HttpServlet {
    public Connection dbConn;
    public void init() {


        try { Class.forName(getServletConfig().getServletContext().getInitParameter("driver"));
            dbConn = DriverManager.getConnection(getServletConfig().getServletContext().getInitParameter("url"), getServletConfig().getServletContext().getInitParameter("Username"), getServletConfig().getServletContext().getInitParameter("Password"));
        } catch (Exception e) {
            System.out.println(e); } }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// request come here-<from method=post>
        //get parameter from register
        String name,password,email,gender,date;
        name = request.getParameter("name");
        password = request.getParameter("password");email = request.getParameter("email");
        gender = request.getParameter("gender");date = request.getParameter("date");
        PrintWriter writer = response.getWriter();
        String[][] r = new String[1000][6];
        int  a= 0;
        try {

            Statement createDbStatement = (Statement) dbConn.createStatement();
            String ADDdbRequire = "insert into usertable values('" + name + "','" + password + "','" + email + "','" + gender + "','" + date + "')";
            ((java.sql.Statement) createDbStatement).executeUpdate(ADDdbRequire);
            //String dbRequire = "select * from usertable";
            //ResultSet resultDb = createDbStatement.executeQuery(dbRequire);
            //while (resultDb.next()) {
            // r[a][0] = resultDb.getObject(1).toString().trim();r[a][1] = resultDb.getObject(2).toString().trim();
            //r[a][2] = resultDb.getObject(3).toString().trim();r[a][3] = resultDb.getObject(4).toString().trim();
            // r[a][4] = resultDb.getObject(5).toString().trim();r[a++][5] = resultDb.getObject(6).toString().trim();}
        } catch (Exception e) {
            System.out.println(e);
        }
        response.sendRedirect("login.jsp");
}}
