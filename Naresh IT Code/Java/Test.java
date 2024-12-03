
package Java;
import java.lang.*;
import java.util.Arrays;
public class Test {
    public static void main(String[] args) {
        int arr[]={70,8,99,102,23,5,120,4,999,50};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
