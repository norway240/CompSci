package compsci.programs.lesson019;

import java.util.Scanner;

public class NameArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		scanner.close();
		
		char[] chars = new char[name.length()];
		for(int i=0; i<name.length(); i++){
			chars[i] = name.charAt(i);
		}
		
		for(int i=0; i<chars.length; i++){
			System.out.println(chars[i]);
		}

	}

}
