public class odd_even_no_check {
    public static void main(String[] args) {
        int n=10;
        int bitmask=n&1;
        if(bitmask==1){
            System.out.println("The Number "+n+" is an odd number");
        }
else{
    System.out.println("The Number "+n+" is an even number");

}
    }
}
