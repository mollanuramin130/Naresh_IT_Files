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

    for(int i=0;str[i]!='\0';i++){
        char ch=str[i];
        if(str[i]>=65 && str[i]<=90){
            ch=ch+32;
        }
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            printf("This string contains vowel.\n");
            return 0;
        }
    }
    
    printf("There is no vowel present in this String.\n");
}