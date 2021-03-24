package org.api.gestion.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name ="composantes" )
public class Composante implements Serializable{
    
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//=================Attributes=====================
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_composante")
	private Long idComposante;
	@Column(name = "quantite_composante")
	private Long quantiteComposante;
	@ManyToOne
	@JoinColumn(name = "idCommande")
	private Commande commande;
	@ManyToOne
	@JoinColumn(name = "idProduit")
	private Produit produit;
	
	
	//=================================Constructeur=============================
	/**
	 * Constructeur par defaut
	 */
	public Composante() {
		super();
		// TODO Auto-generated constructor stub
	}

    /**
     * Constructeur avec paramètre
     * @param quantiteComposante
     * @param commande
     * @param produit
     */
	public Composante(Long idComposante, Long quantiteComposante, Commande commande, Produit produit) {
		super();
		this.idComposante = idComposante;
		this.quantiteComposante = quantiteComposante;
		this.commande = commande;
		this.produit = produit;
	}

	
	//===============================getters/setters==================================
	public Long getIdComposante() {
		return idComposante;
	}


	public void setIdComposante(Long idComposante) {
		this.idComposante = idComposante;
	}


	public Long getQuantiteComposante() {
		return quantiteComposante;
	}


	public void setQuantiteComposante(Long quantiteComposante) {
		this.quantiteComposante = quantiteComposante;
	}


	public Commande getCommande() {
		return commande;
	}


	public void setCommande(Commande commande) {
		this.commande = commande;
	}


	public Produit getProduit() {
		return produit;
	}


	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	
	//===================================Méthodes====================================
	@Override
	public String toString() {
		return "Composante [idComposante=" + idComposante + ", quantiteComposante=" + quantiteComposante + ", commande="
				+ commande + ", produit=" + produit + "]";
	}
	
	
	
}
