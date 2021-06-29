package org.group39.distributedSystem.resources;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.group39.distributedSystem.model.auctioneerLoginModel;
import org.group39.distributedSystem.service.auctioneerLoginService;

@Path("/Login")
public class auctioneerLogin {
	
	
	
	@Path("/User")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public auctioneerLoginModel userLogin(auctioneerLoginModel login) throws Exception {
	//	auctioneerLoginService service = new auctioneerLoginService();
		String userName = login.getUname();
	    String password = login.getPwd();
		auctioneerLoginModel ob = null;
		
		if (login.loginValidate()) {
			
			 System.out.println(" login" +login.getUname());
		}else {
			throw new Exception("BAD CREDANTIAL");
		}
		
	
		
		return ob;
		
	}

}
