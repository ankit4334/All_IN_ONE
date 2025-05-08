/*
What is a tree?
Ans:-A tree is a kind of data structure that is used to represent the data in hierarchical form. 

Binary Search Tree:-
A binary search tree follows some order to arrange the elements.
In a Binary search tree, the value of left node must be smaller 
than the parent node, and the value of right node must be greater 
than the parent node. This rule is applied recursively to the left 
and right subtrees of the root.





//Binary Seach tree
1.left subtree nodes < root

2.right subtree nodes > root

3.left and right subrees are also BST with no duplicates

4.INORDER Traversal of BST gives a sorted sequence.

5.reduce time complexity in Binary search tree O(h) where O(n) in binary tree.

6.Time complexity of BST(
1.BEST CASE-o(log n):-Height of tree. 
2.AVERAGE CASE-O(log n)
3.WORST CASE-O(n)
)

*/

//implements  BST;
import java.util.*;
import java.util.ArrayList;

public class implemention01 {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }

    }


    public static Node insert(Node root,int val){

        if(root==null){
           root=new Node(val);
           return root;
        }

        if(root.data>val){
            root.left=insert(root.left, val);
        }
        else{
        root.right=insert(root.right, val);
        }
        return root;

    }

    public static void inorder(Node root){
        if(root==null){
            return    ;
        }

        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }




    //Question01->serch of BST

    public static boolean serch(Node root,int key){
        if(root==null){
            return false;
        }

        if(root.data==key){
            return true;
        }
        
        if(root.data>key){
            return serch(root.left,key);
        }
        else{
            return serch(root.right,key);
        }
    }


    //Question02->delete a node in BST;
    /*
    ->there there three cases
    1.No chiled (leaf node)
    2.One child
    3.Two children->
    ->replace value with inorder successor
    ->delete the node for inorder successor
    
    */
    public static Node delete(Node root,int val){
        if(root.data<val){
            root.right=delete(root.right,val);
        }
        else if(root.data>val){
            root.left=delete(root.left,val);
        }
        else{
            //case 1-leaf node  delete leaf 
            if(root.left==null && root.right==null){
                return null;
            }

            //case 2.delete one chile node
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }


            //case 3-delete both children node
            Node IS=ifindInorderSuccessor(root.right);
            root.data=IS.data;
            root.right=delete(root.right,IS.data);
        }

        return root;

    }

    public static Node ifindInorderSuccessor(Node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }





    //Question03->print the in range 
    public static void printInRange(Node root,int k1,int k2){

        if(root==null){
            return;
        }

        if(root.data>=k1 && root.data<=k2){
            printInRange(root.left,k1,k2);
            System.out.print(root.data+" ");
            printInRange(root.right,k1,k2);

        }
        else if(root.data < k1){
            printInRange(root.left,k1,k2);
        }
        else{
             printInRange(root.right,k1,k2);
        }
    }



    //Question04->print root to leaf all the path
    public static void printPath(ArrayList<Integer> path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println("Null");
    }
    public static void printRoot2leaf(Node root,ArrayList<Integer> path){

        if(root==null){
            return;
        }
 
        path.add(root.data);

        if(root.left==null && root.right==null){
            printPath(path);
        }

        printRoot2leaf(root.left,path);
        printRoot2leaf(root.right,path);
        path.remove(path.size()-1);

    }


    //Method-01:-inorder traversal nikal lo bhir use cheak kar lo sort hai or nahi.

    //method-2-recursive approch......
    //Question 05:-cheak tree is ValidBST
    public static boolean isValidBST(Node root,Node min,Node max){
        if(root==null){
            return true;
        }

        if(min!=null && root.data<=min.data){
            return false;
        }
        else if(max!=null && root.data>=max.data){
            return false;
        }

        return isValidBST(root.left, min, root) && 
        isValidBST(root.right, root, max);
    }







    public static void main(String[] args) {
        int values[]={8,5,3,1,4,6,10,11,14};

        Node root=null;


        for(int i=0;i<values.length;i++){
         root=insert(root, values[i]);
        }
        
    //createing of BST
    inorder(root);
    System.out.println(); 



    //serch funtion searching an element of BST;
    // if(serch(root, 1)){
    //     System.out.println("key is found");
    // }
    // else{
    //     System.out.println("key is not found");
    // }



    //delete a node in BST;
    // root=delete(root, 10);
    // inorder(root);



    //print in range
    //printInRange(root, 5, 12);




    //print to leaf all path
    //printRoot2leaf(root,new ArrayList<>());




 

    //cheack is valid BST

    if(isValidBST(root, null, null)){
        System.out.println("valid");
    }
    else{
        System.out.println("not valid");
    }
    
    }
}













