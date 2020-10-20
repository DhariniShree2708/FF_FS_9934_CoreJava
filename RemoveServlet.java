package com.hcl.day35;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RemoveServlet
 */
@WebServlet("/RemoveServlet")
public class RemoveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RemoveServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ListReservation list = new ListReservation();
		String docType = ("<!DOCTYPE html>");
		PrintWriter pw = response.getWriter();
		pw.println(docType + "<html>\n" + "<head><title>" + "Reservation Portal" + "</title></head><body>");
		response.getWriter().append("Served at: ").append(request.getContextPath());
		int count = 0;
		for (HotelReservation list1 : list.details) {
			if (list1.getName().equals(request.getParameter("Name"))) {
				list.details.remove(list1);
				count = 1;
				pw.println("Deleted Successfully!");
				break;
			}
		}
		if (count == 0) {
			pw.println("No Matching Data");

			pw.println("<br/><a href=\"index.html\">");
			pw.println("</body></html>");
		}
	}

}
