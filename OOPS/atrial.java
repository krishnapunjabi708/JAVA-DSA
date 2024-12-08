public class atrial {
    public static class Node {
int data;
Node next;
Node(int data){
    this.data=data;
    this.next=null;
}

    }
    public static Node head;
   public static void main(String[] args) {
    int pow=0;
    int integer=0;
    while(head!=null){
integer+=Math.pow(2,pow);
    }
    pow++;
   }
}
