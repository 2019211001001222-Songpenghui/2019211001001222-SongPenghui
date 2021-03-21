package com.Songpenghui.week3;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class LifeCydeServlet extends HttpServlet {
    //1.tomcat read wen.xml file and find out all servlet class
    //2.load servlet - when? 2.first request for this servlet come in - from client
    //3.call default constructor add code
    public LifeCydeServlet(){
        System.out.println("i am in constructor --> LifeCydeServlet()");// line 1
    }
    //4.inti() - add code
    @Override
    public void init(){
        System.out.println("i am in init");//line 2
    }
    //5.tomcat call service() --> call doGet() or doPost()
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("i am in service () --> doGet()");//line 3
        //line 4 - 2nd request
        //line 5 - 3rd request
        //and so on -- many times
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    public void destroy() {
        System.out.println("i am in destroy()");//when? stop tomcat
    }
}

