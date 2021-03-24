package org.api.gestion.controller.contrat;

import java.util.Optional;

import org.api.gestion.model.Composante;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

public interface ComposanteController {

	/**
	 * delete composante by id
	 * @param id
	 */
	void deleteComposante(@PathVariable(value = "id")Long id);

	/**
	 * @param idProduit
	 * @param idCommande
	 * @param quantite commander du produit passer en parametre
	 * @return composante qui vient de créer
	 */
	Composante createComposante(@ModelAttribute(name = "idP") Long idProduit, @ModelAttribute(name = "idC") Long idCommande,@ModelAttribute(name = "quantite") Long quantite);

	/**
	 * @param id
	 * @return composante d'après son id
	 */
	Optional<Composante> getComposante(@PathVariable(value = "id")Long id);

	/**
	 * @return All composantes
	 */
	Iterable<Composante> getComposantes();

}
