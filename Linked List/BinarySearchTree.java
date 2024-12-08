import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {

    public class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public Node root;

    public void insert(int data) {
        root = insertRec(root, data);
    }

    public Node insertRec(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }

        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }

        return root;
    }

    public void delete(int data) {
        root = deleteRec(root, data);
    }

    public Node deleteRec(Node root, int data) {
        if (root == null) {
            return root;
        }

        if (data < root.data) {
            root.left = deleteRec(root.left, data);
        } else if (data > root.data) {
            root.right = deleteRec(root.right, data);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            root.data = minValue(root.right);
            root.right = deleteRec(root.right, root.data);
        }

        return root;
    }

    public int minValue(Node root) {
        int minv = root.data;
        while (root.left != null) {
            minv = root.left.data;
            root = root.left;
        }
        return minv;
    }

    public void inorderTraversal() {
        inorderRec(root);
    }

    public void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }

    // Level-wise printing (Breadth-First Search)
    public void levelOrderTraversal() {
        if (root == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                Node current = queue.poll();
                System.out.print(current.data + " ");

                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
            }
            System.out.println(); // Newline after each level
        }
    }

    // Search (recursive)
    public boolean search(int data) {
        return searchRec(root, data);
    }

    public boolean searchRec(Node root, int data) {
        if (root == null) {
            return false; // Not found
        } else if (data == root.data) {
            return true; // Found
        } else if (data < root.data) {
            return searchRec(root.left, data);
        } else {
            return searchRec(root.right, data);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);


        System.out.println("Inorder traversal:");
        bst.inorderTraversal();
bst.delete(60);

System.out.println("\nInorder traversal:");
bst.inorderTraversal();
        System.out.println("\nLevel-wise traversal:");
        bst.levelOrderTraversal();

        System.out.println("\nSearch for 40: " + bst.search(40));
        System.out.println("Search for 90: "+bst.search(90));
    }
}
