package es.fplumara.dam1.actividades.service;

import jakarta.mail.*;
import jakarta.mail.internet.AddressException;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

import java.util.Properties;


public class EmailService {
    private static final String host = "smtp.gmail.com";
    private static final Integer port = 587;
    public static void Service() throws MessagingException {
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", port);

        Session session = Session.getInstance(props, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(System.getenv("EMAIL_ACCOUNT"), System.getenv("EMAIL_PASSWORD"));
            }
        });

        Message msg = new MimeMessage(session);
        msg.setFrom(new InternetAddress(System.getenv("EMAIL_ACCOUNT")));
        msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse( "soymikelnevado@gmail.com"));
        msg.setSubject("<asunto del correo>");
        msg.setText("Arturo peruano");

        Transport.send(msg);
        System.out.println("Correo enviado OK");
    }
    public static void main(String[] args) throws MessagingException {
        Service();
    }
}
