public class NQueens {
public static int count=0;
    public static void nqueens(char board[][],int row){
        //base
        if(board.length==row){
            printboard(board);
            count++;
            return;
        }
        for(int j=0;j<board.length;j++){
          if(isSafe(board,row,j)==true){
            board[row][j]='Q';
            nqueens(board, row+1);//function call
            board[row][j]='.';//backtracking step
          }
        }
    }
    public static void printboard(char board[][]){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
System.out.print(board[i][j]+" ");
            }
           System.out.println();
        }
      System.out.println();
    }
   public static boolean isSafe(char board[][],int row,int col){
        //vertical up
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //diag left
for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
    if(board[i][j]=='Q'){
        return false;
    }
}

        //diag right
    for(int i=row-1,j=col+1;i>=0&&j<board.length;i--,j++){
        if(board[i][j]=='Q'){
            return false;
        }
    }
    return true;
    }
    public static void main(String[] args) {
        int n=5;
        char [][] board=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        nqueens(board, 0);
        int totalways=count;
        System.out.println(count);

    }
}
