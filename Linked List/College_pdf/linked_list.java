public class linked_list {
    public Node head;

    linked_list() {
        this.head = null;
    }

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    

    public static void main(String[] args) {
        linked_list l = new linked_list();

        // Creating nodes
        l.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        // Linking nodes
        l.head.next = second;
        second.next = third;

        // Printing the linked list
        Node current = l.head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
