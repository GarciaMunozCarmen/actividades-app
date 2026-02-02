package es.fplumara.dam1.actividades.dto;

import es.fplumara.dam1.actividades.model.PerfilUsuario;
import jakarta.validation.constraints.*;

import java.util.Optional;

public record UsuarioUpdateDto(

        Optional<@NotBlank String> nombre,
        Optional<PerfilUsuario> perfil,
        Optional<@NotBlank String> discordUserId,
        Optional<@NotBlank String> curso,
        Optional<@Email String> email
) {}


