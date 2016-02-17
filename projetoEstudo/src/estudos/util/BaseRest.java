package estudos.util;

import java.util.HashMap;
import java.util.Optional;

import javax.inject.Singleton;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;


@Produces(MediaType.APPLICATION_JSON)
public abstract class BaseRest {
	@Context
	protected HttpServletRequest request;
	
	@Context
	protected HttpServletResponse response;
	
	private HashMap<Object, Object> map;
	
	public HashMap<Object, Object> getMap(){
		if(map == null){
			map = new HashMap<>();
		}
		return map;
	}
}
