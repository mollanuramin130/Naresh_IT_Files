#include<stdio.h>
#include<math.h>

int main(){
 printf("Enter your Number to check Number is armstrong or Not\n");
 int number;
 scanf("%d",&number);
    int temp=number;
    int temp2=number;
    int power=0;
    while(temp2>0){
        power++;
        temp2=temp2/10;
    }

 int sum=0;

 while(number>0){
    int mod =number%10;
    sum=sum+pow(mod,power);
    number=number/10;
 }
 if(sum==temp){
    printf("Your number is a armstrong\n");
 }
 else{
    printf("Ypur number is not armstrong\n");
 }
}