

public class Sum_Nodes {
    public static class Node{
        Node right,left;
        int data;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static int count(Node root){
        if(root==null){
            return 0;
        }
        int leftsum=count(root.left);
        int rightsum=count(root.right);
        int Count=leftsum+rightsum+root.data;
        return Count;
    }
    public static void main(String[] args) {
        /*
               1
              / \
             2   3
            / \   \
           4   5   6
         */
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.right=new Node(6);

System.out.println(count(root));


    }
}
