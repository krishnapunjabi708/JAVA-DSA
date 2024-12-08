public class Insertion_sort {
    public static void insert_sort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0&&curr<arr[prev]){
        arr[prev+1]=arr[prev];
        prev--;
            }
           arr[prev+1]=curr;

        }
        
    }
    public static void main(String[] args) {
        int arr[]={8,7,3,5,4};
        insert_sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
