import java.util.Scanner;

public class linkedlist {
public static int len=0;

    /**
     * Node
     */
    public static class Node {
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;

    }
        
    }
public static void AddBegin(int data){
  len++;
    Node newNode=new Node(data);//new Node Create
    if(head==null){
       tail= head=newNode;
        return;
    }

newNode.next=head;//link
head=newNode;//data is adding from the side of head
}
public static void AddLast(int data){
  len++;
    Node newNode=new Node(data);
  if(head==null){
    head=tail=newNode;
    return;
  }
  tail.next=newNode;
  tail=newNode;

}


public static void AddMiddle(int idx, int data) {
  len++;
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
public static void Delet_at_begin(){
  len--;
  if(head==null){
    System.err.println("List is Empty");
  }
  Node temp;
  temp=head;
  head=head.next;

}
public static void Delet_at_last(){
  len--;
  if(head==null){
    System.out.println("List is Empty");
  }
  if(head.next==null){
    head=null;
    return;
    }
  Node prev=head;
  Node last=head.next;
  while(last.next!=null){
    last=last.next;
    prev=prev.next;
  }
  prev.next=null;
}
public static void Delet_at_value(int val) {
  len--;
  if (head == null)
   return;

  if (head.data == val) {
      head = head.next;
      return;
  }

  Node temp = head;
  while (temp.next != null) {
      if (temp.next.data == val) {
          Node valueDeleted = temp.next;
          temp.next = temp.next.next;
          valueDeleted.next = null;
          return;
      }
      temp = temp.next;
  }
}
public static void Search(int key) {
  int index=0;
  Node curr=head;
  while(curr!=null){

    if(curr.data==key){
      System.out.println("data found "+curr.data+" at index "+index);
      return;
    }
    index++;
    curr=curr.next;
  }
System.out.println("key not found");
  }


public static void PrintLL(){
    Node temp=head;
    while(temp!=null){
        System.err.print(temp.data+"->");
        temp=temp.next;
    }
    System.err.println("null");

}

public static Node head;
public static Node tail;


public static void main(String[] args) {
    linkedlist ll=new linkedlist();
//   ll.AddBegin(1);
//   ll.AddBegin(2);
//   ll.AddLast(3);
// ll.AddLast(4);
// ll.AddMiddle(2, 2);
// PrintLL();
// ll.Delet_at_begin();
// ll.Delet_at_last();
// PrintLL();
// ll.Delet_at_value(1);
// PrintLL();
// ll.Search(3);
Scanner s=new Scanner(System.in);

int n=1;
int data;
int idx;
int key;
while(n!=0){
  
System.out.println("1.Add at Begin");
System.out.println("2.Add at Last");
System.out.println("3.Add at middle");
System.out.println("4.Delet at begin");
System.out.println("5.Delet at last");
System.out.println("6.Dele at Indx ");
System.out.println("7.Search");
System.out.println("8.Display");
System.out.println("9.Length of Linked list ");
System.out.println("0.Exit");
n=s.nextInt();
switch (n) {
  case 1:
  System.out.println("Add Data for Adding at begin");
  data=s.nextInt();
    ll.AddBegin(data);
    break;
    case 2:
    System.out.println("Add Data for Adding at Last");
    data=s.nextInt();
      ll.AddLast(data);
      break;
    case 3:
    System.out.println("Add index ");
    idx=s.nextInt();
    System.out.println("Add data for inputing at index");
data=s.nextInt();
ll.AddMiddle(idx, data);
break;
case 4:
System.out.println("Delet at begin");
  ll.Delet_at_begin();
  break;
  case 5:
  System.out.println("Delet at Last");
    ll.Delet_at_last();
    break;
  case 6:
  System.out.println("Delet at index ");
  idx=s.nextInt();
ll.Delet_at_value(idx);
break;
case 7:
System.out.println("Add the element you want to search:  ");
key=s.nextInt();
ll.Search(key);
break;
case 8:
System.out.println("Displaying....");
ll.PrintLL();
case 9:
System.out.println("The length of Linked List is :: "+len);
  default:
    break;
}
}
}
}