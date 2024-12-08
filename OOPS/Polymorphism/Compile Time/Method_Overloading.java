
public class Method_Overloading {
    public static void main(String[] args) {
        Calculator c=new Calculator();
        c.Sum(1, 2);
        c.Sum(1.4f, 2.7f);
        c.Sum(1, 2,3);


    }
}
class Calculator{
    void Sum(int a,int b){
        System.out.println(a+b);
    }
    void Sum(int a,int b,int c){
        System.out.println(a+b+c);
    }
    void Sum(float a,float b){
        System.out.println(a+b);
    }
}