public class StackUsingLinkedlist {
    public static class Node{
        int data;
        Node next;
       public Node(int data){
this.data=data;
this.next=null;
        }
    }
public static Node head=null;

 static class Stack {
public static boolean isEmpty(){
    return head==null;
}
public static void push(int data){
    Node newNode=new Node(data);

    if(head==null){
        head=newNode;
    }
newNode.next=head;
head=newNode;

}
public  static int pop(){
    if(isEmpty()){
        return -1;
    }
    int top=head.data;
    head=head.next;
return top;
}
public static int peek() {
    if(isEmpty()){
        return-1;
    }
    return head.data;
}
public static void print(){
    if (isEmpty()) {
        System.out.println("Stack is empty");
        return;
    }
Node temp=head;
    while(temp!=null){
        System.out.println(temp.data+"->");
       temp=temp.next;
    }
}
}
public static void main(String[] args) {
    Stack s=new Stack();
s.push(1);
s.print();


}
}
