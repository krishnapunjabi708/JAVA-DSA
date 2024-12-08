public class Merge_Sort_on_linked_list {

public static class Node {
Node next;
int data;
Node(int data){
    this.data=data;
    this.next=null;
}

}
public static Node head;
public static Node tail;
public static Node getMid(Node head){
Node slow=head;
Node fast=head.next;
while(fast!=null&&fast.next!=null){
  
slow=slow.next;
fast=fast.next.next;
}
return slow;//mid
    }
public static Node merge(Node head1,Node head2){
    Node mergedLL=new Node(-1);
    Node temp=mergedLL;
   
    while(head1!=null&&head2!=null){
        if(head1.data<=head2.data){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }
        else{
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }
      
    }
    while(head1!=null){
        temp.next=head1;
        head1=head1.next;
        temp=temp.next;
    }
    while (head2!=null) {
        temp.next=head2;
        head2=head2.next;
        temp=temp.next;
    }
    return mergedLL.next;
    
}
public static Node MergeSort(Node head){
    if(head==null||head.next==null){
        return head;
    }
    //find mid
    Node mid=getMid(head);
    //left & right MS
Node rightHead=mid.next;
mid.next=null;
Node newLeft=MergeSort(head);
Node newRight=MergeSort(rightHead);
//merge
return merge(newLeft,newRight);





}

    public static void main(String[] args) {
        
    head=new Node(3);
    head.next=new  Node(2);
    head.next.next=new Node(1);
    head.next.next.next=new Node(5);
    head.next.next.next.next=new Node(4);
Merge_Sort_on_linked_list ll=new Merge_Sort_on_linked_list();

Node Start=ll.MergeSort(head);
while(Start!=null){
    System.out.println(Start.data);
    Start=Start.next;
}
    }

}
