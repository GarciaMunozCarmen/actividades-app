package es.fplumara.dam1.actividades.exception;

public class BusinessRuleException extends RuntimeException{
    public BusinessRuleException(String Message){
        super(Message);
    }
}
