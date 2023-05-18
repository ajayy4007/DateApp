package com.nt.servlet;

import java.io.IOException;
import java.io.*;
import java.util.*;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class DateServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
				res.setContentType("text/html");
				PrintWriter pw=res.getWriter();
				Date d=new Date();
				pw.println("<h1 style='color:red;text-align:center'>Date and Time is::"+d+"</h1>");
				pw.println("<h2 style='color:blue;text-align:center'>Welcome To Servlet</h2>");
				pw.println("<br><b>CurrentServlet class obj hashCode"+this.hashCode()+"<br>");
				pw.println("<br><b>req obj hashCode"+req.hashCode()+"</br>");
				pw.println("<br><b>current Thread obj hashCode"+Thread.currentThread().hashCode()+"--Current Thread name::</br>"+Thread.currentThread().getName());
				pw.close();
				try
				{
					Thread.sleep(30000);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
	}
