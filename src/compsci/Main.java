package compsci;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {
	
	private static void createAndShowGUI(){
		JFrame frame = new JFrame("Computer Science Shenanigans");
		JPanel panel = new JPanel();
		JButton button001 = new JButton();
		JButton button002 = new JButton();
		ButtonActionListener al = new ButtonActionListener();
		
		button001.addActionListener(al.button001action);
		button002.addActionListener(al.button002action);
		
		button001.setBounds(50, 50, 100, 50);
		button001.setText("Test");
		
		button002.setBounds(150, 150, 100, 50);
		button002.setText("Button2");
		
		panel.add(button001);
		panel.add(button002);
		frame.add(panel);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600,600);
		frame.setVisible(true);
	}
	
	public static void main(String args[]){
		
		javax.swing.SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				createAndShowGUI();
			}
		});
		
	}
	
}
