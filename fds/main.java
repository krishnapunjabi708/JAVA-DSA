import java.util.Stack;

public class A4 {
    static class Node {
        char data;
        Node left, right;

        public Node(char data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public static Node root;

    // Check if a character is an operator
    public static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }

    // Form an expression tree from a postfix expression
    public static Node formTree(String postfix) {
        Stack<Node> stack = new Stack<>();
        for (int i = 0; i < postfix.length(); i++) {
            char ch = postfix.charAt(i);
            if (!isOperator(ch)) {
                Node temp = new Node(ch);
                stack.push(temp);
            } else {
                Node t1 = stack.pop();
                Node t2 = stack.pop();
                Node temp = new Node(ch);
                temp.right = t1;
                temp.left = t2;
                stack.push(temp);
            }
        }
        return stack.pop();
    }

    // Recursive inorder traversal
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Non-recursive inorder traversal
    public static void inorderNR(Node root) {
        Stack<Node> stack = new Stack<>();
        Node curr = root;
        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            System.out.print(curr.data + " ");
            curr = curr.right;
        }
    }

    // Recursive preorder traversal
    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // Non-recursive preorder traversal
    public static void NRpreorder(Node root) {
        if (root == null) {
            return;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node temp = stack.pop();
            System.out.print(temp.data + " ");
            if (temp.right != null) {
                stack.push(temp.right);
            }
            if (temp.left != null) {
                stack.push(temp.left);
            }
        }
    }

    // Recursive postorder traversal
    public static void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    // Non-recursive postorder traversal
    public static void NRpostorder(Node root) {
        if (root == null) {
            return;
        }
        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();
        stack1.push(root);
        while (!stack1.isEmpty()) {
            Node temp = stack1.pop();
            stack2.push(temp);
            if (temp.left != null) {
                stack1.push(temp.left);
            }
            if (temp.right != null) {
                stack1.push(temp.right);
            }
        }
        while (!stack2.isEmpty()) {
            Node temp = stack2.pop();
            System.out.print(temp.data + " ");
        }
    }

    public static void main(String[] args) {
        String postfix = "abc++";
        root = formTree(postfix);

        System.out.println("Inorder Recursive:");
        inorder(root);
        System.out.println("\nInorder Non-Recursive:");
        inorderNR(root);

        System.out.println("\n\nPreorder Recursive:");
        preorder(root);
        System.out.println("\nPreorder Non-Recursive:");
        NRpreorder(root);

        System.out.println("\n\nPostorder Recursive:");
        postorder(root);
        System.out.println("\nPostorder Non-Recursive:");
        NRpostorder(root);
    }
}