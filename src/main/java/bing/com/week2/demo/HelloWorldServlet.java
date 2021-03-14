package bing.com.week2.demo;

import javax.script.ScriptContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.io.IOException;

//now its just a java class
//extend HttpServlet
public class HelloWorldServlet extends HttpServlet {
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
        //when client request method is GET here - inside do Get()
        //we want to send Hello to client
        //we need to write hello in respose
        //get write - java .io
        PrintWriter writer = response.getWriter();
        writer.println("Hello Client !!!");//that all
        //next we need to tell about this servlet tomcat - -web.xml
    }
    public void dopost(HttpServletRequest requset,HttpServletResponse response){
        //when client request method is GET here - inside do Post()
    }
}
