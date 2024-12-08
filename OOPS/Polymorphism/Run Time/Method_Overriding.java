public class Method_Overriding {
public static void main(String[] args) {
    Circle c=new Circle();
    c.Area(1, 2);
}    
}
class Shape {
void Area(int a,int b){
System.out.println(a*b);
}
    
}
class Circle extends Shape{
void Area(int a,int b){
System.out.println(a+b);//this will be called
}
}