//Coder Army queston and answer

/* 
 783. Minimum Distance Between BST Nodes
Solved
Easy
Topics
Companies
Given the root of a Binary Search Tree (BST), return the minimum difference between the values of any two different nodes in the tree.

 

Example 1:


Input: root = [4,2,6,1,3]
Output: 1
Example 2:


Input: root = [1,0,48,null,null,12,49]
Output: 1

class Solution {
    int prev=Integer.MIN_VALUE;
    int ans=Integer.MAX_VALUE;
    public int minDiffInBST(TreeNode root) {
        inorder(root);
        return ans;
    }

    public void inorder(TreeNode node) {
        if (node == null) return;

        inorder(node.left);

        if (prev != Integer.MIN_VALUE) {
            ans = Math.min(ans, node.val - prev);
        }
        prev = node.val;

        inorder(node.right);
    }
}
*/





/* 
 Sum of k smallest elements in BST
Difficulty: EasyAccuracy: 54.24%Submissions: 28K+Points: 2
 Given a Binary Search Tree. Find sum of all elements smaller than and equal to Kth smallest element.

Example 1:

Input: 
          20
        /    \
       8     22
     /    \
    4     12
         /    \
        10    14   , K=3

Output: 22

class Tree {
    int s=0;
    int c=0;
    int sum(Node root, int k) { 
        solve(root,k);
        return s;
        
    } 
    void solve(Node root,int k){
        if(root==null || c>=k) return;
        
        solve(root.left,k);
        if(c<k){
            s+=root.data;
            c++;
        }
        solve(root.right,k);
        
    }
}
*/






/* 
 Kth largest element in BST
Difficulty: EasyAccuracy: 49.31%Submissions: 165K+Points: 2
Given a Binary Search Tree. Your task is to complete the function which will return the kth largest element without doing any modification in the Binary Search Tree.

Examples:

Input:
      4
    /   \
   2     9
k = 2 
Output: 4
Explanation: 2nd Largest element in BST is 4



class Solution {
    // return the Kth largest element in the given BST rooted at 'root'
    int ans,c=0;
    public int kthLargest(Node root, int k) {
        solve(root,k);
        return ans;
    }
    
    public void solve(Node root,int k){
        if(root==null || c>=k) return ;
        
        solve(root.right,k);
        c++;
        if(c==k)
        ans=root.data;

        solve(root.left,k);
    }
}
*/







/* 
 Array to BST
Difficulty: EasyAccuracy: 46.02%Submissions: 83K+Points: 2Average Time: 15m
Given a sorted array. Convert it into a Height Balanced Binary Search Tree (BST). Return the root of the BST.

Height-balanced BST means a binary tree in which the depth of the left subtree and the right subtree of every node never differ by more than 1.

Note: The driver code will check the BST, if it is a Height-balanced BST, the output will be true otherwise the output will be false.

Examples :

Input: nums = [1, 2, 3, 4]
Output: true
Explanation: The preorder traversal of the following BST formed is [2, 1, 3, 4]:
           2
         /   \
        1     3
               \
                4

    class Solution {
    public Node sortedArrayToBST(int[] nums) {
        
        return solve(nums,0,nums.length-1);
       
    }
    
    public Node solve(int[] nums,int s,int e){
        if(s>e){
            return null;
        }
        
        int mid=s+(e-s)/2;
        Node root=new Node(nums[mid]);
        
        root.left=solve(nums,s,mid-1);
        root.right=solve(nums,mid+1,e);
        
        return root;
    }
}


*/








