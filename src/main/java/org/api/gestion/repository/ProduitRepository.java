package org.api.gestion.repository;

import org.api.gestion.model.Produit;
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
public interface ProduitRepository extends CrudRepository<Produit, Long>{

}
