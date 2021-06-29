package org.group39.distributedSystem.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.group39.distributedSystem.model.seeProductsModel;

public class seeProductsService {
	Connection con;
	
	public  seeProductsService() {
		
		try {
			//String url="Jdbc:mysql://34.93.89.55/distributed";
//			String instanceConnectionName = "distributed-304314:asia-south1:distributed";
//			String databaseName = "distributed";
//
//
//			String IP_of_instance = "34.93.89.55";
////			String username = "root";
////			String password = "password";
			String url= String.format("jdbc:mysql://34.69.194.80:3306/distributed");
	
			
			String uName="root";
			String pwd ="password";
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con = DriverManager.getConnection(url, uName, pwd);
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
	
	public ArrayList<seeProductsModel> products() throws SQLException {
		ArrayList<seeProductsModel> feedData = new ArrayList<seeProductsModel>();
		
		String select= "select * from item";
		PreparedStatement st = con.prepareStatement(select);
		ResultSet rs = st.executeQuery();
		while(rs.next()) {
			seeProductsModel feedObject = new seeProductsModel();
			feedObject.setId(rs.getInt("id"));
			feedObject.setAuName(rs.getString("auName"));
			feedObject.setItemName(rs.getString("itemName"));
			feedObject.setCate(rs.getString("cate"));
			feedObject.setEmail(rs.getString("email"));
			feedObject.setStartDate(rs.getString("startDate"));
			feedObject.setEndDate(rs.getString("endDate"));
			feedObject.setPrice(rs.getInt("price"));
			feedObject.setAuNumber(rs.getInt("auNumber"));
		
			feedData.add(feedObject);
			System.out.println(feedData);
		}
		return feedData;
		
		
	}
	
	public ArrayList<seeProductsModel> productsById(int id) throws SQLException {
		ArrayList<seeProductsModel> feedData = new ArrayList<seeProductsModel>();
		
		String select= "select * from item where id=?";
		PreparedStatement st = con.prepareStatement(select);
		st.setInt(1,id);
		ResultSet rs = st.executeQuery();
		while(rs.next()) {
			seeProductsModel feedObject = new seeProductsModel();
			feedObject.setId(rs.getInt("id"));
			feedObject.setAuName(rs.getString("auName"));
			feedObject.setItemName(rs.getString("itemName"));
			feedObject.setCate(rs.getString("cate"));
			feedObject.setEmail(rs.getString("email"));
			feedObject.setStartDate(rs.getString("startDate"));
			feedObject.setEndDate(rs.getString("endDate"));
			feedObject.setPrice(rs.getInt("price"));
			feedObject.setAuNumber(rs.getInt("auNumber"));
			feedObject.setLastprice(rs.getInt("lastprice"));
			feedObject.setAddr(rs.getString("addr"));
			feedObject.setUser(rs.getString("user"));
			feedObject.setCustomer(rs.getString("customer"));
			feedObject.setDescrip(rs.getString("descrip"));
			feedObject.setNic(rs.getString("nic"));
			feedData.add(feedObject);
			System.out.println(feedData);
		}
		return feedData;
		
		
	}

}
