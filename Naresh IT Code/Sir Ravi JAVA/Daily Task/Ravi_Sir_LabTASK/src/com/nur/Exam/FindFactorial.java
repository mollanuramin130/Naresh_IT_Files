package com.nur.Exam;

import java.util.Scanner;

public class FindFactorial{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int number =sc.nextInt();

        int result=fact(number);
        System.out.println("The factorial of "+number+" is: "+result);
    }

    public static int fact(int number){
        int factVal=1;
        for(int i=2;i<=number;i++){
            factVal*=i;
        }
        return factVal;
    }
}
