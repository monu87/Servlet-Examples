package com.connectionpool;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class EmployeeInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	com.jolbox.bonecp.BoneCP boneCpConnectionPool =null;
	
	public void init(ServletConfig config)
	{
		
		boneCpConnectionPool= ConnectionManager.getConnectionPool();
		System.out.println("inti method of Employee conection onject :is :"+ boneCpConnectionPool);
	}
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out  = response.getWriter();
		String title="Employee inforamtion from oracle Database";
		out.print("<html><body bgcolor=\"#f0f0f0\">");
		out.print("<h1 align=\"center\">"+title+"</h1>");
		showEmployeeInformation(out);
		out.print("</body></html>");
		
	}


	private void showEmployeeInformation(PrintWriter out) {
		Connection con=null;
		Statement stm= null;
		
		try{
			
			con=boneCpConnectionPool.getConnection();
			String sql="Select EMPLOYEE_ID,FIRST_NAME,LAST_NAME,EMAIL,PHONE_NUMBER from EMPLOYEES";
			ResultSet rs=stm.executeQuery(sql);
			
			while(rs.next()){
				int id= rs.getInt("EMPLOYEE_ID");
				String firstname=rs.getString("FIRST_NAME");
				String lastname=rs.getString("LAST_NAME");
				String email   =rs.getString("EMAIL");
				String phone   =rs.getString("PHONE_NUMBER");
				
				out.print("Employee_id: "+id+"<br>");
				out.print("first_name : "+firstname+"<br>");
				out.print("last_name  : "+lastname+"<br>");
				out.print("email      : "+email+"<br>");
				out.print("phone      : "+phone+"<br>");
			}
			
			rs.close();
			
		}catch(Exception e){
			
		}
		
	}

	
}
