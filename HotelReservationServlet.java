package com.hcl.day33.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HotelReservationServlet
 */
@WebServlet("/HotelReservationServlet")
public class HotelReservationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public HotelReservationServlet() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");// setting the content type
		PrintWriter pw = response.getWriter(); // get the stream to write the data
		// writing html in the stream
		pw.println("<html>" + "<body>" + "<form>" + "<h1>" + "Welcome to Hotel Reservation System!" + "<table>"
				+ "<tr><td>" + "Date of Accomodation:" + "</td>" + "<td>" + "<input type=\"text\">" + "</td></tr>"
				+ "\n" + "<tr><td>" + "Date of Reception:" + "</td>" + "<td>" + "<input type=\"text\">" + "</td></tr>"
				+ "\n" + "<tr><td>" + "Name:" + "</td>" + "<td>" + "<input type=\"text\">" + "</td></tr>" + "\n"
				+ "<tr><td>" + "Status:" + "</td>" + "<td>" + "<input type=\"text\">" + "</td></tr>" + "\n" + "<tr><td>"
				+ "Price(INR):" + "</td>" + "<td>" + "<input type=\"text\">" + "</td></tr>" + "\n" + "<tr><td>"
				+ "<input type=\"submit\">" + "</td>" + "<td>" + "<input type=\"button\" value=\"reset\">"
				+ "</td></tr>" + "</table></form>" + "<h1>" + "Thanks!  Visit Again !!! " + "</h1>" + "</body>"
				+ "</html>");
		pw.close();
	}

}
