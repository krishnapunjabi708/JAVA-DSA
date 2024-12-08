public class Transform_to_sum_tree {
public static class Node {
int data;
Node right,left;
Node(int data){
    this.data=data;
    this.right=null;
    this.left=null;

}
    
}
public static int transform(Node root){
  if(root==null){
    return 0;
  }
  int leftchild=transform(root.left);
  int rightchild=transform(root.right);
  int data=root.data;
  int newleft=root.left==null?0:root.left.data;
  int newright=root.right==null?0:root.right.data;
  root.data=newleft+leftchild+newright+rightchild;
return data;
}
public static void prorder(Node root){
  if(root==null){
    return;
  }
  System.out.print(root.data+" ");
  prorder(root.left);
  prorder(root.right);
}
    public static void main(String[] args) {
        /*
             1
            / \
           2    3
          / \  / \
         4   5 6  7
       */
      Node root=new Node(1);
      root.left=new Node(2);
      root.right=new Node(3);
      root.left.left=new Node(4);
      root.left.right=new Node(5);
      root.right.left=new Node(6);
      root.right.right=new Node(7);
      

      transform(root);
      prorder(root);
  }
}
