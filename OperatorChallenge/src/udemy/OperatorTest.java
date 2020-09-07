package udemy;

public class OperatorTest {

	public static void main(String[] args) {
		double tyve = 20.00d;
		double åtti = 80.00d;
		double myValuesTotal = (tyve + åtti) * 100.00d;
		System.out.println(" MyValueTotal = " + myValuesTotal);
		double theRemainder = myValuesTotal % 40.00d;
		System.out.println("TheRemainder " + theRemainder);
		boolean isNoRemainder = (theRemainder == 0) ? true : false;
		System.out.println("isNoRemainder = " + isNoRemainder);
		if (!isNoRemainder) {
			System.out.println("Got some remainder");
		}
		
	

	}

}
