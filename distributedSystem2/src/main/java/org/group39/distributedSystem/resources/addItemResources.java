package org.group39.distributedSystem.resources;



import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.group39.distributedSystem.model.addItemModel;
import org.group39.distributedSystem.service.addItemService; 

@Path("/setItem")
public class addItemResources {
	
	addItemService service = new addItemService();
	
	
	@Path("/Item")
	@POST
//	@Consumes(MediaType.MULTIPART_FORM_DATA)
	@Produces(MediaType.APPLICATION_JSON)
	public addItemModel setItem(addItemModel item) throws Exception {
		
			return service.addItemForAuction(item);  
		}  
		
}


