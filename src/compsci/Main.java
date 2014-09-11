package compsci;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import compsci.programs.ProgramList;

public class Main {
	
	public static ButtonActionListener bal = new ButtonActionListener();
	public static JFrame frame = new JFrame("Computer Science Shenanigans");
	public static JPanel panel = new JPanel();
	public static JButton btn001 = new JButton(Consts.BTN001);
	public static JButton btn002 = new JButton(Consts.BTN002);
	public static JButton btn003 = new JButton(Consts.BTN003);

	private static void createAndShowGUI(){
		btn001.addActionListener(bal.act);
		btn002.addActionListener(bal.act);
		btn003.addActionListener(bal.act);
		
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
