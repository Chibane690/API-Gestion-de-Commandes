package org.api.gestion.service.impl;

import java.util.Optional;

import org.api.gestion.model.Produit;
import org.api.gestion.repository.ProduitRepository;
import org.api.gestion.service.contrat.ServiceProduit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceProduitImpl implements ServiceProduit{

	 ///========Attributes===================
		@Autowired
		private ProduitRepository produitRepository;
		
		
		/**
		 * méthode read by id
		 * @param id
		 * @return un produit d'après son identifiant
		 */
		@Override
		public Optional<Produit> getProduit(Long id) {
			return this.getProduitRepository().findById(id);
		}
		
		
		/**
		 * méthode read all
		 * @return all produits
		 */
		@Override
		public Iterable<Produit> getProduits(){
			return this.getProduitRepository().findAll();
		}
		
		
		/**
		 * méthode create produit
		 * @param produit
		 * @return le produit qui vient de créer 
		 */
		@Override
		public Produit createProduit(Produit produit){
			Produit produit2 = this.getProduitRepository().save(produit);
			 return produit2;
		}
		
		
		/**
		 * méthode delete produit d'après son identifiant
		 * @param id
		 */
		@Override
		public void deleteProduit(Long id) {
			this.getProduitRepository().deleteById(id);
		}

		

		//===============================getters/setters==================================
		
		public ProduitRepository getProduitRepository() {
			return produitRepository;
		}


		public void setProduitRepository(ProduitRepository produitRepository) {
			this.produitRepository = produitRepository;
		}
}
