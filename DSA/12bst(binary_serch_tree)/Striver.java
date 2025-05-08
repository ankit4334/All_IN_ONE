/* 
 Binary Search Trees
Difficulty: EasyAccuracy: 49.91%Submissions: 27K+Points: 2
Given an array of integers arr[] representing inorder traversal of elements of a binary tree. Return true if the given inorder traversal can be of a valid Binary Search Tree.

Note - In a valid Binary Search Tree all keys are unique.

Examples :

Input: arr[] = [8, 14, 45, 64, 100]
Output: True
Input: arr[] = [5, 6, 1, 8, 7]
Output: False
Expected Time Complexity: O(n)

Expected Space Complexity: O(1)


class Solution {
    static boolean isBSTTraversal(int arr[]) {
       for(int i=1;i<arr.length;i++){
           if(arr[i-1]>=arr[i]){
               return false;
           }
           
       }
       
       return true;
    }
}
-------------------------------------------------------------
700. Search in a Binary Search Tree
Solved
Easy
Topics
Companies
You are given the root of a binary search tree (BST) and an integer val.

Find the node in the BST that the node's value equals val and return the subtree rooted with that node. If such a node does not exist, return null.

 

Example 1:


Input: root = [4,2,7,1,3], val = 2
Output: [2,1,3]
Example 2:


Input: root = [4,2,7,1,3], val = 5
Output: []


class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null){
            return null;
        }

        if(root.val==val){
            return root;
        }
        else if(root.val>val){
           return searchBST(root.left,val);
        }
        else{
            return searchBST(root.right,val);
        }

    }
}
-------------------------------------------------------------
Minimum element in BST
Difficulty: BasicAccuracy: 70.95%Submissions: 185K+Points: 1
Given the root of a Binary Search Tree. The task is to find the minimum valued element in this given BST.

Example 1:

Input:
           5
         /    \
        4      6
       /        \
      3          7
     /
    1
Output: 1
Example 2:

Input:
             9
              \
               10
                \
                 11
Output: 9
Your Task:
The task is to complete the function minValue() which takes root as the argument and returns the minimum element of BST. If the tree is empty, there is no minimum element, so return -1 in that case.

Expected Time Complexity: O(Height of the BST)
Expected Auxiliary Space: O(1).


class Tree {
    // Function to find the minimum element in the given BST.
    int minValue(Node node) {
        
        if(node==null){
            return -1;
        }
        
        while(node.left!=null){
            node=node.left;
        }
        
        return node.data;
    }
}
-------------------------------------------------------------
Ceil in BST
Difficulty: MediumAccuracy: 62.73%Submissions: 92K+Points: 4
Given a BST and a number X, find Ceil of X.
Note: Ceil(X) is a number that is either equal to X or is immediately greater than X.

If Ceil could not be found, return -1.

Example 1:

Input:
      5
    /   \
   1     7
    \
     2 
      \
       3
X = 3
Output: 3
Explanation: We find 3 in BST, so ceil
of 3 is 3.
Example 2:

Input:
     10
    /  \
   5    11
  / \ 
 4   7
      \
       8
X = 6
Output: 7
Explanation: We find 7 in BST, so ceil
of 6 is 7.


class Tree {
    // Function to return the ceil of given number in BST.
    int findCeil(Node root, int key) {
        if (root == null) return -1;
        
        int ans=-1;
        while(root!=null){
            if(root.data==key){
                return root.data;
            }
            else if(root.data > key){
                ans=root.data;
                root=root.left;
            }
            else{
                root=root.right;
            }
        }
        
        return ans;
    }
}
-------------------------------------------------------------
Floor in BST
Difficulty: MediumAccuracy: 51.06%Submissions: 75K+Points: 4
You are given a BST(Binary Search Tree) with n number of nodes and value x. your task is to find the greatest value node of the BST which is smaller than or equal to x.
Note: when x is smaller than the smallest node of BST then returns -1.

Example:

Input:
n = 7               2
                     \
                      81
                    /     \
                 42       87
                   \       \
                    66      90
                   /
                 45
x = 87
Output:
87
Explanation:
87 is present in tree so floor will be 87.
Example 2:

Input:
n = 4                     6
                           \
                            8
                          /   \
                        7       9
x = 11
Output:
9

class Solution {
    public static int floor(Node root, int x) {
        int ans=-1;
        while(root!=null){
            if(root.data==x){
                return root.data;
            }
            else if(root.data > x){
                
                root=root.left;
            }
            else{
                ans=root.data;
                root=root.right;
            }
        }
        
        return ans;
    }
}
-------------------------------------------------------------
701. Insert into a Binary Search Tree
Solved
Medium
Topics
Companies
You are given the root node of a binary search tree (BST) and a value to insert into the tree. Return the root node of the BST after the insertion. It is guaranteed that the new value does not exist in the original BST.

Notice that there may exist multiple valid ways for the insertion, as long as the tree remains a BST after insertion. You can return any of them.

 

Example 1:


Input: root = [4,2,7,1,3], val = 5
Output: [4,2,7,1,3,5]
Explanation: Another accepted tree is:

Example 2:

Input: root = [40,20,60,10,30,50,70], val = 25
Output: [40,20,60,10,30,50,70,null,null,25]
Example 3:

Input: root = [4,2,7,1,3,null,null,null,null,null,null], val = 5
Output: [4,2,7,1,3,5]

class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null){
            root=new TreeNode(val);
            return root;
        }
        if(root.val > val){
            root.left=insertIntoBST(root.left,val);
        }
        else{
            root.right=insertIntoBST(root.right,val);
        }
        return root;
    }
}
-------------------------------------------------------------
450. Delete Node in a BST
Solved
Medium
Topics
Companies
Given a root node reference of a BST and a key, delete the node with the given key in the BST. Return the root node reference (possibly updated) of the BST.

Basically, the deletion can be divided into two stages:

Search for a node to remove.
If the node is found, delete the node.
 

Example 1:


Input: root = [5,3,6,2,4,null,7], key = 3
Output: [5,4,6,2,null,null,7]
Explanation: Given key to delete is 3. So we find the node with value 3 and delete it.
One valid answer is [5,4,6,2,null,null,7], shown in the above BST.
Please notice that another valid answer is [5,2,6,null,4,null,7] and it's also accepted.

Example 2:

Input: root = [5,3,6,2,4,null,7], key = 0
Output: [5,3,6,2,4,null,7]
Explanation: The tree does not contain a node with value = 0.
Example 3:

Input: root = [], key = 0
Output: []


class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {

        if (root == null) {
            return root;
        }

        if (root.val > key) {
            root.left = deleteNode(root.left, key);
        } else if (root.val < key) {
            root.right = deleteNode(root.right, key);
        } else {
            if (root.left == null && root.right == null) {
                return null;
            }
            if (root.left == null) {
                return root.right;
            }
            else if (root.right == null) {
                return root.left;
            } else {
                root.val= solve(root.right);
                root.right = deleteNode(root.right, root.val);
            }
        }

        return root;

    }

    public int solve(TreeNode root) {
        if (root == null) {
            return 0;
        }
        while (root.left != null) {
            root = root.left;
        }
        return root.val;
    }
}
-------------------------------------------------------------
230. Kth Smallest Element in a BST
Solved
Medium
Topics
Companies
Hint
Given the root of a binary search tree, and an integer k, return the kth smallest value (1-indexed) of all the values of the nodes in the tree.

 

Example 1:


Input: root = [3,1,4,null,2], k = 1
Output: 1
Example 2:


Input: root = [5,3,6,2,4,null,null,1], k = 3
Output: 3


class Solution {
    int ans=0;
    int c=0;
    public int kthSmallest(TreeNode root, int k) {
        if(root==null){
            return 0;
        }

        solve(root,k);
        
        return ans;
    }

    public void solve(TreeNode root,int k){
        if(root.left!=null){
            solve(root.left,k);
        }

        c++;
        if(k==c){
            ans=root.val;
            return;
        }


        if(root.right!=null){
            solve(root.right,k);
        }
    }
}
-------------------------------------------------------------
98. Validate Binary Search Tree
Solved
Medium
Topics
Companies
Given the root of a binary tree, determine if it is a valid binary search tree (BST).

A valid BST is defined as follows:

The left 
subtree
 of a node contains only nodes with keys less than the node's key.
The right subtree of a node contains only nodes with keys greater than the node's key.
Both the left and right subtrees must also be binary search trees.
 

Example 1:


Input: root = [2,1,3]
Output: true
Example 2:


Input: root = [5,1,4,null,null,3,6]
Output: false
Explanation: The root node's value is 5 but its right child's value is 4.



class Solution {
    public boolean isValidBST(TreeNode root) {
        if(root==null){
            return true;
        }
        return solve(root,null,null);
    }

    public boolean solve(TreeNode root,TreeNode min,TreeNode max){
        if(root==null){
            return true;
        }

        if(min!=null && root.val <= min.val){
            return false;
        }

        if(max!=null && root.val >= max.val){
            return false;
        }

        return solve(root.left,min,root) & solve(root.right,root,max);

    }

}
-------------------------------------------------------------
235. Lowest Common Ancestor of a Binary Search Tree
Solved
Medium
Topics
Companies
Given a binary search tree (BST), find the lowest common ancestor (LCA) node of two given nodes in the BST.

According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes p and q as the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself).”

 

Example 1:


Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8
Output: 6
Explanation: The LCA of nodes 2 and 8 is 6.
Example 2:


Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 4
Output: 2
Explanation: The LCA of nodes 2 and 4 is 2, since a node can be a descendant of itself according to the LCA definition.
Example 3:

Input: root = [2,1], p = 2, q = 1
Output: 2


class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null || p==null || q==null){
            return null;
        }

        if(p.val < root.val && q.val< root.val){
            return lowestCommonAncestor(root.left,p,q);
        }

         if(p.val > root.val && q.val > root.val){
            return lowestCommonAncestor(root.right,p,q);
        }

        return root;

    }
}
-------------------------------------------------------------


-------------------------------------------------------------


-------------------------------------------------------------























*/