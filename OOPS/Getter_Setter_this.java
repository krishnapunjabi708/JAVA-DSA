/*
 * Get:-to return the value
 * Set:-to modify the value
 * this:- this is the keyword used to refer the current object
 */

public class Getter_Setter_this {

    public static void main(String[] args) {
        Pen p=new Pen();
        p.set_color("Blue");
        p.set_tip(3);
        System.out.println(p.get_color());
        System.out.println(p.get_tip());
        p.set_color("Black");
        System.out.println(p.get_color());

        
    }
}
class Pen {
int tip;
String color;
void set_tip(int tip){
     this.tip=tip;
}
void set_color(String color){
     this.color=color;
}//this = keyword eliminate the confussion class attributes and parameters with same name


int get_tip(){
    return this.tip; 
}
String get_color(){
    return this.color;
}
}