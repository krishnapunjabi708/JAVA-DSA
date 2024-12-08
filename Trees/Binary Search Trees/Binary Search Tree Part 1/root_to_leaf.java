
import java.util.*;;

public class root_to_leaf {
    
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

        public static void Print_Path(ArrayList<Integer> al){
            for(int i=0;i<al.size();i++){
                System.out.print(al.get(i)+" ");
            }
            System.out.println(" -> Null");
        }
       public static void path(Node root,ArrayList<Integer> path){
if(root==null){
    return;
}
path.add(root.data);
if(root.left==null&&root.right==null){
Print_Path(path);
}
path(root.left, path);
path(root.right, path);
path.remove(path.size()-1);

       }
    
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        int val[]={8,5,3,6,10,11,14};
        Node root=null;
        for(int i=0;i<val.length;i++){
            root=insert(root, val[i]);
        }
      path(root,al);
    } 
}
