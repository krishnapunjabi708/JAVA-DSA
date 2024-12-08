public class inheritance {
    
    public static void main(String[] args) {
        Fish Shark=new Fish();
Shark.eat();;
    }

}

 class Animal {
String color;
void eat(){
    System.out.println("eat");
}
void breathe(){
    System.out.println("breathe");
}

}

 class Fish extends Animal {
int fins;
void swim(){
    System.out.println("swim in water");
}
    
}