#include<stdio.h>

int main(){
    char str[100];
    printf("Enter a String: ");
    //gets(str);
    scanf("%[^\n]",str);

    int count=0;
    //count=printf("%s",str);

    for(int i=0;str[i];i++){ //here str[i] means str[i] !='\0'
        count++;
    }
    
    printf("Length of the string: %d\n",count);
}