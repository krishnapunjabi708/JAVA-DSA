public class static_keyword {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.School_name="JMV";
        Student s2=new Student();
        System.out.println(s2.School_name);//output:-JMV


    }
}
class Student{
    static int percentage(int phy,int math,int chem){
return (phy+math+chem)/3;
    }
    String name;
    int roll_no;
    static String School_name;
    void setName(String name) {
        this.name = name;
    }
  String getName() {
        return this.name;
    }
}