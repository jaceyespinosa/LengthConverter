package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.LengthConverter;

/*
 * Servlet for the kilometer jsp's to work with
 */


@SuppressWarnings("serial")
@WebServlet("/kilometersToMetersServlet")
public class KilometersToMetersServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userKilometers = request.getParameter("userKilometers");
		LengthConverter converter = new LengthConverter(Double.parseDouble(userKilometers));
		converter.kilometersToMeters();

		request.setAttribute("convertedLength", converter);
		getServletContext().getRequestDispatcher("/kilometersResult.jsp").forward(request, response);
	}
}