package compsci.programs.lesson007;

import java.util.Scanner;

public class Name {
	
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.print("What is your first name? ");
		String fname = scanner.nextLine();
		System.out.print("What is your last name? ");
		String lname = scanner.nextLine();
		scanner.close();
		System.out.println("Your full name is: " + fname + " " + lname);
	}
	
}
