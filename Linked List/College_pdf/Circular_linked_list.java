
class Circular_linked_list {

    public static class Node {
    int data;
    Node next;
    Node(int data){
        this.data=data;
        

    }
        
    }
public static void AddBegin(int data){
  
    Node newNode=new Node(data);
    if(head==null){
       tail= head=newNode;
        return;
    }

newNode.next=head;
head=newNode;
tail.next=head;
}
public static void AddLast(int data){
  
    Node newNode=new Node(data);
  if(head==null){
    head=tail=newNode;
    return;
  }
  tail.next=newNode;
  tail=newNode;
  tail.next=head;

}


public static void AddMiddle(int idx, int data) {

  if (idx == 0) {
      AddBegin(data);
  } else {
      Node newNode = new Node(data);
      Node temp = head;
      int i = 0;
      while (i < idx - 1 && temp != null) {
          temp = temp.next;
          i++;
      }
      if (temp != null) {
          newNode.next = temp.next;
          temp.next = newNode;
      }
}
}


public static void PrintLL(){
    Node temp=head;
   do {
        System.err.print(temp.data+"->");
        temp=temp.next;
    }while(temp!=head);
    System.err.println("null");

}

public static Node head;
public static Node tail;


public static void main(String[] args) {
    Circular_linked_list ll=new Circular_linked_list();
  ll.AddBegin(1);
  ll.AddBegin(2);
  ll.AddLast(3);
ll.AddLast(4);
ll.AddMiddle(2, 2);
PrintLL();

}
}