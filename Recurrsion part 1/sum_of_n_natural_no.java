public class sum_of_n_natural_no {
    public static int SumOfN(int n){
        if(n==1){
            return 1;//base case
        }
        int Snm1=SumOfN(n-1);
        int Sn=n+Snm1;
        return Sn;
    }
public static void main(String[] args) {
    System.out.println(SumOfN(4));
}
}
