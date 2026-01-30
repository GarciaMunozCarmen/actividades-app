package es.fplumara.dam1.actividades.model;

import java.io.Serializable;
import java.util.UUID;

public interface Identificable<ID extends Serializable> {

    public ID getId();

}
