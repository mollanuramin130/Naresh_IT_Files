#include<stdio.h>

int main(){
    char str[50];
    int charArr[256];
    for(int i=0;i<256;i++){
        charArr[i]=0;
    }
    printf("Enter string : ");
    scanf("%[^\n]",str);
    int len=0;
    for(int i=0;str[i]!='\0';i++){
        len++;
    }
    for(int i=0;i<len;i++){
        int intValue=str[i];
        charArr[intValue]++;
    }
    for(int i=0;i<len;i++){
        int temp=str[i];
        printf("The frequency of %c is %d\n",str[i],charArr[temp]);
    }
}