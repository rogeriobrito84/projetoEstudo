package estudos.servicos;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.inject.Singleton;
import javax.servlet.DispatcherType;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.eclipse.jdt.internal.compiler.parser.RecoveredUnit;

import estudos.to.Usuario;
import estudos.util.BaseRest;

@Path("/login")
public class LoginServico extends BaseRest{
	
	
	@GET
	public Response login(){
		try {
			getMap().put("msg", "");
			request.getSession().setAttribute("usuario", "login");
			getMap().put("userToken", "dsaddfadfq3rfq34");
			List<Usuario> lista = new ArrayList<>();
			Usuario usu = new Usuario();
			usu.setId(1);
			lista.add(usu);
			getMap().put("usu", usu);
			
			
			int a = Integer.parseInt("a");
			
		} catch (Exception e) {
			getMap().put("code", e.getMessage());
			return Response.status(Status.LENGTH_REQUIRED).entity(getMap()).build();
		}
		return Response.ok(getMap()).build();
	}	
	
	@GET
	@Path("/out")
	@Produces(MediaType.TEXT_HTML)
	public Response logout(){
		request.getSession().setAttribute("usuario", "logout");
		return Response.ok().build();
	}
	
}
