
public class Reverse_of_linkedlist {
    static int size=0;

  public static class Node{
int data;
Node next;
public Node(int data){
this.data=data;
this.next=null;
}
    }
public static Node head;
public static Node tail;
public void Add_First(int data){

    //step 1= create new Node
    Node newNode=new Node(data);
    if(head==null){
head=tail=newNode;
size++;
return;

    }
   //step 2-newNode next
newNode.next=head;//link
//step 3-head=newNode
head=newNode;
size++;
    
    
}
public void Add_Last(int data){
    Node newNode=new Node(data);
if(head==null){
    head=tail=newNode;
    size++;
    return;
}
    tail.next=newNode;
    tail=newNode;
    size++;
}
public void Add_Middle_data(int d,int data){
    Node newNode = new Node(data);  
    Node temp=head;
    if(head==null){
        return;
    }
    
    while(temp.data!=d&&temp!=null){

       temp= temp.next;
    }
    newNode.next=temp.next;
    temp.next=newNode;
    size++;
}
public void printLL(){
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.data+" -> ");
       temp=temp.next;
    }
    System.out.print("null");
    System.out.println();
}
public static void AddMiddle_index(int index,int data){
    if(head==null){
        return;
    }
Node newNode=new Node(data);
Node temp=head;
int idx=0;

while(idx!=index&&temp==null){
temp=temp.next;
idx++;
}
newNode.next=temp.next;
temp.next=newNode;
size++;

}
public static int Remove_first(){
    if(size==0){
        System.out.println("The Linkedlist Is Empty !!");
        return 0;
    }
    else if(size==1){
        int val=head.data;
head=tail=null;
size--;
return val;
    }
    else{
        int val=head.data;
size--;
       head= head.next;
       return val;
    }
    

}
public static int Remove_last(){
    if(size==0){
        System.out.println("The Linkedlist Is Empty !!");
        return 0;
    }
    else if(size==1){
        int val=head.data;
head=tail=null;
size--;
return val;
    }
    else{
        int val=tail.data;
        Node prev=head; 
        for(int i=0;i<size-2;i++){
prev=prev.next;
        }
        prev.next=null;
        tail=prev;
return val;
    }
  

    
}
public static int iterative_search(int key){
    Node temp=head;
    int i=0;
    while(temp!=null){
        
        if(temp.data==key){
System.out.println("Key Found at Index "+i);
return i;
        }
        temp=temp.next;
        i++;
    }
    System.out.println("The Key Don't exist in the Linked List!! ");
    return -1;
}
public int helper(Node head, int key){
    if(head==null){
        return -1;
    }
    if(head.data==key){
        return 0;
    }
    int idx=helper(head.next,key);
    if(idx==-1){
        return -1;
    }
    return idx+1;
}
public int recSearch(int key){
return helper(head,key);
}
public void Reverse_of_LinkedList(){
    Node prev=null;
    Node curr=head;
    Node next;
    while(curr!=null){
      
    
      next=curr.next;
      curr.next=prev;
      prev=curr;
      curr=next;
    }
   head=prev;
}

public static void main(String[] args) {
    Reverse_of_linkedlist ll=new Reverse_of_linkedlist();
    ll.Add_First(2);
    ll.Add_First(1);
    ll.Add_Last(3);
    ll.AddMiddle_index(1, 5);
ll.Add_Middle_data(1, 4);
    ll.printLL();//1 -> 4 -> 5 -> 2 -> 3 -> null
    ll.Reverse_of_LinkedList();
    ll.printLL();//3 -> 2 -> 5 -> 4 -> 1 -> null
 

}
}
