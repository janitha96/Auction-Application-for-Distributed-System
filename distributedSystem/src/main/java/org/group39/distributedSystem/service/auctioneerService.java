package org.group39.distributedSystem.service;
import java.sql.*;

//import java.util.ArrayList;
import java.util.List;

import org.group39.distributedSystem.mails.auctioneerMails;
//import org.group39.distributedSystem.mails.auctioneerMails;
import org.group39.distributedSystem.model.auctioneerModel;

public class auctioneerService {

	Connection con;
	List <auctioneerModel> auctioneerModel;
	auctioneerMails amMail = new auctioneerMails();
	
	public auctioneerService() {
		
		
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
	

	public boolean checkUname(auctioneerModel checkUname) throws SQLException {
		boolean result = false;
		String select= "select * from signup where uname= ?";
		PreparedStatement st = con.prepareStatement(select);
		st.setString(1, checkUname.getUname());
		ResultSet rs = st.executeQuery();
        if(rs.next()){
        	 result= true;
        	
        }else{
            result= false;
          
        }
		
		return result;
	}
	
	public boolean checkEmail(auctioneerModel checkEmail) throws SQLException {
		boolean result = false;
		String select= "select * from signup where email= ? ";
		PreparedStatement st = con.prepareStatement(select);
		st.setString(1, checkEmail.getEmail());
		ResultSet rs = st.executeQuery();
        if(rs.next()){
        	 result= true;
        	
        }else{
            result= false;
        }
		
		return result;
	}
	
	
	
	public auctioneerModel addName(auctioneerModel am) {
		String insert ="INSERT INTO signup (fname,lname,uname,email,tel,address,pwd)VALUES(?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(insert);
			ps.setString(1, am.getFname());
			ps.setString(2,am.getLname());
			ps.setString(3, am.getUname());
			ps.setString(4, am.getEmail());
			ps.setLong(5, am.getTel());
			ps.setString(6, am.getAddress());
			ps.setString(7, am.getPwd());	
			ps.execute();
		
		
			
		}catch(Exception e) {
			System.out.println(e);
		}
		return am ;
	
	}
	
	public String mail() {
		System.out.println("done");
		return amMail.sendmail();
		
	}
	
	
	
}
