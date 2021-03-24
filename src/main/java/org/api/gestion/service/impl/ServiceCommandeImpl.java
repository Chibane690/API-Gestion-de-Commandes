package org.api.gestion.service.impl;

import java.util.Optional;

import org.api.gestion.model.Commande;
import org.api.gestion.repository.CommandeRepository;
import org.api.gestion.service.contrat.ServiceCommande;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceCommandeImpl implements ServiceCommande{

	 ///========Attributes===================
	@Autowired
	private CommandeRepository commandeRepository;
	
	
	/**
	 * méthode read by id
	 * @param id
	 * @return un commande d'après son identifiant
	 */
	@Override
	public Optional<Commande> getCommande(Long id) {
		return this.getCommandeRepository().findById(id);
	}
	
	
	/**
	 * méthode read all
	 * @return all commandes
	 */	
	@Override
	public Iterable<Commande> getCommandes(){
		return this.getCommandeRepository().findAll();
	}
	
	
	/**
	 * méthode create Commande
	 * @param Commande
	 * @return le commande qui vient de créer 
	 */
	@Override
	public Commande createCommande(Commande commande){
		Commande commande2 = this.getCommandeRepository().save(commande);
		 return commande2;
	}
	
	
	/**
	 * méthode delete Commande d'après son identifiant
	 * @param id
	 */
	@Override
	public void deleteCommande(Long id) {
		this.getCommandeRepository().deleteById(id);
	}


	//===============================getters/setters==================================

	public CommandeRepository getCommandeRepository() {
		return commandeRepository;
	}


	public void setCommandeRepository(CommandeRepository commandeRepository) {
		this.commandeRepository = commandeRepository;
	}

	
	
}
