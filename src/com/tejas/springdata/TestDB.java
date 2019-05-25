package com.tejas.springdata;



	import java.io.IOException;
	import java.io.PrintWriter;

	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;
	import com.mysql.jdbc.Driver;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.*;

	/**
	 * Servlet implementation class TestDbServlet
	 */
	// @WebServlet("/TestDbServlet")
	
	//public class TestDB extends HttpServlet {
		//private static final long serialVersionUID = 1L;

		/**
		 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
		 */
	
	   @Controller
	   public class TestDB
	   {
	   
		// protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

			// setup connection variables
		    @RequestMapping("/test")
		    public String connectionCheck()
		    {
			  String user = "root";
			  String pass = "Hassan@123";
			
			  String jdbcUrl = "jdbc:mysql://localhost/world?useSSL=false&serverTimezone=UTC";
			  String driver = "com.mysql.jdbc.Driver";
			
			// get connection to database
			try {
				  // PrintWriter out = response.getWriter();
				
				// out.println("Connecting to database: " + jdbcUrl);
				
				Class.forName(driver);
				
				Connection myConn = DriverManager.getConnection(jdbcUrl, user, pass);
				
				// out.println("SUCCESS!!!");
				
				myConn.close();
				
				return "Success";
				
			}
			catch (Exception exc) {
				exc.printStackTrace();
				return "Failure";
			}
		
		
		}

	}







