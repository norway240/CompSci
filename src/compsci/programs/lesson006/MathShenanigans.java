package compsci.programs.lesson006;

import java.util.Scanner;

public class MathShenanigans {
	public static void main(String args[]){
		//2 types
		//$2 1 day
		//$5 golf
		
		//$161
		//43
		
		//23
		//18
		//25
		//20
		//21
		
		Scanner scanner = new Scanner(System.in);
		int dt = scanner.nextInt();
		scanner.close();
		int dm = dt*2;
		int gt = 43-dt;
		int gm = gt*5;
		int tt = dt+gt;
		int tm = dm+gm;
		
		System.out.println("dt="+dt+"\n"
				+ "dm="+dm+"\n"
				+ "gt="+gt+"\n"
				+ "gm="+gm+"\n"
				+ "tt="+tt+"\n"
				+ "tm="+tm);
		if(tt==43&&tm==161){
			System.out.println(dt+" works");
		}else{
			System.out.println(dt+" doesn't work");
		}
	}
}
