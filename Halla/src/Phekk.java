import java.util.Scanner;

public class Phekk {

	public static void main(String[] args) {
		System.out.println("What is your name?");
		
		//type identifier = new type();
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		
		System.out.println("hello " + name);
	}

}
