 package com.supinfo.java.chapdev;

import java.time.LocalDate;
import java.util.List;

import com.supinfo.java.chap3.ContactEtudiant;

public class Etudiant extends Personne 
{
	private String matricule;
	
	private List<ContactEtudiant> ContactEtudiant;
	public Etudiant() 
	{
		super();
	}
	public Etudiant(int id,String prenom, String nom, LocalDate dateNaissance,String adresse,String telephone)
	{
		super(id, prenom, nom, dateNaissance, adresse,telephone);
		this.matricule =matricule;
		
	}
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public List<ContactEtudiant> getContactEtudiant() {
		return ContactEtudiant;
	}
	public void setContactEtudiant(List<ContactEtudiant> contactEtudiant) {
		ContactEtudiant = contactEtudiant;
	}
	@Override
	public String toString() {
		return super.toString() +",matricule=" + matricule + ", ContactEtudiant=" + ContactEtudiant + "]";
	}
	@Override
	public String getNomTotal() {
		return  "Etudiant:"+ super.getPrenom()+" "+super.getNom();
	}

		
	
	

}
