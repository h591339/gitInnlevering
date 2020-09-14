package no.hvl.dat100;

import javax.swing.JOptionPane;

public class Oppgave5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				String tall1;
				
				for (int i =0; i<20; i++ ) { //Oppgave B
			
				
				tall1 = JOptionPane.showInputDialog("Tast inn poengsum: ");
				
				
				
				int s = Integer.parseInt(tall1);
				
				
				
				
				if (s>=0 && s<=100) {
				
				
				if (s>=0 && s<=39) {
					JOptionPane.showMessageDialog(null, "Karakteren din er: F");
				}
				if (s>=40 && s<=49) {
					JOptionPane.showMessageDialog(null, "Karakteren din er: E");
					
				}
				if (s>=50 && s<=59) {
					JOptionPane.showMessageDialog(null, "Karakteren din er: D");
				}
				if (s>=60 && s<=79) {
					JOptionPane.showMessageDialog(null, "Karakteren din er: C");
				}
				
				if (s>=80 && s<=89) {
					JOptionPane.showMessageDialog(null, "Karakteren din er: B");
					
				}
				if (s>=90 && s<=100) {
					JOptionPane.showMessageDialog(null, "Karakteren din er: A");
					
				}
				}
				else {
					JOptionPane.showMessageDialog(null, "Ugylding nummer");
					i = i-2; // Oppgave C Uglydig nummer blir nå lest på nytt 
				}
				i = i +1; 
				
				
				
				}
				
	}
}