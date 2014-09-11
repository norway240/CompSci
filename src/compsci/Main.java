package compsci;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import compsci.programs.ProgramList;

public class Main {
	
	private static void createAndShowGUI(){
		JFrame frame = new JFrame("Computer Science Shenanigans");
		JPanel panel = new JPanel();
		JButton btn001 = new JButton("TEST");
		JButton btn002 = new JButton("Button2");
		ButtonActionListener al = new ButtonActionListener();
		
		btn001.addActionListener(al.btn001act);
		btn002.addActionListener(al.btn001act);
		
		panel.add(btn001);
		panel.add(btn002);
		frame.add(panel);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600,600);
		frame.setVisible(true);
	}
	
	public static void main(String args[]){
		createAndShowGUI();
		ProgramList.listPrograms();
	}
	
}
