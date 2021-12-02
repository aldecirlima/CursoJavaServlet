package br.com.bb.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


// A anota��o abaixo define a rota da requisi��o
// @WebServlet(urlPatterns = "/oi")
public class OlaMundoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	public OlaMundoServlet() {
		System.out.println("Criando oi mundo servlet...");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException{

		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h3>Ol� mundo, parab�ns voc� escreveu o primeiro Servlet</h3>");
		out.println("</body>");
		out.println("</html>");
		
//		System.out.println("O servlet OlaMundoServlet foi chamado.");
	}

}
