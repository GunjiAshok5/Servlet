package com.app;

import java.io.PrintWriter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/sub")
public class SubServlet extends HttpServlet {
	
	
	public void service(ServletRequest req,ServletResponse res)
    {
        try{
              String s1=req.getParameter("first");         
              String s2=req.getParameter("second");
               int x=Integer.parseInt(s1);
               int y=Integer.parseInt(s2);
            PrintWriter pw=res.getWriter();
            pw.println("Output :"+(x-y));
           }catch(Exception e)
           {
               System.err.println(e);
           }
     }
}
