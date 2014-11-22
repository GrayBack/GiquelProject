package com.mia.banque.model;

import java.util.List;

public interface IClient {

	public String getNom();
	public String getPrenom();
	public String getAdresse();

	public void setNom(String s);
	public void setPrenom(String s);
	public void setAdresse(String s);

	public List<ICompte> getComptes();
	public void setComptes(List<ICompte> s);

}