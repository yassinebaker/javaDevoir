package com.supinfo.java.chapdev;

import java.time.LocalDate;

public class Secretaire extends Personne {
	private String numeroBureau;
	
	public Secretaire() 
	
	{
		super();
		
	}
	public Secretaire( int id,String prenom, String nom, LocalDate dateNaissance,String adresse,String telephone,String numeroBureau)
	{
		super(id, prenom, nom, dateNaissance, adresse,telephone);
		this.numeroBureau=numeroBureau;
		
	}
	public String getNumeroBureau() {
		return numeroBureau;
		
	}
	public void setNumeroBureau(String numeroBureau) {
		this.numeroBureau = numeroBureau;
	}
	@Override
	public String toString() {
		return super.toString() + ", numeroBureau=" + numeroBureau + "]";
	}
	@Override
	public String getNomTotal() {
		return  "Secretaire:"+ super.getPrenom()+" "+super.getNom();
	}


}
