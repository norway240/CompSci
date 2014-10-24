package compsci.programs.TEST002.lesson012;

import java.util.Scanner;

public class Triangle {
	
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		int num1,num2,num3;
		System.out.println("Enter 3 integers");
		System.out.print("Side 1: ");
		num1 = scanner.nextInt();
		do{
			System.out.print("Side 2: ");
			num2 = scanner.nextInt();
			if(num2<num1){
				System.out.println("Side 2 must be bigger");
			}
		}while(num2 < num1);
		do{
			System.out.print("Side 3: ");
			num3 = scanner.nextInt();
			if(num3<num2){
				System.out.println("Side 3 must be bigger");
			}
		}while(num3 < num2);
		scanner.close();
		System.out.println("Your 3 sides are: "+num1+", "+num2+", "+num3);
		if((Math.pow(num1, 2)+Math.pow(num2, 2))==Math.pow(num3, 2)){
			System.out.println("Right triangle");
		}
		
	}
	
}
