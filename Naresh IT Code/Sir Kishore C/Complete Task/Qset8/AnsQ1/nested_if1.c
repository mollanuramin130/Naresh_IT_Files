#include<stdio.h>

int main(){
    int age;
    char gen,city;
    printf("Enter your age: ");
    scanf("%d",&age);
    printf("Enter your gender (M/F): ");
    scanf(" %c",&gen);
    printf("Enter your nationality (i or I for indian): ");
    scanf(" %c",&city);
    if(city=='i' || city=='I'){
        if((gen=='m'||gen=='M') && age>=21 ){
            printf("Eligible to get married in India\n");
        }
        else if((gen=='f' || gen=='F')&& age>=18){
            printf("Eligible to get married in India\n");
        }
        else{
            printf("Not eligible to get married in India\n");
        }
    }
    else{
        printf("You are not an Indian citizen\n");
    }

}