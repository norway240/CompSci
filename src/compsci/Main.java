package compsci;

import java.io.PrintStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import compsci.programs.ProgramList;

public class Main {
	
	public static ButtonActionListener bal = new ButtonActionListener();
	public static JFrame frame = new JFrame("Computer Science Shenanigans");
	public static JPanel panel = new JPanel();
	public static JButton btn001 = new JButton(Consts.BTN001);
	public static JButton btn002 = new JButton(Consts.BTN002);
	public static JButton btn003 = new JButton(Consts.BTN003);
	public static JTextArea textArea = new JTextArea(10,50);
	public static JScrollPane scroll = new JScrollPane(textArea);
	public static PrintStream standardOut;

	private static void createAndShowGUI(){
		btn001.addActionListener(bal.act);
		btn002.addActionListener(bal.act);
		btn003.addActionListener(bal.act);
		
		panel.add(btn001);
		panel.add(btn002);
		panel.add(btn003);
		panel.add(scroll);
		frame.add(panel);
		
		PrintStream printStream = new PrintStream(new CustomOutputStream(textArea));
		textArea.setEditable(false);
		standardOut = System.out;
		System.setOut(printStream);
		System.setErr(printStream);
		
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
