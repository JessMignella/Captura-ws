package br.com.fiap.captura.ws;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.fiap.captura.dao.CapturaDAO;
import br.com.fiap.captura.to.CapturaTO;

@Path("captura")
public class CapturaWS {
	CapturaDAO CapturaDAO = new CapturaDAO();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<CapturaTO> getCapturas() {
		List<CapturaTO> listOfCapturas = CapturaDAO.getAllCapturas();
		return listOfCapturas;
	}

	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public CapturaTO getCapturaById(@PathParam("id") String id) {
		return CapturaDAO.getCapturaTO(id);
	}

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public CapturaTO addCaptura(CapturaTO CapturaTO) {
		System.out.println(CapturaTO.toString());
		return CapturaDAO.addCapturaTO(CapturaTO);
	}

	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	public CapturaTO updateCApturaTO(CapturaTO CapturaTO) {
		
		return CapturaDAO.updateCapturaTO(CapturaTO);
	}

	@DELETE
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public void deleteCapturaTO(@PathParam("id") String id) {
		CapturaDAO.deleteCapturaTO(id);
		;
	}
}
