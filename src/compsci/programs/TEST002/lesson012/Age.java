package compsci.programs.TEST002.lesson012;

import java.util.Scanner;

public class Age {
	
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Hey what's your name? (Sorry I keep forgetting) ");
		String name = scanner.nextLine();
		System.out.print("Okay " + name + ", how old are you? ");
		int age = scanner.nextInt();
		scanner.close();
		
		if(age<16){
			System.out.println("You can't drive, " + name);
		}else if(age>=16 && age<=17){
			System.out.println("You can drive but not vote, " + name);
		}else if(age>=18 && age<=24){
			System.out.println("You can vote but not rent a car, " + name);
		}else if(age>=25){
			System.out.println("You can do pretty much anything, " + name);
		}
		
	}

}
