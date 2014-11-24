package compsci.programs.lesson018;

public class Exercise4 {
	
	public static void main(String args[]){
		int[] valA = {13,-22,82,17};
		int[] valB = {0,0,0,0};
		
		for(int i=0;i<valA.length;i++){
			valB[i] = 25 - valA[i];
		}
		
		System.out.println("valA:");
		for(int i=0;i<valA.length; i++){
			System.out.print(valA[i] + " ");
		}
		System.out.println("\nvalB:");
		for(int i=0;i<valB.length; i++){
			System.out.print(valB[i] + " ");
		}
	}

}
