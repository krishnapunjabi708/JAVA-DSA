public class DiagSum {
    
        public static void DiaSum(int mat[][]){
            int sum=0;
            int sum1=0;
            for(int i=0;i<=mat.length-1;i++){
    sum=sum+mat[i][i];
    if(i!=mat.length-1-i)
    sum1=sum1+mat[i][mat.length-i-1];
            }
          
            System.out.println(sum);
            System.out.println(sum1);
            System.out.println("the total sum is equal to "+(sum+sum1));
        }


        public static void main(String[] args) {
            int mat[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
    DiaSum(mat);
        }
    
    
}
