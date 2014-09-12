package compsci;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import compsci.programs.math.ComputeThis;
import compsci.programs.math.MathShenanigans;
import compsci.programs.test.Tester;

public class ButtonActionListener {
	ActionListener act = new ActionListener(){
		public void actionPerformed(ActionEvent e){
			Main.textArea.setText("");
			if(e.getSource()==Main.btnclear){
			}else if(e.getSource()==Main.btn001){
				System.out.println(Consts.BTN001);
				Tester.main(null);
			}else if(e.getSource()==Main.btn002){
				System.out.println(Consts.BTN002);
				MathShenanigans.main(null);
			}else if(e.getSource()==Main.btn003){
				System.out.println(Consts.BTN003);
				ComputeThis.main(null);
			}
		}
	};
}
