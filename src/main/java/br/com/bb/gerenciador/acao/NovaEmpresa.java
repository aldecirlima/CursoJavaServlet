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

public class NovaEmpresa implements Acao {
	
	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("Cadastrando nova empresa.");

//			Obtendo os parametros da requisição http com o request.getParameter
		String nomeEmpresa = request.getParameter("nome");
		String paramDataEmpresa = request.getParameter("data");

		Date dataAbertura = null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			dataAbertura = sdf.parse(paramDataEmpresa);
		} catch (ParseException e) {
			throw new ServletException(e);
		}

		Empresa empresa = new Empresa();
		empresa.setNome(nomeEmpresa);
		empresa.setDataAbertura(dataAbertura);

		Banco banco = new Banco();
		banco.adiciona(empresa);

		request.setAttribute("empresa", empresa.getNome());

//			O response.sendRedirect, responde ao navegador, e informa qual deve ser a nova requisição
//			a ser efetuada pelo próprio navegador. Obs: neste caso não se usa o "/", usamos somente o nome do servlet
		return "redirect:entrada?acao=ListaEmpresas";

	}
}
