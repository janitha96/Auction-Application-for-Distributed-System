package org.group39.distributedSystem.model;

import java.sql.SQLException;

import org.group39.distributedSystem.service.auctioneerService;

public class auctioneerModel {
 
	private String fname;
	private String lname;
	private String uname;
	private String email;
	private String address;
	private int tel;
	private String pwd;
	
	
	public auctioneerModel() {
	
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	public String getUname() {
		return uname;
	}


	public void setUname(String uname) {
		this.uname = uname;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getTel() {
		return tel;
	}


	public void setTel(int tel) {
		this.tel = tel;
	}


	public String getPwd() {
		return pwd;
	}


	public void setPwd(String pwd) {
		this.pwd = pwd;
	}


	public auctioneerModel(String fname, String lname, String uname, String email, String address, int tel,
			String pwd) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.uname = uname;
		this.email = email;
		this.address = address;
		this.tel = tel;
		this.pwd = pwd;
	}
	
	public boolean validUname() throws Exception {
		auctioneerService serve1 = new auctioneerService();
		boolean result1 = serve1.checkUname(this);
		
		return result1;
	}

	public boolean validEmail() throws Exception {
		auctioneerService serve2 = new auctioneerService();
		boolean result2 = serve2.checkEmail(this);
		
		return result2;
	}
	
	
}
