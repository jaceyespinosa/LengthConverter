package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.LengthConverter;

@SuppressWarnings("serial")
@WebServlet("/metersToCentimetersServlet")
public class MetersToCentimetersServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userMeters = request.getParameter("userMeters");
		LengthConverter converter = new LengthConverter(Double.parseDouble(userMeters));
		converter.metersToCentimeters();

		request.setAttribute("convertedLength", converter);
		getServletContext().getRequestDispatcher("/metersResult.jsp").forward(request, response);
	}
}