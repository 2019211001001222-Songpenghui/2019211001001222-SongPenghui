package com.Songpenghui.week6;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.net.URLEncoder;

@WebServlet(name = "RedirectServlet", value = "/RedirectServlet")
public class RedirectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        String txt = URLEncoder.encode(request.getParameter("txt"),"utf-8");
        String search = request.getParameter("search");
        System.out.println(search);
        if(txt.equals("")){
            response.sendRedirect("index.jsp");
        }else{
            if(search.equals("baidu")){
                response.sendRedirect("https://www.baidu.com/s?wd=" + txt);
            }else if(search.equals("bing")){
                response.sendRedirect("https://cn.bing.com/search?q=" + txt);
            }else if(search.equals("google")){
                response.sendRedirect("https://www.google.cn/search?q=" +txt);
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
