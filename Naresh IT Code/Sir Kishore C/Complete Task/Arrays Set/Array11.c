#include<stdio.h>

void arrayRotate(int arr[],int size){
    printf("Enter the position : ");
    int position;
    scanf("%d",&position);
    printf("After rotating from %dth position the array is:",position);
    for(int i=position;i<size;i++){
        printf("%d ",arr[i]);
    }
    for(int i=0;i<position;i++){
        printf("%d ",arr[i]);
    }
    printf("\n");
}

int main(){
    printf("Enter your Array size : ");
    int size;
    scanf("%d",&size);
     if(size<=0){
        printf("Invalid Size...\n");
    }
    else{       
        int arr[size];
        printf("Enter %d Array Elements : ",size);
    
        for(int i=0;i<size;i++){
            scanf("%d",&arr[i]);
        }
        arrayRotate(arr,size);
    }
}