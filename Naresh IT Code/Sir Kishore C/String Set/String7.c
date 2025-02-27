#include<stdio.h>

int main(){
    char str[30];
    printf("Enter string : ");
    scanf("%[^\n]",str);
    int len=0;
    for(int i=0;str[i]!='\0';i++){
        len++;
        if(str[i]>='A' && str[i]<='Z'){
            str[i]+=32;
        }
    }
    for(int i=0;i<=len/2;i++){
        if(str[i]!=str[len-1-i]){
            printf("%s is not palindrome..\n",str);
            return 0;
        }
    }
    printf("%s is palindrome..\n",str);
}