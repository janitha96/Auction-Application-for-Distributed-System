package org.group39.distributedSystem.resources;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.group39.distributedSystem.model.addItemModel;
import org.group39.distributedSystem.model.bidPriceModel;
import org.group39.distributedSystem.model.seeProductsModel;
import org.group39.distributedSystem.service.bidPriceService;
import org.group39.distributedSystem.service.seeProductsService;
@Path("/Bid")
public class bidPrice {
	
	bidPriceService service = new bidPriceService();
	
	@Path("/Item")
	@POST
//	@Consumes(MediaType.MULTIPART_FORM_DATA)
	@Produces(MediaType.APPLICATION_JSON)
	public bidPriceModel setItem(bidPriceModel item) throws Exception {
		
			return service.bidItemUpdate(item);  
		}  
}
