class PrimeCheck{
	public static boolean isPrime(int number){
		for(int i=2;i<=number/2;i++){
			if(number%i==0){
				return false;
			}
		}
		return true;
	}
}

public class PrimeNumberCheck{
	public static void main(String args[]){
		int number = Integer.parseInt(args[0]);
		if(PrimeCheck.isPrime(number)){
			System.out.println(number + " is a Prime Number");
		}else{
			System.out.println(number + " is not a Prime Number");
		}
	}
}