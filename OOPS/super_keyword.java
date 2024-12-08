 class super_keyword {
    public static void main(String[] args) {
        Horse h=new Horse();
        System.out.println(h.color);
    }
}
class Animal{
    String color;
    Animal(){
        System.out.println("Animal Constructor Called");
    }
}
class Horse extends Animal{
    Horse(){
        super();//by default super is called 
        super.color="brown";
        System.out.println("Horse Constructor Called");
       
    }
}