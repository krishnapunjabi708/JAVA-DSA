public class Zig_Zag {
    public static class Node{
        Node next;
        int data;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static void zigZag(){
        //find mid
        Node slow=head;
        Node fast=head.next;
        while(fast!=null&&fast.next!=null){
           slow=slow.next;
           fast=fast.next.next;
        }
        Node mid=slow;
        //reverse 2nd half
Node prev=null;
Node curr=mid.next;
mid.next=null;
Node next;
while(curr!=null){
    next=curr.next;
    curr.next=prev;
   prev=curr;
   curr=next;
}
Node left=head;
Node right=prev;
Node nextL,nextR;
//alt merge- zig-zag merge
while(left!=null&&right!=null){
  nextL=  left.next;
  left.next=right;
  nextR=right.next;
  right.next=nextL;
  left=nextL;
  right=nextR;
}


    }
    public static void printll(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
       head=new Node(1);
       head.next=new Node(2);
       head.next.next=new Node(3);
       head.next.next.next=new Node(4);
       head.next.next.next.next=new Node(5);
       head.next.next.next.next.next=new Node(6);
       
       zigZag();
       printll(head);

    }
}
