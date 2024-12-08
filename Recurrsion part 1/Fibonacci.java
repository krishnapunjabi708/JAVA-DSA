public class Fibonacci {
    public static int Fibonacci(int n){
        if(n==0||n==1){
            return n;
        }
        
        int FibNs2=Fibonacci(n-2);
        int FibNs1=Fibonacci(n-1);
        int FibN=FibNs1+FibNs2;    
return FibN;
    }
public static int Fib(int n){
    if(n==0||n==1){
        return n;
    }
   
    int f1=Fib(n-2),f2=Fib(n-1);
return f1+f2;
}
public static void main(String[] args) {
    System.out.println(Fibonacci(25));
}
}
