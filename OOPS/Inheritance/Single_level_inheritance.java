public class Single_level_inheritance {
    public static void main(String[] args) {
        
        Rectangle r=new Rectangle();
        r.Display();
    }
}


class Shapes {
public void Display(){
    System.out.println("Inside Display");
}
    
}
class Rectangle extends Shapes{
    public void Area(){
        System.out.println("Inside The Area");
    }
}