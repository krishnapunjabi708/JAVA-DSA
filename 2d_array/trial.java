public class trial {
    public static void main(String[] args) {
        int array[][][]=new int[1][2][3];
        for(int i=0; i<1;i++){
            for(int j=0;j<2;j++){
                for(int k=0;k<3;k++){
                    array[i][j][k]=k;

                }
            }


        }
        for(int i=0; i<1;i++){
            for(int j=0;j<2;j++){
                for(int k=0;k<3;k++){
                    System.out.println(array[i][j][k]);
                    
                }
            }


        }
    }
}
