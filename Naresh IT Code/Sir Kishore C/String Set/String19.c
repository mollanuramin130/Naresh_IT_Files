#include<stdio.h>

int isPrime(int number);

int main(){
    printf("enter your String : ");
    char str[50];
    scanf("%[^\n]",str);
   
   printf("Prime index position String : ");
    for(int i=0;str[i];i++){
        if(isPrime(i)){
            printf("%c",str[i]);
        }
    }
    printf("\n");
    
}
int isPrime(int number){
    if(number<=1){
        return 0;
    }else{
        for(int i=2;i<=number/2;i++){
            if(number%i==0){
                return 0;
            }
        }
        return 1;
    }
}