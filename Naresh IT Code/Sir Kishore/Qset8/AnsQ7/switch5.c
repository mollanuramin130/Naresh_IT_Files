#include<stdio.h>

int main(){
    int choice;
    abc:
    printf("Select an option:\n1. Turn ON the Light\n2. Turn OFF the Light\n3. Turn ON the AC\n4. Turn OFF the AC\nEnter your choice: ");
    
    scanf("%d",&choice);
    
    if(choice>=1 && choice<=4){
        switch(choice){
        case 1:
        printf("Light is now ON.\n");
        break;
        case 2:
        printf("Light is now OFF.\n");
        break;
        case 3:
        printf("AC is now ON.\n");
        break;
        case 4:
        printf("AC is now OFF.\n");
        break;
        }
    }
    else{
        printf("Invalid choice! Please enter 1, 2, 3, or 4.\n\n");
            goto abc;

    }
    return 0;
}