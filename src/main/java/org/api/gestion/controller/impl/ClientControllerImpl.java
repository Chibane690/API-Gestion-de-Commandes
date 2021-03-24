package org.api.gestion.controller.impl;

import java.util.Optional;

import org.api.gestion.controller.contrat.ClientController;
import org.api.gestion.model.Client;
import org.api.gestion.service.contrat.ServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientControllerImpl implements ClientController{
    
	//========Attributes===================
	@Autowired
	private ServiceClient serviceClient;
	
	
	/**
	 * @return All clients
	 */
	@Override
	@GetMapping("/clients")
	public Iterable<Client> getClients() {
		System.out.println(this.getServiceClient().getClients());
        return this.getServiceClient().getClients();
    } 
	
	/**
	 * @param id
	 * @return Client d'après son id
	 */
	@Override
	@GetMapping("/client/{id}")
	public Optional<Client> getClient(@PathVariable(value = "id")Long id){
		return this.getServiceClient().getClient(id);
	}
	
	/**
	 * @param client
	 * @return client qui vient de créer
	 */
	@Override
	@PostMapping("/create/client")
	public Client createClient(@ModelAttribute Client client) {
		return this.getServiceClient().createClient(client);
	}
	
	/**
	 * delete client by id
	 * @param id
	 */
	@Override
	@DeleteMapping("/delete/client/{id}")
	public void deleteClient(@PathVariable(value = "id")Long id) {
		 this.getServiceClient().deleteClient(id);
	}
	
	//===============================getters/setters==================================
	
	public ServiceClient getServiceClient() {
		return serviceClient;
	}

	public void setServiceClient(ServiceClient serviceClient) {
		this.serviceClient = serviceClient;
	}
	
	
}
