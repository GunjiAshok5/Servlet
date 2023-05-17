package com.app;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/arithmetic")
public class Arithmetic extends HttpServlet {

	 public void service(ServletRequest req,ServletResponse res)

     {

           try{

                  ServletContext sc=getServletContext();

                  String s=req.getParameter("task");

                  if(s.equals("ADD"))

                 {               

                   RequestDispatcher rd1=sc.getRequestDispatcher("/add");

                   rd1.forward(req,res);

                 }

                 else if(s.equals("SUB"))

                 {


                    RequestDispatcher rd2=sc.getRequestDispatcher("/sub");

                    rd2.forward(req,res);

                 }

                  else if(s.equals("MUL"))

                 {

                    RequestDispatcher rd3=sc.getRequestDispatcher("/mul");

                     rd3.forward(req,res);

                 }

                 else if(s.equals("DIV"))

                 {

                    RequestDispatcher rd4=sc.getRequestDispatcher("/div");

                    rd4.forward(req,res);

                 }

              }catch(Exception e)
              {
                  System.err.println(e);
              }
    }
	

  
}
