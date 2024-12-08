import java.util.Scanner;

public class doubly_circular_ll {
    public static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public static void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            head.next = head;
            head.prev = head;
        } else {
            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            tail.next = newNode;
            head = newNode;
        }
        print();
    }
    public static void AddAfter(int data, int d1) {
        
       
            if ( tail.data==d1) {
               addLast(data);
             }
             
            Node newNode = new Node(data);
            Node temp = head;

            while (temp.data!=d1 && temp != null) {
                temp = temp.next;
                
            }
            if (temp != null && temp != head) {
                newNode.next = temp.next;
                newNode.prev = temp;
                temp.next.prev = newNode;
                temp.next = newNode;
                size++;
            } else {
                System.out.println("Invalid data");
            }
            print();
        
    }

    public static void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            head.next = head;
            head.prev = head;
        } else {
            newNode.next = head;
            newNode.prev = tail;
            tail.next = newNode;
            head.prev = newNode;
            tail = newNode;
        }
        print();
    }

  
    public static int  delFirst() {
        if (head == null) {
            System.out.println("Linked List is empty");
            print();
            return -1;
        }
        if (head == tail) {
            int val = head.data;
            head = tail = null;
            size = 0 ;
            print();
            return val;
        } else {
            int val = head.data;
            head = head.next;
            tail.next = head;
            head.prev = tail;
            size--;
            print();
            return val;
        }
    }

    public static int delLast() {
        if (head == null) {
            System.out.println("Linked List is empty");
            print();
            return -1 ;
        }
        if (head == tail) {
            int val = tail.data;
            head = tail = null; 
            size = 0 ;
            print();
            return val;
        } else {
            int val = tail.data;
            tail = tail.prev;
            tail.next = head;
            head.prev = tail;
            size--;
            print();
            return val;
        }
    }

    public static int delVal(int vale) {
        if(head.data==vale){
            return delFirst();
            }
            if ( tail.data==vale) {
                return delLast();
             }
        Node temp = head;
boolean b=false;
do 
{
    if(temp.data==vale){
b=true;

    }
   temp= temp.next;
}while(temp!=head);
temp=head;
if(b==true){
        while (temp.next.data!=vale&& temp.next != head) {
            temp = temp.next;
            
        }
       
      

        Node toDelete = temp.next;
        int val = toDelete.data;
        temp.next = toDelete.next;
        toDelete.next.prev = temp;
        size--;
        print();
        return val;
    }
    else{
        System.out.println("The Value not found!!");
        return 0;
    }
    }

   
    public static void print() {
        if (head == null) {
            System.out.println("Linked List is empty");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("head");
    }

    public static void main(String[] args) {
        doubly_circular_ll l1 = new doubly_circular_ll();
        Scanner sc = new Scanner(System.in);
        System.out.println("1.addFirst \n2.addLast \n3.AddAfter \n4.DelFirst \n5.DelLast \n6.DelValue \n7.Print Size \n8.Print \n9.Exit");
        int choice =0 ;
        while (choice!=9) {
            System.out.print("Enter the Choice : ");
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    System.out.print("Enter the value to Insert : ");
                    int data = sc.nextInt();
                    addFirst(data);
                    break;
                }
                case 2: {
                    System.out.print("Enter the value to Insert : ");
                    int data = sc.nextInt();
                    addLast(data);
                    break;
                }
                case 3: {
                    System.out.print("Enter the value to Insert : ");
                    int data = sc.nextInt();
                    System.out.print("Enter the data after you want to add  : ");
                    int d1 = sc.nextInt();
                    AddAfter(data, d1);
                    break;
                }
                case 4: {
                    System.out.println("Deleted : " + delFirst());
                    break;
                }
                case 5: {
                    System.out.println("Deleted : " + delLast());
                    break;
                }
                case 6: {
                    System.out.print("Enter the value to Delete : ");
                    int val = sc.nextInt();
                    System.out.println("Deleted : " +delVal(val));
                    break;
                }
             
                case 7 :{
                    System.out.println("Size  : "+size );
                    break;
                }
                case 8: {
                    print();
                    break;
                }
                case 9:{
                    System.out.println("Exiting");
                    break;
                }

                default:{
                    System.out.println("enter the correct choice");
                }
            }
        }
    }
}