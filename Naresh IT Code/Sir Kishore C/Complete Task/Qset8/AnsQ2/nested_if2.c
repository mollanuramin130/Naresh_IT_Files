#include<stdio.h>
#include<string.h>

int main(){
    int no_wheel,vehicle_age,bill;
    char name[20],vehicle_name[20],issue[40];
    printf("Enter vehicle number of wheeles (2/3/4): ");
    scanf("%d",&no_wheel);
    if(no_wheel>4 || no_wheel<=1){
        printf("This service center only accepts 2 wheeler ,3 wheeler & 4 wheeler\n");
    }
    else{
        printf("Enter your name: ");
        scanf("%s",name);
        printf("Enter name of vehicle: ");
        scanf(" %s",vehicle_name);
        printf("Enter age of vehicle in months: ");
        scanf("%d",&vehicle_age);
        if(vehicle_age>8){
            printf("Option:\n----------\n\n1)Enter 1 for tyre problem\n2)Enter 2 for fuel problem\n3)Enter 3 for engine issue\n4)Enter 4 for general services\n:");
            int problem_type;
            scanf("%d",&problem_type);
            if(problem_type==1){
                strcpy(issue,"tyre problem");               
                printf("how many tyres you are facing the issue ? ");
                int tyre_no;
                scanf("%d",&tyre_no);
                bill=400*tyre_no;
                printf("Name of the owner : %s\n",name);
                printf("Name of the Vehicle : %s\n",vehicle_name);
                printf("Issue : %s\n",issue);
                printf("Your total bill : %d\n",bill);
            }
            else if(problem_type==2){              
                bill=1500;
                strcpy(issue,"fuel problem"); 
                printf("Name of the owner : %s\n",name);
                printf("Name of the Vehicle : %s\n",vehicle_name);
                printf("Issue : %s\n",issue);
                printf("Your total bill : %d\n",bill);
            }
            else if(problem_type==3){              
                bill=5000;
                strcpy(issue,"Engine issue"); 
                printf("Name of the owner : %s\n",name);
                printf("Name of the Vehicle : %s\n",vehicle_name);
                printf("Issue : %s\n",issue);
                printf("Your total bill : %d\n",bill);
            }
            else if(problem_type==4){              
                bill=1000;
                strcpy(issue,"General services"); 
                printf("Name of the owner : %s\n",name);
                printf("Name of the Vehicle : %s\n",vehicle_name);
                printf("Issue : %s\n",issue);
                printf("Your total bill : %d\n",bill);
            }
            else{
                printf("Invalid choose\n");
            }
        }
        else{
            printf("your vehicle servie will done after a while\n");
        }
    }
}