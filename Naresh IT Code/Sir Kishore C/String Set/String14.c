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
    if(lenStr1!=lenStr2){
        printf("This are not anagram String..\n");
        return 0;
    }else{
        for(int i=0;i<lenStr1;i++){
            for(int j=i+1;j<lenStr1;j++){
                if(str1[i]>str1[j]){
                    char temp=str1[i];
                    str1[i]=str1[j];
                    str1[j]=temp;
                }
                if(str2[i]>str2[j]){
                    char temp=str2[i];
                    str2[i]=str2[j];
                    str2[j]=temp;
                }
            }
        }
        for(int i=0;i<lenStr1;i++){
            if(str1[i]!=str2[i]){
                printf("This is not anagram String..\n");
                return 0;
            }
        }
        printf("This are Anagram String..\n");
    }
}