package compsci;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

	static ButtonActionListener bal = new ButtonActionListener();
	static JPanel panel = new JPanel(new GridBagLayout());
	static GridBagConstraints c = new GridBagConstraints();
	static JButton[] BTN = new JButton[CONSTS.NUMBTNS];
	//static JTextArea textArea = new JTextArea(10,50);
	//static JButton btnclear = new JButton("Clear");
	
	
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
		
		//Set button titles
		CONSTS.BTNS[0] = "TEST";
		//L005
		CONSTS.BTNS[1] = "Results";
		//L006
		CONSTS.BTNS[2] = "ComputeThis";
		CONSTS.BTNS[3] = "MathShenanigans";
		//L007
		CONSTS.BTNS[4] = "Circle";
		CONSTS.BTNS[5] = "Name";
		//L009
		CONSTS.BTNS[6] = "EvenOdd";
		//L010
		CONSTS.BTNS[7] = "Calculator";
		CONSTS.BTNS[8] = "Weight";
		//L011
		CONSTS.BTNS[9] = "Loops";
		CONSTS.BTNS[10] = "ReverseName";
		//L012
		CONSTS.BTNS[11] = "L12";
		CONSTS.BTNS[12] = "Age";
		CONSTS.BTNS[13] = "Count";
		CONSTS.BTNS[14] = "Triangle";
		//L014
		CONSTS.BTNS[15] = "TableOfBases";
		
		//Create and add buttons to frame
		int x=0,y=0;
		for(int i=0;i<CONSTS.NUMBTNS;i++){
			//System.out.println(i);
		    BTN[i] = new JButton(CONSTS.BTNS[i]);
			addSomething(BTN[i],"button",x,y,1);
			x++;
			if(x==5){
				x=0;
				y++;
			}
		}
		
		/*JScrollPane scroll = new JScrollPane(textArea);
		@SuppressWarnings("unused")
		PrintStream standardOut;*/
		
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
		//ProgramList.listPrograms();
	}
	
}
