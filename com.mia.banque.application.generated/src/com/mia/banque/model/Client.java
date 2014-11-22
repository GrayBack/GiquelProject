package com.mia.banque.model;

import java.util.List;
import java.util.ArrayList;
import com.mia.banque.application.model.IClient;

public class Client implements com.mia.banque.application.model.IClient {
	private String nom ;
	private String prenom ;
	private String adresse ;

	private List<com.mia.banque.model.ICompte> listCompte;

public String getNom() {
		return this.nom;
	}
public String getPrenom() {
		return this.prenom;
	}
public String getAdresse() {
		return this.adresse;
	}

public void setNom(String s) {
		this.nom = s;
	}
public void setPrenom(String s) {
		this.prenom = s;
	}
public void setAdresse(String s) {
		this.adresse = s;
	}

public List<com.mia.banque.model.ICompte> getComptes() {
		if (this.listCompte == null) {
			this.listCompte = new ArrayList<com.mia.banque.model.ICompte>();
		}
		return this.listCompte;
	}
public void setComptes(List<com.mia.banque.model.ICompte> s) {
		this.listCompte = s;
}


}