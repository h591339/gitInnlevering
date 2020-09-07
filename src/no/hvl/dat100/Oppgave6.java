package no.hvl.dat100;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Oppgave6 {
	public static int Factorial(int  input) {
		if ( input == 1) {
			return 1;
		}
		else {
			return input*Factorial(input-1);
		}
		
	}
	
	public static void main(String[] args) {
		
		System.out.print("Tast inn tall større enn 0 her: ");
		Scanner sc=new Scanner (System.in);
		int input =sc.nextInt();
		if(input<=0) {
			System.out.println("ugyldig nummer");
		}
		else {
			int resultat = Factorial(input);
			
			System.out.println(input + "!=" + resultat);
		}
		
		
	}
}
