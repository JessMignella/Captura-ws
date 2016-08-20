package br.com.fiap.captura.ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("Ola")
public class DigaOla {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String DigaOla(){
		return "Ola jersey";
	}
}
