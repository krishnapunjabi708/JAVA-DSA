public class spiral_matrix {
    public static void a_spiral_matrix(int matrix[][]){
        int Startrow=0, 
        Endrow=matrix.length-1,
        Startcol=0,
        Endcol=matrix[0].length-1;
        while(Startrow<=Endrow&&Startcol<=Endcol){
            //top
            for(int j=Startcol;j<=Endcol;j++){
                System.out.println(matrix[Startrow][j]);
            }
            //right
            for(int i=Startrow+1;i<=Endrow;i++){
                System.out.println(matrix[i][Endcol]);
            }
            //bottom
            for(int j=Endcol-1;j>=Startcol;j--){
                if(Startrow==Endrow){
                    break;
                     }
                System.out.println(matrix[Endrow][j]);

            }
            //left
            for(int i=Endrow-1;i>=Startrow+1;i--){
                if(Startcol==Endcol){
                    break;
                     }
System.out.println(matrix[i][Startcol]);
            }
           Startcol++;
           Startrow++;
           Endcol--;
           Endrow--;
        }
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        a_spiral_matrix(matrix);
    }
}
