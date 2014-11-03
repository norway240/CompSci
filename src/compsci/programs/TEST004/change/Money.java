package compsci.programs.TEST004.change;

public class Money {
	double money,rem;
	int q,n,d,p;
	
	public Money(double m){
		money = m;
		if(money>=25){
			q = (int) (money/25);
			money -= q*25;
		}
		if(money>=10){
			d = (int) (money/10);
			money -= d*10;
		}
		if(money>=5){
			n = (int) (money/5);
			money -= n*5;
		}
		if(money>=1){
			p = (int) (money/1);
		}
	}
	
	public void getChange(){
		//System.out.println(q+","+d+","+n+","+p);
		if(q>0){
			System.out.println("Quarters: "+q);
		}
		if(n>0){
			System.out.println("Nickels: "+n);
		}
		if(d>0){
			System.out.println("Dimes: "+d);
		}
		if(p>0){
			System.out.println("Pennies: "+p);
		}
	}
	
}
