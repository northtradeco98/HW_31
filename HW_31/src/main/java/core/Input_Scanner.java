package core;
import java.util.Scanner;

public class Input_Scanner {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in) ;
		System.out.println ("Enter your first name: ");
		String first_name = s.nextLine();
		System.out.println("Enter your last name: ");
		String last_name = s.nextLine();
		System.out.println ("Your full na,e is: " + first_name + " " + last_name);
		s.close();
		
	}

}