/* 
Preorder to BST
Difficulty: MediumAccuracy: 59.2%Submissions: 62K+Points: 4Average Time: 30m
Given an array arr[] of N nodes representing preorder traversal of some BST. You have to build the BST  from the given preorder traversal. 

In Pre-Order traversal, the root node is visited before the left child and right child nodes.

Example 1:

Input:
N = 5
arr[]  = {40,30,35,80,100}
Output: 35 30 100 80 40
Explanation: PreOrder: 40 30 35 80 100
Therefore, the BST will be:
              40
           /      \
         30       80
           \        \   
           35      100
Hence, the postOrder traversal will
be: 35 30 100 80 40


 
static class Solution {
    int index=0;
    public Node Bst(int pre[], int size) {
         return solve(pre,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    
     public Node solve(int[] pre ,int min,int max){
        if(index==pre.length || min>pre[index] || max<pre[index]) return null;

        Node root=new Node(pre[index++]);
        root.left=solve(pre,min,root.data);
        root.right=solve(pre,root.data,max);

        return root;
    }
}

*/








/* 
Construct BST from Postorder
Difficulty: EasyAccuracy: 59.66%Submissions: 15K+Points: 2
Given postorder traversal of a Binary Search Tree, you need to construct a BST from postorder traversal. The output will be inorder traversal of the constructed BST.

Example 1:

Input:
6
1 7 5 50 40 10

Output:
1 5 7 10 40 50

Explanation:
Testcase 1: The BST for the given post order traversal is:

class GFG {
    static int index;
    public static Node constructTree(int post[], int n) {
        index=n-1;
         return solve(post,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    
    public static Node solve(int[] post ,int min,int max){
        if (index < 0 || post[index] < min || post[index] > max) return null;


        Node root=new Node(post[index--]);
        root.right=solve(post,root.data,max);
        root.left=solve(post,min,root.data);

        return root;
    }
}
*/







/* 
Preorder Traversal and BST
Difficulty: MediumAccuracy: 36.84%Submissions: 39K+Points: 4Average Time: 20m
Given an array arr[ ] of size N consisting of distinct integers, write a program that returns 1 if given array can represent preorder traversal of a possible BST, else returns 0.

Example 1:

Input:
N = 3
arr = {2, 4, 3}
Output: 1
Explaination: Given arr[] can represent
preorder traversal of following BST:
               2
                \
                 4
                /
               3
Example 2:

Input:


class Solution {
    static int index;
    static int canRepresentBST(int arr[], int N) {
        index=0;
        solve(arr,N,Integer.MIN_VALUE,Integer.MAX_VALUE);
        
         return (index == N) ? 1 : 0;
    }
    
    public static void solve(int[] arr,int N,int min,int max){
        if(index==N || min>arr[index] || max<arr[index]) return ;

        int value=arr[index++];
        solve(arr,N,min,value);
        solve(arr,N,value,max);
    }
}
*/







/* 
 Lowest Common Ancestor in a BST
Difficulty: EasyAccuracy: 65.2%Submissions: 170K+Points: 2Average Time: 20m
Given a Binary Search Tree (with all values unique) and two nodes n1 and n2 (n1 != n2). You may assume that both nodes exist in the tree. Find the Lowest Common Ancestor (LCA) of the given two nodes in the BST.

LCA between two nodes n1 and n2 is defined as the lowest node that has both n1 and n2 as descendants (where we allow a node to be a descendant of itself).

Examples:

Input: root = [5, 4, 6, 3, N, N, 7, N, N, N, 8], n1 = 7, n2 = 8
        
Output: 7
Explanation: 7 is the closest node to both 7 and 8, which is also an ancestor of both the nodes.


class Solution {
    Node LCA(Node root, Node n1, Node n2) {
        if(root==null) return null;
        
        if(root.data>n1.data && root.data>n2.data)
            return LCA(root.left,n1,n2);
            
        if(root.data<n1.data && root.data<n2.data)
            return LCA(root.right,n1,n2);
            
        return root;
        
    }
}

*/











/* 
BST Keys in a Range
Difficulty: EasyAccuracy: 60.01%Submissions: 58K+Points: 2Average Time: 20m
Given a Binary Search Tree and a range [low, high]. Find all the numbers in the BST that lie in the given range.
Note: Element greater than or equal to root go to the right side.

Example 1:

Input:
       17
     /    \
    4     18
  /   \
 2     9 
l = 4, h = 24
Output: 
4 9 17 18 


class Solution
{   
    //Function to return a list of BST elements in a given range.
	public static ArrayList<Integer> printNearNodes(Node root,int low,int high) {
        ArrayList<Integer> ans=new ArrayList<>();
        solve(root,low,high,ans);
        return ans;
    }
    public static void solve(Node root,int low,int high,ArrayList<Integer> ans){
        if(root==null) return;
        
        solve(root.left,low,high,ans);
        if(low<=root.data && root.data<=high){
            ans.add(root.data);
        }
        solve(root.right,low,high,ans);
    }
    
}

*/









