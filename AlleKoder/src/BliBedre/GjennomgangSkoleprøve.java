package BliBedre;

public class GjennomgangSkoleprøve {

	public static void main(String[] args) {
		//
		//Skrive kode som skriver ut om verdien er mindre enn 0, lik 0 eller større enn 0
		
		int a = 3;
		
		if (a>0) {
			System.out.println("a er større enn null");
		}
		else if (a==0) {
			System.out.println("a er lik null");
		}
		else {
			System.out.println("a er mindre enn null");
		}
		
		if (5<=a && a<=8) {
			System.out.println("a er innenfor intervallet");
		}
		else { 
			System.out.println("a er utenfor intervallet");
		}

	 
	
	//Lag en switch setning som gir verdi til strengvariabelen basert på gitte verdier
	
		int tall = 3; {
		switch (tall) {
		case 0: 
			System.out.println("null");
			break;
		case 1: 
			System.out.println("en"); 
			break;
		case 2: 
			System.out.println("to"); 
			break;
		case 3: 
			System.out.println("tre"); 
			break;
		case 4: 
			System.out.println("fire"); 
			break;
		default: 
			System.out.println("ulovlig verdi");
			break;
		}
	} 
		
		//Skriv koden for en for-løkke som gir følgende utskrift på skjermen
		
		for(int i = 2; i > 7; i++) {
			System.out.println("10 / " + i + " = " + 10 / i);
		}
		
		

}
}
