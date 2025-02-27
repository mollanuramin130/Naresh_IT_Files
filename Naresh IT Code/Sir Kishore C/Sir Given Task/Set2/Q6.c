#include<stdio.h>

int main(){
    int number;
    printf("Enter your Number : ");
    scanf("%d",&number);
    int sum=0;
    for(int i=1;i<=number;i++){
        printf("%d\u00B2+",i);
        sum+=i*i;
    }
printf("\b=%d\n",sum);
    return 0;
}