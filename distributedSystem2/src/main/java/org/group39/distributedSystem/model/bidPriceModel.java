package org.group39.distributedSystem.model;

public class bidPriceModel {
	
	private String fulname;
	private String addr;
	private String email;
	private int bid;
	private int tel;
	private String itemId;
//	private String user;

		
	public bidPriceModel() {
		
	}

	public bidPriceModel(String fulname, String addr, String email, int bid, int tel, String itemId) {
		super();
		this.fulname = fulname;
		this.addr = addr;
		this.email = email;
		this.bid = bid;
		this.tel = tel;
		this.itemId = itemId;
	//	this.user = user;
		
	}

	public String getFulname() {
		return fulname;
	}

	public void setFulname(String fulname) {
		this.fulname = fulname;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	
	

	
}
