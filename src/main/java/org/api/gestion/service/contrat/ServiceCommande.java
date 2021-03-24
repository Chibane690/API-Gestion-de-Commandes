package org.api.gestion.service.contrat;

import java.util.Optional;

import org.api.gestion.model.Commande;

public interface ServiceCommande {

	/**
	 * méthode delete Commande d'après son identifiant
	 * @param id
	 */
	void deleteCommande(Long id);

	/**
	 * méthode create Commande
	 * @param Commande
	 * @return le commande qui vient de créer 
	 */
	Commande createCommande(Commande commande);

	/**
	 * méthode read all
	 * @return all commandes
	 */
	Iterable<Commande> getCommandes();

	/**
	 * méthode read by id
	 * @param id
	 * @return un commande d'après son identifiant
	 */
	Optional<Commande> getCommande(Long id);


}
