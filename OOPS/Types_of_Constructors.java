/*
 TYPES OF CONSTRUCTOR:-
1.Non-parameterized.
2.Parameterized.
3.Copy Constructor.
 */


public class Types_of_Constructors {
    public static void main(String[] args) {
        //Constructor Overloading and this is an e.g of polymorphism
        Constructor c1=new Constructor();
        Constructor c2=new Constructor(2);
        Constructor c3=new Constructor("krishna");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

    }
}


class Constructor{
    String name;
    int age;
Constructor(){//it don't have parameter in it.
System.out.println("non parameter.. ");
}
Constructor(String name){//parameter
this.name=name;
}
Constructor(int age){//parameter
this.age=age;
}

}
