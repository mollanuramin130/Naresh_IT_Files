#include<stdio.h>
#include<math.h>

void arrayToNumberCon(int arr[],int size){
    int long number=0; 
    for(int i=size-1;i>=0;i--){
        number+=arr[size-1-i]*pow(10,i);
    }
    number+=1;
    int newArr[size+1];
    for(int i=0;i<=size;i++){
        newArr[i]=number%10;
        number/=10;
    }
    for(int i=size;i>=0;i--){
        printf("%d ",newArr[i]);
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
        arrayToNumberCon(arr,size);
    }
}