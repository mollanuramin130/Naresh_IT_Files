#include<stdio.h>

int main(){
    int arr[50];
    printf("Enter your array size : ");
    int size;
    scanf("%d",&size);
    printf("Enter your Array Elements : ");
    for(int i=0;i<size;i++){
        scanf("%d",&arr[i]);
    }
    for(int i=0;i<size;i++){
        for(int j=i+1;j<size;j++){
            if(arr[i]>arr[j]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }
    for(int i=0;i<size;i++){
        printf("%4d",arr[i]);
    }
    printf("\n");
    int ele,count,flag;
    for(int i=0;i<size;i++){  
        count=0; 
        flag=1;
        for(int j=i;j<size;j++){
            if(ele==arr[i]){
                flag=0;
                break;
            }
            if(arr[i]==arr[j]){
                count++;
            }
        }
        ele=arr[i];
        if(flag){
        printf("%d element %d times.\n",arr[i],count);
        }
    }
}