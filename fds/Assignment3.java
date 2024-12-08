import java.util.*;
public class Assignment3 {
    
    public static class Node {
        int data;
        Node right, left;

        public Node(int data) {
            this.data = data;
            this.right = this.left = null;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void preorder(Node root){
        if(root==null){
            return;
        }
       
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
       
    }
    public static Node Delete(Node root, int val){
        if(root.data>val){
            root.left=Delete(root.left, val);
        }
        else if(root.data<val){
            root.right=Delete(root.right, val);
        }
        else{//root.data==val
//case 1
if(root.right==null&&root.left==null){
    return null;
}
//case 2
else if(root.left==null){
    return root.right;
}
else if (root.right==null){
    return root.left;
}
//case 3
else{
    root.data=minval(root.right);//inorder succesor
    root.right=Delete(root.right, root.data);
}
        }
        return root;
        }
        
    
    static int minval(Node root){
    int minval=root.data;
    
    while(root.left!=null){
        minval=root.data;
        root=root.left;
    }
    return minval;
    }

    public static Boolean Search(Node root,int val){
        if(root==null){
            return false;
        }
        if(root.data>val){
return Search(root.left, val);
        }
        else if (root.data<val) {
            return Search(root.right, val);
            
        }
        else if(root.data==val){
            return true;
        }
        
            else{
                return false;
            }
        
    }
    public static void LevelOrder(Node root){
        if (root == null) {
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node curr = q.poll();
            System.out.print(curr.data + " ");

            // Enqueue left child
            if (curr.left != null) {
                q.add(curr.left);
            }
            // Enqueue right child
            if (curr.right != null) {
                q.add(curr.right);
            }
        } 

    }
    public static void main(String[] args) {
        Node root = null;
        root = insert(root, 5);
        root = insert(root, 3);
        root = insert(root, 7);
        root = insert(root, 2);
        root = insert(root, 4);
        root = insert(root, 6);
        root = insert(root, 8);
        inorder(root);
        Delete(root,6);
        System.out.println();
        inorder(root);
       System.out.println( Search(root, 6));
       System.out.println(Search(root, 7));
        LevelOrder(root);
    }
}
