package compsci.programs.TEST002.lesson012;

import java.util.Scanner;

public class L12 {
	
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		int num;
		do{
			System.out.print("Enter an integer: ");
			num = scanner.nextInt();
			System.out.println(Math.pow(num, 2));
		}while(num!=0);
		scanner.close();
	}

}