package compsci.programs.TEST004.change;

import java.util.Scanner;

public class Change {
	
	public static void main(String args[]){
		System.out.print("How much change do you have? ");
		Scanner scanner = new Scanner(System.in);
		double amt = scanner.nextDouble();
		scanner.close();
		Money change = new Money(amt);
		change.getChange();
	}

}
