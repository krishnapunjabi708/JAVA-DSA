public class count_set_bit_in_a_number {
    public static void count_set_bit(int bit){
        int count=0;
        while (bit>0) {
            if ((bit&1)!=0) {
                count++;
            }
            bit=bit>>1;
        }

        System.out.println(count);
    }
    public static void main(String[] args) {
        count_set_bit(5);
    }
}
