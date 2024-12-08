public class Interface_multiple_inheritance {
    public static void main(String[] args) {
        
    }
}
interface Carnivarous{
    void nonVeg();
}
interface Herbivarous{
    void Veg();
}
class Omnivarous implements Carnivarous,Herbivarous{//by using coma we cant use as much as interface
public void nonVeg(){
System.out.println("Eat Non-Veg");
}
public void Veg(){
System.out.println("Eat Veg");
}
}