package compsci;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import compsci.programs.ProgramList;

public class Main {

	static ButtonActionListener bal = new ButtonActionListener();
	static JPanel panel = new JPanel(new GridBagLayout());
	static GridBagConstraints c = new GridBagConstraints();
	//static JTextArea textArea = new JTextArea(10,50);
	static JButton btnclear = new JButton("Clear");
	static JButton btn001 = new JButton(CONSTS.BTN001);
	static JButton btn002 = new JButton(CONSTS.BTN002);
	static JButton btn003 = new JButton(CONSTS.BTN003);
	static JButton btn004 = new JButton(CONSTS.BTN004);
	static JButton btn005 = new JButton(CONSTS.BTN005);
	static JButton btn006 = new JButton(CONSTS.BTN006);
	static JButton btn007 = new JButton(CONSTS.BTN007);
	static JButton btn008 = new JButton(CONSTS.BTN008);
	
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
		/*JScrollPane scroll = new JScrollPane(textArea);
		@SuppressWarnings("unused")
		PrintStream standardOut;*/

		//addSomething(btnclear,"button",0,0,1);
		addSomething(btn001,"button",0,0,1);
		addSomething(btn002,"button",1,0,1);
		addSomething(btn003,"button",2,0,1);
		addSomething(btn004,"button",3,0,1);
		addSomething(btn005,"button",0,1,1);
		addSomething(btn006,"button",1,1,1);
		addSomething(btn007,"button",2,1,1);
		addSomething(btn008,"button",3,1,1);
		//addSomething(scroll,"scroll",0,3,4);
		
		frame.add(panel);
		
		/*PrintStream printStream = new PrintStream(new CustomOutputStream(textArea));
		textArea.setEditable(false);
		standardOut = System.out;
		System.setOut(printStream);
		System.setErr(printStream);*/
		
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
