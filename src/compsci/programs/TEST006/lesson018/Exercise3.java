package compsci.programs.TEST006.lesson018;

public class Exercise3 {
	
	public static void main(String argsp[]){
		int[] valA = {13,-22,82,17};
		int[] valB = {-12,24,-79,-13};
		int[] sum = new int[valA.length];
		
		System.out.println("Original Array:");
		for(int i=0;i<valA.length; i++){
			System.out.print(valA[i] + " ");
		}
		
		for(int i=0; i<valA.length; i++){
			sum[i] = valA[i] + valB[i];
		}
		
		System.out.println("\nSum:");
		for(int i=0;i<sum.length; i++){
			System.out.print(sum[i] + " ");
		}
	}

}
