public class aatrial {
public static class Node {
int data;
Node next;
Node(int data){
    this.data=data;
    this.next=null;
}
    
}
public static Node head;
public static Node tail;
public static void Add_First(int data){
    Node newNode=new Node(data);
    if(head==null){
        head=tail=newNode;
return;
    }

newNode.next=head;
head=newNode;
}
public static void Add_Last(int data){
    Node newNode=new Node(data);
    if(head==null){
        head=tail=null;
        return;
    }
tail.next=newNode;
tail=newNode;
}
public static void Add_Middle(int d,int data){
    Node newNode=new Node(data);
if(head==null){
    System.out.println("LL is Empty!! ");
return;
}
Node temp=head;
while(temp.data!=d&&temp==null){
temp=temp.next;
}
newNode.next=temp.next.next;
temp.next=newNode;
}


}
