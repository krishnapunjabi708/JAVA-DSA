import java.util.LinkedList;;
public class LL_in_Collection_FrameWork {
    public static void main(String[] args) {
        //create-Objects int,float,boolean->Integer,Float,Character
        LinkedList<Integer> ll=new LinkedList<>();
        //add
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
       
        //0->1->2
        ll.add(2,3);
        //Printing Linked List
        
        System.out.println(ll);

        //remove
        ll.removeFirst();//[1, 3, 2]
        ll.removeLast();//[1, 3]
        ll.remove(1);//[1]
        System.out.println(ll);//[1]
        
    }
}
