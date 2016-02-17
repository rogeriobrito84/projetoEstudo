package estudos.servicos;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import estudos.to.Usuario;

@Path("/principal")
public class TesteServico {
	@Context
	private HttpServletRequest request;
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String bemVindo(){
		String login = (String) request.getSession().getAttribute("usuario");
		String msg = "É null";
		if(login != null){
			if(login.equals("login")){
				msg ="Seja bem vindo";
			}else{
				msg ="Por favor faço o login!";
			}
		}
		return msg;
	}
	
	@GET
	@Path("/nomes")
	@Produces({MediaType.APPLICATION_JSON})
	public List<Usuario> getNomes(){
		List<Usuario> lista = new ArrayList<>();
		Usuario usu = new Usuario();
		usu.setId(1);
		lista.add(usu);
		return lista;
	}
	
	
	
	
}
