public class Delete_a_Node {
   

    
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


        //Delete Node:-
public static Node delete(Node root,int val){
    if(root==null){
        return null;
    }
   if(root.data>val){
root.left=delete(root.left, val);
   }
   else if(root.data<val){
    root.right=delete(root.right, val);
   }
else{//equal (voila)

    //Case 1:- Leaf Node
if(root.left==null&&root.right==null){
return null;
}
//Case 2:- Single children
if(root.left==null){
    return root.right;
}
else if(root.right==null){
return root.left;
}
//Case 3:-Both Children
Node IS=FindInorderSuccesor(root.right);
root.data=IS.data;
root.right=delete(root.right, IS.data);
}
return root;
}
//Find Inorder Succesor
public static Node FindInorderSuccesor(Node root){
    while(root.left!=null){
        root=root.left;
    }
    return root;

}

        public static void main(String[] args) {
        int val[]={1,3,4,5,6,8,10,11,14};
        Node root=null;
        for(int i=0;i<val.length;i++){
            root=insert(root, val[i]);
        }
    
       inorder(root);
       System.out.println();
       delete(root, 6);
       inorder(root);
    } 


}
