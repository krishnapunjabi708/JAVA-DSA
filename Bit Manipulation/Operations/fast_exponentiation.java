
public class fast_exponentiation {
public static void fast_expo(int a,int n){
    int ans=1;
    while(n>0){
        if((n&1)!=0){
           ans*=a;
        }
       a*=a;
       n=n>>1;

    }
    System.out.println(ans);

}
    public static void main(String[] args) {
        fast_expo(4, 2);
    }

}