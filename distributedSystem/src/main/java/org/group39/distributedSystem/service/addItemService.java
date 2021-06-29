package org.group39.distributedSystem.service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;
import org.group39.distributedSystem.model.addItemModel;

public class addItemService {
	
	Connection con;
	
	public addItemService() {
		
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
	
	//@Consumes(MediaType.MULTIPART_FORM_DATA)
	public addItemModel addItemForAuction(addItemModel model) throws Exception {
		
      
		
		String insert ="INSERT INTO item (auName,auNumber,nic,user,email,addr,cate,itemName,price,descrip,startDate,endDate)VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
		
		try {
			PreparedStatement ps = con.prepareStatement(insert);
			ps.setString(1, model.getAuName());
			ps.setLong(2, model.getAuNumber());
			ps.setString(3, model.getNic());
			ps.setString(4, model.getUser());
			ps.setString(5, model.getEmail());
			ps.setString(6, model.getAdd());
			ps.setString(7, model.getCate());
			ps.setString(8, model.getItemName());
			ps.setLong(9, model.getPrice());
			ps.setString(10, model.getDesc());
			ps.setString(11, model.getStartDate());
			ps.setString(12, model.getEndDate());
			
			
			ps.execute();
		
		
			
		}catch(Exception e) {
			System.out.println(e);
		}
		 return model;  
		
	}

}
