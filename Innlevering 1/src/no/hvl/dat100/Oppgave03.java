package no.hvl.dat100;


import static javax.swing.JOptionPane.*;

import static java.lang.Integer.*;

public class Oppgave03 {

	public static void main(String[] args) {
		
		
		String tallTxt = showInputDialog("skriv ett heltall");
		int fakultet = parseInt(tallTxt);
	
		
		while (fakultet <0) {
			 
			 showMessageDialog(null,"Ugyldig, velg et nytt positiv heltall");
			 
			 fakultet = parseInt(showInputDialog("skriv ett heltall"));
			 
			    
		
		 }
		int resultat= 1;
		
		
		for (int i=1; i<=fakultet; i++) {
		
		
			resultat = resultat * i;
		}
		
		 
		 
		 showMessageDialog(null, "fakultet  av "  + fakultet + " er " + resultat);
	
		
	
 
	}

}
