import java.util.*;

public class _Deque {
    public static void main(String[] args) {
        Deque<Integer> deque=new LinkedList<>();
deque.addFirst(1);
deque.addFirst(2);
deque.addLast(3);
System.out.println(deque.getFirst());
System.out.println(deque.getLast());
System.out.println(deque);

    }
}
