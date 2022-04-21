package com.supinfo.java.chapdev;

import java.time.LocalDate;

public class Enseignant extends Personne
{
	private String specialite;
	
	public Enseignant()
	{
		super();
		
	}
	public Enseignant(int id,String prenom, String nom, LocalDate dateNaissance,String adresse,String telephone)
	{
		super(id, prenom, nom, dateNaissance, adresse,telephone);
		this.specialite = specialite;
		
		
	}
	public String getSpecialite() {
		return specialite;
	}
	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}
	@Override
	public String toString() {
		return super.toString() + ",specialite=" + specialite + "]";
		
	}
	@Override
	public String getNomTotal() {
		return  "Enseignant:"+ super.getPrenom()+" "+super.getNom();
	}

}
