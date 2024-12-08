public class abstract_class {

    public static void main(String[] args) {
        Horse h=new Horse();
        Chicken c=new Chicken();
    // Animal a=new Animal(); Object cannot be created
        h.eat();
        c.eat();
        h.walk();
        c.walk();
    System.out.println(h.color);//Animal class color is called by default
    Mustang m=new Mustang();
    //Animal->Horse->Mustang




    }
    
}
abstract class Animal {
String color;
Animal(){
color="brown";
System.out.println("Animal Constructor Called");
}
void eat(){
    System.out.println("animal eats");
}
abstract void walk();//this function should mustt be in there extend class
//otherwise it show the error in code


}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse Constructor Called");
    }
void Change_color(){
    color="dark brown";
    System.out.println(color);

}

void walk(){
    System.out.println("walks on 4 legs");
}
}
class Chicken extends Animal{
    void walk(){
        System.out.println("walks on 2 legs");
    }
}
class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang Constructor Called");
    }
}