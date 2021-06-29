package org.group39.distributedSystem.model;

import java.sql.SQLException;

import org.group39.distributedSystem.service.auctioneerLoginService;

public class auctioneerLoginModel {
	private String uname;
	private String pwd;
	
	public auctioneerLoginModel() {
	
	}
	
	public auctioneerLoginModel(String uname, String pwd) {
		super();
		this.uname = uname;
		this.pwd = pwd;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	

	public boolean loginValidate() throws SQLException {
		auctioneerLoginService serve = new auctioneerLoginService();
		boolean valid = serve.auctioneerUserLogin(this);
		
		return valid;
	}
	

}
