public class GridWays {

public static int gridWays(int i,int j,int n,int m){
   //base case
    if(i==n-1&&j==m-1){
return 1;
   }
   else if(i==n||j==n){//boundary cross condition
    return 0;
   }
   
    int w1=gridWays(i+1, j, n, m);
    int w2=gridWays(i, j+1, n, m);
    int totalways=w1+w2;
    return totalways;
}


    public static void main(String[] args) {
        int n=3,m=3;
        System.out.println(gridWays(0, 0, n, m));
    }
}
