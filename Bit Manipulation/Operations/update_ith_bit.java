public class update_ith_bit {
    
    public static int set(int bit,int pos){
int bitmask=1<<pos;
return bit|bitmask;


    }
    public static int clear(int bit ,int pos){
        int bitmask=1<<pos;
        return bit&(~(bitmask));
    }
public static int update(int bit,int pos,int update){
      
if(update==0){
   return clear(bit, pos);
}
else{
return set(bit, pos);
}
    }
    public static int update_new(int bit,int pos,int update){
        bit=clear(bit,pos);
        int bitmask=update<<pos;
        return bit|bitmask;
      
        
        }
    public static void main(String[] args) {
    
      System.out.println(update(5, 1, 1)); 
System.out.println(update_new(5, 1, 1));
    }
    
}
