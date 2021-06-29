package org.group39.distributedSystem.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.group39.distributedSystem.model.auctioneerLoginModel;



public class auctioneerLoginService {
	Connection con;
	  
	
	public auctioneerLoginService() {
		try {
			String url= String.format("jdbc:mysql://34.69.194.80:3306/distributed");
			String uName="root";
			String pwd ="password";
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, uName, pwd);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
//	public auctioneerLoginModel auctioneerUserLogin(auctioneerLoginModel loginModel) throws Exception {
//		
//		
//		String select= "select * from signup where uname= ? and pwd = ?";
//		PreparedStatement st = con.prepareStatement(select);
//		st.setString(1, loginModel.getUname());
//		st.setString(2, loginModel.getPwd());
//		ResultSet rs = st.executeQuery();
//        if(rs.next()){
//        	 
//        	 System.out.println(" login");
//        }else{
//           
//            System.out.println(" login fail Re enter username and password");
//        }
//		
//		return loginModel;
//	}

	public boolean auctioneerUserLogin(auctioneerLoginModel login) throws SQLException {

		
		boolean result = false;
		String select= "select * from signup where uname= ? and pwd = ?";
		PreparedStatement st = con.prepareStatement(select);
		st.setString(1, login.getUname());
		st.setString(2, login.getPwd());
		ResultSet rs = st.executeQuery();
        if(rs.next()){
        	 result= true;
        	// System.out.println(" login"+login.getUname());
        }else{
            result= false;
          //  System.out.println(" login fail Re enter username and password"+login.getUname());
        }
		
		return result;
		
	}

}
