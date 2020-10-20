package com.hcl.day35;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddReservationDetails
 */
@WebServlet("/ListReservation")
public class ListReservation extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static ArrayList<HotelReservation> details = new ArrayList<>();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ListReservation() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("<html><body>");
		if (details.equals(null)) {
			pw.println("<h1>" + "No Data Exists" + "</h1>");

		} else {
			pw.println("<table border=\"5\">" + "<tr><th>Date of Accomodating Rooms</th>"
					+ "<th>Date of Vacating Rooms</th>" + "<th>Name</th>" + "<th>Status</th>" + "<th>Price</th></tr>");
			for (HotelReservation lists : details) {
				pw.println("<tr><td>" + lists.getFromDate() + "</td>" + "<td>" + lists.getToDate() + "</td>" + "<td>"
						+ lists.getName() + "</td>" + "<td>" + lists.getStatus() + "</td>" + "<td>" + lists.getPrice()
						+ "</td>" + "<td>" + "<a href=\"/AddReservation/form.html\">" + "edit" + "</a>"
						+ "<a href=\"/AddReservation/delete.html\">" + "delete" + "</a>");
				pw.println("</tr></table>");
			}
			pw.println("</body></html>");

		}

	}

}
