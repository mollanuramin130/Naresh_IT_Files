#include<stdio.h>

int main(){
    char str1[50],str2[50];
    printf("Enter first String : ");
    scanf("%[^\n]",str1);
    printf("Enter second String : ");
    getchar();
    scanf("%[^\n]",str2);

    int lenStr1=0,lenStr2=0;
    for(int i=0;str1[i];i++){
        lenStr1++;
    }
    for(int i=0;str2[i];i++){
        lenStr2++;
    }
    for(int i=lenStr1;i<lenStr1+lenStr2;i++){
        str1[i]=str2[i-lenStr1];
    }
    str1[lenStr1+lenStr2]='\0';
    printf("Resulting String is : %s\n",str1);
}