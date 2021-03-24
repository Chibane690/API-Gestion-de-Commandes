package org.api.gestion.service.impl;

import java.util.Optional;

import org.api.gestion.model.Composante;
import org.api.gestion.repository.ComposanteRepository;
import org.api.gestion.service.contrat.ServiceComposante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceComposanteImpl implements ServiceComposante{
    
	@Autowired
	private ComposanteRepository composanteRepository;
	
	/**
	 * méthode read by id
	 * @param id
	 * @return un Composante d'après son identifiant
	 */	
	@Override
	public Optional<Composante> getComposante(Long id) {
		return this.getComposanteRepository().findById(id);
	}
	
	
	/**
	 * méthode read all
	 * @return all composantes
	 */	
	@Override
	public Iterable<Composante> getComposantes(){
		return this.getComposanteRepository().findAll();
	}
	
	
	/**
	 * méthode create composante
	 * @param composante
	 * @return le composante qui vient de créer 
	 */
	@Override
	public Composante createComposante(Composante composante){
		Composante composante2 = this.getComposanteRepository().save(composante);
		 return composante2;
	}
	
	
	/**
	 * méthode delete Composante d'après son identifiant
	 * @param id
	 */
	@Override
	public void deleteComposante(Long id) {
		this.getComposanteRepository().deleteById(id);
	}


	//===============================getters/setters==================================
    
	public ComposanteRepository getComposanteRepository() {
		return composanteRepository;
	}


	public void setComposanteRepository(ComposanteRepository composanteRepository) {
		this.composanteRepository = composanteRepository;
	}

}
