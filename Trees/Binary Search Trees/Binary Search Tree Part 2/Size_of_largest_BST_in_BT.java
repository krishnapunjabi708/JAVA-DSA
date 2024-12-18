public class Size_of_largest_BST_in_BT {

    public static class Node {
    int data;
    Node left,right;
    Node(int data){
this.data=data;
this.left=null;
this.right=null;
    }}
    static class Info {
    boolean isBST;
    int size;
    int min;
    int max;
        public Info(boolean isBST,int size,int min,int max){
            this.isBST=isBST;
            this.size=size;
            this.min=min;
            this.max=max;
        }
    }
    public static int maxBST=0;

    public static Info largestBST(Node root){
if(root==null){
    return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
}
Info leftInfo=largestBST(root.left);
Info righInfo=largestBST(root.right);

int size=leftInfo.size+righInfo.size+1;

int min=Math.min(root.data,Math.min(leftInfo.min,righInfo.min));
int max=Math.max(root.data, Math.min(leftInfo.max, righInfo.max));

if(root.data<=leftInfo.max||root.data>=righInfo.min){
    return new Info(false, size, min, max);
}
if(leftInfo.isBST&&righInfo.isBST){
    maxBST=Math.max(maxBST, size);
    return new Info(true, size, min,max);
}
return new Info(false, size, min, max);

    }
  public static void main(String[] args) {
     /*
                 50
               /   \
              30     60
             / \    /  \
            5   20  45  70
                       /  \
                     65    80
           Given BST
 */ 
    Node root=new Node(50);
    root.left=new Node(30);
    root.left.left=new Node(5);
  
    root.right=new Node(60);
    root.right.left=new Node(45);
    root.right.right=new Node(70);
    root.right.right.left=new Node(65);
    root.right.right.right=new Node(80);
      /*
               
                  60
                 /  \
                45  70
               /  \
             65    80

           Expected BST: size=5
 */ 
Info info=largestBST(root);

System.out.println(maxBST);
    
}
    
}
