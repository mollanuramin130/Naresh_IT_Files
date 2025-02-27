#include<stdio.h>
#include<string.h>

int main(){
     printf("Enter your string: ");
    char str[50];
    scanf("%[^\n]", str);

    int strLen = strlen(str);
    printf("Enter the character to find frequency: ");
    char charValue;
    getchar();
    scanf("%c",&charValue);

    int frequCount=0;
    for(int i=0;i<strLen;i++){
        if(str[i]==charValue){
            frequCount++;
        }
    }
    printf("The frequency of '%c' is : %d\n",charValue,frequCount);
}