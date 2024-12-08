public class number_is_power_of_two_or_not {
    public static void two_power(int bit){
        int bitmask=bit&(bit-1);
        if(bitmask==0)
        {
          System.out.println("The Number is Two Power");
        }
        else{
          System.out.println("the Number is Not Power of 2");
        }
        
          }
          public static void main(String[] args) {
            two_power(10);
          }
}
