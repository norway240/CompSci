package compsci.programs.lesson018;

public class Exercise5 {
	
	public static void main(String argsp[]){
		int[] val = {0,1,2,3};

		System.out.println("Original Array:");
		for(int i=0;i<val.length; i++){
			System.out.print(val[i] + " ");
		}
		
		//reverse array
		for(int i=0; i<val.length/2; i++){
			int tmp = val[i];
			val[i] = val[val.length-i-1];
			val[val.length-i-1] = tmp;
		}
		
		System.out.println("\nReversed Array:");
		for(int i=0;i<val.length; i++){
			System.out.print(val[i] + " ");
		}
	}

}
