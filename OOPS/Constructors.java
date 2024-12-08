/*Constructor:-
Constructor is a special method which is invoked automatically
at the time of object creation
-Constructor have the same name as class or structure
-Constructor don't have return type (not even void)
-Constructors are only called once,at object creation.
-Memory allocation happens when constructor is called.
 */


public class Constructors {
    public static void main(String[] args) {
        Student s1=new Student("krishna");//Constructor is called....
        System.out.println(s1.name);
    }
}
class Student{
    String name;
    int roll;
    Student(String name){// Constructor
this.name=name;
System.out.println("Constructor is Called....");
    }
}