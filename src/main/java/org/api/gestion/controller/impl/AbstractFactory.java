package org.api.gestion.controller.impl;

import org.api.gestion.model.Commande;
import org.api.gestion.model.Composante;

/**
 * j'ai utilisé le pattern Factory pour ne pas violer  le principe S du célèbre acronyme SOLID 
 */
public abstract class AbstractFactory {
    
	//========Attributes===================
	private static Commande commande = new Commande();
	private static Composante composante = new Composante();
	;

	//===============================getters/setters==================================
	public static Commande getCommande() {
		return commande;
	}

	public static Composante getComposante() {
		return composante;
	}


	
	
	
}
