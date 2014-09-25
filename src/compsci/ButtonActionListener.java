package compsci;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonActionListener {
	ActionListener act = new ActionListener(){
		public void actionPerformed(ActionEvent e){
			//Main.textArea.setText("");
			if(e.getSource()==Main.btnclear){
			}else if(e.getSource()==Main.btn001){
				System.out.println(CONSTS.BTN001);
				compsci.programs.test.Tester.main(null);
			}else if(e.getSource()==Main.btn002){
				System.out.println(CONSTS.BTN002);
				compsci.programs.lesson006.MathShenanigans.main(null);
			}else if(e.getSource()==Main.btn003){
				System.out.println(CONSTS.BTN003);
				compsci.programs.lesson006.ComputeThis.main(null);
			}else if(e.getSource()==Main.btn004){
				System.out.println(CONSTS.BTN004);
				compsci.programs.lesson011.ReverseName.main(null);
			}else if(e.getSource()==Main.btn005){
				System.out.println(CONSTS.BTN005);
				compsci.programs.lesson009.EvenOdd.main(null);
			}else if(e.getSource()==Main.btn006){
				System.out.println(CONSTS.BTN006);
				compsci.programs.lesson010.Calculator.main(null);
			}else if(e.getSource()==Main.btn007){
				System.out.println(CONSTS.BTN007);
				compsci.programs.lesson010.Weight.main(null);
			}else if(e.getSource()==Main.btn008){
				System.out.println(CONSTS.BTN008);
				compsci.programs.lesson012.L12.main(null);
			}
		}
	};
}
