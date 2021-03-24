package org.api.gestion.service.impl;


import java.util.Optional;

import org.api.gestion.model.Client;
import org.api.gestion.repository.ClientRepository;
import org.api.gestion.service.contrat.ServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ServiceClientImpl implements ServiceClient{
    
    ///========Attributes===================
	@Autowired
	private ClientRepository clientRepository;
	
	
	/**
	 * méthode read by id
	 * @param id
	 * @return un client d'après son identifiant
	 */
	@Override
	public Optional<Client> getClient(final Long id) {
		return this.getClientRepository().findById(id);
	}
	
	
	/**
	 * méthode read all
	 * @return all clients
	 */
	@Override
	public Iterable<Client> getClients(){
		return this.getClientRepository().findAll();
	}
	
	
	/**
	 * méthode create client
	 * @param client
	 * @return le client qui vient de créer 
	 */
	@Override
	public Client createClient(Client client){
		Client client1 = this.getClientRepository().save(client);
		 return client1;
	}
	
	
	/**
	 * méthode delete client d'après son identifiant
	 * @param id
	 */
	@Override
	public void deleteClient(Long id) {
		this.getClientRepository().deleteById(id);
	}
	
    
	
	//===============================getters/setters==================================
	public ClientRepository getClientRepository() {
		return clientRepository;
	}

	public void setClientRepository(ClientRepository clientRepository) {
		this.clientRepository = clientRepository;
	}
	
	
}
