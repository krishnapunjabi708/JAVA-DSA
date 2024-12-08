public class get_ith_bit {
    public static void _get_ith_bit(int n,int pos){
        int bitmask=1<<pos;
        if((n&bitmask)!=0){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }
    public static void set_bit(int n,int pos,int set) {
        int bitmask=n^((1<<pos)*set);
        System.out.println(bitmask);

    }
    public static void main(String[] args) {
        int n=6;
        int pos=1;
        int set=1;
_get_ith_bit(n, pos);
set_bit(n,pos,set);
        
        


    }
}
