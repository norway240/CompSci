package compsci.programs.lesson017.addem;

import java.util.Scanner;

public class AddThem {
	
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter something like 8 + 33 + 1,345 +137: ");
		String s = scanner.nextLine();
		
		Scanner sc = new Scanner(s);
		
		int sum = 0;
		while(sc.hasNext()){
			if(sc.next()=="+"){
				sc.useDelimiter("\\s*\\+\\s*");
				sum = sum + sc.nextInt();
			}else if(sc.next()=="-"){
				sc.useDelimiter("\\s*\\-\\s*");
				sum = sum - sc.nextInt();
			}else{
				continue;
			}
		}
		System.out.println("Sum is: " + sum);
	}

}
