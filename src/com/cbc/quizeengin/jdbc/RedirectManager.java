package com.cbc.quizeengin.jdbc;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RedirectManager")
public class RedirectManager extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RedirectManager() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		if (request.getParameter("quize") != null) {
			RequestDispatcher rd = request.getRequestDispatcher("quize.jsp");
			rd.include(request, response);
		}
		else if(request.getParameter("login_again") != null) {
			RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
			rd.include(request, response);	
		}

	}

}
