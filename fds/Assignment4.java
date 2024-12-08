import java.util.*;

public class Assignment4 {
        
    public static class Node {
        int data;
        Node right, left;

        public Node(int data) {
            this.data = data;
            this.right = this.left = null;
        }
    }
    static Node root;
    public static boolean isOperator(char c){
        return (c=='*'||c=='+'||c=='/'||c=='-');
    }
    public static void convert(String postfix){
Stack<Node> s=new Stack<Node>();
for(char ch:postfix.toCharArray()){
  
    if(!isOperator(ch)){
        Node temp=new Node(ch);
        s.push(temp);
    }
    else{
Node ob1,ob2,temp;
temp=new Node(ch);
ob1=s.pop();
ob2=s.pop();
temp.left=ob2;
temp.right=ob1;
s.push(temp);
    }
}
root=s.pop();
    }
    public static void inOrderTraversal(Node node) {
        if (node == null) {
            return;
        }
        inOrderTraversal(node.left);
        System.out.print((char) node.data + " ");
        inOrderTraversal(node.right);
    }
   public static void inorder(Node root){
    Stack<Node> s=new  Stack<>();
    Node curr=root;
    while (curr!=null||!s.isEmpty()) {
       
        while (curr!=null) {
            s.push(curr);
            curr=curr.left;
        }
        curr=s.pop();
        System.out.print((char)curr.data+" ");
      curr=curr.right;

    }
    
   }
   public static void preorder(Node root){
Stack<Node> s=new Stack<>();
s.push(root);
while (!s.isEmpty()) {
    Node curr=s.pop();
    System.out.print((char)curr.data+" ");
    if(curr.right!=null){
        s.push(curr.right);
    }
    if(curr.left!=null){
        s.push(curr.left);
    }
}


   }
   public static void postorder(Node root){
Stack<Node> s1=new Stack<>();
Stack<Node> s2=new Stack<>();
s1.push(root);
while (!s1.isEmpty()) {
    Node curr=s1.pop();
    s2.push(curr);
    if(curr.left!=null){
        s1.push(curr.left);
    }
    if(curr.right!=null){
        s1.push(curr.right);
    }

    
}
while(!s2.isEmpty()){
    System.out.print((char)s2.pop().data+" ");
}

   }
    public static void main(String[] args) {
        String postfix = "23*54*+";
        convert(postfix);
    //    inorder(root);
       preorder(root);
       System.out.println();
       postorder(root);

    }
}
