package compsci;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonActionListener {
	ActionListener act = new ActionListener(){
		public void actionPerformed(ActionEvent e){
			if(e.getSource()==Main.BTN[0]){
				compsci.programs.test.Tester.main(null);
			}else if(e.getSource()==Main.BTN[1]){
				System.out.println(Main.BTN[1].getText());
				compsci.programs.TEST001.lesson005.Results.main(null);
			}else if(e.getSource()==Main.BTN[2]){
				System.out.println(Main.BTN[2].getText());
				compsci.programs.TEST001.lesson006.ComputeThis.main(null);
			}else if(e.getSource()==Main.BTN[3]){
				System.out.println(Main.BTN[3].getText());
				compsci.programs.TEST001.lesson006.MathShenanigans.main(null);
			}else if(e.getSource()==Main.BTN[4]){
				System.out.println(Main.BTN[4].getText());
				compsci.programs.TEST001.lesson007.Circle.main(null);
			}else if(e.getSource()==Main.BTN[5]){
				System.out.println(Main.BTN[5].getText());
				compsci.programs.TEST001.lesson007.Name.main(null);
			}else if(e.getSource()==Main.BTN[6]){
				System.out.println(Main.BTN[6].getText());
				compsci.programs.TEST002.lesson009.EvenOdd.main(null);
			}else if(e.getSource()==Main.BTN[7]){
				System.out.println(Main.BTN[7].getText());
				compsci.programs.TEST002.lesson010.Calculator.main(null);
			}else if(e.getSource()==Main.BTN[8]){
				System.out.println(Main.BTN[8].getText());
				compsci.programs.TEST002.lesson010.Weight.main(null);
			}else if(e.getSource()==Main.BTN[9]){
				System.out.println(Main.BTN[9].getText());
				compsci.programs.TEST002.lesson011.Loops.main(null);
			}else if(e.getSource()==Main.BTN[10]){
				System.out.println(Main.BTN[10].getText());
				compsci.programs.TEST002.lesson011.ReverseName.main(null);
			}else if(e.getSource()==Main.BTN[11]){
				System.out.println(Main.BTN[11].getText());
				compsci.programs.TEST002.lesson012.L12.main(null);
			}else if(e.getSource()==Main.BTN[12]){
				System.out.println(Main.BTN[12].getText());
				compsci.programs.TEST002.lesson012.Age.main(null);
			}else if(e.getSource()==Main.BTN[13]){
				System.out.println(Main.BTN[13].getText());
				compsci.programs.TEST002.lesson012.Count.main(null);
			}else if(e.getSource()==Main.BTN[14]){
				System.out.println(Main.BTN[14].getText());
				compsci.programs.TEST002.lesson012.Triangle.main(null);
			}else if(e.getSource()==Main.BTN[15]){
				System.out.println(Main.BTN[15].getText());
				compsci.programs.TEST003.lesson014.TableOfBases.main(null);
			}
		}
	};
}
