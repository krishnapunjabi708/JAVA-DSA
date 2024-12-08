import java.util.Scanner;

class circular{
    int arr[];
    int front,rear;
    int size;
circular(int size){
    this.size=size;
    arr=new int[size];
    front=-1;
    rear=-1;

}
 public boolean isFull(){
return (rear+1)%size==front;
}
public boolean isEmpty(){
    return rear==-1&&front==-1;
}
public void Enqueue(int element){
    if(isFull()){
        System.out.println("Queue Is full!! ");
    }
    if(isEmpty()){
        front=0;
        rear=0;
    }
    else{
rear=(rear+1)%size;
    }
    arr[rear]=element;
}
public void Deque(){
    if(isEmpty()){
        System.out.println("Queue Is Empty!! ");
    }
    int Dequeued=arr[front];

    if(front==rear){
        front=-1;
        rear=-1;

    }
    else{
        front=(front-1)%size;
    }
    System.out.println(Dequeued+"  The Element is Dequeued");
}
public void Display(){
    if(isEmpty()){
        System.out.println("Queue Is Empty!!");
    }
    else{
        for(int i=front;i<=rear;i++){
            System.out.println(arr[i]);
        }
    }
}
}
public class Circular_queue {
      public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter The Size Of queue::: ");
    int size=s.nextInt();
    circular q=new circular(size);
    int choice;
do{
  System.out.println("1.Enqueue");
  System.out.println("2.Dequeue");
  System.out.println("3.Display");
  System.out.println("4.Exit");
 choice=s.nextInt();
  switch (choice) {
    case 1:System.out.println("Enter The Value");
    int data=s.nextInt();
    q.Enqueue(data);
      
      break;
      case 2:q.Deque();
      
      break;
    
      case 3:q.Display();
      
      break;
    
    
  
    default:System.out.println("Invalid Choice");
      break;
  }
}while(choice!=4);
   }
}
