public class Binary_search_tree {
static class Node {
    Node left,right;
    int data;
    public Node(int val){
        data=val;

    }

}

public static Node insert(Node root,int val){
    if(root==null){
        return new Node(val);

    }
    if(root.data>val){
      root.left=  insert(root.left, val);
    }
    else{
       root.right= insert(root.right, val);
    }
return root;
}
public  static void inorder(Node root){
    if(root==null){
        return;
    }
    inorder(root.left);
    System.out.print(root.data+" ");
    inorder(root.right);
}
public static boolean Search(int key,Node root){
    if(root==null){
        return false;
    }
if(root.data==key){
    return true;
}
else if(root.data>key){
return Search(key, root.left);
}
else if(root.data<key){
    return Search(key, root.right);
}
return false;
}
public static void main(String[] args) {
    Node root=null;
    int nums[]={1,2,8,10,5};
    for(int i=0;i<nums.length;i++){
        root=insert(root,nums[i]);
    }
    inorder(root);
    int key=80;
    System.out.println(Search(key,root));
}
}
