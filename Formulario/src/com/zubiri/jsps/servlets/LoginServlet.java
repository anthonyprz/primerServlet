package com.zubiri.jsps.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
//@WebServlet("/LoginWeb.jr")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String usuario = request.getParameter("nombre");
		String pass = request.getParameter("pass");
		
		System.out.println("usuario: " + usuario);
		System.out.println("contraseña: " + pass);
		
		if(usuario.equals("anthony") && pass.equals("perez")){
			System.out.println("LOOOOL");
			request.setAttribute("usuarioLogeado", usuario+" "+pass);
			request.getRequestDispatcher("welcome.jsp").forward(request, response);
		}
		else {
			System.out.println("error usuario no existe");
		}
	}

}
