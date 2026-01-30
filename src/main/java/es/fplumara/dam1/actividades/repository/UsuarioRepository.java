package es.fplumara.dam1.actividades.repository;

import es.fplumara.dam1.actividades.model.Usuario;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UsuarioRepository extends Repository<Usuario,UUID> {
    Optional<Usuario> findByEmail(String email);
    Optional<Usuario> findByDiscordUserId(String discordUserId);
}
