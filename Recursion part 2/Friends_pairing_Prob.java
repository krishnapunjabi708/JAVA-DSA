public class Friends_pairing_Prob {
    public static int Friend_pairing(int n){
        if(n==1||n==2){
            return n;
        }
        int Fnm1=Friend_pairing(n-1);
        int Fnm2=Friend_pairing(n-2);
        int pair_ways=(n-2)*Fnm2;
        int total_ways=Fnm1+pair_ways;
        return total_ways;
    }
    public static void main(String[] args) {
        System.out.println(Friend_pairing(4));
    }
}
