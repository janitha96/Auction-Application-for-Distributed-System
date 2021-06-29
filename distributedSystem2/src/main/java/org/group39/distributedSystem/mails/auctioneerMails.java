package org.group39.distributedSystem.mails;

//import java.util.List;
import java.util.Properties;

//import javax.mail.Authenticator;
import javax.mail.Message;
//import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.group39.distributedSystem.model.auctioneerModel;

//import org.group39.distributedSystem.model.auctioneerModel;



public class auctioneerMails {
	//List <auctioneerModel> auctioneerModel;

//	auctioneerModel am = new auctioneerModel();


	public String sendmail() {

		try {
			auctioneerModel am = new auctioneerModel();
			
			final String myEmail= "jdhhendhavitharana@gmail.com";
			final String pwd="jddilshan1997";
			
			Properties pro = new Properties();

			pro.put("mail.smtp.auth", "true");
			pro.put("mail.smtp.starttls.enable", "true");
			pro.put("mail.smtp.host", "smtp.gmail.com");
			pro.put("mail.smtp.port", "587");
			
			Session session = Session.getInstance(pro,
					new javax.mail.Authenticator() {
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(myEmail, pwd);
				}
			});
			
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(myEmail));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(am.getEmail()));
			message.setSubject("hello this is subject");
			message.setText("thank you for deal with us. we will send you a confirmation mail soon.");
			Transport.send(message);
			System.out.println("done");
		}catch(Exception e) {
			System.out.println(e);
		}
		return null;
		
	
	}


	
	
	


}
