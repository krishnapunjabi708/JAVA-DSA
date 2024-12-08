import java.util.Scanner;

class queue {
int arr[];
int size;
int front,rear;
public queue(int size){
this.size=size;
arr=new int[size];
front=-1;
rear=-1;
}
boolean isFull(){
  return rear==size-1;

}
boolean isEmpty(){
  return rear==-1;

}
boolean Enqueue(int element){
  if(isFull()){
    System.out.println("Queue is Full !!");
    return false;
  }
  front=0;
 rear++;
  arr[rear]=element;
  return true;

}
public boolean Dequeue(){
  int deq;
  if(isEmpty()){
    System.out.println("Queue Is Empty!! ");
    return false;
  }
 
  else if(rear==front){
    deq=arr[rear];
    front=-1;
rear=-1;
System.out.println(deq+" Element is Dequeue");
return true;
  }
  else{
    deq=arr[rear];
    arr[rear]--;
    System.out.println(deq+" Element is Dequeue");
    return true;

  }
  

}
public void Display(){
  if(isEmpty()){
    System.out.println(" Queue Is Empty !!");
  }
for(int i=front;i<=rear;i++){
  System.out.println(arr[i]);
}
}
public void Peek(){
  if(isEmpty()){
    System.out.println(" Queue Is Empty !!");
  }
  else{
    System.out.println(" Peek elment is "+arr[front]);
  }
}
}


public class aQueue {
public static void abinary_search(int arr[],int key){
  int start ,end, mid;
  start=0;
  end=arr.length-1;

while(start<=end){
  mid=start + (end - start) / 2;
if(arr[mid]==key){
  System.out.println("array at index "+mid);
  return;
}
else if(mid<key){
  end=mid-1; 
}
else {
 start=mid+1;
}

}

}
public static void linear_search(int arr[],int key){
  for(int i=0;i<arr.length;i++){
    if(arr[i]==key){
      System.out.println("array is at index "+i);
      return;
    }
  }
}
  public static void main(String[] args) {
    System.out.println("Enter The Size of queue");
    Scanner s=new Scanner(System.in);
    int size=s.nextInt();
  queue q=new queue(size);
  int choice;
  do{
    System.out.println("1.Enquque");
     System.out.println("2.Dequque");
     System.out.println("3.Peek");
     System.out.println("4.Display");
     System.out.println("5.EXit");

choice=s.nextInt();
    switch (choice) {
      case 1:
      System.out.println("Enter The Element: ");
      int element=s.nextInt();
      q.Enqueue(element);
      break;
        case 2:
        q.Dequeue();
        break;
        case 3:
        q.Peek();
        break;
        case 4:
        q.Display();
        break;
    
      default:
        break;
    }
   


  }while(choice!=5);
  }
}