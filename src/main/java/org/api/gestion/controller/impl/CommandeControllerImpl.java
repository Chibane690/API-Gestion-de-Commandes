package org.api.gestion.controller.impl;

import java.sql.Date;
import java.util.Optional;

import org.api.gestion.controller.contrat.CommandeController;
import org.api.gestion.model.Commande;
import org.api.gestion.service.contrat.ServiceClient;
import org.api.gestion.service.contrat.ServiceCommande;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommandeControllerImpl extends AbstractFactory implements CommandeController{
    
	//========Attributes===================
	@Autowired
	private ServiceCommande serviceCommande;
	@Autowired
	private ServiceClient serviceClient;
	
	
	/**
	 * @return All commandes
	 */
	@Override
	@GetMapping("/commandes")
	public Iterable<Commande> getCommandes() {
        return this.getServiceCommande().getCommandes();
    } 
	
	/**
	 * @param id
	 * @return commande d'après son id
	 */
	@Override
	@GetMapping("/commande/{id}")
	public Optional<Commande> getCommande(@PathVariable(value = "id")Long id){
		return this.getServiceCommande().getCommande(id);
	}
	
	/**
	 * @param id du client de cette commande
	 * @param date du commande
	 * @return commande qui vient de créer
	 */
	@Override
	@PostMapping("/create/commande")
	public Commande createCommande(@ModelAttribute(name = "idC") Long id,@ModelAttribute(name = "dateCommande") String date) {
		Date date2 = Date.valueOf(date);
		Commande commande2 = getCommande();
		commande2.setClient(this.getServiceClient().getClient(id).get());
		commande2.setDateCommande(date2);
		return this.getServiceCommande().createCommande(commande2);
	}
	
	/**
	 * delete commande by id
	 * @param id
	 */
	@Override
	@DeleteMapping("/delete/commande/{id}")
	public void deleteProduit(@PathVariable(value = "id")Long id) {
		 this.getServiceCommande().deleteCommande(id);;
	}

	
	
	//===============================getters/setters==================================
	public ServiceCommande getServiceCommande() {
		return serviceCommande;
	}

	public void setServiceCommande(ServiceCommande serviceCommande) {
		this.serviceCommande = serviceCommande;
	}

	public ServiceClient getServiceClient() {
		return serviceClient;
	}

	public void setServiceClient(ServiceClient serviceClient) {
		this.serviceClient = serviceClient;
	}

    
}
