import java.util.Scanner;
class RoundOff{
	public static void main(String []nur){
	
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the your Number : ");
		int number=sc.nextInt();
		
		int rem=number%10;
		if(rem>=5){
			System.out.println(((number/10)+1)*10);
		}
		else{
			System.out.println(((number/10))*10);
		}
	}
}
//wap for checking voting eligibility of the person by following few requirment requirement is ig age is greater than 18 eligible for voting else not eligible

//wap to find out the biggest number among three number
//int a=5,b=6,c=7
//biggest number is : 7
//int a=5,b=60,c=7
//biggest number is : 60
//int a=25,b=6,c=7
//biggest number is : 25

//wap by roundoff the number by following few requirements 
//if the last number is less than 5 roundoff the previous multiplication of its 10.
//if the last number is greater than 5 or equal to 5 roundoff the next multiplication of its 10.

//input as: a=34 output as:30
//input as: a=38 output as:40