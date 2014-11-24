package compsci.programs.lesson018;

public class Exercise7 {

	public static void main(String[] args) {
		int[] data = {3,1,5,7,4,12,-3,8,-2};
		int l1=0,l2=0;
		
		for(int i=0; i<data.length; i++){
			if(data[i]>l1){
				l1=data[i];
			}
			
			if(data[i]>l2 && data[i] < l1){
				l2 = data[i];
			}
		}
		
		System.out.println(l1 + ", " + l2);
		
	}

}
