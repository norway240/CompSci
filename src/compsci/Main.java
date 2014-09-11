package compsci;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import compsci.programs.ProgramList;

public class Main {
	
	private static void createAndShowGUI(){
		ButtonActionListener al = new ButtonActionListener();
		JFrame frame = new JFrame("Computer Science Shenanigans");
		JPanel panel = new JPanel();
		JButton btn001 = new JButton(Consts.BTN001);
		JButton btn002 = new JButton(Consts.BTN002);
		JButton btn003 = new JButton(Consts.BTN003);
		
		btn001.addActionListener(al.btn001act);
		btn002.addActionListener(al.btn002act);
		btn003.addActionListener(al.btn003act);
		
		panel.add(btn001);
		panel.add(btn002);
		panel.add(btn003);
		frame.add(panel);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600,600);
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String args[]){
		createAndShowGUI();
		ProgramList.listPrograms();
	}
	
}
