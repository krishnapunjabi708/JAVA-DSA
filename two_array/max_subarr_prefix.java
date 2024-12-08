public class max_subarr_prefix {
public static void max_arr(int arr[]){
    int currSum=0,Max_sum=Integer.MIN_VALUE;
    int prefix_arr[]=new int[arr.length];
    prefix_arr[0]=arr[0];
    //calculating prefix array
    for(int i=1;i<arr.length;i++){
        prefix_arr[i]=prefix_arr[i-1]+arr[i];
    }
for(int i=0;i<arr.length;i++){
    for(int j=i;j<arr.length;j++){
        currSum=i==0?prefix_arr[j]:prefix_arr[j]-prefix_arr[i-1];
        //imp formula prefix_arr[j]-prefix_arr[i-1]
        System.out.println("The Curr Sum: "+currSum);
        if(currSum>Max_sum){
            Max_sum=currSum;
        }

    }
}
System.out.println("The Max Sum oF the Sub arr is : "+Max_sum);
}

    public static void main(String[] args) {
        int arr[]={2,1,-3};
        max_arr(arr);
    }
}