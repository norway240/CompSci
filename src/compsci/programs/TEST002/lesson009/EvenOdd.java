package compsci.programs.TEST002.lesson009;

import java.util.Scanner;

public class EvenOdd {
	
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter and integer: ");
		int num = scanner.nextInt();
		scanner.close();
		if(num%2==0){
			System.out.println("The integer "+num+" is even.");
		}else{
			System.out.println("The integer "+num+" is odd.");
		}
		
	}

}
