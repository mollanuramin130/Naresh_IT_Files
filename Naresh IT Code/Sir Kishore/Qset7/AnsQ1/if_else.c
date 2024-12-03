#include<stdio.h>

int main(){
    printf("Enter the lengths of the three sides : \n");
    int side1,side2,side3;
    printf("\tSide 1: ");
    scanf("%d",&side1);
     printf("\tSide 2: ");
    scanf("%d",&side2);
     printf("\tSide 3: ");
    scanf("%d",&side3);
   if((side1+side2>side3)&&(side2+side3>side1)&&(side3+side1>side2)){
    printf("The triangle is valid\n");
   }
   else{
    printf("The triangle is not valid.\n");
   }
   return 0;
}