package com.Songpenghui.week6;

import javax.servlet.*;
import java.sql.Connection;
import java.sql.DriverManager;

//@WebListener()
public class jdbcServletContextListener implements ServletContextListener {


    @Override
    public void contextInitialized(ServletContextEvent sce) {
        Connection dbConn;
        ServletContext c = sce.getServletContext();

        try {
            Class.forName(c.getInitParameter("driver"));
            dbConn = DriverManager.getConnection(c.getInitParameter("url"),
                    c.getInitParameter("Username"),
                    c.getInitParameter("Password"));
            c.setAttribute("dbConn",dbConn);
//            System.out.println(dbConn);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}