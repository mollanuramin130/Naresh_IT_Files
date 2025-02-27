class Addition{
	public static double addition(double a,double b){
		return a+b;
	}
}

public class AdditionMain{
	public static void main(String []args){
		double a=Double.parseDouble(args[0]);
		double b=Double.parseDouble(args[1]);
		
		double result = Addition.addition(a,b);
		System.out.println("Addition of Command line Arguments is: "+result);
		
	}
}