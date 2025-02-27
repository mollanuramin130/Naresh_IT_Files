class ArithmeticOperation{
	public static double addition(double a,double b){
		return a+b;
	}
	
	public static double subtraction(double a,double b){
		return a-b;
	}
	
	public static double multiplication(double a,double b){
		return a*b;
	}
	
	public static double division(double a,double b){
		return a/b;
	}
}

public class ArithmeticOperationMain{
	public static void main(String []args){
		double a=Double.parseDouble(args[0]);
		double b=Double.parseDouble(args[1]);
		
		double result = ArithmeticOperation.addition(a,b);
		System.out.println("Addition of Command line Arguments is: "+result);
		
		result = ArithmeticOperation.subtraction(a,b);
		System.out.println("Subtraction of Command line Arguments is: "+result);
		
		result = ArithmeticOperation.multiplication(a,b);
		System.out.println("Multiplication of Command line Arguments is: "+result);
		
		
		if(b!=0){
			result = ArithmeticOperation.division(a,b);
			System.out.println("Division of Command line Arguments is: "+result);
		
		}else{
			System.out.println("Division not possible by 0.");
		}
	}
}

