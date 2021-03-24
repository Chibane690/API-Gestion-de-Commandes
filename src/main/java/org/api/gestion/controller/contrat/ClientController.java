package org.api.gestion.controller.contrat;

import java.util.Optional;

import org.api.gestion.model.Client;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

public interface ClientController {

	/**
	 * delete client by id
	 * @param id
	 */
	void deleteClient(@PathVariable(value = "id")Long id);

	/**
	 * @param client
	 * @return client qui vient de créer
	 */
	Client createClient(@ModelAttribute Client client);

	/**
	 * @param id
	 * @return Client d'après son id
	 */
	Optional<Client> getClient(@PathVariable(value = "id")Long id);

	/**
	 * @return All clients
	 */
	Iterable<Client> getClients();

}
