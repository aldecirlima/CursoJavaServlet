package br.com.bb.gerenciador.acao;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.bb.gerenciador.modelo.Banco;
import br.com.bb.gerenciador.modelo.Empresa;

public class AlteraEmpresa {

	public void executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//		Obtendo os parametros da requisição http com o request.getParameter
		String nomeEmpresa = request.getParameter("nome");
		String paramDataEmpresa = request.getParameter("data");
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);

		System.out.println("Acao altera empresa" + id);

		Date dataAbertura = null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			dataAbertura = sdf.parse(paramDataEmpresa);
		} catch (ParseException e) {
			throw new ServletException(e);
		}

		Banco banco = new Banco();

		Empresa empresa = banco.getEmpresaById(id);

		empresa.setNome(nomeEmpresa);
		empresa.setDataAbertura(dataAbertura);
		response.sendRedirect("entrada?acao=ListaEmpresas");

	}

}
