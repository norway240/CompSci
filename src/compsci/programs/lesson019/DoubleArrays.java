package compsci.programs.lesson019;

public class DoubleArrays {
	
	public static void main(String[] args) {
		double[] d1 = {1, 2, 3};
		double[] d2 = {1, 2, 3};
		
		int c = 0;
		boolean s = false;
		for(int i=0; i<d1.length; i++){
			if(d1[i] == d2[i]){
				c++;
			}
		}
		
		if(c == d1.length){
			s = true;
		}
		
		System.out.println(s);

	}
	
}
