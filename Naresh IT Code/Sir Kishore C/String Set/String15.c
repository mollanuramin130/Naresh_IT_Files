#include<stdio.h>

int main(){
    printf("Enter your string : ");
    char str[50];
    scanf("%[^\n]",str);
    int strLen=0;
    for(int i=0;str[i];i++){ //here str[i] means str[i] !='\0'
        strLen++;
    }

    int count=0;
    for(int i=0;i<=strLen;i++){
        count++;

        if(str[i]==' ' || str[i]=='\0'){
            for(int j=0;j<count;j++){
                printf("%c",str[i-j-1]);
            }
            if(str[i]!='\0')printf(" ");
            count=0;
        }
    }
}