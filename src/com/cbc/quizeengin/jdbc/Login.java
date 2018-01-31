package com.cbc.quizeengin.jdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {

			String email = request.getParameter("email");
			String password = request.getParameter("password");
			
			String dbUsername = null;
			String dbName = null;
			String dbPassword = null;
			String sql = "select * from user where email =? and password=?";
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/quize_db", "root", "");
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, email);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			PrintWriter out = response.getWriter();
			while (rs.next()) {
				dbName = rs.getString(3);
				dbUsername = rs.getString(2);
				dbPassword = rs.getString("password");
			}
			
			if(email.equals(dbName) && password.equals(dbPassword)) {
		
				out.println("Wlcome "+dbUsername);
				RequestDispatcher rd = request.getRequestDispatcher("quize.jsp");
				rd.include(request, response);
			}else {
				//response.sendRedirect("UserLogin.jsp");
				RequestDispatcher rd = request.getRequestDispatcher("error_page.jsp");
				rd.include(request, response);
			}
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
