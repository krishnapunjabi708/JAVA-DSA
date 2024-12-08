
public class Search_a_BST {
    
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
        public static void inorder(Node root){
         if(root==null){
            return;
         } 
         inorder(root.left);
         System.out.print(root.data+" ");  
         inorder(root.right);
        }
        // Search In Binary Search Tree:-
        public static boolean search(Node root, int key){
            if(root==null){
                return false;
            }
            if(root.data==key){
                return true;
            }
            if(root.data>key){
                return search(root.left, key);
            }
            else{
                return search(root.right, key);
            }
        }
    public static void main(String[] args) {
        int val[]={5,1,3,4,2,7};
        Node root=null;
        for(int i=0;i<val.length;i++){
            root=insert(root, val[i]);
        }
       System.out.println(search(root, 4));
    } 
}
