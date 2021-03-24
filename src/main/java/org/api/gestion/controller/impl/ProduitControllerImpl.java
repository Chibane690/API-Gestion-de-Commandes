package org.api.gestion.controller.impl;

import java.util.Optional;

import org.api.gestion.controller.contrat.ProduitController;
import org.api.gestion.model.Produit;
import org.api.gestion.service.contrat.ServiceProduit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProduitControllerImpl implements ProduitController{

	//========Attributes===================
		@Autowired
		private ServiceProduit serviceProduit;
		
		
		/**
		 * @return All produits
		 */
		@Override
		@GetMapping("/produits")
		public Iterable<Produit> getProduits() {
	        return this.getServiceProduit().getProduits();
	    } 
		
		/**
		 * @param id
		 * @return Produit d'après son id
		 */
		@Override
		@GetMapping("/produit/{id}")
		public Optional<Produit> getProduit(@PathVariable(value = "id")Long id){
			return this.getServiceProduit().getProduit(id);
		}
		
		/**
		 * @param produit
		 * @return produit qui vient de créer
		 */
		@Override
		@PostMapping("/create/produit")
		public Produit createProduit(@ModelAttribute Produit produit) {
			return this.getServiceProduit().createProduit(produit);
		}
		
		/**
		 * delete produit by id
		 * @param id
		 */
		@Override
		@DeleteMapping("/delete/produit/{id}")
		public void deleteProduit(@PathVariable(value = "id")Long id) {
			 this.getServiceProduit().deleteProduit(id);
		}

		
		//===============================getters/setters==================================
		
		public ServiceProduit getServiceProduit() {
			return serviceProduit;
		}

		public void setServiceProduit(ServiceProduit serviceProduit) {
			this.serviceProduit = serviceProduit;
		}
		
}
