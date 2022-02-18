package org.hcl.service;

//import java.util.Date;
//import java.util.Date;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.Date;
import java.util.Properties;
//import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MailSender {
     public static void main(String[] args) throws Exception { 
          final String SenderEmail = "subbusirirr143@gmail.com";
          final String password = "Subburs987@";


          Properties prop = new Properties();
          prop.put("mail.smtp.auth", "true");
          prop.put("mail.smtp.starttls.enable", "true");
          prop.put("mail.smtp.host", "smtp.gmail.com");
          prop.put("mail.smtp.port", "587");
          

          Session session = Session.getInstance(prop,
                  new javax.mail.Authenticator() {
               protected PasswordAuthentication getPasswordAuthentication() {
                     return new PasswordAuthentication(SenderEmail, password);
               }
          });
          
          try {
 
                Message message = new MimeMessage(session);
                message.setFrom(new InternetAddress("SenderMail"));
                message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("subburs987@gmail.com"));
                message.setSubject("Message from subbu");
                message.setText("Hi , this is subbu I am YouTuber");

                Transport.send(message);
 
                System.out.println("Mail successfully sent..");  
             }catch (MessagingException e){
                 throw new RuntimeException(e);
             }
    	 /*Properties props = new Properties();
         props.put("mail.smtp.host", "127.0.0.1");
         props.put("mail.smtp.port", "80");
         props.put("mail.debug", "true");
         Session session = Session.getDefaultInstance(props);
         MimeMessage message = new MimeMessage(session);
         message.setFrom(new InternetAddress("subburs987@gmail.com"));
         message.setRecipient(RecipientType.TO, new InternetAddress("marripellinavya27@gmail")); 
         message.setSubject("Notification");
         message.setText("Successful!", "UTF-8"); // as "text/plain"*/
        // message.setSentDate(new Date());
        // Transport.send(message);
    // }
         }

	

	
	
 }
         
         
