package com.guyue.javaee;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Description
 * @auther hujun
 * @create 2020-04-17 15:43
 */
@WebServlet(name = "TestServlet")
public class TestServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().println("hello world");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        StringBuffer requwet= request.getRequestURL();
        String rootUrl ="http://localhost:8081/javaee1/test";
        requwet.delete(0,rootUrl.length());
        System.out.println(requwet);

        if(requwet.toString().equals("/t1")){
            t1(request,response);
        }else if(requwet.toString().equals("/t2")){
            t2(request,response);
        }else{
            response.getWriter().println("hello world");
        }


    }


    public void t1(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        /*StringBuffer requwet= request.getRequestURL();
        String rootUrl ="http://localhost:8081/javaee1/test";
        requwet.delete(0,rootUrl.length());
        System.out.println(requwet);*/
        response.getWriter().println("hello world   t1");
    }

    public void t2(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
       /* StringBuffer requwet= request.getRequestURL();
        String rootUrl ="http://localhost:8081/javaee1/test";
        requwet.delete(0,rootUrl.length());
        System.out.println(requwet);*/
        response.getWriter().println("hello world   t2");
    }
}
