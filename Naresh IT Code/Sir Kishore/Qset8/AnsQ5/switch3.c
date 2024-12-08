#include<stdio.h>

int main(){
    int month_no;
    printf("Enter month number (1-12): ");
    scanf("%d",&month_no);
    if(month_no<=12 && month_no>=1){
        switch (month_no)
        {
        case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
            printf("31 days\n");
            break;
        case 4: case 6: case 9: case 11:  
            printf("30 days\n");
            break;
        default:
            printf("28 or 29 days (depending on leap year)\n");
            break;
        }
    }
    else{
        printf("Invalid Month No.....\n");
    }
    return 0;
}