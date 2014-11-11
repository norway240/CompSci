package compsci.programs.test;

import java.util.Scanner;


public class Tester {
	
	public static void main(String args[]){
		/*String s = "Lucky hockey puck";
		String m = "uck";
		int j = 6, z = 99;

		int k = s.indexOf(m);
		System.out.println(k);
		k = s.indexOf("uck", j);
		System.out.println(k);
		k = s.indexOf('c');
		System.out.println(k);
		String str = s.replace('o', 'p');
		System.out.println(str);
		k = s.lastIndexOf(m, j + 3);
		System.out.println(k);
		char p = s.charAt(7);
		System.out.println(p);
		k = s.indexOf(z);
		System.out.println(k);
		k = s.lastIndexOf(m);
		System.out.println(k);
		k = s.indexOf('y', j);
		System.out.println(k);
		p = s.charAt(z - 90);
		System.out.println(p);
		k = s.indexOf(m,15);
		System.out.println(k);
		k = s.indexOf(z + 2, 4);
		System.out.println(k);
		k = s.lastIndexOf('h');
		System.out.println(k);
		k = s.lastIndexOf(121);
		System.out.println(k);
		str = s.replace('y', 'A');
		System.out.println(str);*/
		
		String xyz = "bathtub";
		String ddd = "BathTUB";
		String ccc = xyz;
		String wc = "Whooping crane";
		String s = "	\t\tGu daay, mates \n";
		
		int j = xyz.compareTo(wc);
		boolean bb;
		if(j>0){
			bb = true;
		}else{
			bb = false;
		}
		System.out.println("16: "+bb);
		
		String v = ddd.toLowerCase();
		int fg = ccc.compareTo(v);
		System.out.println("17: "+(fg+1));
		
		System.out.println("18: "+ddd.compareTo(ccc));

		System.out.println("19: "+xyz.compareTo(ccc));

		System.out.println("20: " + "Stupid".compareTo(ddd));

		System.out.println("21: " + ">>>" + s.trim() + "<<<");

		String m = "Good morning, how may I help you? I289 56";
		Scanner sc = new Scanner(m);
		
		System.out.println("22: " + sc.next());

		sc.skip("\\s*mo");
		System.out.println("23: " + sc.next());

		sc.useDelimiter("\\s+1");
		System.out.println("24: " + sc.next());

		sc.findInLine("el");
		System.out.println("25: " + sc.hasNext());
		//System.out.println(sc.next());
		
		sc.useDelimiter("\\s+");
		//System.out.println("26: "+sc.nextInt());
		sc.close();
	}

}
