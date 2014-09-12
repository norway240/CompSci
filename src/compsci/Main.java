package compsci;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.io.PrintStream;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import compsci.programs.ProgramList;

public class Main {

	static ButtonActionListener bal = new ButtonActionListener();
	static JPanel panel = new JPanel(new GridBagLayout());
	static GridBagConstraints c = new GridBagConstraints();
	static JTextArea textArea = new JTextArea(10,50);
	static JButton btnclear = new JButton("Clear");
	static JButton btn001 = new JButton(Consts.BTN001);
	static JButton btn002 = new JButton(Consts.BTN002);
	static JButton btn003 = new JButton(Consts.BTN003);
	
	private static void addSomething(Object obj,String type, int x, int y, int width){
		if(type.equalsIgnoreCase("button")){
			((AbstractButton) obj).addActionListener(bal.act);
		}
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = x;
		c.gridy = y;
		c.gridwidth = width;
		panel.add((Component) obj,c);
	}

	private static void createAndShowGUI(){
		JFrame frame = new JFrame("Computer Science Shenanigans");
		JScrollPane scroll = new JScrollPane(textArea);
		@SuppressWarnings("unused")
		PrintStream standardOut;

		addSomething(btnclear,"button",0,0,1);
		addSomething(btn001,"button",0,1,1);
		addSomething(btn002,"button",1,1,1);
		addSomething(btn003,"button",2,1,1);
		addSomething(scroll,"scroll",0,2,4);
		
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
