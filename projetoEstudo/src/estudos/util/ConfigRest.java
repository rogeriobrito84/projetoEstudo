package estudos.util;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import estudos.servicos.LoginServico;
import estudos.servicos.TesteServico;

@ApplicationPath("/servico")
public class ConfigRest extends Application{
	public ConfigRest(){
		
	}
	
	@Override
	public Set<Class<?>> getClasses() {
		final Set<Class<?>> classes = new HashSet<Class<?>>( );
		classes.add(TesteServico.class);
		classes.add(LoginServico.class);
		return classes;
	}
	
}
