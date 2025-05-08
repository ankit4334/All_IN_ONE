/*
//Binary Tree->it is hierarchical data structure.


Binary Tree Data Structure:-A Binary Tree Data Structure is a hierarchical data structure 
in which each node has at most two children, referred to as the left child and the right child. 
It is commonly used in computer science for efficient storage and retrieval of data, with various 
operations such as insertion, deletion, and traversal.


*/


/*
import java.util.LinkedList;
import java.util.Queue;

public class implemention01 {
    static class Node{
        int data;
        Node left;
        Node right;

       public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;
        }

    } 


    public static void preorder(Node root){
        if(root==null){
            return;
        }

        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }


    public static void inorder(Node root){
        if(root==null){
            return;
        }

        
        preorder(root.left);
        System.out.print(root.data+" ");
        preorder(root.right);
    }

    public static void postorder(Node root){
        if(root==null){
            return;
        }

        
        preorder(root.left);
        preorder(root.right);
        System.out.print(root.data+" ");
    }




    public static void levelOrder(Node root){
        if(root==null){
            return;
        }

        
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node currNode=q.remove();
            if(currNode==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }else{
                System.out.print(currNode.data+" ");
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode);
                }
            }
        }
    }


    public static int count(Node root){
        if(root==null){
            return 0;
        }
        int leftCount=count(root.left);
        int rightCount=count(root.right);
        return leftCount+rightCount+1;
    }



    public static int sum(Node root){
        if(root==null){
            return 0;
        }
        int leftSum=count(root.left);
        int rightSum=count(root.right);
        return leftSum+rightSum+root.data;
    }







    public static int diameter(Node root){  //TC-O(n);

        //diameter->number of nodes in the longest path between 2 leaves.
        if(root==null){
            return 0;
        }
        
        int leftDiam=diameter(root.left);
        int leftHt=count(root.left);  //find the height  wala function nahi  likha hu;
        int rightDiam=diameter(root.right);
        int rightHt=count(root.right);

        int sefDia=leftHt+rightHt+1;

        return Math.max(sefDia,Math.max(leftDiam,rightDiam));

    }





    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        System.out.println(root.data);

    //    System.out.println("preorder");
    //    preorder(root);
    //    System.out.println();
    //    System.out.println("inorder");
    //    inorder(root);
    //    System.out.println();
    //    System.out.println("postorder");
    //    postorder(root);

    //levelOrder(root);

    count(root);

    }
    
}
*/














//Implementions of Binary tree using Itreative ways....
import java.util.*;
public class implemention01 {
static class  Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the value of root node :-");
    int x=sc.nextInt();
    int first,second;
    Queue<Node> q=new LinkedList<>();
    Node root=new Node(x);
    q.add(root);

    //Build the binary tree
    while(!q.isEmpty()){
        Node t=q.remove();

        System.out.print("Enter the left child of "+ t.data+":-");
        first=sc.nextInt();
        //left Node
        if(first!=-1){
            root.left=new Node(first);
            q.add(root.left);
        }

        //right node
        System.out.print("Enter the right child of :"+t.data+":-");
        second=sc.nextInt();
        if(second!=-1){
            root.right=new Node(second);
            q.add(root.right);
        }
    }
    
}
    
}