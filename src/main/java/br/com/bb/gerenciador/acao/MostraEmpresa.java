package br.com.bb.gerenciador.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.bb.gerenciador.modelo.Banco;
import br.com.bb.gerenciador.modelo.Empresa;

public class MostraEmpresa implements Acao {
	
	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Mostrando dados da empresa");
		
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		Banco banco = new Banco();
		
		Empresa empresa = banco.getEmpresaById(id);
		
		request.setAttribute("empresa", empresa);
		
		
		return "forward:formAlteraEmpresa.jsp";
				
	}

}
