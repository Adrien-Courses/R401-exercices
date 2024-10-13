package fr.adriencaubel.exerciceB;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//Utilisation de l'annotation @WebServlet pour déclarer le servlet
@WebServlet(name = "AnnotatedServlet", urlPatterns = { "/annotate" })
public class AnnotatedServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Appel à System.out.println()
		System.out.println("AnnotatedServlet was called via GET request");
	}
}
