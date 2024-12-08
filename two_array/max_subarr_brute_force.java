public class max_subarr_brute_force {
    public static int max_sub_arr(int arr[]){
        int max_sum=Integer.MIN_VALUE,current_sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
current_sum+=arr[k];

                }
                System.out.println(current_sum);
                if(current_sum>max_sum){
                    max_sum=current_sum;
                }
                current_sum=0;
            }
        }
return max_sum;
    }
    public static void main(String[] args) {
        int arr[]={-3,10,-8};
        System.out.println("The Max Sum is "+max_sub_arr(arr));

    }
}
