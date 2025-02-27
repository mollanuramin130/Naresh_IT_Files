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
    int vowelCount=0,consonantCount=0,digitCount=0,specialChCount=0;
    for(int i=0;str[i]!='\0';i++){
        char ch=str[i];
        if(str[i]>=65 && str[i]<=90){
            ch=ch+32;
        }
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            vowelCount++;
        }
        else if(ch>='a' && ch<='z'){
            consonantCount++;
        }
        else if(ch>='0' && ch<='9'){
            digitCount++;
        }else{
            specialChCount++;
        }
    }
    
    printf("Vowel count is : %d\nConsonant count is : %d\nDigit count is : %d\nSpecial Character count is : %d\n",vowelCount,consonantCount,digitCount,specialChCount);
}