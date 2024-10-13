package fr.adriencaubel.exerciceC;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "RedirectServlet", urlPatterns = { "/redirect" })
public class RedirectServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Redirection vers un site externe
		String externalUrl = "https://www.iut-rodez.fr/fr";
		response.sendRedirect(externalUrl);
	}
}
