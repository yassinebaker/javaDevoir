package com.supinfo.java.chapdev;

import java.time.LocalDate;

public class TestClassePersonne {

	public static void main(String[] args)
	{
		LocalDate dateNaissance = LocalDate.parse("2004-05-02");
		Enseignant enseignant = new Enseignant(1,"victoria", "sagna",dateNaissance,"yoff","78 254 12 25 ");
		Secretaire secretaire = new Secretaire (2,"charles", "ka",dateNaissance,"hlm grd yoff","78 435 12 35 ","0053A");
		Etudiant e1 = new Etudiant (3,"abaa", "dia",dateNaissance,"patte d'oie","18 403 53 24");
		Etudiant e2 = new Etudiant (4,"daba", "dieng",dateNaissance,"dakar","78542 25 25");
	
	System.out.println(e1);
	System.out.println(e2);
	System.out.println(enseignant);
	System.out.println(secretaire);
	

}
}
