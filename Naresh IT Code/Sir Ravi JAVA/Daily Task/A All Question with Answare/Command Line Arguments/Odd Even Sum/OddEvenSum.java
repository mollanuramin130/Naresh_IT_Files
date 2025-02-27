class SumValue{
	public static void oddEvenSum(int lastTerm){
		
		int oddSum=0,evenSum=0;

		for(int i=1;i<=lastTerm;i++){
			if(i%2==0){
				evenSum +=i;
			}else{
				oddSum +=i;
			}
		}
		System.out.println("Sum of even numbers from 1 to "+lastTerm+" is : "+evenSum);
		System.out.println("Sum of odd numbers from 1 to "+lastTerm+" is : "+oddSum);

	}
}

public class OddEvenSum{
	public static void main(String args[]){
		int lastTerm= Integer.parseInt(args[0]);
		SumValue.oddEvenSum(lastTerm);
	}
}