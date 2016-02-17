package estudos.servicos;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import estudos.to.Usuario;

@Path("/principal")
public class TesteServico {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String bemVindo(){
		return "Sejam Bem vindos!";
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
