package compsci.programs.encrypt;

import java.util.Scanner;

public class NCrypt {
	
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Sentance to be encrypted: ");
		String sntc = scanner.nextLine();
		
		Encrypt encrypt = new Encrypt();
		String encryptedSntc = encrypt.encryptIt(sntc);
		System.out.println("Encrypted sentance: " + encryptedSntc);
		
		String decryptedSntc = encrypt.decryptIt(encryptedSntc);
		System.out.println("Decrypted sentance: " + decryptedSntc);
	}
}
