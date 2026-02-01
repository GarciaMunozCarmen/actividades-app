package es.fplumara.dam1.actividades.service;

import es.fplumara.dam1.actividades.dto.UsuarioCreateDto;
import es.fplumara.dam1.actividades.dto.UsuarioUpdateDto;
import es.fplumara.dam1.actividades.model.Usuario;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UsuarioService {

    Usuario crearUsuario(UsuarioCreateDto dto);

    List<Usuario> listarUsuario();

    Optional<Usuario> obtenerUsuario(UUID id);

    Usuario actualizarUsuario(UUID id, UsuarioUpdateDto dto);

    void eliminarUsuario(UUID id);
}
