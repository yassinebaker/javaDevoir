package com.supinfo.java.chapdev;

import java.time.LocalDate;

public abstract class Personne 
{
	
		private int id;
		private String prenom;
		private String nom;
		private LocalDate dateNaissance;
		private String adresse;
		private String telephone;
		private static int nbPersonne = 0;
		//constructeur explicite sans paramétres
			public Personne() {}
			//appeller un constucteur
			public Personne( int id,String prenom, String nom, LocalDate dateNaissance,String adresse,String telephone) {
				this.id=id;
				this.prenom=prenom;
				this.nom=nom;
				this.dateNaissance= dateNaissance;
				this.adresse =adresse;
				this.telephone =telephone;
				Personne.nbPersonne++;
			}
			
			
			
			public int getId() {
				return id;
			}
			public void setId(int id) {
				this.id = id;
			}
			public String getPrenom() {
				return prenom;
			}
			public void setPrenom(String prenom) {
				this.prenom = prenom;
			}
			public String getNom() {
				return nom;
			}
			public void setNom(String nom) {
				this.nom = nom;
			}
			public LocalDate getDateNaissance() {
				return dateNaissance;
			}
			public void setDateNaissance(LocalDate dateNaissance) {
				this.dateNaissance = dateNaissance;
			}
			public String getAdresse() {
				return adresse;
			}
			public void setAdresse(String adresse) {
				this.adresse = adresse;
			}
			public String getTelephone() {
				return telephone;
			}
			public void setTelephone(String telephone) {
				this.telephone = telephone;
			}
			public abstract String getNomTotal();
			@Override
			public String toString() {
				return " [id="  + id + ", prenom=" + prenom + ", nom=" + nom + ", dateNaissance=" + dateNaissance
						+ ", adresse=" + adresse + ", telephone=" + telephone;
			}
			

}
