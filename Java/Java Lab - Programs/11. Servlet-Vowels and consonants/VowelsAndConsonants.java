
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class VowelsAndConstants
 */
@WebServlet("/VowelsAndConstants")
public class VowelsAndConsonants extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public VowelsAndConsonants() {
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
		PrintWriter out = response.getWriter();
		out.println("<h2>The Number of Vowels and Constants:</h2><br><hr>");

		String usrInputTxt = request.getParameter("txt");
		int vowelCount = 0;
		int constantCount = 0;

		String inputTxt = usrInputTxt;

		for (int i = 0; i < inputTxt.length(); i++) {
			char c = inputTxt.charAt(i);

			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				vowelCount++;
			} else {
				constantCount++;
			}
		}
		out.println("<p>The Number of Vowels in <strong>" + usrInputTxt + "</strong> : " + vowelCount + "</p>");
		out.println("<p>The Number of Constantss in <strong>" + usrInputTxt + "</strong> : " + constantCount + "</p>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
