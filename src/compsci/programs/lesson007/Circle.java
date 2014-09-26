package compsci.programs.lesson007;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("What is the area? ");
		double area = scanner.nextDouble();
		double radius = Math.sqrt(area/Math.PI);
		System.out.println("Radius of your circle is: " + radius);
		scanner.close();
	}

}
