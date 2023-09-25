package com.assignment.service;

import java.io.PrintWriter;
import java.lang.ProcessBuilder.Redirect;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Servelet extends HttpServlet {
	String username, password;
	
	public void service(HttpServletRequest req, HttpServletResponse res) {
		
		
		
        username = req.getParameter("username");
		
		password = req.getParameter("password");
try {
			
			
			if(username != null && password != null ) {
				
				if(username.equalsIgnoreCase("raphaela664") && password.equalsIgnoreCase("test123")) {
					res.sendRedirect("./homepage.html?username"+username);

				}else {
					res.sendRedirect("./ForgetPassword.html");
					
				}
			}
			
			
			
		} catch (java.io.IOException e) {
			
			e.printStackTrace();
		}
		
	}

}
