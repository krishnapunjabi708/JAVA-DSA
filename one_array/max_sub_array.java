public class max_sub_array {

    public static void main(String[] args) {
int nums[]={1,2,3,4,5};
                int currentSum = 0;
                int maxSum = Integer.MIN_VALUE;
        
                for (int num : nums) {
                    currentSum = Math.max(num, currentSum + num);
                    maxSum = Math.max(maxSum, currentSum);
                }
        System.out.println(maxSum);
               
        
    }
}