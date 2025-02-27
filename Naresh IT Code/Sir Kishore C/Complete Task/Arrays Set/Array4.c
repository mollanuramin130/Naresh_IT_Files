#include<stdio.h>

void reverse1(){
    int size,sum=0;
    printf("Enter the size of the array: ");
    scanf("%d",&size);
    int arr[size];

    printf("Enter %d elements:\n",size);

    for(int i=0;i<size;i++){
        printf("Element at index %d: ",i);
        scanf("%d",&arr[i]);
    }
    printf("\n");

    printf("The values store into the array are :");
    for(int i=0;i<size;i++){
       printf("%d ",arr[i]);
    }

    printf("\n");
    printf("The values store into the array in reverse are :");
    for(int i=size-1;i>=0;i--){
       printf("%d ",arr[i]);
    }
    printf("\n");
}

void reverse2(){
    int size,sum=0;
    printf("Enter the size of the array: ");
    scanf("%d",&size);
    int arr[size];

    printf("Enter %d elements:\n",size);

    for(int i=0;i<size;i++){
        printf("Element at index %d: ",i);
        scanf("%d",&arr[i]);
    }
    printf("\n");

    printf("The values store into the array are :");
    for(int i=0;i<size;i++){
       printf("%d ",arr[i]);
    }

    printf("\n");
    for(int i=0;i<=size/2-1;i++){
       int temp=arr[i];
       arr[i]=arr[size-1-i];
       arr[size-1-i]=temp;
    }
    printf("\n");
    printf("The values store into the array in reverse are :");
    for(int i=0;i<size;i++){
       printf("%d ",arr[i]);
    }
    printf("\n");
    printf("\n");
}

int main(){
   //reverse1();
   reverse2();
}