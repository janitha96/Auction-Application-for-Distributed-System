package org.group39.distributedSystem.model;

import java.sql.SQLException;

import org.group39.distributedSystem.service.auctioneerLoginService;
import org.group39.distributedSystem.service.seeProductsService;

public class seeProductsModel {
 
    private int id;
	private String auName;
	private String itemName;
	private String cate;
	private int price;
	private String email;
	private int auNumber;
	private String startDate;
	private String endDate;
	private String user;
	private String nic;
	private int lastprice;
	private String addr;
	private String descrip;
	private String customer;
	
	public seeProductsModel() {
		
	}

	public seeProductsModel(int id, String auName, String itemName, String cate, int price, String email, int auNumber,
			String startDate, String endDate, String user, String nic, int lastprice, String addr, String descrip,
			String customer) {
		super();
		this.id = id;
		this.auName = auName;
		this.itemName = itemName;
		this.cate = cate;
		this.price = price;
		this.email = email;
		this.auNumber = auNumber;
		this.startDate = startDate;
		this.endDate = endDate;
		this.user = user;
		this.nic = nic;
		this.lastprice = lastprice;
		this.addr = addr;
		this.descrip = descrip;
		this.customer = customer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAuName() {
		return auName;
	}

	public void setAuName(String auName) {
		this.auName = auName;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getCate() {
		return cate;
	}

	public void setCate(String cate) {
		this.cate = cate;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAuNumber() {
		return auNumber;
	}

	public void setAuNumber(int auNumber) {
		this.auNumber = auNumber;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getNic() {
		return nic;
	}

	public void setNic(String nic) {
		this.nic = nic;
	}

	public int getLastprice() {
		return lastprice;
	}

	public void setLastprice(int lastprice) {
		this.lastprice = lastprice;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getDescrip() {
		return descrip;
	}

	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	
	
}
