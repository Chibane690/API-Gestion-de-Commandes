package org.api.gestion.repository;

import org.api.gestion.model.Composante;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * L'interface CrudRepository contient CRUD
 * méthode create
 * méthode read
 * méthode update
 * méthode delete
 */
@Repository
public interface ComposanteRepository extends CrudRepository<Composante, Long>{

}
