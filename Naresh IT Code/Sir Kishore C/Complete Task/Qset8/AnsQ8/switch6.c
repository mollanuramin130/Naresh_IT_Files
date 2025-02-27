#include<stdio.h>

int main(){
    int id;
    printf("Enter Id : ");
    scanf("%d",&id);
    if(id>=11 && id<=23){
        switch(id){
        case 11: case 12: case 13: case 14: case 15:
        printf("Software department\n");
        break;
        case 16: case 17: case 18: case 19: case 20:
        printf("Developer department\n");
        break;
        case 21: case 22: case 23:
        printf("Management department\n");
        break;
    }
    }
    else{
        printf("Invalid Id..!");
    }
    return 0;
}