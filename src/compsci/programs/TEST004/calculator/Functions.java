package compsci.programs.TEST004.calculator;

public class Functions {
	double num1,num2,ans;
	
	public Functions(double n1, double n2){
		num1 = n1;
		num2 = n2;
	}
	
	public double sum(){
		return (ans = num1+num2);
	}
	
	public double difference(){
		return (ans = num1-num2);
	}

	public double product(){
		return (ans = num1*num2);
	}

	public double average(){
		return (ans = (num1+num2)/2);
	}
	
	public double maximum(){
		return (ans = Math.max(num1, num2));
	}

	public double minimum(){
		return (ans = Math.min(num1, num2));
	}
}
