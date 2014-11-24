package compsci.programs.lesson019;

public class DateArray {

	public static void main(String[] args) {
		String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		String[] m1 = new String[6];
		String[] m2 = new String[6];
		
		for(int i=0; i<months.length; i++){
			if(i<6){
				m1[i] = months[i];
			}else{
				m2[i-6] = months[i];
			}
		}
		
		for(int i=0; i<m1.length; i++){
			System.out.println(m1[i]);
		}
		
		for(int i=0; i<m2.length; i++){
			System.out.println(m2[i]);
		}
		
	}

}
