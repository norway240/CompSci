package compsci.programs.TEST006.lesson019;

public class CopyArray {

	public static void main(String args[]) {
		int[] a1 = {1,2,3};
		int[] a2 = new int[3];
		
		System.arraycopy(a1, 0, a2, 0, 3);
		
		for(int i: a2){
			System.out.println(i);
		}

	}

}
