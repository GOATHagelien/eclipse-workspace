package kap3Kontrollstruktur;

import javax.swing.JOptionPane;

public class skuddår {

	public static void main(String[] args) {
		int aar = 1974;
		int mnd = 3;
		int antDager = 31;
		
		
		
		
		if(mnd == 4 || mnd == 6 || mnd == 9 || mnd == 11) {
			antDager = 30;
		} else {
			if (mnd == 2) {
				antDager = 28;
				boolean skuddaar = (aar % 4 == 0 && aar % 100 != 0) || (aar % 400 == 0);
				if (skuddaar) {
				antDager = 29;
			
		}
	}
		
}
	JOptionPane.showMessageDialog(null, " Måned " + mnd + " i år " + aar + " har " + antDager + " dager ");
	
	
		
	}
}	