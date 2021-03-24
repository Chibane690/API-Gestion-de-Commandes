package org.api.gestion.controller.impl;

import java.util.Optional;

import org.api.gestion.controller.contrat.ComposanteController;
import org.api.gestion.model.Composante;
import org.api.gestion.service.contrat.ServiceCommande;
import org.api.gestion.service.contrat.ServiceComposante;
import org.api.gestion.service.contrat.ServiceProduit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ComposanteControllerImpl extends AbstractFactory implements ComposanteController{

	//========Attributes===================
		@Autowired
		private ServiceComposante serviceComposante;
	    @Autowired
	    private ServiceCommande serviceCommande;
	    @Autowired
	    private ServiceProduit serviceProduit;
		
		/**
		 * @return All composantes
		 */
		@Override
		@GetMapping("/composantes")
		public Iterable<Composante> getComposantes() {
	        return this.getServiceComposante().getComposantes();
	    } 
		
		/**
		 * @param id
		 * @return composante d'après son id
		 */
		@Override
		@GetMapping("/composante/{id}")
		public Optional<Composante> getComposante(@PathVariable(value = "id")Long id){
			return this.getServiceComposante().getComposante(id);
		}
		
		/**
		 * @param idProduit
		 * @param idCommande
		 * @param quantite commander du produit passer en parametre
		 * @return composante qui vient de créer
		 */
		@Override
		@PostMapping("/create/composante")
		public Composante createComposante(@ModelAttribute(name = "idP") Long idProduit, @ModelAttribute(name = "idC") Long idCommande,@ModelAttribute(name = "quantite") Long quantite) {
			Composante composante = getComposante();
			composante.setQuantiteComposante(quantite);
			composante.setCommande(this.getServiceCommande().getCommande(idCommande).get());
			composante.setProduit(this.getServiceProduit().getProduit(idProduit).get());
			return this.getServiceComposante().createComposante(composante);
		}
		
		/**
		 * delete composante by id
		 * @param id
		 */
		@Override
		@DeleteMapping("/delete/composante/{id}")
		public void deleteComposante(@PathVariable(value = "id")Long id) {
			 this.getServiceComposante().deleteComposante(id);
		}

		
		//===============================getters/setters==================================
		
		public ServiceComposante getServiceComposante() {
			return serviceComposante;
		}

		public void setServiceComposante(ServiceComposante serviceComposante) {
			this.serviceComposante = serviceComposante;
		}

		public ServiceCommande getServiceCommande() {
			return serviceCommande;
		}

		public void setServiceCommande(ServiceCommande serviceCommande) {
			this.serviceCommande = serviceCommande;
		}

		public ServiceProduit getServiceProduit() {
			return serviceProduit;
		}

		public void setServiceProduit(ServiceProduit serviceProduit) {
			this.serviceProduit = serviceProduit;
		}
		
		
		
}
