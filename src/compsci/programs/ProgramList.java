package compsci.programs;

import compsci.CONSTS;

public class ProgramList {
	public static void listPrograms(){
		String[] programs = {CONSTS.BTN001,CONSTS.BTN002,CONSTS.BTN003,CONSTS.BTN004};
		System.out.println("Programs:");
		for(int i=0; i<programs.length; i++){
			System.out.println(programs[i]);
		}
	}
}