public class PrintNoInDecreasingOrder {
public static void PrintNo(int n){
    if(n==0){
        return;
    }
    System.out.print(n+" ");
PrintNo(n-1);
}
    public static void main(String[] args) {
        PrintNo(5);
    }
}