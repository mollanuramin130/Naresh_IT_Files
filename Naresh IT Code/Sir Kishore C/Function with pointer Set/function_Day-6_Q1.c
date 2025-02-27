#include<stdio.h>
void odddNumbersOfTimes(int arr[], int size);

int main(){
    printf("Enter the array size : ");
    int size;
    scanf("%d",&size);
    int arr[size];
    printf("Enter the array elements : ");
    for(int i=0;i<size;i++){
        scanf("%d",&arr[i]);
    }
    
    odddNumbersOfTimes(arr,size);
}

void odddNumbersOfTimes(int arr[], int size){
    int count;
    int tempArr[size];
    for(int i=0;i<size;i++){
        tempArr[i]=0;
    }
    printf("The element odd number of times is : ");
    for(int i=0;i<size;i++){
        count=1;
        if(tempArr[i]!=-1){
            for(int j=i+1;j<size;j++){
                if(arr[i]==arr[j]){
                    tempArr[j]=-1;
                    count++;
                }
            }
            if(count%2==1){
                printf("%3d",count);
            }
        }
    }
    printf("\n");
}