package es.fplumara.dam1.actividades.repository;

import es.fplumara.dam1.actividades.model.Identificable;
import es.fplumara.dam1.actividades.model.Taller;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface Repository<T extends Identificable<ID>,ID extends Serializable> {
    T save(T entity);
    Optional<T> findById(ID id);
    List<T> findAll();
    void deleteById(ID id);
}
