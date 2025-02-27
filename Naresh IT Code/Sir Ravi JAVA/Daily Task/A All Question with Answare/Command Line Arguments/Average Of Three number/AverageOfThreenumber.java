class PrdoubleTable{
	public static void prdoubleTable(double number1,double number2,double number3){
	if(number1<0 || number2<0 || number3<0){
		System.out.println("Please enter all positive numbers...");
	}else{
		System.out.printf("Average of Three number is: %.2f\n",(number1+number2+number3)/3);
	}
		
	}
}

public class AverageOfThreenumber{
	public static void main(String args[]){
		double number1 = Double.parseDouble(args[0]);
		double number2 = Double.parseDouble(args[1]);
		double number3 = Double.parseDouble(args[2]);

		PrdoubleTable.prdoubleTable(number1,number2,number3);
	}
}