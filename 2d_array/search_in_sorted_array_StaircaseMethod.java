public class search_in_sorted_array_StaircaseMethod {
    public static void Stair_case(int matrix[][],int key){
        int row=0,column=matrix[0].length-1;
        while(row<matrix.length&&column>=0){
            if(key==matrix[row][column]){
                System.out.println("Element Found at "+"("+(row+1)+","+(column+1)+")");
                return;
            }
else if(key>matrix[row][column]){
    row++;
}
else
{
    column--;
}
        }
    }
   public static void main(String[] args) {
    int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
    int key =8;
    Stair_case(matrix, key);
   } 
}
