public class Copy_Contructor {
public static void main(String[] args) {
    Students s1=new Students();
    
   s1.name="krishna";
   s1.roll=2;
   s1.marks[0]=98;
   s1.marks[1]=97;
   s1.marks[2]=95;
   Students s2=new Students(s1);
s1.marks[1]=100;
    for(int i=0;i<3;i++){
        System.out.println(s2.marks[i]);
    }
    
}
}
class Students{
    String name;
    int roll;
    String password;
    int marks[];
    // Shallow Copy :-
//     Students(Students s1){
//     marks= new int[3];
//     this.marks=s1.marks;
// this.name=s1.name;
// this.roll=s1.roll;

//     }
// Deep Copy:-
Students(Students s1){
    marks= new int[3];
this.name=s1.name;
this.roll=s1.roll;
//Deep Copy
for(int i=0;i<3;i++){
    this.marks[i]=s1.marks[i];
}
}

    Students(){
        marks= new int[3];
        System.out.println("Constructor Call:");
    }

}