package compsci.programs.TEST002.lesson012;

import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Count to: ");
		int num = scanner.nextInt();
		scanner.close();
		for(int count=0;count<=num;count++){
			System.out.print(count+" ");
		}
	}

}
