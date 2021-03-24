package org.api.gestion.model;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "commandes")
public class Commande implements Serializable{
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//=======================Attributes===================
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_commande")
	private Long idCommande;
	@Column(name = "date_commande")
	private Date dateCommande;
	@ManyToOne
	@JoinColumn(name = "idClient")
	private Client client;
	@OneToMany(mappedBy = "commande", cascade = CascadeType.ALL)
	private List<Composante> composantes = new ArrayList<Composante>();
	
	
	//==================================Constructeur==========================
	/**
	 * Constructeur par defaut
	 */
	public Commande() {
		super();
		
	}
    /**
     * Constructeur avec paramètre
     * @param dateCommande
     * @param client
     */
	public Commande(Date dateCommande, Client client) {

        this.setDateCommande(dateCommande);
        this.setClient(client);
		
	}
    
	
	//===============================getters/setters==================================
	public Long getIdCommande() {
		return idCommande;
	}

	public void setIdCommande(Long idCommande) {
		this.idCommande = idCommande;
	}

	public Date getDateCommande() {
		return dateCommande;
	}

	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}


	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	
	
	//===================================Méthodes====================================
	@Override
	public String toString() {
		return "Commande [idCommande=" + idCommande + ", dateCommande=" + ", client=" + client + "]";
	}
	
	
	
}
