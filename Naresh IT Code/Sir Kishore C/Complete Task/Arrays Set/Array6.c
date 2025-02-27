#include<stdio.h>

int secondLarge(int arr[],int size){
    int maxPosition=2;
    for(int i=0;i<size;i++){
        for(int j=i+1;j<size;j++){
            if(arr[i]>arr[j]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }
    for(int i=size-2;i>=0;i--){
        if(arr[i]!=arr[i+1]){
            maxPosition--;
        }
        if(maxPosition==1){
            return arr[i];
        }
    }
    return 0;
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
        if(secondLarge(arr,size)){
            printf("Second largest element = %d\n",secondLarge(arr,size));
        }
        else{
            printf("No second largest element found.\n");
        }
    }
}