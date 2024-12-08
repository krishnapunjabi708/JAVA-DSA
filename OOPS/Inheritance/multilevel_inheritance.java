public class multilevel_inheritance {
    
    public static void main(String[] args) {
        Dog d=new Dog();
        Animal a=new Animal();
        a.color="white";
        a.color();
        d.legs=3;
    d.color="black";
        d.legs();
     d.color();
        d.breathe();
        d.breed();
    }
}

class Animal{
    String color;
    void color(){
        System.out.println("Color "+color);
    }
    void eat(){
        System.out.println("Inside eat");
    }
    void breathe(){
        System.out.println("Inside Breathe");
    }

}
class Mammals extends Animal{
    int legs;

    void legs(){
        System.out.println("legs "+legs);
    }

}
class Dog extends Mammals{
    void breed(){
        
System.out.println("Inside Breed");
    }
}
