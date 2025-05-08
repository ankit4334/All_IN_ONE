//question base on binary search
/*
    //Question01->
    Subtree of another Tree:-Given the roots of two binary tees root and subRoot, return true
    if there is a subreee of root with the same structure and node values of subRoot and false otherwise.



    public class part02 {

    public class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static boolean isSubtree(Node root,Node subRoot){

        if(root==null){
            return false;
        }

        if(root.data==subRoot.data){
            if(isIdentical(root,subRoot)){
                return true;
            }
        }

        // boolean leftAns=isSubtree(root.left,subRoot);
        // boolean rightAns=isSubtree(root.right,subRoot);
        // return leftAns || rightAns;

        //or
        return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
    }

    public static boolean isIdentical(Node node,Node subRoot){
        if(node==null && subRoot==null){
            return true;
        }

        else if(node==null || subRoot==null || node.data!=subRoot.data){
            return false;
        }

        if(!isIdentical(node.left, subRoot.left)){
            return false;
        }

        if(!isIdentical(node.right, subRoot.right)){
            return false;
        }

        return true;

    }


public static void main(String[] args) {
    
    Node root=new Node(1);
    root.left=new Node(2);
    root.right=new Node(3);
    root.left.left=new Node(4);
    root.left.right=new Node(5);
    root.right.left=new Node(6);
    root.right.right=new Node(7);

    Node subRoot=new Node(2);
    subRoot.left=new Node(4);
    subRoot.right=new Node(5);

    System.out.println(isSubtree(root, subRoot));
    
    }
}
*/


















/* 
 ->Question->top view of binary tree.

import java.util.*;
import java.util.HashMap;
import java.util.LinkedList;

public class part02 {
    static public class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    static class Info{
        Node node;
        int hd;
        public Info(Node node,int hd){
            this.node=node;
            this.hd=hd;
        }
    }

    

    public static void topView(Node root){
        //level order
        Queue<Info> q=new LinkedList<>();
        HashMap<Integer,Node>map=new HashMap<>();

        int min=0,max=0;
        q.add(new Info(root, 0));
        q.add(null);

        while(!q.isEmpty()){
            Info curr=q.remove();
            if(curr==null){
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }

            else{
                if(!map.containsKey(curr.hd)){ //first time my  hd is occurring
                    map.put(curr.hd,curr.node);
                }
    
                if(curr.node.left!=null){
                    q.add(new Info(curr.node.left,curr.hd-1));
                    min=Math.min(min,curr.hd-1); 
                }
    
                if(curr.node.right!=null){
                    q.add(new Info(curr.node.right, curr.hd+1));
                    max=Math.max(max,curr.hd+1);
                }
            }

        }


        //print top view
        for(int i=min;i<=max;i++){
            System.out.print(map.get(i).data+" ");
        }
        System.out.println();

    }
    

public static void main(String[] args) {
    /* 
     1
    2  3
   4 56  7
    
    
   Node root=new Node(1);
   root.left=new Node(2);
   root.right=new Node(3);
   root.left.left=new Node(4);
   root.left.right=new Node(5);
   root.right.left=new Node(6);
   root.right.right=new Node(7);

   topView(root);
    
    }
}
*/












/* 
 ->Kth Level of a Tree
            1
        1       3
       4  5    6  7

    k=3(level number 3) then 
    ans:-4,5,6,7



import java.util.*;
import java.util.HashMap;
import java.util.LinkedList;

public class part02 {
    static public class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static void klevel(Node root,int level,int k){
        if(root==null){
            return;
        }

        if(level==k){
            System.out.print(root.data+" ");
            return;
        }

        klevel(root.left,level+1,k);
        klevel(root.right, level+1, k);

    }
    

public static void main(String[] args) {
   
    
   Node root=new Node(1);
   root.left=new Node(2);
   root.right=new Node(3);
   root.left.left=new Node(4);
   root.left.right=new Node(5);
   root.right.left=new Node(6);
   root.right.right=new Node(7);

   int k=3;
   klevel(root,1,k);
   
    }
}

*/








