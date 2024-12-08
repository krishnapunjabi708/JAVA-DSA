
public class Diameter_tree {
    public static class Node{
        Node right,left;
        int data;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static int height(Node root){
if(root==null){
    return 0;
}
int lh=height(root.left);
int rh=height(root.right);
return Math.max(lh,rh)+1;

    }

    //Approach 1::--
    public static int adiameter(Node root){
        if(root==null){
return 0;
        }
        int leftDia=adiameter(root.left);
        int rightDia=adiameter(root.right);
        int Lh=height(root.left);
        int Rh=height(root.right);
        int selfdiam=Lh+Rh+1;
        return Math.max(selfdiam,Math.max(rightDia, leftDia));
    }


//Approach 2::-
public static class Info {
int dia;
int height;
public Info(int dia,int height){
this.dia=dia;
this.height=height;
}
    
}

public static Info diameter(Node root){
    if (root==null) {
        return new Info(0, 0);
    }
    Info leftInfo=diameter(root.left);
    Info rightInfo=diameter(root.right);
    int diam=Math.max(Math.max(leftInfo.dia, rightInfo.dia), leftInfo.height+rightInfo.height+1);
int ht=Math.max(leftInfo.height,rightInfo.height)+1;
return new Info(diam, ht);
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
System.out.println(adiameter(root));
System.out.println(diameter(root).dia);



    }
}
