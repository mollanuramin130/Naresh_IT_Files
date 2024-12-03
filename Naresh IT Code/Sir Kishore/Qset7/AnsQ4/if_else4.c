#include<stdio.h>

int main(){
    float teamA,teamB;
    printf("Enter sales amounts of team A : ");
    scanf("%f",&teamA);
    printf("Enter sales amounts of team B : ");
    scanf("%f",&teamB);

    if(teamA>=teamB){
        printf("Congratulations Team A wins bonus.\n");
    }
    else{
        printf("Congratulations Team B wins bonus.\n");
    }
}