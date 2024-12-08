import java.util.*;
public class Sorted_Array_to_Balanced_BST {
    
    
    public static class Node {
        int data;
        Node left,right;
       Node(int data){
    this.data=data;
    this.left=null;
    this.right=null;
        }
    }

    public static void preorder(Node root){
        if(root==null){
           return;
        } 
    
        System.out.print(root.data+" ");  
        preorder(root.left);
        preorder(root.right);
       }

       public static Node create_BST(int arr[],int si,int ei){
if(ei<si){
    return null;
}
int mid=(si+ei)/2;
Node root=new Node(arr[mid]);
root.left=create_BST(arr, si, mid-1);
root.right=create_BST(arr, mid+1, ei);
return root;
       }
    public static void main(String[] args) {
        int val[]={1,2,3,4,5,6,7};
      Node root= create_BST(val, 0, val.length-1);
        preorder(root);
       
      

 } 
}



