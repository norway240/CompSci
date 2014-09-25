package compsci.programs.lesson010;

import java.util.Scanner;

public class Weight {
	
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.print("What is you weight on Earth? ");
		double weight = scanner.nextDouble();
		System.out.println("1. Voltar\n2. Krypton\n3. Fertos\n4. Servontos");
		System.out.print("Selecton? ");
		int sel = scanner.nextInt();
		scanner.close();
		String planet = "";
		switch(sel){
			case 1:
				planet = "Voltar";
				weight*=0.091;
				break;
			case 2:
				planet = "Krypton";
				weight*=0.720;
				break;
			case 3:
				planet = "Fertos";
				weight*=0.865;
				break;
			case 4:
				planet = "Servontos";
				weight*=4.612;
				break;
			default:
				System.out.println("Not a choice");
		}
		System.out.println("Your weight on " + planet + " would be " + weight);
		
	}
	
}
