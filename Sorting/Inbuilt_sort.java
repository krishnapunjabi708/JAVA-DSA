import java.util.Arrays;
import java.util.Collections;

public class Inbuilt_sort {


    public static void printArr(int arr[]){
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
    }
public static int compare(int a,int b){// this basically used in collections.reverseorder() to print in reverse order
    
    
    //a>b - positive val
    //a<b- neg val
    //a=b- zero 
    return a-b;
    //but if want to reverse it than 
    //return b-a;
}


    public static void main(String[] args) {
       
        int arr[]={5,4,3,2,1};//Primitive Type 
        Arrays.sort(arr);
        printArr(arr);


        System.out.println(); System.out.println(); System.out.println();


      int arrr[]={5,4,3,2,1};
Arrays.sort(arrr,2,5);
printArr(arrr);


System.out.println(); System.out.println(); System.out.println();




Integer ar[]={1,2,3,4,5};
Arrays.sort(ar,2,5,Collections.reverseOrder());
for(int i=0;i<ar.length;i++){
    System.out.println(ar[i]);
}
    }
}
