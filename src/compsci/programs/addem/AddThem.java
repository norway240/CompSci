package compsci.programs.addem;

import java.util.Scanner;

public class AddThem {
	
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter something like 8 + 33 + 1,345 +137: ");
		String s = scanner.nextLine();
		
		Scanner sc = new Scanner(s);
		sc.useDelimiter("\\s*\\+\\s*");
		
		int sum = 0;
		while(sc.hasNext()){
			sum = sum + sc.nextInt();
		}
		System.out.println("Sum is: " + sum);
	}

}
