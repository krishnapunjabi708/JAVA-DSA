import java.util.*;;
public class Queue_reversal {
    
    public static void reverse(Queue<Integer> q){
Stack<Integer> s=new Stack<>();
int n=q.size();
for(int i=0;i<n;i++){
s.push(q.remove());

}
for(int i=0;i<n;i++)
{
q.add(s.pop());
}
}
public static void main(String[] args) {
    Queue<Integer> q=new LinkedList<>();
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
    q.add(5);
    q.add(6);
    q.add(7);
    q.add(8);
    q.add(9);
    q.add(10);
    reverse(q);
    while(!q.isEmpty()){
        System.out.println(q.peek());
        q.remove();
    }
}
}