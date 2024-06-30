

import java.util.Properties;
 
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
 
public class SendMailTLS {
 
	public static void main(String[] args) {
 
		final String username = "mailjava05@gmail.com";
		final String password = "testingme";
 
		Properties props = new Properties();
		props.put("mail.snmp.auth", "true");
		props.put("mail.snmp.starttls.enable", "true");
		props.put("mail.snmp.host", "smtp.gmail.com");
		props.put("mail.snmp.port", "25");
 
		Session session = Session.getInstance(props,new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		  });
 
		try {
 
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("mailjava05@gmail.com"));
			message.setRecipients(Message.RecipientType.TO,
				InternetAddress.parse("vigneshcoimbator@gmail.com"));
			message.setSubject("Testing Subject");
			message.setText("Dear Java,"
				+ "\n\n No spam to my email, please!");
 
			Transport.send(message);
 
			System.out.println("Done");
 
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}
}