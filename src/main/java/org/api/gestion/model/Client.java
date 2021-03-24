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
@Table(name = "clients")
public class Client implements Serializable{
   
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//========Attributes===================
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_client")
	private Long idClient;
	@Column(name = "nom_client")
	private String nomClient;
	@Column(name = "prenom_client")
	private String prenomClient;
	@Column(name = "ville_client")
	private String villeClient;
	@Column(name = "Code_postal_client")
	private Long CodePostalClient;
	@OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
	private List<Commande> commandes = new ArrayList<Commande>();
	
	//==================================Constructeur==========================
	/**
	 * Constructeur par defaut
	 */
	public Client() {
		super();
	}

    /**
     * Constructeur avec paramètre
     * @param nomClient
     * @param prenomClient
     * @param villeClient
     * @param codePostalClient
     */
	public Client(String nomClient, String prenomClient, String villeClient, Long codePostalClient) {
		
		this.setCodePostalClient(codePostalClient);
	    this.setNomClient(nomClient);
	    this.setPrenomClient(prenomClient);
	    this.setVilleClient(villeClient);
	}

	
   //===============================getters/setters==================================
	public Long getIdClient() {
		return idClient;
	}


	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}


	public String getNomClient() {
		return nomClient;
	}


	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}


	public String getPrenomClient() {
		return prenomClient;
	}


	public void setPrenomClient(String prenomClient) {
		this.prenomClient = prenomClient;
	}


	public String getVilleClient() {
		return villeClient;
	}


	public void setVilleClient(String villeClient) {
		this.villeClient = villeClient;
	}


	public Long getCodePostalClient() {
		return CodePostalClient;
	}


	public void setCodePostalClient(Long codePostalClient) {
		CodePostalClient = codePostalClient;
	}
	
	

   

	//===================================Méthodes====================================
	@Override
	public String toString() {
		return "Client [idClient=" + idClient + ", nomClient=" + nomClient + ", prenomClient=" + prenomClient
				+ ", villeClient=" + villeClient + ", CodePostalClient=" + CodePostalClient + "]";
	}
	
	
    
    
	
	
}