/* 
BST with Dead End
Difficulty: MediumAccuracy: 35.99%Submissions: 83K+Points: 4
Given a Binary Search Tree that contains unique positive integer values greater than 0. The task is find if the BST contains a dead end. Here Dead End means a leaf node, at which no other integer can be inserted.

Example 1:

Input :   
               8
             /   \ 
           5      9
         /  \     
        2    7 
       /
      1     
          
Output : 
Yes
Explanation : 
Node 1 is a Dead End in the given BST.


class Solution
{
    public static boolean isDeadEnd(Node root)
    {
        return solve(root,0,Integer.MAX_VALUE);
    }
    
    public static boolean solve(Node root,int min,int max){
        if(root==null) return false;
        
        if(root.left==null && root.right==null){
            if(root.data-min==1 && max-root.data==1) return true;
            return false;
        }
        return solve(root.left,min,root.data) || solve(root.right,root.data,max);
    }
}

*/











/* 
Find Common Nodes in two BSTs
Difficulty: MediumAccuracy: 51.7%Submissions: 69K+Points: 4Average Time: 20m
Given two Binary Search Trees. Find the nodes that are common in both of them, ie- find the intersection of the two BSTs.

Note: Return the common nodes in sorted order.

Examples:

Input:
BST1:
                  5
               /     \
             1        10
           /   \      /
          0     4    7
                      \
                       9
BST2:
                10 
              /    \
             7     20
           /   \ 
          4     9

Output: 4 7 9 10



class Solution {
    // Function to find the nodes that are common in both BST.
    public static ArrayList<Integer> findCommon(Node r1, Node r2) {
        ArrayList<Integer> a1=new ArrayList<>();
        ArrayList<Integer> a2=new ArrayList<>();
        ArrayList<Integer> ans=new ArrayList<>();
        
        inorder(r1,a1);
        inorder(r2,a2);
        common(a1,a2,ans);
        
        return ans;
    }
    public static void inorder(Node node,ArrayList<Integer> list){
        if(node==null) return;
        
        inorder(node.left,list);
        list.add(node.data);
        inorder(node.right,list);
    }
    
    public static void common(ArrayList<Integer> a1,ArrayList<Integer> a2,ArrayList<Integer> ans){
        int i=0,j=0;
        while(i<a1.size() && j<a2.size()){
            if(a1.get(i).equals(a2.get(j))){
                ans.add(a1.get(i));
                i++;
                j++;
            }
            else if(a1.get(i)<a2.get(j)){
                i++;
            }
            else{
                j++;
            }
        }
    }
}
*/









/* 
Sorted Linked List to BST
Difficulty: HardAccuracy: 53.24%Submissions: 26K+Points: 8
Given a Singly Linked List which has data members sorted in ascending order. Construct a Balanced Binary Search Tree which has same data members as the given Linked List.
Note: There might be nodes with the same value.

Examples:

Input: Linked List: 1->2->3->4->5->6->7

Output: 4 2 1 3 6 5 7
Explanation : The BST formed using elements of the linked list is -
        4
      /   \
     2     6
   /  \   / \
  1   3  5   7  
Hence, preorder traversal of this tree is 4 2 1 3 6 5 7

class Solution {
    public TNode sortedListToBST(LNode head) {
        ArrayList<Integer> ldata=new ArrayList<>();
        storeListData(head,ldata);
        
        return bst(ldata,0,ldata.size()-1);
    }
    
    public void storeListData(LNode head,ArrayList<Integer> ldata){
        while(head!=null){
            ldata.add(head.data);
            head=head.next;
        }
    }
    
    public TNode bst(ArrayList<Integer> ldata,int s,int e){
        if(s>e){
            return null;
        }
        
        int m=s+(e-s+1)/2;
        TNode root=new TNode(ldata.get(m));
        root.left=bst(ldata,s,m-1);
        root.right=bst(ldata,m+1,e);
        
        return root;
    }
    
}

*/






