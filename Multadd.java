public class Multadd{
	public static double multadd(double a, double b, double c){
		return a*b+c;
	}
	public static double expSum(double x){
		return multadd(x,Math.exp(-x), Math.sqrt(1.0-Math.exp(-x)));
	}
	public static void main(String[] args){
		double first = multadd(1.0,2.0,3.0);
		System.out.println(first);
		double second = multadd(Math.cos(Math.PI/4.0),1.0/2.0,Math.sin(Math.PI/4.0));
		System.out.println(second);
		double third = expSum(2.0);
		System.out.println(third);
		double fourth = multadd(1,Math.log10(10.0),Math.log10(20.0));
		System.out.println(fourth);
	
	}

}
