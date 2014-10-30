package compsci.programs.TEST004.factors;

public class Factorgen {
	double num;
	double factor;
	double rem;
	
	public Factorgen(double n){
		num = n;
		factor = 2;
		rem = num;
	}
	
	public double nextFactor(){
        return factor;
	}
	
	public boolean hasMoreFactors(){
		if(rem % factor == 0){
			rem = rem/factor;
	        return true;
		}else{
			factor++;
			if(factor<num){
				if(hasMoreFactors()){
					return true;
				}else{
					return false;
				}
			}else{
				if (!(rem == 1)){
					System.out.println(rem);
				}
				return false;
			}
		}
	}
}
