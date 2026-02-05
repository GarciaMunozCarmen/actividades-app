package es.fplumara.dam1.actividades.service;

public interface EmailService {
    //**Constants
    String Host = "smtp.gmail.com";
    int Port = 587;
    // Mthods
    void sendEmail(String to, String subject, String body);

}
