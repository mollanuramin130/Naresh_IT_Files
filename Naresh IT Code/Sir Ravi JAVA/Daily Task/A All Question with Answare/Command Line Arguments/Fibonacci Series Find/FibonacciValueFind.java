class FibonacciValue{
	public static void fibonacciValue(int lastTerm){
		int first=0,second=1;
		System.out.println("Fibonacci series upto "+lastTerm+" term be: ");
		for(int i=0;i<lastTerm;i++){
		
			System.out.print(first+"  ");
			int temp=first;
			first=second;
			second=temp+first;
			
		}
		
	}
}

public class FibonacciValueFind{
	public static void main(String args[]){
		int lastTerm= Integer.parseInt(args[0]);
		FibonacciValue.fibonacciValue(lastTerm);
	}
}