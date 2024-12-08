import java.util.*;
abstract class shape{
    public abstract double  calculate_area();
}
class aCircle extends shape{
double radius;
public aCircle(double radius){
    this.radius=radius;
}
public double calculate_area(){
return Math.PI*radius*radius;
}
}
public class aabstract {
    public static void main(String[] args) {
       
        System.out.println("Radius: ");
        Scanner sc=new Scanner(System.in);
        int radius=sc.nextInt();
        aCircle circle=new aCircle(radius);

        System.out.println("The area of circle is "+circle.calculate_area());
    }
    
}
