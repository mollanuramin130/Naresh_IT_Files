#include<stdio.h>
#include<math.h>

void allArmstrong(int num1,int num2){
    if(num1<=0 ||num2<=0 || num1>num2){
        printf("Invalid Input\n");
    }
    else{
        printf("Armstrong numbers between %d and %d are: \n",num1,num2);
        for(int i=num1;i<=num2;i++){
            int count=0,sum=0;
            for(int r=i;r!=0;r/=10){
                count++;
            }
            for(int j=i;j!=0;j/=10){
                sum+=pow(j%10,count);
            }
            if(sum==i){
                printf("%4d\n",i);
            }
        }
        printf("\n");
    }
}
int main(){
    int start,end;
    printf("Enter start number : ");
    scanf("%d",&start);
    printf("Enter end number : ");
    scanf("%d",&end);
    allArmstrong(start,end);
}