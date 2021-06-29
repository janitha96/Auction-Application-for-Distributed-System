package org.group39.distributedSystem.resources;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.group39.distributedSystem.model.seeProductsModel;
import org.group39.distributedSystem.service.seeProductsService;

@Path("/See") 
public class seeProducts {
	
	seeProductsService service = new seeProductsService();
	@Path("/products") 
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<seeProductsModel> seeProducts() throws SQLException {
//		List<seeProductsModel> see = new ArrayList<seeProductsModel>();
//		see = service.products();
		return service.products();
		
		//return  service.products();
	}
	
	@Path("/productsById/{id}") 
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<seeProductsModel> productsByIdSee(@PathParam("id") int id) throws SQLException {
		List<seeProductsModel> see = new ArrayList<seeProductsModel>();
		see = service.products();
		return service.productsById(id);
		
		//return  service.products();
	}

}
