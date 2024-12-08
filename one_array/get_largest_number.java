import java.util.*;
public class get_largest_number {
    public static int largest_number(int arr[]){
        int large_num=Integer.MIN_VALUE;//-infinity
        int small_number=Integer.MAX_VALUE;//+infinity
        for(int i=0;i<arr.length;i++){
            if(large_num<arr[i]){
                large_num=arr[i];
            }
            if(small_number>arr[i]){
                small_number=arr[i];
             }
        }
System.out.println("The Smallest number in the array is "+small_number);

        return large_num;
    }
    public static void main(String[] args) {
        int arr[]={1,6,12,2,3,4,9,15,11};
        
int large_num=largest_number(arr);

System.out.println("The Largest Number in the array is "+large_num);

    }
}
