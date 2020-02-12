package loginApp;

import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("LoginServlet/LoginIndex")

public class loginIndex extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter printWriter = response.getWriter();
		String userName = request.getParameter("userName");
		String password = request.getParameter("userPassword");
		if (userName.equals("Michael") && (password.equals("123456"))) {
			printWriter.println("Login Succeeded!");
		} else {
			printWriter.println("Login Failed!");
		}
	}

	public void destroy() {

	}
}
