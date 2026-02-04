package es.fplumara.dam1.actividades.dto;

import es.fplumara.dam1.actividades.model.RolInscripcion;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

public record InscripcionCreateDto(
        @NotNull
        UUID idTaller,
        @NotNull
        UUID idUsuario,
        @NotNull
        RolInscripcion rol
) {

}
