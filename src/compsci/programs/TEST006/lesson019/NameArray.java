package compsci.programs.TEST006.lesson019;

import java.util.Arrays;
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
		
		int i = Arrays.binarySearch(chars, 'r');
		System.out.println(i);

	}

}
