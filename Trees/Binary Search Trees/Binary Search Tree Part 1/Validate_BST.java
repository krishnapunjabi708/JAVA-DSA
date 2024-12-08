

import java.util.*;;
public class Validate_BST {
    
    public static class Node {
        int data;
        Node left,right;
        Node(int data){
    this.data=data;
    this.left=null;
    this.right=null;
        }}
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
        public static boolean validbst(Node root,Node min,Node max){
            
            if(root==null){
                return true;
            }
     if(min!=null&&root.data<=min.data){
        return false;
     }
     else if(max!=null&&root.data>=max.data){
        return false;
     }

     return validbst(root.left, min, root)&&validbst(root.right, root, max);

}

        
        
    public static void main(String[] args) {
        int val[]={5,1,3,4,2,7};
        Node root=null;
        for(int i=0;i<val.length;i++){
            root=insert(root, val[i]);
        }
System.out.println(validbst(root,null,null));   
 } 
}
