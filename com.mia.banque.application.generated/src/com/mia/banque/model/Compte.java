package com.mia.banque.model;

import java.util.List;
import java.util.ArrayList;
import com.mia.banque.application.model.ICompte;

public class Compte implements com.mia.banque.application.model.ICompte {
	private String numero ;

	private List<com.mia.banque.model.IOperation> listOperation;

public String getNumero() {
		return this.numero;
	}

public void setNumero(String s) {
		this.numero = s;
	}

public List<com.mia.banque.model.IOperation> getOperations() {
		if (this.listOperation == null) {
			this.listOperation = new ArrayList<com.mia.banque.model.IOperation>();
		}
		return this.listOperation;
	}
public void setOperations(List<com.mia.banque.model.IOperation> s) {
		this.listOperation = s;
}


}