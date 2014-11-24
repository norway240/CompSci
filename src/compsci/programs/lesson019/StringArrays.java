package compsci.programs.lesson019;

public class StringArrays {

	public static void main(String[] args) {
		String[] s1 = {"test1", "test2", "test3"};
		String[] s2 = {"test2", "test2", "test3"};
		
		int c = 0;
		boolean s = false;
		for(int i=0; i<s1.length; i++){
			if(s1[i] == s2[i]){
				c++;
			}
		}
		
		if(c == s1.length){
			s = true;
		}
		
		System.out.println(s);

	}

}
