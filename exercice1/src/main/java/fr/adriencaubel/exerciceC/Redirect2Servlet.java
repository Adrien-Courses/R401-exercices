package fr.adriencaubel.exerciceC;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "Redirect2Servlet", urlPatterns = { "/redirect2" })
public class Redirect2Servlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// URL vers laquelle l'utilisateur sera redirigé
		String externalUrl = "https://www.iut-rodez.fr/fr";

		// Ajout de l'en-tête "Location" avec l'URL de redirection
		response.setHeader("Location", externalUrl);

		// Envoi du code statut HTTP de redirection (302 - redirection temporaire)
		response.setStatus(HttpServletResponse.SC_FOUND); // 302 Found
	}
}