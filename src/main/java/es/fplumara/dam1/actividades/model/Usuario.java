package es.fplumara.dam1.actividades.model;

public class Usuario {
    private Long id;
    private String nombre;
    private String perfil;
    private String discordUserId;
    private String curso;
    private String email;
    public Usuario(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
