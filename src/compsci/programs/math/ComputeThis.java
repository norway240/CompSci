package compsci.programs.math;

public class ComputeThis {
	public static void main(String args[]){
		/*
		 * d1 = 3PIsin(187)+|cos(122)|
		 * d2 = (14.72)^""3.801"" + log base e 72
		 * 
		 * d1 = -0.618672237585067
		 * d2 = 27496.988867001543
		 */
		double d1,d2;
		d1 = (3*Math.PI*Math.sin(Math.toRadians(187))+(Math.abs(Math.cos(Math.toRadians(122)))));
		d2 = (Math.pow(14.72, 3.801)+Math.log(72));
		System.out.println("d1 = "+d1);
		System.out.println("d2 = "+d2);
	}
}
