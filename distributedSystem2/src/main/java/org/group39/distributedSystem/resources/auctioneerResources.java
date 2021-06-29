package org.group39.distributedSystem.resources;

//import java.util.ArrayList;
//import java.util.List;

//import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.cxf.rs.security.cors.CrossOriginResourceSharing;
//import org.group39.distributedSystem.mails.auctioneerMails;
//import org.group39.distributedSystem.mails.auctioneerMails;
import org.group39.distributedSystem.model.auctioneerModel;
import org.group39.distributedSystem.service.auctioneerService;
//@CrossOriginResourceSharing(allowAllOrigins = true)
@Path("/registration")
public class auctioneerResources {
	
	auctioneerService as = new auctioneerService();
	//auctioneerMails amMail = new auctioneerMails();
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getName() {
		return "hello world";
	}
	 
	@Path("/reg1")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public auctioneerModel addAuctioneerName(auctioneerModel am) throws Exception {
		if (am.validUname()) {
			throw new Exception("user name takenL");
		}else{
			if (am.validEmail()) {
				throw new Exception("email taken");
			}else{
				return as.addName(am);
			}
		}
		
	
		
	}
	//return as.mail();

}
