public class atrial {




public static void print(int mat[][]){
    for(int i=0;i<mat.length;i++){
        for(int j=0;j<mat[0].length;j++){
System.out.print(mat[i][j]+" ");

        }
        System.out.println();
    }
}
    public static void count(int mat[][],int key){
        int count=0;
    for(int i=0;i<mat.length;i++){
        for(int j=0;j<mat[0].length;j++){
if(key==mat[i][j]){
    count++;
}
        }
    }
    System.out.println("The "+key+" is repeated "+count+" times.." );
    }



    public static void sum_of_row(int mat[][],int row){
int sum_element_row=0;
    for(int j=0;j<mat[0].length;j++){
sum_element_row+=mat[row-1][j];
    }
    System.out.println("the sum of "+row+" row element is "+sum_element_row);

    }


public static void transpose (int mat[][]){
    print(mat);
   int row=mat.length,column=mat[0].length;
   int transpose[][]=new int[column][row];
   for(int i=0;i<row;i++){
    for(int j=0;j<column;j++){
        transpose[j][i]=mat[i][j];
    }
   }
    System.out.println("matrix becomes ");

   print(transpose);
}
  public static void main(String[] args) {
    
    int mat[][]={{1,2,3},{3,2,3},{1,2,3},{1,4,2}};
    int key =2;
    int row=2;
count(mat, key);
sum_of_row(mat, row);
transpose(mat);
  }
}
