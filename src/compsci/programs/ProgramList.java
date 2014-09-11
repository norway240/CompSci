package compsci.programs;

public class ProgramList {
	public static void listPrograms(){
		String[] programs = {"TEST","IDK"};
		System.out.println("Programs:");
		for(int i=0; i<programs.length; i++){
			System.out.println(programs[i]);
		}
	}
}