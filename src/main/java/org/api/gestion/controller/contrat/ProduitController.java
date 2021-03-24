package org.api.gestion.controller.contrat;

import java.util.Optional;

import org.api.gestion.model.Produit;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

public interface ProduitController {

	/**
	 * delete produit by id
	 * @param id
	 */
	void deleteProduit(@PathVariable(value = "id")Long id);

	/**
	 * @param produit
	 * @return produit qui vient de créer
	 */
	Produit createProduit(@ModelAttribute Produit produit);

	/**
	 * @param id
	 * @return Produit d'après son id
	 */
	Optional<Produit> getProduit(@PathVariable(value = "id")Long id);

	/**
	 * @return All produits
	 */
	Iterable<Produit> getProduits();

}
