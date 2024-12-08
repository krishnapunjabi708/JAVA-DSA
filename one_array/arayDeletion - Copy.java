import java.util.Scanner;

public class arayDeletion {
    public static void main(String[] args){
        int k=0;
       ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements in array");
        int n= sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter elements of Array");
        for (int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("The elements in Array are ");
        for (int i=0; i<n;i++){
            System.out.print(arr[i]+",");
        }
        System.out.println("Enter element to delete");
        int pos= sc.nextInt();
        
        for(int i= pos-1;i<n-1;i++) {
            arr[i]=arr[i+1];
        }


        System.out.println ("newly formed array is");
        for (int i=0; i<n-1;i++){
            System.out.print(arr[i]+",");
        }

    }

}