/* 
Merge two BST 's
Difficulty: MediumAccuracy: 64.95%Submissions: 91K+Points: 4Average Time: 30m
Given two BSTs, return elements of merged BSTs in sorted form.

Examples :

Input: root1 = [5, 3, 6, 2, 4]
       5
     /   \
    3     6
   / \
  2   4 
root2 = [2, 1, 3, N, N, N, 7, 6, N]
        2
      /   \
     1     3
            \
             7
            /
           6
Output: [1, 2, 2, 3, 3, 4, 5, 6, 6, 7]
Explanation: After merging and sorting the two BST we get [1, 2, 2, 3, 3, 4, 5, 6, 6, 7].




class Solution {
    // Function to return a list of integers denoting the node
    // values of both the BST in a sorted order.
    public ArrayList<Integer> merge(Node root1, Node root2) {
        ArrayList<Integer> a=new ArrayList<>();
        ArrayList<Integer> b=new ArrayList<>();
        ArrayList<Integer> ans=new ArrayList<>();
        
        inorder(root1,a);
        inorder(root2,b);
        merge(a,b,ans);
        
        return ans;
    }
    
    public void inorder(Node root,ArrayList<Integer> temp){
        if(root==null) return;
        
        inorder(root.left,temp);
        temp.add(root.data);
        inorder(root.right,temp);
    }
    
    public void merge(ArrayList<Integer> a,ArrayList<Integer> b,ArrayList<Integer> ans){
        int i=0;
        int j=0;
        while(i<a.size() && j<b.size()){
            if(a.get(i)<=b.get(j)){
                ans.add(a.get(i));
                i++;
            }
            else{
                ans.add(b.get(j));
                j++;
            }
        }
        
        
        while(i<a.size()){
            ans.add(a.get(i));
            i++; 
        }
        
        while(j<b.size()){
            ans.add(b.get(j));
            j++; 
        }
    }
}
*/





/* 
Fixing Two nodes of a BST
Difficulty: HardAccuracy: 53.68%Submissions: 65K+Points: 8Average Time: 45m
Given the root of a Binary search tree(BST), where exactly two nodes were swapped by mistake. Your task is to fix (or correct) the BST by swapping them back. Do not change the structure of the tree.
Note: It is guaranteed that the given input will form BST, except for 2 nodes that will be wrong. All changes must be reflected in the original Binary search tree(BST).
 
Examples :
Input: root = [10, 5, 8, 2, 20]
     
Output: 1
       

Explanation: The nodes 20 and 8 were swapped. 



class Solution {
    int index=0;
    void correctBST(Node root) {
        ArrayList<Integer> ans=new ArrayList<>();
        inorder(root,ans);
        
        int f=-1;
        int s=-1;
        for(int i=1;i<ans.size();i++){
            if(ans.get(i)<ans.get(i-1)){
                if(f==-1){
                   f=i-1;
                   s=i;
                }
                else{
                   s=i; 
                }
            }
        }
        
        int temp=ans.get(f);
        ans.set(f,ans.get(s));
        ans.set(s,temp);
        
        index=0;
        bst(root,ans);
        
    }
    
    public void inorder(Node root,ArrayList<Integer> temp){
        if(root==null) return;
        
        inorder(root.left,temp);
        temp.add(root.data);
        inorder(root.right,temp);
    }
    
    public void bst(Node root,ArrayList<Integer> temp){
        if(root==null) return;
        
        bst(root.left,temp);
        root.data=temp.get(index++);
        bst(root.right,temp);
    }
}
*/







