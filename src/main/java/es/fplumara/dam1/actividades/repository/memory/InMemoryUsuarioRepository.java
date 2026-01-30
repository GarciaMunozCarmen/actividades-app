package es.fplumara.dam1.actividades.repository.memory;

import es.fplumara.dam1.actividades.model.Usuario;
import es.fplumara.dam1.actividades.repository.UsuarioRepository;

import java.util.Optional;
import java.util.UUID;

public class InMemoryUsuarioRepository extends InMemoryRepository<Usuario, UUID> implements UsuarioRepository {

    @Override
    public Usuario save(Usuario usuario) {
        if (usuario.getId() == null) {
            usuario.setId(UUID.randomUUID());
        }
        storage.put(usuario.getId(), usuario);
        return usuario;
    }


    @Override
    public Optional<Usuario> findByEmail(String email) {
        return storage.values().stream().filter(i -> i.getEmail().equals(email)).findFirst();
    }

    @Override
    public Optional<Usuario> findByDiscordUserId(String discordUserId) {
        return storage.values().stream().filter(i -> i.getDiscordUserId().equals(discordUserId)).findFirst();
    }

}
