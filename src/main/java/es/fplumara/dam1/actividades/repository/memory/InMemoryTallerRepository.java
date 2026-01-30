package es.fplumara.dam1.actividades.repository.memory;

import es.fplumara.dam1.actividades.model.Taller;
import es.fplumara.dam1.actividades.repository.TallerRepository;

import java.util.UUID;

public class InMemoryTallerRepository extends InMemoryRepository<Taller, UUID> implements TallerRepository {

    @Override
    public Taller save(Taller taller) {
        if (taller.getId() == null) {
            taller.setId(UUID.randomUUID());
        }
        storage.put(taller.getId(), taller);
        return taller;
    }

}
