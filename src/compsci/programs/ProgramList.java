package compsci.programs;

import compsci.Consts;

public class ProgramList {
	public static void listPrograms(){
		String[] programs = {Consts.BTN001,Consts.BTN002,Consts.BTN003};
		System.out.println("Programs:");
		for(int i=0; i<programs.length; i++){
			System.out.println(programs[i]);
		}
	}
}