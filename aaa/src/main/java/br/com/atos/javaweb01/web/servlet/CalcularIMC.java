package br.com.atos.javaweb01.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalcularIMC
 */
@WebServlet("/CalcularIMC")
public class CalcularIMC extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException {
	    System.out.println("Método doPost chamado"); 
	    double peso = Double.parseDouble(request.getParameter("peso"));
	    double altura = Double.parseDouble(request.getParameter("altura"));
	    double imc = calcularIMC(peso, altura);

	    response.setContentType("text/html");
	    PrintWriter out = response.getWriter();
	    out.println("<!DOCTYPE html>");
	    out.println("<html>");
	    out.println("<head>");
	    out.println("<meta charset='UTF-8' >");
	    out.println("<title>Calculadora de IMC</title>");
	    out.println("</head>");
	    out.println("<body>");
	    out.println("<h2>Resultado do IMC:</h2>");
	    out.println("<p>Peso: " + peso + " kg</p>");
	    out.println("<p>Altura: " + altura + " m</p>");
	    out.println("<p>IMC: " + imc + "</p>");
	    out.println("</body>");
	    out.println("</html>");
	    
	    out.flush();
	}

    private double calcularIMC(double peso, double altura) {
        
        return peso / (altura * altura);
    }
}

