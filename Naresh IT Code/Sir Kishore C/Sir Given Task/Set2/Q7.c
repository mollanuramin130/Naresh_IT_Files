#include<stdio.h>

int main(){
    int number;
    printf("Enter your number : ");
    scanf("%d",&number);
    float sum=0.0;
    for(int i=0;i<=number;i++){
        if(i==0){
            sum+=1;
            printf("%d+",1);
        }
        else{
            sum+=(1.0/i);
            printf("1/%d+",i);
        }
    }
    printf("\b=%.2f\n",sum);
    return 0;
}