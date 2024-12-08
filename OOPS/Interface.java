public class Interface {
    public static void main(String[] args) {
        Queen q=new Queen();
        q.moves();
    }
}

interface ChessPlayer{
void moves();
}

class Queen implements ChessPlayer{
   public void moves() {
        System.out.println("up,down,right,left,diag{in all 4 derns }");
    }
}
class Rook implements ChessPlayer{
    public void moves() {
         System.out.println("up,down,right,left");
     }
 }
class king implements ChessPlayer{
    public void moves() {
         System.out.println("up,down,right,left,diag{in 1 derns}");
     }
 }