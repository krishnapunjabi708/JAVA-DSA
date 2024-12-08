public class BacktrackingArray {
    public static void ChangeArray(int arr[],int i,int val){
        //base case
        if(i==arr.length){
print(arr);
return;
        }
        //recursion
        arr[i]=val;
ChangeArray(arr, i+1, val+1);//function call step
arr[i]=arr[i]-2;//backtracking stop
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[]=new int[5];
        ChangeArray(arr, 0, 1);
        print(arr);
        
    }
}
