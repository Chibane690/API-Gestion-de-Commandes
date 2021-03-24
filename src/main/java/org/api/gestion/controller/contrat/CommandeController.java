package org.api.gestion.controller.contrat;


import java.util.Optional;

import org.api.gestion.model.Commande;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;


public interface CommandeController {

	/**
	 * delete commande by id
	 * @param id
	 */
	void deleteProduit(@PathVariable(value = "id")Long id);

	/**
	 * @param id du client de cette commande
	 * @param date du commande
	 * @return commande qui vient de créer
	 */
	Commande createCommande(@ModelAttribute(name = "id") Long id,@ModelAttribute(name = "dateCommande") String date);

	/**
	 * @param id
	 * @return commande d'après son id
	 */
	Optional<Commande> getCommande(@PathVariable(value = "id")Long id);

	/**
	 * @return All commandes
	 */
	Iterable<Commande> getCommandes();

}
