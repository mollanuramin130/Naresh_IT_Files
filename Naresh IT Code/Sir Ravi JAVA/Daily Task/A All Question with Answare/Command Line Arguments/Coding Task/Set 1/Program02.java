import java.util.Scanner;

class Program01{
	public static void main(String []nur){
	
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter your age : ");
		int age=sc.nextInt();
		if(age>=18){
			System.out.println("You are Eligible for Vote...");
		}
		else{
			System.out.println("You are not Eligible for Vote!!!!");
		}
	}
}