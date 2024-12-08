public class Hybrid_inheritance {
   public static void main(String[] args) {
    Shark s=new Shark();
    s.eat();
   }
}
class Animal{
    String color;
    void eat(){
        System.out.println("eat");
    }
}
class Fish extends Animal{
    void swim(){
        System.out.println("Swim");
    }
}
class Shark extends Fish{
    void teeth(){
        System.out.println("teeth");
    }
}
class Birds extends Animal{
    void fly(){
        System.out.println("Fly");
    }
}
