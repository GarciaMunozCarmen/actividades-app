package es.fplumara.dam1.actividades.model;

import java.time.LocalDateTime;
import java.util.UUID;

public class Inscripcion {
    private UUID id;
    private UUID idTaller;
    private UUID idUsuario;
    private RolInscripcion rol;
    private LocalDateTime fechaInscripcion;
    private static final String FORMAT_DATE_TIME = "dd-MM-yyyy / HH:mm:ss";

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getIdTaller() {
        return idTaller;
    }

    public void setIdTaller(UUID idTaller) {
        this.idTaller = idTaller;
    }

    public UUID getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(UUID idUsuario) {
        this.idUsuario = idUsuario;
    }

    public RolInscripcion getRol() {
        return rol;
    }

    public void setRol(RolInscripcion rol) {
        this.rol = rol;
    }

    public LocalDateTime getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(LocalDateTime fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }
}
