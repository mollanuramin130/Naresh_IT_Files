#include<stdio.h>

int main(){
    float physics,chemistry,biology,math,computer;
    printf("Enter the marks of Physics: ");
    scanf("%f",&physics);
    printf("Enter the marks of Chemistry: ");
    scanf("%f",&chemistry);
    printf("Enter the marks of Biology: ");
    scanf("%f",&biology);
    printf("Enter the marks of Mathematics: ");
    scanf("%f",&math);
    printf("Enter the marks of Computer: ");
    scanf("%f",&computer);

    float total=physics+chemistry+biology+math+computer;
    float percen=total/5;

    printf("Total marks = %.2f/500\n",total);
    printf("Percentage = %.2f%%\n",percen);
    if(percen>=90){
        printf("Grade = A");
    }
    else if(percen>=80){
            printf("Grade = B");
        }
    else if(percen>=70){
            printf("Grade = C");
        }
    else if(percen>=60){
            printf("Grade = D");
        }
    else if(percen>=40){
            printf("Grade = E");
        }
    else if(percen<40){
        printf("Grade = F");
    }


    return 0;
}