import java.util.*;

public class fast_transpose {
    static int count;
    public static void Sparse(int arr[][],int [][]sparse,int r,int c){
        int k=1;
        sparse[0][0]=r;
        sparse[0][1]=c;
        for (int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(arr[i][j]!=0){
                    count++;
                    sparse[k][0]= i;
                    sparse[k][1]= j;
                    sparse[k][2] = arr[i][j];
                    k++;
             }
            }
        }
        sparse[0][2]= count;
        System.out.println("************ Sparse matrix is ***********");
        for (int i=0;i<count+1;i++){
            for(int j=0;j<3;j++){
                System.out.print(sparse[i][j] + " ");
            }
            System.out.println();
    }

}


 public static void main(String[] args) {
    int sparse[][] = new int[30][3];
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter no of rows ");
    int m = sc.nextInt();
    System.out.println("ENter no of columns");
    int n= sc.nextInt();
     int [][] arr = new int [m][n];
     System.out.println("Enter Array elements ");
     for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            System.out.println("Enter the element at "+i+"th row "+j+"the column");;
            arr[i][j] = sc.nextInt();
        }
     }
     Sparse(arr, sparse, m, n);

    }


}
