#include<stdio.h>

int main(){
    int side1,side2,side3;

    printf("Enter the lengths of the three sides of the triangle:\n");
    printf("\tSite 1: ");
    scanf("%d",&side1);

    printf("\tSite 2: ");
    scanf("%d",&side2);

    printf("\tSite 3: ");
    scanf("%d",&side3);

    if(side1==side2 && side1==side3){
        printf("the triangle is equilateral.\n");
    }
    else if(side1==side2 || side1==side3 || side2==side3){
        printf("The triangle is isosceles.\n");
    }
    else{
        printf("The triangle is scalene.\n");
    }
    return 0;
}