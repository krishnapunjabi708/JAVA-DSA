public class PrintFactorial {
    public static int factorial(int n){
        if(n==0){
            return 1;//base case
        }
return n*factorial(n-1);
    }
public static void main(String[] args) {
    System.out.println(factorial(0));
}
}
