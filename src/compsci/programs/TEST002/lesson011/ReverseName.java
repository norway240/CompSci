package compsci.programs.TEST002.lesson011;

import java.util.Scanner;

public class ReverseName {
	
	public static void main(String args[]){
		System.out.print("Please enter your name. ");
		Scanner kbReader = new Scanner(System.in);
		String name = kbReader.nextLine().toLowerCase();
		kbReader.close();
		String revName = "";
		for(int i=name.length(); i>0; i--){
			revName = revName + name.substring(i-1, i);
		}
		System.out.println(revName);
	}

}
