
public class SwapWithout3rdVariable{
	public static void main(String []args){
		double firstNumber=Double.parseDouble(args[0]);
		double secondNumber=Double.parseDouble(args[1]);
		
		System.out.println("Before Swap First Number :"+firstNumber+" Second Number :"+secondNumber);
		
		firstNumber = firstNumber + secondNumber;
		secondNumber = firstNumber - secondNumber;
		firstNumber = firstNumber - secondNumber;
		
		System.out.println("Before Swap First Number :"+firstNumber+" Second Number :"+secondNumber);
	}
}