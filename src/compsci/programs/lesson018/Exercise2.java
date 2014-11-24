package compsci.programs.lesson018;

public class Exercise2 {

	public static void main(String[] args) {
		int[] val = {13,-4,82,17};
		int[] twice = new int[val.length];
		
		System.out.println("Original Array:");
		for(int i=0;i<val.length; i++){
			System.out.print(val[i] + " ");
		}
		
		for(int i=0; i<val.length; i++){
			twice[i] = val[i] * 2;
		}
		
		System.out.println("\nNew Array:");
		for(int i=0;i<twice.length; i++){
			System.out.print(twice[i] + " ");
		}

	}

}
