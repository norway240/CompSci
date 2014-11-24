package compsci.programs.lesson018;

public class Exercise8 {

	public static void main(String[] args) {
		int[] data = {3,1,5,7,4,12,-3,8,-2};
		int[] d0 = new int[data.length];
		int n = data[0];
		
		for(int i=0; i<data.length; i++){
			d0[i] = Math.abs(data[i]);
			if(d0[i] < n){
				n = d0[i];
			}
		}
		
		System.out.println(n);

	}

}
