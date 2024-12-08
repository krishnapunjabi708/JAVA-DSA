/**
 * Tiling_prob
 */
public class Tiling_prob {
  //  2*n 
    public static int Tiling(int n){
        //base case
if(n==0||n==1){
    return 1;//only one way
}
//vertical choice
int Fnm1=Tiling(n-1);
//Horizontal choice
int Fnm2=Tiling(n-2);
int ways=Fnm1+Fnm2;
return ways;
    }

    public static void main(String[] args) {
        System.out.println(Tiling(5));
    }


}