package no.hvl.dat100;

import javax.swing.JOptionPane;

public class Oppgave5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				String tall1;
				
				//int a1 = 100; int a =90; int b1 = 89; int b = 80; int c1 = 79; int c = 60; 
				//int d1 = 59; int d = 50; int e1= 49; int e = 40; int f1 = 39; int f= 0;
				
				tall1 = JOptionPane.showInputDialog("Tast inn poengsum");
				
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
				}
	}
}