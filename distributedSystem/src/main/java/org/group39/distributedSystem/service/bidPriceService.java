package org.group39.distributedSystem.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.group39.distributedSystem.model.addItemModel;
import org.group39.distributedSystem.model.bidPriceModel;

public class bidPriceService {
	 Connection con;
	public bidPriceService() {
		try {
			//String url="Jdbc:mysql://34.93.89.55/distributed";
			String instanceConnectionName = "distributed-304314:asia-south1:distributed";
			String databaseName = "distributed";


			String IP_of_instance = "34.93.89.55";
//			String username = "root";
//			String password = "password";
			String url= String.format("jdbc:mysql://34.69.194.80:3306/distributed");
	
			
			String uName="root";
			String pwd ="password";
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con = DriverManager.getConnection(url, uName, pwd);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public bidPriceModel bidItemUpdate(bidPriceModel model) throws Exception {
				
		String insert ="update item set lastPrice=?,customer=? where id=?";
		String insert2 ="INSERT INTO bidder (fulname,email,addr,bid,tel,itemId)VALUES(?,?,?,?,?,?)";
		
		try {
			PreparedStatement ps = con.prepareStatement(insert);
			ps.setLong(1, model.getBid());
			ps.setString(2, model.getFulname());
			ps.setString(3, model.getItemId());
			ps.executeUpdate();
		
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		try {
			PreparedStatement ps2 = con.prepareStatement(insert2);
			ps2.setString(1, model.getFulname());
			ps2.setString(2, model.getEmail());
			ps2.setString(3, model.getAddr());
			ps2.setLong(4, model.getBid());
			ps2.setLong(5, model.getTel());
			ps2.setString(6, model.getItemId());
			

			ps2.execute();
		
			
		}catch(Exception e) {
			System.out.println(e);
		}
		 return model;  
		
	}
	
//	public bidPriceModel bidItem(bidPriceModel model) throws Exception {
//		
//		String insert ="INSERT INTO bidders (bidername,email,addr,bid,tel,itemid,user)VALUES(?,?,?,?,?,?,?)";
//
//		
//		try {
//			PreparedStatement ps = con.prepareStatement(insert);
//			ps.setString(1, model.getFulname());
//			ps.setString(2, model.getEmail());
//			ps.setString(3, model.getAddr());
//			ps.setLong(4, model.getBid());
//			ps.setLong(5, model.getTel());
//			ps.setString(6, model.getItemId());
//			ps.setString(7, model.getUser());
//
//			ps.execute();
//		
//			
//		}catch(Exception e) {
//			System.out.println(e);
//		}
//		 return model;  
//		
//	}

}
