package es.fplumara.dam1.actividades.repository.memory;

import es.fplumara.dam1.actividades.model.Identificable;
import es.fplumara.dam1.actividades.repository.Repository;

import java.io.Serializable;
import java.util.*;

public class InMemoryRepository<T extends Identificable<ID>, ID extends Serializable> implements Repository<T, ID> {

    protected Map<ID, T> storage = new HashMap<>();

    @Override
    public T save(T entity) {
        storage.put(entity.getId(), entity);
        return entity;
    }

    @Override
    public Optional<T> findById(ID id) {
        return Optional.ofNullable(storage.get(id));
    }

    @Override
    public List<T> findAll() {
        return new ArrayList<>(storage.values());
    }

    @Override
    public void deleteById(ID id) {
        storage.remove(id);
    }
}
