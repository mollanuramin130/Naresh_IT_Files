#include<stdio.h>
#include<string.h>

int main(){
     printf("Enter your string: ");
    char str[50];
    scanf("%[^\n]", str);

    int strLen = strlen(str);
    int tempStr[256];
    for(int i=0;i<256;i++){
        tempStr[i]=0;
    }
    for(int i=0;i<strLen;i++){
        tempStr[str[i]]++;
    }
    for(int i=0;i<strLen;i++){
        if(tempStr[str[i]]>1){
            printf("%c%d",str[i],tempStr[str[i]]);
            tempStr[str[i]]=-1;
        }
    }
    printf("\n");
}