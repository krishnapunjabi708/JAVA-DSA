public class swap_twoNo_without_using_third_var {
    public static void main(String[] args) {
        int a=2;
        int b=3;
        // a=a*b;
        // b=a/b; General Method
        // a=a/b;
        // by bit manipulation:-
        // by using x^x=0
        a=a^b;
        b=a^b;
        a=a^b;


        System.out.println(a);
        System.out.println(b);
    }
}