/* 
 ->Lowest Common Ancestor
        1                         1
    2        3                 2       3
  4   5    6   7             4   5       6
  n1=4,n2=6                  n1=4,n2=5
  ans(lca)=1                 ans(lca)=2



import java.util.*;
import java.util.HashMap;
import java.util.LinkedList;

public class part02 {
    static public class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }


    //lca method 1

    public static boolean getPath(Node root,int n,ArrayList<Node> path){  //O(n)

        if(root==null){
            return false;
        }

        path.add(root);
        if(root.data==n){
            return true;
        }

        boolean foundLeft=getPath(root.left, n, path);
        boolean foundRight=getPath(root.right, n, path);

        if(foundLeft || foundRight){
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }

    public static Node lca(Node root,int n1,int n2){ //O(n)
        
        ArrayList<Node> path1=new ArrayList<>();
        ArrayList<Node> path2=new ArrayList<>();
        getPath(root,n1,path1);
        getPath(root,n2,path2);

        //last common ancestor
        int i=0;
        for(;i<path1.size() && i<path2.size();i++){
            if(path1.get(i)!=path2.get(i)){
                break;
            }
        }

        //last equl node ->i-1th
        Node lca=path1.get(i-1);

        return lca;

    }
    








 //lca method 2
 public static Node lca2(Node root,int  n1,int n2){

    if(root==null){
        return null;
    }

    if(root==null || root.data==n1 || root.data==n2){
        return root;
    }

    Node leftLca=lca2(root.left,n1,n2);
    Node rightLca=lca2(root.right,n1,n2);

    //leftLCA=val rightLca =null
    
    if(rightLca==null){
        return leftLca;
    }

    if(leftLca==null){
        return rightLca;
    }

    return root;

 }



public static void main(String[] args) {
   
    
   Node root=new Node(1);
   root.left=new Node(2);
   root.right=new Node(3);
   root.left.left=new Node(4);
   root.left.right=new Node(5);
   root.right.left=new Node(6);
   root.right.right=new Node(7);

   int n1=4,n2=5;
   //System.out.print(lca(root , n1, n2).data);
   System.out.print(lca2(root,n1,n2).data);
    }
}  


*/










/* 

//Question->Min distance Between nodes
          1
        2   3
      4  5 6 7
    n1=4,n2=6
    dis=4




import java.util.*;
import java.util.HashMap;
import java.util.LinkedList;

public class part02 {
    static public class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static Node lca2(Node root,int  n1,int n2){

    if(root==null){
        return null;
    }

    if(root==null || root.data==n1 || root.data==n2){
        return root;
    }

    Node leftLca=lca2(root.left,n1,n2);
    Node rightLca=lca2(root.right,n1,n2);

    //leftLCA=val rightLca =null
    
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

        int leftDist=lcaDist(root.left, n);
        int rightDist=lcaDist(root.right,n);


        if(leftDist==-1 && rightDist==-1){
            return -1;
        }
        else if(leftDist==-1){
            return rightDist+1;
        }
        else{
            return leftDist+1;
        }

    }

    public static int minDist(Node root,int n1,int n2){

        Node lca=lca2(root, n1, n2);
        int dist1=lcaDist(lca,n1);
        int dist2=lcaDist(lca,n2);
        return dist1+dist2;
    }

   

public static void main(String[] args) {
   
    
   Node root=new Node(1);
   root.left=new Node(2);
   root.right=new Node(3);
   root.left.left=new Node(4);
   root.left.right=new Node(5);
   root.right.left=new Node(6);
   root.right.right=new Node(7);

   int n1=4,n2=6;
   System.out.println(minDist(root, n1, n2));

   
    }
}  
*/












/*

->Question:-Kth Ancestor of node

          1
        2   3
      4  5 6 7
    node=5 k=2
    ans=1;


import java.util.*;
import java.util.HashMap;
import java.util.LinkedList;

public class part02 {
    static public class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }


    public static int kAncestor(Node root,int n,int k){


        //base condition
        if(root==null){
            return -1;
        }


        if(root.data==n){
            return 0;
        }
        int leftDist=kAncestor(root.left, n, k);
        int rightDist=kAncestor(root.right, n, k);

        if(leftDist==-1 && rightDist==-1){
            return -1;
        }
        int max=Math.max(leftDist, rightDist);
        if(max+1==k){
            System.out.println(root.data);
        }
        return max+1;
    }

    


public static void main(String[] args) {
   
    
   Node root=new Node(1);
   root.left=new Node(2);
   root.right=new Node(3);
   root.left.left=new Node(4);
   root.left.right=new Node(5);
   root.right.left=new Node(6);
   root.right.right=new Node(7);

   int n=5,k=2;
   kAncestor(root, n, k);

   
    }
}  
*/















/* 
->Question->Transform to sum tree

          1                 27
        2   3      ->   9       13
      4  5 6 7        0   0   0    0
    Each node= sum of left and right subrees

*/
import java.util.*;
import java.util.HashMap;
import java.util.LinkedList;

public class part02 {
    static public class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    
    public static int transform(Node root){

        if(root==null){
            return 0;
        }

        int leftChild=transform(root.left);
        int rightChild=transform(root.right);

        int data=root.data;

        int newLeft=root.left==null ? 0 : root.left.data;
        int newRight=root.left==null ? 0 : root.right.data;

        root.data=newLeft + leftChild + newRight + rightChild;
        return data;

    }

    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }


public static void main(String[] args) {
   
    
   Node root=new Node(1);
   root.left=new Node(2);
   root.right=new Node(3);
   root.left.left=new Node(4);
   root.left.right=new Node(5);
   root.right.left=new Node(6);
   root.right.right=new Node(7);

   transform(root);
   preorder(root);


   
    }
}  
