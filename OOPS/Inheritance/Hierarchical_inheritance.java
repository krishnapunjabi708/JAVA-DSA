public class Hierarchical_inheritance {
    public static void main(String[] args) {
        Fish f=new Fish();
        f.color="blue";
System.out.println(f.color);
f.eat();
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
class Birds extends Animal{
    void fly(){
        System.out.println("Fly");
    }
}
class Mammals extends Animal{
    void walk(){
        System.out.println("walk");
    }
}