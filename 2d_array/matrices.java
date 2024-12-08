import java.util.*;

public class matrices {

    public static void search(int key,int matrice[][]){
        for(int i=0;i<matrice.length;i++){
            for(int j=0;j<matrice[0].length;j++){
                if(key==matrice[i][j]){
                    System.out.println("the key is at index "+"("+i+","+j+")");
                    return;
                }
            }
        }
    }
    public static void min(int matrice[][]){
        int curr=Integer.MAX_VALUE;
        for(int i=0;i<matrice.length;i++){
            for(int j=0;j<matrice[0].length;j++){
                if(matrice[i][j]<curr){
                    curr=matrice[i][j];

                }
                }
            }
            System.out.println("The Minimum value in matrix is "+curr);
        }
    
    public static void max(int matrice[][]){
        int curr=Integer.MIN_VALUE;
        for(int i=0;i<matrice.length;i++){
            for(int j=0;j<matrice[0].length;j++){
                
                if(matrice[i][j]>curr){
                    curr=matrice[i][j];
                }
                }
            }
            System.out.println("The Maximum value in matrix is "+curr);
        }
    
public static void main(String[] args) {
    int matrice[][]=new int[3][3];
//matrice[row][column]    
   int m=matrice.length;
   int n=matrice[0].length;//first row size == column
//m:- row        
//n:- column
int t=1;
    Scanner s=new Scanner(System.in);
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
 matrice[i][j]=t;
 t++;
        }
    }
    for(int i=0;i<m;i++){
        System.out.print("| ");
              for(int j=0;j<n;j++){
                               System.out.print(matrice[i][j] +" ");
                               }

                  System.out.print("| ");
    System.out.println();

    }
    int key =8;
    search(key, matrice);
    min(matrice);
    max(matrice);
    s.close();
}    
}
