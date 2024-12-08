
public class set_ith_bit {
public static void set(int bit,int pos){
    int bitmask=1<<pos;
    bit=bit|bitmask;
    System.out.println(bit);
}
    public static void main(String[] args) {
        set(5, 3);
    }
}