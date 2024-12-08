public class apna_college_LL_part_2 {
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

  public static boolean isCycle(Node head){//Floyds Cycle Finding Methods
    Node slow=head,fast=head;
    while(fast!=null&&fast.next!=null){
        slow=slow.next;//+1
        fast=fast.next.next;//+2
        if(fast.data==slow.data){
            return true;
        }

    }
    return false;
  }

  public static void Removing_a_loop(){
  //Detect Cycle
    Node slow=head,fast=head; 
    boolean cycle=false;
    while(fast!=null&&fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
        
        if(fast==slow){
            cycle=true;
            break;
        }
    }
    if(cycle==false){
        return;
    }
    else{
    //find meeting point

    slow=head;
    Node prev=null;//last Node
    while(slow!=fast){
slow=slow.next;
prev=fast;
fast=fast.next;
    }
    //remove->last.next=null
    prev.next=null;
}
  }
 public static void main(String[] args) {
    apna_college_LL_part_2 ll=new apna_college_LL_part_2();
  
    head=new Node(1);
    head.next=new Node(2);
    head.next.next=new Node(3);
    head.next.next.next=head.next;
    ll.Removing_a_loop();

  
   Node temp=head;
    while(temp!=null){
        System.out.print(temp.data+"->");
       temp= temp.next;
    }

 }

}
