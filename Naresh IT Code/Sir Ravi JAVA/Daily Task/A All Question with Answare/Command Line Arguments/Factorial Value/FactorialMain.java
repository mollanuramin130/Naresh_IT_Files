
public class FactorialMain{
	public static void main(String []args){
		int number=Integer.parseInt(args[0]);
		System.out.println("Factorial value of "+number+" is: "+Factorial.factorial(number));
	}
}


class Factorial{
	public static long factorial(int number){
		if(number ==1){
			return 1;
		}
		return number*factorial(number-1);
	}
}