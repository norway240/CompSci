package compsci;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import test.Tester;

public class ButtonActionListener {
	ActionListener button001action = new ActionListener(){
		@SuppressWarnings("static-access")
		public void actionPerformed(ActionEvent e){
			System.out.println("Button1");
			Tester test = new test.Tester();
			test.main(null);
		}
	};
	ActionListener button002action = new ActionListener(){
		public void actionPerformed(ActionEvent e){
			System.out.println("Button2");
		}
	};
}
