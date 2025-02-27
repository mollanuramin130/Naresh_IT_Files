import java.util.Scanner;

class Program03{
	public static void main(String []nur){
	
	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First Number : ");
		int a=sc.nextInt();
		System.out.println("Enter the Second Number : ");
		int b=sc.nextInt();
		System.out.println("Enter the Third Number : ");
		int c=sc.nextInt();
	
		if(a>=b && a>=c){
			System.out.println("Biggest number is : "+a);
		}
		else if(b>=a && b>=c){
			System.out.println("Biggest number is : "+b);
		}
		else if(c>=b && c>=a){
			System.out.println("Biggest number is : "+c);
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