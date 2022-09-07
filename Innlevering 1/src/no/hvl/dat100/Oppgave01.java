package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class Oppgave01 {

	public static void main(String[] args) {
		
		
		String bruttoinntektTxt = showInputDialog("gi bruttoinntekt");
		double bruttoinntekt = parseInt(bruttoinntektTxt);
		
		double trinn1 = bruttoinntekt * 0.93 / 100;
		double trinn2 = bruttoinntekt * 2.42 / 100;
		double trinn3 = bruttoinntekt * 11.52 / 100; 
		double trinn4 = bruttoinntekt * 14.52 / 100;
		

		if (bruttoinntekt <= 164100) {
			System.out.println(" trinnskatt 0");
		} 
		
		
		else if (bruttoinntekt <=230950 && bruttoinntekt>=164101) {
			System.out.println(" trinnskatt 1: " + trinn1);
		} 
		

		else if (bruttoinntekt <= 580650 && bruttoinntekt >= 230951) {
			System.out.println(" trinnskatt 2: " + trinn2);
		} 
		

		else if (bruttoinntekt <= 934050 && bruttoinntekt >= 580651) {
			System.out.println(" trinnskatt 3: " + trinn3);
		} 
		
  
		else if (bruttoinntekt >= 934051) { 
			System.out.println(" trinnskatt 4: " + trinn4); 
		}  

	}

}
