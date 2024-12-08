public class Circular_Queue_using_Array {

    static class Circular_Queue {
        static int arr[];
        static int size;
        static int rear;
        static int front;
        Circular_Queue(int n){
           
            size=n;
            arr=new int[n];
            rear=-1;
            front=-1;
        }
    public static boolean isEmpty(){
        return rear==-1&&front==-1;
    }
    public static boolean isFull(){
        return (rear+1)%size==front;
    }
 //Add
 public static void add(int data){
    if(isFull()){
        System.out.println("Queue is full");
return;
    }
    //add 1st element
    if(front==-1){
      front=0;
    }

rear=(rear+1)%size;
arr[rear]=data;
 }   
 //remove
 public static int remove(){
    if(isEmpty()){
        System.out.println("Queue is Empty");
        return -1;
    }
    int result=arr[front];

//last el delete 
if(rear==front){
rear=front=-1;

}
else{
    front=(front+1)%size;

}
    return result;
 }
 public static int peek(){
    if(isEmpty()){
        System.out.println("Queue is Empty ");
        return -1;
    }
    return arr[front];
 }
    }
    public static void main(String[] args) {
        Circular_Queue q=new Circular_Queue(5);
        
        q.add(1);
        q.add(2);
        q.add(3);
        q.remove();
        q.add(4);
      while ((!q.isEmpty())) {
        System.out.println(q.peek());
        q.remove();
      }
    }

}
