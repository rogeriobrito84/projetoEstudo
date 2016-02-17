package estudos.servicos;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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

import estudos.to.Usuario;

@Path("/login")
public class LoginServico {
	@Context
	private HttpServletRequest request;
	
	@Context
	private HttpServletResponse response;
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public Response login(){
		request.getSession().setAttribute("usuario", "login");
		return Response.ok().build();
	}	
	
	@GET
	@Path("/out")
	@Produces(MediaType.TEXT_HTML)
	public Response logout(){
		request.getSession().setAttribute("usuario", "logout");
		return Response.ok().build();
	}
	
}
