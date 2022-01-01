package br.com.bb.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/entrada")
public class UnicaEntradaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
//		String paramAcao = request.getParameter("acao");

//		HttpSession sessao = request.getSession();
//		boolean usuarioNaoEstaLogado = (sessao.getAttribute("usuarioLogado") == null);
//		boolean ahUmaAcaoProtegida = !(paramAcao.equals("Login") || paramAcao.equals("LoginForm"));
//		
//		if (ahUmaAcaoProtegida && usuarioNaoEstaLogado) {
//			response.sendRedirect("entrada?acao=LoginForm");
//			return;
//		}

//		String nomeDaClasse = "br.com.bb.gerenciador.acao." + paramAcao;
//
////		carrega a classe com o valor da string.
//		String nome;
//		try {
//			@SuppressWarnings("rawtypes") 
//			Class classe = Class.forName(nomeDaClasse);
//			@SuppressWarnings("deprecation")
//			Acao acao = (Acao) classe.newInstance();
//			nome = acao.executa(request, response);
//		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | ServletException
//				| IOException e) {
//			throw new ServletException(e);
//		}
//
//		String[] tipoEndereco = nome.split(":");
//
//		if (tipoEndereco[0].equals("forward")) {
//			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/" + tipoEndereco[1]);
//			rd.forward(request, response);
//		} else {
//
//			response.sendRedirect(tipoEndereco[1]);
//		}

	}

}
