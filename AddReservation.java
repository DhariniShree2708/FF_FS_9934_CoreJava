package com.hcl.day35;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HotelReservation
 */
@WebServlet("/AddReservation")
public class AddReservation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AddReservation() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ListReservation list = new ListReservation();
		int count = 0;
		response.setContentType("text/html");// setting the content type
		PrintWriter pw = response.getWriter(); // get the stream to write the data
		String title = "Welcome to Hotel Reservation Portal!";
		String doctype = ("<!DOCTYPE HTML>");
		pw.println(doctype + "<html>\n" + "<head><title>" + title + "</title></head><body>");
		pw.println("<p>Add Hotel Reservation Details:<p>");
		for (HotelReservation list1 : list.details) {
			if (list1.getName().equals(request.getParameter("Name"))) {
				list1.setFromDate(request.getParameter("Date of Accomodating Rooms"));
				list1.setToDate(request.getParameter("Date of Vacating Rooms"));
				list1.setStatus(request.getParameter("Status"));
				list1.setPrice(request.getParameter("Price"));
				count = 1;
				break;
			}
		}
		if (count == 0) {
			list.details.add(new HotelReservation(request.getParameter("Date of Accomodating Rooms"),
					request.getParameter("Date of Vacating Rooms"), request.getParameter("Name"),
					request.getParameter("Status"), request.getParameter("Price")));
		}
		pw.println("<p>Reservation Details Added Successfully!<p>");
		pw.println("</body></html>");
		pw.println("<h2>Thanks! Visit Again!<h2>");
		pw.close();

	}

}
