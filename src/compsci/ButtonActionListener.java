package compsci;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import compsci.programs.test.Tester;

public class ButtonActionListener {
	ActionListener btn001act = new ActionListener(){
		public void actionPerformed(ActionEvent e){
			System.out.println("Button1");
			Tester.main(null);
		}
	};
	ActionListener btn002act = new ActionListener(){
		public void actionPerformed(ActionEvent e){
			System.out.println("Button2");
		}
	};
}
