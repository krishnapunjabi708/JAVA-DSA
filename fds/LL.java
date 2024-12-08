import java.util.Scanner;

public class LL {

    public static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static int size;

    public static void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            size++;
        }
        else {
            newNode.next = head;
            head = newNode;
            size++;
        }
        print();
    }

    public static void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = newNode;

        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;

        }
        print();
    }

    public static void addMiddle(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
        } else {
            Node newNode = new Node(data);
            size++;
            Node temp = head;
            int i = 0;
            while (i < idx - 1 && temp != null) {
                temp = temp.next;
                i++;
            }
            if (temp != null) {
                newNode.next = temp.next;
                temp.next = newNode;
            }
        }
        print();
    }

    public static int delFirst() {
        if (head == null) {
            System.out.println("List is Empty");
            return -1;
        } else {
            int val = head.data;
            head = head.next;
            size--;
            print();
            return val;
        }

    }

    public static int delLast() {
        if (head == null) {
            System.out.println("LL is empty");
            return -1;
        } else if (head.next == null) {
            int val = head.data;
            head = null;
            size =0;
            return val;
        } else {
            Node prev = head;
            Node last = head.next;
            while (last.next != null) {
                last = last.next;
                prev = prev.next;
            }
            int val = last.data;
            prev.next = null;
            size--;
            print();
            return val;
        }

    }

    public static void delVal(int val) {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        if (head.data == val) {
            head = head.next;
            size--;
            return;
        }
        Node temp = head;
        while (temp != null && temp.next != null) {
            if (temp.next.data == val) {
               // Node valueDel = temp.next;
                temp.next = temp.next.next; // we can only use this single statment instead of this 3 statment because deleted Node can be handled by garbage collector
                //valueDel.next =null;  //therefore it will not need to add one more Node
                size--;
                return;
            }
            temp = temp.next;
        }
        print();
    }
    public static void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static boolean Search(int val){
        Node temp = head ;
        while (temp!=null){
            if (temp.data == val){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    public static void Modify(int data , int repl){
        Node temp = head;
        while (temp!= null){
            if (temp.data == data){
                 temp.data = repl;
                print();
            }
            else {
                System.out.println("Value Not found");
            }
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LL ll = new LL();

        System.out.println("1.addFirst \n2.addLast \n3.addMiddle \n4.DelFirst \n5.DelLast \n6.DelValue \n7.Search \n8.Print \n9.Modify \n10.print Size \n11.Exit");
        int choice =0 ;
        while (choice!=11) {
            System.out.print("Enter the Choice : ");
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    System.out.print("Enter the value to Insert : ");
                    int data = sc.nextInt();
                    ll.addFirst(data);
                    break;
                }
                case 2: {
                    System.out.print("Enter the value to Insert : ");
                    int data = sc.nextInt();
                    ll.addLast(data);
                    break;
                }
                case 3: {
                    System.out.print("Enter the value to Insert : ");
                    int data = sc.nextInt();
                    System.out.print("Enter the index of value  : ");
                    int idx = sc.nextInt();
                    ll.addMiddle(idx, data);
                    break;
                }
                case 4: {
                    System.out.println("Deleted : " + ll.delFirst());
                    break;
                }
                case 5: {
                    System.out.println("Deleted : " + ll.delLast());
                    break;
                }
                case 6: {
                    System.out.print("Enter the value to Delete : ");
                    int val = sc.nextInt();
                    ll.delVal(val);
                    break;
                }
                case 7: {
                    System.out.print("Enter the value to Search : ");
                    int val = sc.nextInt();
                    Search(val);
                    if (Search(val)==true){
                        System.out.println("Key Found");
                    }
                    else {
                        System.out.println("Not found");
                    }
                    break;
                }
                case 8: {
                    ll.print();
                    break;
                }
                case 9 : {
                    System.out.print("Enter the value to be replaced : " );
                    int data = sc.nextInt();
                    System.out.print("Enter the value to be replaced by : " + data );
                    int repl = sc.nextInt();
                    ll.Modify(data,repl);
                    break;
                }
                case 10 :{
                    System.out.println("Size  : "+size );
                    break;
                }
                default:{
                    System.out.println("enter the correct choice");
                }
            }
        }
    }
}