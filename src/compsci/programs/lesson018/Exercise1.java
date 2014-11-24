package compsci.programs.lesson018;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		scanner.close();
		
		int ar[] = new int[10];
		int i = 0;
		Scanner sc = new Scanner(s);
		while(sc.hasNext()){
			ar[i] = sc.nextInt();
			//System.out.println(ar[i]);
			i++;
		}
		sc.close();
		
		int sum = ar[0];
		String st = ""+ar[0];
		boolean p = true;
		for(i=1; i<ar.length; i++){
			if (!(ar[i]==0)){
				if(p){
					sum += ar[i];
					st += " + " + ar[i];
				}else{
					sum -= ar[i];
					st += " - " + ar[i];
				}
				p = !p;
			}
		}
		
		System.out.println(st + " = " + sum);
		
		/*1
		4
		9
		16
		19
		-7*/

	}

}
