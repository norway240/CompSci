package compsci.programs.TEST007.lesson029;

import java.util.Random;

public class MonteCarlo {
	
	public double h,k,r;
	private Random rnd = new Random();
	
	public MonteCarlo(double h, double k, double r){
		this.h = h;
		this.k = k;
		this.r = r;
	}
	
	public double nextRainDrop_x(){
		double x = rnd.nextDouble() * h;
		return x;
	}
	
	public double nextRainDrop_y(){
		double y = rnd.nextDouble() * k;
		return y;
	}
	
	public boolean insideCircle(double x, double y){
		boolean in = false;
		
		if((Math.pow(x-h,2)+Math.pow(y-k,2)) <= Math.pow(r,2)){
			in = true;
		}
		
		return in;
	}

}
