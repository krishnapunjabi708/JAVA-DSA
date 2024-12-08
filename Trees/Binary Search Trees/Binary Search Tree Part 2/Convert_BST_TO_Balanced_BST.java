/**
 * Build_a_BST
 */
import java.util.*;;
public class Convert_BST_TO_Balanced_BST{

    public static class Node {
    int data;
    Node left,right;
    Node(int data){
this.data=data;
this.left=null;
this.right=null;
    }}    
    public static void getinorder(Node root,ArrayList<Integer> inorder){
     if(root==null){
        return;
     } 
     getinorder(root.left, inorder);
     inorder.add(root.data);
     getinorder(root.right, inorder);
    }

    public static Node createBST(ArrayList<Integer> inorder, int si,int ei){
        if(si>ei){
            return null;
        }
      int mid=(si+ei)/2;
        Node root=new Node(inorder.get(mid));
        root.left=createBST(inorder, si, mid-1);
        root.right=createBST(inorder, mid+1, ei);
        return root;

    }
    public static Node balanceBST(Node root){
//Find inorder seq
ArrayList<Integer> inorder=new ArrayList<>();
getinorder(root, inorder);
//sorted inorder-> balanced BST
root=createBST(inorder, 0, inorder.size()-1);
return root;
    }
    public static void preorder(Node root){
        if (root==null) {
        return;    
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
public static void main(String[] args) {
/*
                 8
                / \
               6  10
              /     \
             5       11
            /          \
           3           12
           Given BST
 */ 
  Node root=new Node(8);
  root.left=new Node(6);
  root.left.left=new Node(5);
  root.left.left.left=new Node(3);
  root.right=new Node(10);
  root.right.right=new Node(11);
  root.right.right.right=new Node(12);
preorder(root);
System.out.println();
  /*
                 8
               /   \
              5     11
             / \    / \
            3   6  10  12
           expected BST
 */ 

preorder(balanceBST(root));
}
    }
