


public class Print_In_Range {
    
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
        //Print In Range
        public static void Print_Range(Node root,int k1,int k2){
            if (root==null) {
                return;
            }
            if(k1<=root.data&&root.data<=k2){
            Print_Range(root.left, k1, k2);
            System.out.print(root.data+" ");
            Print_Range(root.right, k1, k2);
            }
           else if (root.data<k2) {
                Print_Range(root.right, k1, k2);
            }
            else{
                Print_Range(root.left, k1, k2);
            }
                }
    public static void main(String[] args) {
        int val[]={5,1,3,4,2,7};
        Node root=null;
        for(int i=0;i<val.length;i++){
            root=insert(root, val[i]);
        }
        Print_Range(root, 2, 5);
    } 
}
