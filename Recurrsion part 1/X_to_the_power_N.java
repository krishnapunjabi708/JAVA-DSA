public class X_to_the_power_N {
    public static int XtoN(int x,int n){
        if(n==0){
            return 1;
        }
    
        return x*XtoN(x, n-1);
    }
public static int XtoN_Optimized(int x,int n){
    if(n==0){
        return 1;
    }
    int half_power=XtoN_Optimized(x, n/2);
   int half_powerSq=half_power*half_power;
    if(n%2==0){
        return half_powerSq;
    }
  
        return half_powerSq*x;
  

}
    public static void main(String[] args) {
        System.out.println(XtoN(2, 3));
        System.out.println(XtoN_Optimized(4, 3 ));
    }
}
