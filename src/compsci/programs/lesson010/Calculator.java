package compsci.programs.lesson010;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String args[]){
		System.out.println("Make your arithmetic selection from the choices below:\n");
		System.out.println("Addition");
		System.out.println("Subtraction");
		System.out.println("Multiplication");
		System.out.println("Division\n");
		System.out.print("Your choice? ");
		Scanner kbReader = new Scanner(System.in);
		String choice = kbReader.nextLine();
		System.out.print("\nEnter first operand. ");
		double op1 = kbReader.nextDouble();
		System.out.print("\nEnter second operand. ");
		double op2 = kbReader.nextDouble();
		kbReader.close();
		System.out.println(" ");
		choice.toLowerCase();
		switch(choice){
			case "add":
				System.out.println(op1 + " plus " + op2 + " = " + (op1 + op2) );
				break;
			case "subtract":
				System.out.println(op1 + " minus " + op2 + " = " + (op1 - op2));
				break;
			case "multiply":
				System.out.println(op1 + " times " + op2 + " = " + (op1 * op2) );
				break;
			case "divide": 
				System.out.println(op1 + " divided by " + op2 + " = " + (op1 / op2) );
				break;
			default:
				System.out.println("Enter only Add, Subtract, Multiply or Divide!");
		} 
	}

}
