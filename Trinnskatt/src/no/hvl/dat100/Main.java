package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		String x = showInputDialog("Bruttoinntekt");
		
		int Bruttoinntekt = Integer.parseInt(x);
		
		double sats = 0.00;
		if (Bruttoinntekt >= 0 && Bruttoinntekt <= 164100);
		
		sats = 0.93/100;
		if (Bruttoinntekt >= 164101 && Bruttoinntekt <= 230950);
		
		sats = 2.41/100;
		if (Bruttoinntekt >= 230951 && Bruttoinntekt <= 580650);
				
		sats = 11.52/100;
		if (Bruttoinntekt >= 580651 && Bruttoinntekt <= 934050);		
		
		sats = 14.52/100;
		if (Bruttoinntekt >= 934051);
		
		double Trinnskatt = Bruttoinntekt * sats;
	
		
		JOptionPane.showMessageDialog(null, "Trinnskatten er " + Trinnskatt);
		
		
		
		
		
		
		
			
			
			
		

	}

}
