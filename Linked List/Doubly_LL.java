public class Doubly_LL {

public static class Node{
int data;
Node prev,next;
public Node(int data){
    this.data=data;
    this.prev=this.next=null;
}
}
public static  Node head,tail;
public static int size;
public static void add_first(int data){
    Node newNode=new Node(data);
    if(head==null){
        head=tail=newNode;
        return;
    }

newNode.next=head;
head.prev=newNode;
head=newNode;


}
public static void Add_Last(int data){
    Node newNode=new Node(data);
  
    if(head==null){
        head=tail=newNode;
        return;
    }
   
    tail.next=newNode;
    newNode.prev=tail;
    tail=newNode;
}
public static void Remove_First(){
    
    if(head.next==null){
       head=tail=null;
        return;
    }
    head=head.next;
    head.prev=null;
}
public static void Remove_Last(){
    if (head.next==null) {
        head=tail=null;
       return;
    }
    tail=tail.prev;
    tail.next=null;
}
public static void printLL(){
Node temp=head;
    while(temp!=null){
        System.out.print(temp.data+"->");
        temp=temp.next;
    }
    System.out.println("null");

}
    public static void main(String[] args) {
        Doubly_LL dll=new Doubly_LL();

        dll.add_first(1);
        dll.add_first(2);
        dll.printLL();
        dll.Add_Last(3);
        dll.Add_Last(4);
        dll.printLL();

        dll.Add_Last(5);
        dll.printLL();
dll.Remove_First();
dll.printLL();
dll.Remove_Last();
dll.printLL();
dll.Remove_First();
dll.printLL();
dll.Remove_Last();
dll.printLL();

        

    }
}