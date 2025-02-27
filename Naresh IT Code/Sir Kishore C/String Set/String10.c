#include<stdio.h>

int main(){
    char str[50];
    printf("Enter a string with number : ");
    scanf("%[^\n]",str);
    int sum=0,len=0;
    for(int i=0;str[i];i++){
        len++;
    }
    for(int i=0;i<len;i++){
        if(str[i]>='0' && str[i]<='9'){
            sum+=str[i]-'0';
        }
    }
    printf("Sum of the number is : %d \n",sum);
}