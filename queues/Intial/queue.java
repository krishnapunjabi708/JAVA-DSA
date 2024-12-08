import java.util.Scanner;


class Queues{
      int[] arr;
     int front,rear,capacity;
 
Queues(int capacity){
this.capacity=capacity;
arr= new int[capacity];
front=rear=-1;
        }
     boolean isEmpty(){
            return front==-1;
        }
        public boolean isFull(){
            return rear==capacity-1;
        }
        public void enqueue(int data){
            if(isFull()){
                System.out.println("Queue is Overflow!");
            }
            if(isEmpty()){
                front=0;
            }
            rear++;
            arr[rear]=data;

        }
        public int dequeue(){
            if(isEmpty()){
                System.out.println("Queue is underflow! ");
                return -1;
            }
            int store=arr[front];
            if(front==rear){
                front=rear=-1;//reset queue if only one element left
            }
            else{
                front ++;
            }
            System.out.println(store+"removed from queue");
return store;
        }
        public void display(){
            if(isEmpty()){
                System.out.println("Queue is Empty!! ");
                return;
            }
            System.out.println("Queue contains : ");
            for(int i=front;i<+rear;i++){
                System.out.println(arr[i]);
            }
        }

    }
public class queue {

    public static void main(String[] args) {
  
        Scanner s=new Scanner(System.in);
        int choice;
        System.out.println("Enter The size Of queue: ");
int capacity=s.nextInt();
Queues queues=new Queues(capacity);

        do {
System.out.println("\n1. Enqueue (Add)");
System.out.println("2. Dequeue (Remove)");
System.out.println("3. Display Queue");
System.out.println("4. Exit");
System.out.print("Enter your choice: ");
choice=s.nextInt();
switch (choice) {
case 1:System.out.println("Enter The Element: ");
int data=s.nextInt();
queues.enqueue(data);

break;
case 2:queues.dequeue();
        
break;  
case 3:queues.display();
        
break; 

default:
System.out.println(" Invalid Choice!!");
break;
}
        }while(choice!=4);
s.close();
    }
}

