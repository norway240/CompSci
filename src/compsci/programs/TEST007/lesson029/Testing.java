package compsci.programs.TEST007.lesson029;

public class Testing {
	
	public static void main(String args[]){
		MonteCarlo mc = new MonteCarlo(5,3,2);
		int ins = 0,inc = 0;
		
		for(int i=0; i<10000; i++){
			double x = mc.nextRainDrop_x();
			double y = mc.nextRainDrop_y();
			if(mc.insideCircle(x, y)){
				inc++;
			}
			ins++;
			//System.out.println(inc);
			//System.out.println(ins);
			double s = mc.h*2;
			double r = mc.r;
			double pi = ((inc * (Math.pow(s,2))) / (ins * Math.pow(r,2)));
			System.out.println(ins+": "+pi);
			//i=0;
		}
		
		
	}
	
}
