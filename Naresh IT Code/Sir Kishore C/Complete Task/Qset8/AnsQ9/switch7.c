#include<stdio.h>

int main(){
    int id=1001,password=1010,user_id,user_password;

    printf("Enter Id : ");
    scanf("%d",&user_id);
    switch(user_id==id){
        case 1:
        printf("Enter password : ");
        scanf("%d",&user_password);
        switch(user_password==password){
            case 1:
            printf("Login successful\n");
            break;
            case 0:
            printf("Invalid password\n");
            break;
        }
        break;
        case 0:
         printf("Invalid Id\n");
        
    }
   
    return 0;
}