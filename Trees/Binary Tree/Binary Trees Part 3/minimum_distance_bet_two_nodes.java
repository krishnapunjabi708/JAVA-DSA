
public class minimum_distance_bet_two_nodes {
   
    public static class Node {
    int data;
    Node right,left;
    Node(int data){
        this.data=data;
        this.right=null;
        this.left=null;
    
    }
        
    }

public static Node lca(Node root,int n1,int n2) {
 
        if(root==null||root.data==n1||root.data==n2)
        {
            return root;
        }
        Node leftLca=lca(root.left, n1, n2);
        Node rightLca=lca(root.right, n1, n2);
    
        //leftlca =val rightlca=null
        if(rightLca==null){
            return leftLca;
        }
        if(leftLca==null){
            return rightLca;
        }
    return root;
    
}
public static int lcaDist(Node root,int n){
    if(root==null){
        return -1;
    }
    if(root.data==n){
        return 0;
    }
    int leftDist=lcaDist(root.left,n);
    int rightDist=lcaDist(root.right,n);
    if(leftDist==-1&&rightDist==-1){
return -1;
    }
//     else if(leftDist==-1){
//         return rightDist+1;
//     } 
// else{
//     return leftDist+1;
// } apna college
return leftDist+1+rightDist+1;
}
    public static int min_Distance(Node root,int n1,int n2){
Node lca=lca(root, n1, n2);
int dist1=lcaDist(lca,n1);
int dist2=lcaDist(lca,n2);
return dist1+dist2;
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
          System.out.println(min_Distance(root, 3, 6));
          
      }
    }
     

