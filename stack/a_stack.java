import java.util.*;
public class a_stack {
  private  int arr[];
  private  int size;
   private int top;
public a_stack(int size){
top=-1;
this.size=size;
arr=new int[size];
}
public boolean isEmpty(){
   
    return top==-1;
}
public boolean isFull(){
    return top==size-1;
}

public boolean push(int value){
    if(isFull()){
        return false;
    }
    else{
        top++;
        arr[top]=value;
        System.out.println(value+" Is pushed");
        return true;
    }

}
public boolean pop() {
        if(isEmpty()){
            return false;
        }
        else{
            int value=arr[top];
            top--;
            System.out.println(value+" is Popped");
            return true;
        }
    }
    public int peek(){
if(isEmpty()){
    System.out.println("Empty!");
    return -1;
}
else{
    System.out.println("The Top Element is :"+arr[top]);
    return arr[top];
}

    }
    public void Display(){
        if(isEmpty()){
            System.out.println("Stack is Empty!");
        }
        else{
            System.out.println("Stack element are : ");
            for(int i=top;i>=0;i--){
                System.out.println(arr[i]);
            }
        }

    }
public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);
    System.out.println("Enter The Size of Stack:");
int size=scanner.nextInt();
    a_stack stack= new a_stack(size);
    int choice;
    do{
        System.out.println("1.Push");
        System.out.println("2.Pop");
        System.out.println("3.Peek");
        System.out.println("4.Display");
        System.out.println("5.Exit");
        choice=scanner.nextInt();
        switch(choice){
            case 1:System.out.println("Enter The value: ");
            int value=scanner.nextInt();
            stack.push(value);
            break;
            case 2:stack.pop();
            break;   
            case 3:stack.peek();
            break;  
            case 4:stack.Display();
            break;   
           default:System.out.println("Choice invalid!");
        }

    }while(choice!=5);
scanner.close();
}

    
}