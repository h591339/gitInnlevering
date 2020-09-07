package no.hvl.dat100;

import javax.swing.JOptionPane;

public class Oppgave4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String tall1;
		
		tall1 = JOptionPane.showInputDialog("Tast inn ditt inntekt");
		
		double a = Integer.parseInt(tall1);
		double b = 0;
		double c = 180800; //trinn1:  180 800 -  254 500, trekk 1,9%
		double d = 254500; 
		double e = 639750; //trinn2: 254 500 - 639 750, 4,2%
		double f = 999550; //trinn3: 639 750 - 999 550, 12,20%
		double p0 = 0.00;
		double p1 = 0.019;
		double p2 = 0.042; 
		double p3 = 0.122;
		double p4 = 0.162; //trinn4: Over 999 550, 16,20% 
		
		
		if (a<c) {
			a = ((c-b)*p0);
			double rounded = Math.round(a);
			JOptionPane.showMessageDialog(null, "Trinn 0, og din trinntrekk er:  " + rounded+" kr");
		}
		if (a>=c && a<d) {
			a = ((a-c)*p1);
			double rounded = Math.round(a);
			JOptionPane.showMessageDialog(null, "Trinn 1, og din trinntrekk er:  " + rounded+" kr");
			
		}
		if (a>=d && a<e) {
			a = (((d-c)*p1)+((a-d)*p2));
			double rounded = Math.round(a);
			JOptionPane.showMessageDialog(null, "Trinn 2, og din trinntrekk er:  " + rounded+" kr");
		}
		if (a>=e && a<f) {
			a = (((d-c)*p1)+((e-d)*p2)+((a-e)*p3));
			double rounded = Math.round(a);
			JOptionPane.showMessageDialog(null, "Trinn 3, og din trinntrekk er:  " + rounded+" kr");
		}
		
		if (a>f) {
			a = (((d-c)*p1)+((e-d)*p2)+((f-e)*p3)+((a-f)*p4));
			double rounded = Math.round(a);
			JOptionPane.showMessageDialog(null, "Trinn 4, og din trinntrekk er:  " + rounded+" kr");
		}
		
			
		}
		
}
