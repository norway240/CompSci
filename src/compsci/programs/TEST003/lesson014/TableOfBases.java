package compsci.programs.TEST003.lesson014;

public class TableOfBases {
	
	public static void main(String args[]){
		System.out.println("Decimal\t Binary\t Octal\t Hex\t Character");
		for(int i=65;i<=90;i++){
			System.out.println(i + "\t" + Integer.toBinaryString(i) + "\t   " + Integer.toOctalString(i) + "\t " + Integer.toHexString(i) + "\t " + (char)i);
		}
	}

}
