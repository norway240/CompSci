package compsci.programs.lesson019;

public class DateArray {

	public static void main(String args[]) {
		String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		String[] m1 = new String[6];
		String[] m2 = new String[6];
		
		System.arraycopy(months, 0, m1, 0, 6);
		System.arraycopy(months, 6, m2, 0, 6);
		
		for(String i: m1){
			System.out.println(i);
		}
		
		for(String i: m2){
			System.out.println(i);
		}
		
	}

}
