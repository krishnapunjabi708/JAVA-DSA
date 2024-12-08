import java.util.*;
public class stacka {
Scanner s=new Scanner(System.in);
int top;
int arr[];
public stacka(int size){
top =-1;
arr=new int[size];
}
public boolean isEmpty(){
    if(top==-1){
        return true;
    }
    else{
        return false;

    }
}
public boolean isFull(){
    if(top==arr.length-1){
        return true;
    }
    else{
        return false;
    }
public boolean push(){
    if(isFull()){
        System.out.println("Stack Overflow! ");
        return false;
    }
    else{
        System.out.println("Enter value to be pushed:");
        int value=s.nextInt();
        top++;
        arr[top]=value;
        System.out.println(value+"Value Pushed");
        return true;
    }
}
public boolean pop(){
    if(isEmpty()){
        System.out.println("Stack Overflow!");
    }
    else{
        top--;
        System.out.println("Value Poped!");
        return true;
    }

}
public int peek(){
    if(isEmpty()){
        System.out.println("Stack Underflow!");
        return 0;

    }
else{
int x=arr[top];
return x;
}
}
public void display(){
    if(isEmpty()){
        System.out.println("Stack is Empty! ");
    }
    else{
        System.out.println("Stack elemnet are :");
        for(int i=top;i>=0;i--){
            System.out.println(arr[i]+"");
        }
    }
}
}

    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the Size of the stack: ");
    int size=s.nextInt();
    Stack st=new Stack(size);
    System.out.println("1. Push");
    System.out.println("2. Pop");
    System.out.println("3. Peek ");
    System.out.println("4. Display");
  int choice;
  do{
    System.out.println("Enter your choice: ");
    choice=s.nextInt();
    switch (choice) {
        case 1:
            st.push();
        break;
        case 2:
            st.pop();
        break; 
        case 3:
            System.out.println("Element at the top:"+st.peek());
        break;
        case 4:
            s.display();
        break;
        default:
        System.out.println("Invalid choice ");
            break;
    }
  }
       
    }
}