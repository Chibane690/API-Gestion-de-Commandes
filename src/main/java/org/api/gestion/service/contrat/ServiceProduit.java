package org.api.gestion.service.contrat;

import java.util.Optional;

import org.api.gestion.model.Produit;

public interface ServiceProduit {

	/**
	 * méthode delete produit d'après son identifiant
	 * @param id
	 */
	void deleteProduit(Long id);

	/**
	 * méthode create produit
	 * @param produit
	 * @return le produit qui vient de créer 
	 */
	Produit createProduit(Produit produit);

	/**
	 * méthode read all
	 * @return all produits
	 */
	Iterable<Produit> getProduits();

	/**
	 * méthode read by id
	 * @param id
	 * @return un produit d'après son identifiant
	 */
	Optional<Produit> getProduit(Long id);

}
