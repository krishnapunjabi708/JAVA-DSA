public class Queue_using_LL {
    public static class Node {
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
        
    }
    public static Node head=null;
    public static Node tail=null;

public static boolean isEmpty() {
    return head==null&&tail==null;
}
public static void Add(int data){
    Node newNode=new Node(data);
if(head==null){
head=tail=newNode;
return;
}
tail.next=newNode;
tail=newNode;

}
public static int Remove(){
    if(isEmpty()){
        System.out.println("Queue is Empty");
return -1;
    }
    int store=head.data;
    if(tail==head){
        tail=head=null;
        
    }
else{
    head=head.next;
}
    return store;
}
public static int peek(){
    if(isEmpty()){
        System.out.println("Queue is Empty");
        return -1;
    }
return head.data;
}
public static void main(String[] args) {
    Add(1);
    Add(2);
    Add(3);
    Remove();
Add(4);
  while ((!isEmpty())) {
    System.out.println(peek());
    Remove();
  }
}


}
