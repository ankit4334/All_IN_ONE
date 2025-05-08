/* 
//Question01:-Mirror a of BST TC=O(n)
    
public class Question {

    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }


    //mirror bst function
    public static Node MirrorBST(Node root){
        if(root==null){
            return null;
        }

        Node leftSubtree=MirrorBST(root.left);
        Node rightSubtree=MirrorBST(root.right);

        //swap function
        root.left=rightSubtree;
        root.right=leftSubtree;

        return root; 
    }

    //function for printing  value
    public static void preorder(Node root){
        if(root==null){
            return ;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }


    public static void main(String[] args) {
    /*

        8
      /  \
     5    10
    / \    \
   3   6    11 
        
    

    Node root=new Node(8);
    root.left=new Node(5);
    root.right=new Node(10);
    root.left.left=new Node(3);
    root.left.right=new Node(6);
    root.right.right=new Node(11);

    /*

        8
      /  \
    10    5  
    /    / \
   11   6   3
   
   Mirro of BST
        
   

    root= MirrorBST(root);
    preorder(root);

    }
    
}

*/














//-----------------------------------------------------


//Question-2:-Sorted array to balanced BST

/*   
public class Question {

    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }


    
    public static Node createrBST(int arr[],int st,int end){
        if(st > end){
            return null;
        }

        int mid= (st+end)/2;
        Node root=new Node(arr[mid]);
        root.left=createrBST(arr, st, mid-1);
        root.right=createrBST(arr, mid+1, end);
        return root;

    }

    //function for printing  value
    public static void preorder(Node root){
        if(root==null){
            return ;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }


    public static void main(String[] args) {

    int arr[]={2,5,6,8,10,11,12};
    


     /*

        8
      /   \
     5     11
    / \   /  \
   3   6  10    12
   
 
   //expected bst;
   

    Node root= createrBST(arr,0,arr.length-1);
    preorder(root);

    }
    
}

*/













//Question-03 Convert BST to Balanced BST
/* 
import java.util.*;
import java.util.ArrayList;

public class Question {

    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }


    
    public static Node createrBST(ArrayList<Integer> inorder,int st,int end){
        if(st > end){
            return null;
        }

        int mid= (st+end)/2;
        Node root=new Node(inorder.get(mid));
        root.left=createrBST(inorder, st, mid-1);
        root.right=createrBST(inorder, mid+1, end);
        return root;

    }


    public static void getInorder(Node root,ArrayList<Integer> inorder){
        if(root==null){
            return;
        }

        getInorder(root.left, inorder);
        inorder.add(root.data);
        getInorder(root.right, inorder); 
    }



    public static Node balanceBST(Node  root){
        //inorder seq
        ArrayList<Integer> inorder=new ArrayList<>();

        getInorder(root, inorder);

        //sorted inorder -> balanced BST
        root=createrBST(inorder, 0, inorder.size()-1);
        return root;
    }


    //function for printing  value
    public static void preorder(Node root){
        if(root==null){
            return ;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }


    public static void main(String[] args) {

    Node root=new Node(8);
    root.left=new Node(6);
    root.left.left=new Node(5);
    root.left.left.left=new Node(3);

    root.right=new Node(10);
    root.right.right=new Node(11);
    root.right.right.right=new Node(12);


   

    root= balanceBST(root);
    preorder(root);

    }
    
}

*/











/* 
//Question04:-Size of Largest BST of in BT;

import java.util.*;
import java.util.ArrayList;

public class Question {

    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }

    static class Info{
        boolean isBST;
        int size;
        int min;
        int max;

        public Info(boolean isBST,int size,int min ,int max){
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
        Info rightInfo=largestBST(root.right);
        int size=leftInfo.size + rightInfo.size + 1;
        int min=Math.min(root.data,Math.min(leftInfo.min,rightInfo.min));
        int max=Math.max(root.data,Math.max(leftInfo.max,rightInfo.max));


        if(root.data <= leftInfo.max || root.data >= rightInfo.min){
            return new Info(false, size, min, max);
        }

        if(leftInfo.isBST && rightInfo.isBST){
            maxBST=Math.max(maxBST, size);
            return  new Info(true, size, min, max); 
        }

        return new Info(false, size, min, max);

    }


    public static void main(String[] args) {

    Node root=new Node(50);
    root.left=new Node(30);
    root.left.left=new Node(5);
    root.left.right=new Node(20);

    root.right=new Node(60);
    root.right.left=new Node(45);
    root.right.right=new Node(70);
    root.right.right.left=new Node(65);
    root.right.right.right=new Node(80);

    //ans size=5
   

    Info info=largestBST(root);
    System.out.println("largest BST size = "+maxBST );

    }
    
}

*/









//Question-5 Merge 2 BSTS

import java.util.*;
import java.util.ArrayList;

public class Question {

    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }

    public static void getInorder(Node root,ArrayList<Integer> arr){
        if(root==null){
            return;
        }

        getInorder(root.left,arr);
        arr.add(root.data);
        getInorder(root.right,arr);

    }


    
    public static Node createrBST(ArrayList<Integer> arr,int st,int end){
        if(st > end){
            return null;
        }

        int mid= (st+end)/2;
        Node root=new Node(arr.get(mid));
        root.left=createrBST(arr, st, mid-1);
        root.right=createrBST(arr, mid+1, end);
        return root;

    }


    public static Node MergeBST(Node root1,Node root2){

        //step1 store inorder of root1
        ArrayList<Integer> arr1=new ArrayList<>();
        getInorder(root1,arr1);


        //step2 same 
        ArrayList<Integer> arr2=new ArrayList<>();
        getInorder(root2, arr2);


        //step 3 merge

        ArrayList<Integer> finalArr=new ArrayList<>();
        int i=0,j=0;
        while(i<arr1.size() && j<arr2.size()){
 
            if(arr1.get(i) <= arr2.get(j)){
                finalArr.add(arr1.get(i));
                i++;
            }
            else{
                finalArr.add(arr2.get(j));
                j++;
            }

        }

        while(i<arr1.size()){
            finalArr.add(arr1.get(i));
            i++;
        }

        while(j<arr2.size()){
            finalArr.add(arr2.get(j));
            j++;
        }

        

        //sorted AL-> balanced BST
        return createrBST(finalArr,0,finalArr.size()-1); 


    }


    public static void preorder(Node root){
        if(root==null){
            return ;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
     

    public static void main(String[] args) {

        //bst1 
        Node root1=new Node(2);
        root1.left=new Node(1);
        root1.right=new Node(4);

        //bst2
        Node root2=new Node(9);
        root2.left=new Node(3);
        root2.right=new Node(12);


        Node root=MergeBST(root1,root2);
        preorder(root);

    }
    
}

