package org.api.gestion.service.contrat;

import java.util.Optional;

import org.api.gestion.model.Composante;

public interface ServiceComposante {

	/**
	 * méthode delete Composante d'après son identifiant
	 * @param id
	 */
	void deleteComposante(Long id);

	/**
	 * méthode create composante
	 * @param composante
	 * @return le composante qui vient de créer 
	 */
	Composante createComposante(Composante composante);

	/**
	 * méthode read all
	 * @return all composantes
	 */
	Iterable<Composante> getComposantes();

	/**
	 * méthode read by id
	 * @param id
	 * @return un Composante d'après son identifiant
	 */
	Optional<Composante> getComposante(Long id);

}
