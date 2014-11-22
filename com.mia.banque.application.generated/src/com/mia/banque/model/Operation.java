package com.mia.banque.model;

import java.util.List;
import java.util.ArrayList;
import com.mia.banque.application.model.IOperation;

public class Operation implements com.mia.banque.application.model.IOperation {
	private String numero ;
	private String montant ;


public String getNumero() {
		return this.numero;
	}
public String getMontant() {
		return this.montant;
	}

public void setNumero(String s) {
		this.numero = s;
	}
public void setMontant(String s) {
		this.montant = s;
	}





}