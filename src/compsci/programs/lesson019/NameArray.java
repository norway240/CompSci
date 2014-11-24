package compsci.programs.lesson019;

import java.util.Scanner;

public class NameArray {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		scanner.close();
		
		char[] chars = new char[name.length()];
		chars = name.toCharArray();
		
		for(char i: chars){
			System.out.println(i);
		}

	}

}
