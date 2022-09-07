package no.hvl.dat100;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;


public class Oppgave02 {

	public static void main(String[] args) {
		
       int k = 10;
		
		for (int i = 1; i<=k; i ++) {
		
		String poengTxt=showInputDialog("gi poeng");
		int poeng = parseInt(poengTxt);
		
		
		
			if(poeng <101 && poeng >= 90) {
				System.out.println("Fremragende, karakter A");
		
				  }
			else if (poeng < 90 && poeng >= 80) {
				System.out.println("Meget godt, karakter B");
			}
			else if(poeng < 80 && poeng >=60) {
				System.out.println("God,karakter C");
			}
			else if(poeng < 60 && poeng >= 50) {
				System.out.println("Nokså god, karakter D");
			}
			else if(poeng < 50 && poeng >=40) {
				System.out.println("Tilstrekkelig, karakter E");
					
			}else if(poeng < 40 && poeng >= 0) {
				System.out.println("Ikke bestått, karakter F");
				
			}
			
			else {
				System.out.println("Ugyldig karakter");
				k++;
			} 
			
		
			
			
			
			
			
		}
		
		
		
       
		
		
		

	}

}
