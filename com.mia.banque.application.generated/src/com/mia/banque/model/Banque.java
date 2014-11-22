package com.mia.banque.model;

import java.util.List;
import java.util.ArrayList;
import com.mia.banque.application.model.IBanque;

public class Banque implements com.mia.banque.application.model.IBanque {

	private List<com.mia.banque.model.IClient> listClient;



public List<com.mia.banque.model.IClient> getClients() {
		if (this.listClient == null) {
			this.listClient = new ArrayList<com.mia.banque.model.IClient>();
		}
		return this.listClient;
	}
public void setClients(List<com.mia.banque.model.IClient> s) {
		this.listClient = s;
}


}