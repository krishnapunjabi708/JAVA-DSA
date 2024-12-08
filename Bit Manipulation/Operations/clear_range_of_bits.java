public class clear_range_of_bits {
    public static void clear_range(int bit,int start,int end){
        int a=(~0)<<(end+1);
        int b=(1<<start)-1;
        int bitmask=a|b;
    
        System.out.println(bit&bitmask);
      }
      public static void main(String[] args) {
        clear_range(5, 0, 1);
      }
}
