
public class Classes_And_Objects {

public static void main(String[] args) {
    PEN p=new PEN();
    p.setcolor("Blue");
    p.settip(3);
    System.out.println(p.color);
    System.out.println(p.tip);
    Student s=new Student();
    s.average(70, 80, 100);
    s.age=12;
    System.out.println(s.age);
    System.out.println(s.percentage);
}
}
class PEN {
    String color;
    int tip;
    void setcolor(String Newcolor){
    color=Newcolor;
    }    
    void settip(int Newtip){
    Newtip=tip;
    }

        }
        class Student{
            String Student;
            float percentage;
            int age;
            void average(float chem,float phy,float math){
        percentage=chem+phy+math/300;
        
            }

        
        
        }
 