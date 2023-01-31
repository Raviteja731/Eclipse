package com.xworkz.message.servelet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Message
 */
@WebServlet(loadOnStartup = 1, name = "sms", urlPatterns = { "/sms" })
public class Message extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Message() {
		super();
		System.out.println("running : " + getClass().getSimpleName());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		System.out.println("creating do post method");
		
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String gender = request.getParameter("gender");
		String reason = request.getParameter("reason");
		String address = request.getParameter("address");
		
		System.out.println(fname);
		System.out.println(lname);
		System.out.println(gender);
		System.out.println(reason);
		System.out.println(address);

		RequestDispatcher disp1 = request.getRequestDispatcher("Display.jsp");
		request.setAttribute("fname", fname);
		request.setAttribute("lname", lname);
		request.setAttribute("age", gender);
		request.setAttribute("reason", reason);
		request.setAttribute("address", address);
		disp1.forward(request, response);
		
		
	}

}
