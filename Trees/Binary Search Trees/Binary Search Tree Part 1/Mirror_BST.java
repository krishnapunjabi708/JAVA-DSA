

import java.util.*;;
public class Mirror_BST {
    
    public static class Node {
        int data;
        Node left,right;
       Node(int data){
    this.data=data;
    this.left=null;
    this.right=null;
        }
    }
        public static Node insert(Node root,int val){
      if ((root==null)) {
            root=new Node(val);
            return root;
            }
            if(root.data>val){
                //left subtree
                root.left=insert(root.left, val);
            }
            else{
                //right subtree
                root.right=insert(root.right,val);
            }
            return root;
            
        }
    public static Node mirror(Node root){
        if(root==null){
            return null;
        }
        Node lefts=mirror(root.left);
        Node rights=mirror(root.right);
        root.left=rights;
        root.right=lefts;
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
    public static void main(String[] args) {
        int val[]={5,1,3,4,2,7};
        Node root=null;
        for(int i=0;i<val.length;i++){
            root=insert(root, val[i]);
        }
        inorder(root);
        mirror(root);
        inorder(root);

 } 
}

