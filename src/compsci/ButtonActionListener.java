package compsci;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import compsci.programs.math.ComputeThis;
import compsci.programs.math.MathShenanigans;
import compsci.programs.test.Tester;

public class ButtonActionListener {
	ActionListener btn001act = new ActionListener(){
		public void actionPerformed(ActionEvent e){
			System.out.println(Consts.BTN001);
			Tester.main(null);
		}
	};
	ActionListener btn002act = new ActionListener(){
		public void actionPerformed(ActionEvent e){
			System.out.println(Consts.BTN002);
			MathShenanigans.main(null);
		}
	};
	ActionListener btn003act = new ActionListener(){
		public void actionPerformed(ActionEvent e){
			System.out.println(Consts.BTN003);
			ComputeThis.main(null);
		}
	};
}
