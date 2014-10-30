package compsci.programs.TEST004.factors;

import java.util.Scanner;

/*
 * Factoring of integers.  Write a program that asks the user for an integer and then prints out all its factors.  
 * For example, when the user enters 150, the program should print 2,3,5,5.  
 * Use a class FactorGenerator with methods nextFactor and hasMoreFactors.
 */
public class Factors {
	
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		double n = scanner.nextDouble();
		
		Factorgen factor = new Factorgen(n);
		while(factor.hasMoreFactors()){
			System.out.println(factor.nextFactor());
		}
		
		scanner.close();
	}
	
}
