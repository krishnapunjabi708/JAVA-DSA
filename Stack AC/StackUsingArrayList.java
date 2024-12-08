import java.util.ArrayList;

/**
 * StackUsingArrayList
 */
public class StackUsingArrayList {
static class Stack {
    static ArrayList<Integer> list=new ArrayList<>();
public static boolean isEmpty(){
    return list.size()==0;
}
//push
public static void push(int data){
 

    list.add(data);
  //  System.out.println(data+" is added to stack");

}
public static int pop(){
    if(isEmpty()){
        System.out.println("Stack is Empty");
    }
int top=list.get(list.size()-1);
//System.out.println(top+" is deleted");
    list.remove(list.size()-1);
    return top;
  
}
public static int peek(){
    if(isEmpty()){
        System.out.println("Stack is Empty");
    }
    int top=list.get(list.size()-1);
    System.out.println(top);
    return top;
}
public static void Display(){
    if(isEmpty()){
        System.out.println("Stack is Empty");
    }
    for(int i=list.size()-1;i>=0;i--){
        System.out.println(list.get(i));
    }
}
}
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.Display();
        s.pop();
        s.pop();
        s.Display();
        s.pop();
        
    }
}