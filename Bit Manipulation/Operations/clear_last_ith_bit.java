public class clear_last_ith_bit {
  public static int clear_last_ith(int bit,int pos){
int bitmask=(~0)<<pos;
return bit&bitmask;
  }

  
  public static void main(String[] args) {
   System.out.println(clear_last_ith(5,3));
   
   
  }
}
