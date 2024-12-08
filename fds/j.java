public class j {
    

    public static class Node {
int data;
Node next;
Node prev;
public Node(int data){
    this.data=data;
    this.next=null;
    this.prev=null;

}    
    }
    public static Node head;
    public static Node tail;
public static void addfirst(int data){
Node newNode=new Node(data);
    if(head==null){
        head=tail=newNode;
        head.next=head;
        head.prev=head;
   return;
        
    }
newNode.next=head;
newNode.prev=tail;
head.prev=newNode;
tail.next=newNode;
head=newNode;



}
public static void addlast(int data){
    Node newNode=new Node(data);
    if(head==null){
        head=tail=newNode;
        head.next=head;
        head.prev=head;
    }
   
    newNode.prev=tail;
    newNode.next=head;
    tail.next=newNode;
    head.prev=newNode;
    tail=newNode;
   
}
public static void addmid(int data,int idx){
    Node newNode=new Node(data);
    if(head==null){
        head=tail=newNode;
        head.next=head;
        head.prev=head;
    }
    Node temp=head;
    int i=0;
    while (i!=idx-1&&temp.next!=head) {
        temp=temp.next;
    }
    newNode.next=temp.next;
    newNode.prev=temp;
    temp.next.prev=newNode;
    temp.next=newNode;
}
public static void print(){
    Node temp=head;
    System.out.println(temp.data);
   temp= temp.next;
    while(temp!=head){
        System.out.println(temp.data);
        temp=temp.next;
    }
}


public static void main(String[] args) {
   
    addfirst(1);

    addlast(2);
    addmid(3, 1);
     print();
}

   
}
