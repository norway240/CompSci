package compsci.programs.TEST006.lesson018;

public class Exercise6 {

	public static void main(String[] args) {
		int[] data = {3,2,5,7,9,12,97,24,54};
		int[] sums = new int[3];
		
		//n%2=0: even
		
		for(int i=0; i<data.length; i++){
			sums[0] += data[i];
		}
		
		for(int i=0; i<data.length; i++){
			if(i%2 == 0){
				sums[1] += data[i];
			}
		}
		
		for(int i=0; i<data.length; i++){
			if(!(i%2 == 0)){
				sums[2] += data[i];
			}
		}
		
		for(int i=0; i<sums.length; i++){
			System.out.println(sums[i]);
		}
		
	}

}
