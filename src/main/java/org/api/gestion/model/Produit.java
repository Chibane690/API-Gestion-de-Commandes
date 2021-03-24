package org.api.gestion.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "produits")
public class Produit implements Serializable{
    
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//=========================Attributes==================================
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_produit")
	private Long idProduit;
	@Column(name = "nom_produit")
	private String nomProduit;
	@Column(name = "prix_unitaire_produit")
	private Double prixUnitaireProduit;
	@Column(name = "tva_produit")
	private Double tvaProduit;
	@Column(name = "quantite_stock_produit")
	private Long quantiteStockProduit;
	@OneToMany(mappedBy = "produit",cascade = CascadeType.ALL)
	private List<Composante> composantes = new ArrayList<Composante>();
	
	
	//==================================Constructeur==========================
	/**
	 * Constructeur par defaut
	 */
	public Produit() {
		super();
	}

    /**
     * Constructeur avec paramètre
     * @param nomProduit
     * @param prixUnitaireProduit
     * @param tvaProduit
     * @param quantiteStockProduit
     */
	public Produit( String nomProduit, Double prixUnitaireProduit, Double tvaProduit,
			Long quantiteStockProduit) {

		this.setNomProduit(nomProduit);
		this.setQuantiteStockProduit(quantiteStockProduit);
		this.setPrixUnitaireProduit(prixUnitaireProduit);
		this.setTvaProduit(tvaProduit);
	}

	
	//===============================getters/setters==================================
	public Long getIdProduit() {
		return idProduit;
	}


	public void setIdProduit(Long idProduit) {
		this.idProduit = idProduit;
	}


	public String getNomProduit() {
		return nomProduit;
	}


	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}


	public Double getPrixUnitaireProduit() {
		return prixUnitaireProduit;
	}


	public void setPrixUnitaireProduit(Double prixUnitaireProduit) {
		this.prixUnitaireProduit = prixUnitaireProduit;
	}


	public Double getTvaProduit() {
		return tvaProduit;
	}


	public void setTvaProduit(Double tvaProduit) {
		this.tvaProduit = tvaProduit;
	}


	public Long getQuantiteStockProduit() {
		return quantiteStockProduit;
	}


	public void setQuantiteStockProduit(Long quantiteStockProduit) {
		this.quantiteStockProduit = quantiteStockProduit;
	}
	

	
	//===================================Méthodes====================================
	@Override
	public String toString() {
		return "Produit [idProduit=" + idProduit + ", designationProduit=" + nomProduit
				+ ", prixUnitaireProduit=" + prixUnitaireProduit + ", tvaProduit=" + tvaProduit
				+ ", quantiteStockProduit=" + quantiteStockProduit + "]";
	}
	
	
}
