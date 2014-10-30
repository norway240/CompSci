package compsci.programs.TEST004.calculator;

import java.util.Scanner;

/*
 * 3.	Write an OOP simple calculator program.  User enters two number and then print out:
a.	The sum
b.	The difference
c.	The product
d.	The average
e.	The maximum
f.	The minimum
 */
public class Calc {
	
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("First Number: ");
		double fnum = scanner.nextDouble();
		System.out.print("Second Number: ");
		double snum = scanner.nextDouble();
		
		Functions calculator = new Functions(fnum, snum);	
		System.out.println("Sum: " + calculator.sum());
		System.out.println("Difference: " + calculator.difference());
		System.out.println("Product: " + calculator.product());
		System.out.println("Average: " + calculator.average());
		System.out.println("Maximum: " + calculator.maximum());
		System.out.println("Minimum: " + calculator.minimum());
		
		scanner.close();
	}
	
}
