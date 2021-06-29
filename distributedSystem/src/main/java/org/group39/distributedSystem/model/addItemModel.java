package org.group39.distributedSystem.model;

public class addItemModel {

	private String itemName;
	private String endDate;
	private String startDate;
	private String desc;
	private String auName;
	private int auNumber;
	private String nic;
	private String email;
	private String add;
	private String cate;
	private int price;
	private String user;
	private String image;
	
	
	public addItemModel() {

	}
	
	


	public addItemModel(String itemName, String endDate, String startDate, String desc, String auName, int auNumber,
			String nic, String email, String add, String cate, int price, String user, String image) {
		super();
		this.itemName = itemName;
		this.endDate = endDate;
		this.startDate = startDate;
		this.desc = desc;
		this.auName = auName;
		this.auNumber = auNumber;
		this.nic = nic;
		this.email = email;
		this.add = add;
		this.cate = cate;
		this.price = price;
		this.user = user;
		this.image = image;
	}




	public String getItemName() {
		return itemName;
	}


	public void setItemName(String itemName) {
		this.itemName = itemName;
	}


	public String getEndDate() {
		return endDate;
	}


	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}


	public String getStartDate() {
		return startDate;
	}


	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}


	public String getDesc() {
		return desc;
	}


	public void setDesc(String desc) {
		this.desc = desc;
	}


	public String getAuName() {
		return auName;
	}


	public void setAuName(String auName) {
		this.auName = auName;
	}


	public int getAuNumber() {
		return auNumber;
	}


	public void setAuNumber(int auNumber) {
		this.auNumber = auNumber;
	}


	public String getNic() {
		return nic;
	}


	public void setNic(String nic) {
		this.nic = nic;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAdd() {
		return add;
	}


	public void setAdd(String add) {
		this.add = add;
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


	public String getUser() {
		return user;
	}


	public void setUser(String user) {
		this.user = user;
	}


	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}




	

	
	
	
	
}
