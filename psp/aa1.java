 interface Inner1{
    void intera();
    void abstr();
  
    
}
 class inter implements Inner1 {
public void intera(){
System.out.println(" Inter ");
};
public void abstr(){
System.out.println(" abstr ");
};
    
}
public class aa1 {
  
 

    public static void main(String[] args) {
        inter k=new inter();
        k.intera();
    }
}