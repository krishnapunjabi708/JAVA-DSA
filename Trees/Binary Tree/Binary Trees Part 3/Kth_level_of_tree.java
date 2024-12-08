import java.util.*;
public class Kth_level_of_tree {
public static class Node {
int data;
Node right,left;
Node(int data){
    this.data=data;
    this.right=null;
    this.left=null;

}
    
}
public static void kth_Level(Node root,int level,int k){
if(root==null){
    return;
}
if(level==k){
System.out.print(root.data+" ");
return;
}
kth_Level(root.left, level+1, k);
kth_Level(root.right, level+1, k);


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
      kth_Level(root, 0, 2);
      
  }
}
