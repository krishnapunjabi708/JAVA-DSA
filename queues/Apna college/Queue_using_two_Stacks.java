import java.util.*;;
public class Queue_using_two_Stacks {
    public static class Queue {
    public static Stack<Integer> s1=new Stack<>();
    public static Stack<Integer> s2=new Stack<>();
public static boolean isEmpty(){
    return s1.isEmpty();
}
//add
public static void add(int data){//O(n)
    while (!s1.isEmpty()) {
        s2.push(s1.pop());
    }
    s1.push(data);
    while (!s2.isEmpty()) {
        s1.push(s2.pop());
    }

}
//remove
public static int remove(){
    if(isEmpty()){
        System.out.println("queue is Empty!!");
return -1;
    }
    return s1.pop();//O(1)
}
    
    public static int peek(){
        if(isEmpty()){
            System.out.println("queue is Empty!!");
    return -1;
        }
        return s1.peek();//O(1)
    }
        }
    
    public static void main(String[] args) {
        Queue q=new Queue();
        q.add(1);
        q.add(2);
    }
}