/* 
Largest BST
Difficulty: MediumAccuracy: 29.73%Submissions: 165K+Points: 4Average Time: 40m
You're given a binary tree. Your task is to find the size of the largest subtree within this binary tree that also satisfies the properties of a Binary Search Tree (BST). The size of a subtree is defined as the number of nodes it contains.

Note: A subtree of the binary tree is considered a BST if for every node in that subtree, the left child is less than the node, and the right child is greater than the node, without any duplicate values in the subtree.

Examples :

Input: root = [5, 2, 4, 1, 3]
Root-to-leaf-path-sum-equal-to-a-given-number-copy
Output: 3
 

class Solution {
    static int totalSize;  // Global variable to track the largest BST size

    static class Box {
        boolean BST;
        int size;
        int min, max;

        Box(int data) {
            BST = true;
            size = 1;
            min = data;
            max = data;
        }
    }

    static Box find(Node root) {
        // Base case: If root is null
        if (root == null) {
            return null;
        }

        // Leaf node
        if (root.left == null && root.right == null) {
            totalSize = Math.max(totalSize, 1);
            return new Box(root.data);
        }

        // Only right child exists
        if (root.left == null) {
            Box head = find(root.right);
            if (head.BST && head.min > root.data) {
                head.size++;
                head.min = root.data;
                totalSize = Math.max(totalSize, head.size);
                return head;
            } else {
                head.BST = false;
                return head;
            }
        }

        // Only left child exists
        if (root.right == null) {
            Box head = find(root.left);
            if (head.BST && head.max < root.data) {
                head.size++;
                head.max = root.data;
                totalSize = Math.max(totalSize, head.size);
                return head;
            } else {
                head.BST = false;
                return head;
            }
        }

        // Both children exist
        Box leftHead = find(root.left);
        Box rightHead = find(root.right);

        if (leftHead.BST && rightHead.BST && leftHead.max < root.data && rightHead.min > root.data) {
            Box head = new Box(root.data);
            head.size += leftHead.size + rightHead.size;
            head.min = leftHead.min;
            head.max = rightHead.max;
            totalSize = Math.max(totalSize, head.size);
            return head;
        } else {
            leftHead.BST = false;
            return leftHead;
        }
    }

    static int largestBst(Node root) {
        totalSize = 0;  // Initialize the global variable
        find(root);
        return totalSize;
    }
}
*/






/* 
1373. Maximum Sum BST in Binary Tree
Solved
Hard
Topics
Companies
Hint
Given a binary tree root, return the maximum sum of all keys of any sub-tree which is also a Binary Search Tree (BST).

Assume a BST is defined as follows:

The left subtree of a node contains only nodes with keys less than the node's key.
The right subtree of a node contains only nodes with keys greater than the node's key.
Both the left and right subtrees must also be binary search trees.
 

Example 1:



Input: root = [1,4,3,2,4,2,5,null,null,null,null,null,null,4,6]
Output: 20



class Solution {
    static int totalSum;

    static class Box {
        boolean BST;
        int sum;
        int min, max;

        Box(int data) {
            BST = true;
            sum = data;  // Ye galti thi, pehle sum = 0 tha
            min = data;
            max = data;
        }
    }

    static Box find(TreeNode root) {
        // Base case: Agar root null ho, toh empty BST consider karo
        if (root == null) {
            return new Box(Integer.MAX_VALUE);  // Min aur Max set karne ke liye ek dummy object
        }

        // Leaf node ke liye
        if (root.left == null && root.right == null) {
            totalSum = Math.max(totalSum, root.val);  // Directly leaf ka value add karenge
            return new Box(root.val);
        }

        // Sirf right child exist kare
        if (root.left == null) {
            Box head = find(root.right);
            if (head.BST && head.min > root.val) {
                head.sum += root.val;
                head.min = root.val;
                totalSum = Math.max(totalSum, head.sum);
                return head;
            } else {
                head.BST = false;
                return head;
            }
        }

        // Sirf left child exist kare
        if (root.right == null) {
            Box head = find(root.left);
            if (head.BST && head.max < root.val) {
                head.sum += root.val;
                head.max = root.val;
                totalSum = Math.max(totalSum, head.sum);
                return head;
            } else {
                head.BST = false;
                return head;
            }
        }

        // Dono side exist kare
        Box leftHead = find(root.left);
        Box rightHead = find(root.right);

        if (leftHead.BST && rightHead.BST && leftHead.max < root.val && rightHead.min > root.val) {
            Box head = new Box(root.val);
            head.sum += leftHead.sum + rightHead.sum;
            head.min = leftHead.min;
            head.max = rightHead.max;
            totalSum = Math.max(totalSum, head.sum);
            return head;
        } else {
            leftHead.BST = false;
            return leftHead;
        }
    }

    public int maxSumBST(TreeNode root) {
        totalSum = 0;  // Initialize max sum
        find(root);
        return totalSum;
    }
}

*/





/* 
 


*/





/* 
 


*/