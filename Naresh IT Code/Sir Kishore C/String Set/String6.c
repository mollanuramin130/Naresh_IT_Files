#include<stdio.h>

int main(){
    char str[100];
    printf("Enter a String: ");
    //gets(str);
    scanf("%[^\n]",str);

    int strLen=0;
    //strLen=printf("%s",str);

    for(int i=0;str[i];i++){ //here str[i] means str[i] !='\0'
        strLen++;
    }
    
    for(int i=0;i<strLen;i++){
        for(int j=i+1;j<strLen;j++){
            if(str[i]>str[j]){
                char temp=str[i];
                str[i]=str[j];
                str[j]=temp;
            }
        }
    }
    printf("After Sorting the String is : %s\n",str);

}