package org.api.gestion.service.contrat;

import java.util.Optional;

import org.api.gestion.model.Client;

public interface ServiceClient {

	/**
	 * méthode delete client d'après son identifiant
	 * @param id
	 */
	void deleteClient(Long id);

	/**
	 * méthode create client
	 * @param client
	 * @return le client qui vient de créer 
	 */
	Client createClient(Client client);

	/**
	 * méthode read all
	 * @return all clients
	 */
	Iterable<Client> getClients();

	/**
	 * méthode read by id
	 * @param id
	 * @return un client d'après son identifiant
	 */
	Optional<Client> getClient(Long id);

}
