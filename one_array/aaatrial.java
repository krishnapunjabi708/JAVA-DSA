import java.util.Scanner;

public class aaatrial {
    String name;
    String Seat;
    String Fruit;
   public aaatrial(String name,String Seat,String Fruit){
    this.name=name;
    this.Seat=Seat;
    this.Fruit=Fruit;

   }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        aaatrial my=new aaatrial(s,s,s);
        System.out.println();
    }
}
