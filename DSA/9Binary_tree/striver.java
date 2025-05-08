/*
Introduction to Trees
Difficulty: EasyAccuracy: 82.66%Submissions: 24K+Points: 2
Given an integer i. Print the maximum number of nodes on level i of a binary tree.

Example 1:

Input: 5
Output: 16
Example 2:

Input: 1
Output: 1

class Solution {
    static int countNodes(int i) {
        
        return 1<<(i-1);   // equals 1 x 2^(i-1)
        
    }
}
-------------------------------------------------------------------
Binary Tree Representation
Difficulty: EasyAccuracy: 75.76%Submissions: 19K+Points: 2
You are given an array nodes. It contains 7 integers, which represents the value of nodes of the binary tree in level order traversal. You are also given a root of the tree which has a value equal to nodes[0].

Your task to construct a binary tree by creating nodes for the remaining 6 nodes.

Example:

Input: 
nodes = [1 2 3 4 5 6 7]
Output: 
         1
       /   \
     2       3
   /  \     /  \
   4  5    6   7
Explanation: 
The 7 node binary tree is represented above.
Your Task:

Complete the function void create_tree(node* root0, vector &vec), which takes a root of a Binary tree and vector array vec containing the values of nodes.

Expected Time Complexity: O(1).

Expected Auxiliary Space: O(1).

class Solution{
    public static void createTree(Node root0, ArrayList<Integer> v ){
        root0.left=new Node(v.get(1));
        root0.right=new Node(v.get(2));
        root0.left.left=new Node(v.get(3));
        root0.left.right=new Node(v.get(4));
        root0.right.left=new Node(v.get(5));
        root0.right.right=new Node(v.get(6));
    }
}
-------------------------------------------------------------------
144. Binary Tree Preorder Traversal
Solved
Easy
Topics
Companies
Given the root of a binary tree, return the preorder traversal of its nodes' values.

 

Example 1:


Input: root = [1,null,2,3]
Output: [1,2,3]
Example 2:

Input: root = []
Output: []
Example 3:

Input: root = [1]
Output: [1]


class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> ans=new ArrayList<>();

        if(root==null){
            return ans;
        }
        
        Stack<TreeNode> s=new Stack<>();
        s.push(root);

        while(!s.isEmpty()){
            TreeNode curr=s.pop();
            ans.add(curr.val);

            if(curr.right!=null){
                s.push(curr.right);
            }

            if(curr.left!=null){
                s.push(curr.left);
            }
        }
        return ans;
    }
}
-------------------------------------------------------------------
145. Binary Tree Postorder Traversal
Solved
Easy
Topics
Companies
Given the root of a binary tree, return the postorder traversal of its nodes' values.

 

Example 1:


Input: root = [1,null,2,3]
Output: [3,2,1]
Example 2:

Input: root = []
Output: []
Example 3:

Input: root = [1]
Output: [1]
 


class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans=new ArrayList<>();

        if(root==null){
            return ans;
        }
        
        Stack<TreeNode> s=new Stack<>();
        s.push(root);

        while(!s.isEmpty()){
            TreeNode curr=s.pop();
            ans.add(curr.val);

            if(curr.left!=null){
                s.push(curr.left);
            }

            if(curr.right!=null){
                s.push(curr.right);
            }
        }

        Collections.reverse(ans);

        return ans;
    }
}
-------------------------------------------------------------------
94. Binary Tree Inorder Traversal
Solved
Easy
Topics
Companies
Given the root of a binary tree, return the inorder traversal of its nodes' values.

 

Example 1:


Input: root = [1,null,2,3]
Output: [1,3,2]
Example 2:

Input: root = []
Output: []
Example 3:

Input: root = [1]
Output: [1]



class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();

        if(root==null){
            return ans;
        }
        
        Stack<TreeNode> s = new Stack<>();
        Stack<Boolean> vis = new Stack<>();

        
        s.push(root);
        vis.push(false);
        

        while (!s.isEmpty()) {
            TreeNode curr = s.pop();
            boolean flag = vis.pop();

            if (!flag) {
                // right
                if (curr.right != null) {
                    s.push(curr.right);
                    vis.push(false);
                }

                // node
                s.push(curr);
                vis.push(true);

                // left
                if (curr.left != null) {
                    s.push(curr.left);
                    vis.push(false);
                }
            } else {
                ans.add(curr.val);
            }
        }
        return ans;
    }
}
-------------------------------------------------------------------
102. Binary Tree Level Order Traversal
Solved
Medium
Topics
Companies
Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).

 

Example 1:


Input: root = [3,9,20,null,null,15,7]
Output: [[3],[9,20],[15,7]]
Example 2:

Input: root = [1]
Output: [[1]]
Example 3:

Input: root = []
Output: []


class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> level=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode temp=q.remove();
                level.add(temp.val);

                if(temp.left!=null){
                    q.add(temp.left);
                }

                if(temp.right!=null){
                    q.add(temp.right);
                }
            }
            ans.add(level);
        }

        return ans;
        
    }

}

-------------------------------------------------------------------
Level Order in spiral form
Difficulty: EasyAccuracy: 36.43%Submissions: 217K+Points: 2Average Time: 20m
Given a binary tree and the task is to find the spiral order traversal of the tree and return the list containing the elements.
Spiral order Traversal mean: Starting from level 0 for root node, for all the even levels we print the node's value from right to left and for all the odd levels we print the node's value from left to right.
For below tree, function should return [1, 2, 3, 4, 5, 6, 7]

 spiral_order

Examples:

Input: root = [1, 3, 2]
      1
    /   \
   3     2
Output: [1, 3, 2]
Explanation: Start with root (1), print level 0 (right to left), then level 1 (left to right).
Input: root = [10, 20, 30, 40, 60]

           10
         /     \
        20     30
      /    \
    40     60
Output: [10, 20, 30, 60, 40]
Explanation: Start with root (10), print level 0 (right to left), level 1 (left to right), and continue alternating.

ArrayList<Integer> findSpiral(Node root) {
        ArrayList<Integer> ans=new ArrayList<>();
        if(root==null) return ans;
        
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        int c=0;
        while(!q.isEmpty()){
            int n=q.size();
            
            ArrayList<Integer> level=new ArrayList<>();
            for(int i=0;i<n;i++){
                Node curr=q.remove();
                if(c%2==1){
                    level.add(curr.data);
                }
                else{
                    level.add(0,curr.data);
                }
                
                if(curr.left!=null){
                    q.add(curr.left);
                }
                
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
            c++;
            ans.addAll(level);
        }
        
        return ans;
    }


-------------------------------------------------------------------

Largest value in each level
Difficulty: EasyAccuracy: 68.05%Submissions: 19K+Points: 2
Given a binary tree, find the largest value in each level.

Example 1:

Input :
        1
       / \
      2   3 

Output : 1 3
Explanation : 
There are two levels in the tree :
1. {1}, max = 1
2. {2, 3}, max = 3
Example 2:

Input :
        4
       / \
      9   2
     / \   \
    3   5   7 

Output : 4 9 7


 public ArrayList<Integer> largestValues(Node root)
    {
        ArrayList<Integer> ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            int size=q.size();
            int ma=Integer.MIN_VALUE;
            for(int i=0;i<size;i++){
                Node curr=q.remove();
                ma=Math.max(ma,curr.data);
                
                if(curr.left!=null){
                    q.add(curr.left);
                }
                
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
            ans.add(ma);
        }
        
        return ans;
        
    }



-------------------------------------------------------------------

104. Maximum Depth of Binary Tree
Solved
Easy
Topics
Companies
Given the root of a binary tree, return its maximum depth.

A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

 

Example 1:


Input: root = [3,9,20,null,null,15,7]
Output: 3
Example 2:

Input: root = [1,null,2]
Output: 2


class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }

        int l=maxDepth(root.left);
        int r=maxDepth(root.right);
        return Math.max(l,r)+1;
        
    }
}
-------------------------------------------------------------------
110. Balanced Binary Tree
Solved
Easy
Topics
Companies
Given a binary tree, determine if it is 
height-balanced
.

 

Example 1:


Input: root = [3,9,20,null,null,15,7]
Output: true
Example 2:


Input: root = [1,2,2,3,3,null,null,4,4]
Output: false
Example 3:

Input: root = []
Output: true
 

class Solution {

    public int height(TreeNode root){
         if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        if (leftHeight == -1 || rightHeight == -1 || Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public boolean isBalanced(TreeNode root) {
         return height(root) != -1;
    }
}



//or

boolean valid = true;
    
    public boolean isBalanced(Node root) {
        valid = true; // Reset before each call
        height(root);
        return valid;
    }
    
    public int height(Node root) {
        if (root == null) return 0;
        
        int l = height(root.left);
        int r = height(root.right);
        
        // Check the balance condition
        if (Math.abs(l - r) > 1) {
            valid = false;
        }
        
        return Math.max(l, r) + 1;
    }
-------------------------------------------------------------------
543. Diameter of Binary Tree
Solved
Easy
Topics
Companies
Given the root of a binary tree, return the length of the diameter of the tree.

The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.

The length of a path between two nodes is represented by the number of edges between them.

 

Example 1:


Input: root = [1,2,3,4,5]
Output: 3
Explanation: 3 is the length of the path [4,2,1,3] or [5,2,1,3].
Example 2:

Input: root = [1,2]
Output: 1
 


class Solution {
    int c=0;
    public int diameterOfBinaryTree(TreeNode root) {
     
     solve(root);
     return c;

    }

    public int solve(TreeNode root) {
     if(root==null){
        return 0;
     }   

        int l=solve(root.left);
        int r=solve(root.right);
        c=Math.max(c,l+r);
        return Math.max(l,r)+1;

    }

}




-------------------------------------------------------------------
Check if two Nodes are Cousins
Difficulty: MediumAccuracy: 25.99%Submissions: 47K+Points: 4Average Time: 20m
Given a binary tree (having distinct node values)root and two node values. Check whether or not the two nodes with values a and b are cousins.
Note: Two nodes of a binary tree are cousins if they have the same depth with different parents.

Examples:

Input:
      1
    /   \
   2     3
a = 2, b = 3
Output: false
Explanation: Here, nodes 2 and 3 are at the same level but have same parent nodes.
Input:
       1
     /   \ 
    2     3
   /       \
  5         4 
a = 5, b = 4
Output: True

public boolean isCousins(Node root, int a, int b) {
       int l1=-1,l2=-1;
       int level=0;
       Queue<Node> q=new LinkedList<>();
       q.add(root);
       
       while(!q.isEmpty()){
           int n=q.size();
           for(int i=0;i<n;i++){
               Node curr=q.remove();
               if(curr.data==a){
                   l1=level;
               }
               
               if(curr.data==b){
                   l2=level;
               }
               
               if(curr.left!=null){
                   q.add(curr.left);
               }
               
               if(curr.right!=null){
                   q.add(curr.right);
               }
           }
           
           level++;
           
           if(l1!=l2){
            return false; //same level pe nahi hai.
           }
           
           if(l1!=-1 && l2!=-1){
               break;   //done -1 nahi mean dono ko level mil gya hai.
           }
       }
       
       if(l1==-1 && l2==-1) return false;
       
       //yha pe parent cheak karege ki diffrent hai or nahi.
       if(isParent(root,a,b)){
           return false;
       }
       
       return true;
       
    }
    
    public boolean isParent(Node root,int a,int b){
        if(root==null) return false;
        
        if(root.left!=null && root.right!=null){
            if(root.left.data==a && root.right.data==b){
            return true;
            }
        
            if(root.left.data==b && root.right.data==a){
            return true;
            }
        }
        
        return isParent(root.left,a,b) || isParent(root.right,a,b);
    }

-------------------------------------------------------------------
124. Binary Tree Maximum Path Sum
Solved
Hard
Topics
Companies
A path in a binary tree is a sequence of nodes where each pair of adjacent nodes in the sequence has an edge connecting them. A node can only appear in the sequence at most once. Note that the path does not need to pass through the root.

The path sum of a path is the sum of the node's values in the path.

Given the root of a binary tree, return the maximum path sum of any non-empty path.

 

Example 1:


Input: root = [1,2,3]
Output: 6
Explanation: The optimal path is 2 -> 1 -> 3 with a path sum of 2 + 1 + 3 = 6.
Example 2:


Input: root = [-10,9,20,null,null,15,7]
Output: 42
Explanation: The optimal path is 15 -> 20 -> 7 with a path sum of 15 + 20 + 7 = 42.


class Solution {
    int ma=Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        
        solve(root);

        return ma;
       
    }

    public int solve(TreeNode root){
        if(root==null){
            return 0;
        }
        int l=Math.max(0,solve(root.left));
        int r=Math.max(0,solve(root.right));

        int currma=(l+r+root.val);
        ma=Math.max(ma,currma);

        return Math.max(l,r)+root.val;
    }
}
-------------------------------------------------------------------

-------------------------------------------------------------------
Mirror Tree
Difficulty: EasyAccuracy: 72.67%Submissions: 224K+Points: 2Average Time: 20m
Given a binary tree, convert the binary tree to its Mirror tree.

Mirror of a Binary Tree T is another Binary Tree M(T) with left and right children of all non-leaf nodes interchanged.     

Examples:

Input: root[] = [1, 2, 3, N, N, 4]
Output: [1, 3, 2, N, 4]
Explanation: 
class Solution {
    // Function to convert a binary tree into its mirror tree.
    void mirror(Node node) {
        solve(node);
    }
    Node solve(Node node){
        if(node==null){
            return null;
        }
        
        Node l=solve(node.left);
        Node r=solve(node.right);
        node.left=r;
        node.right=l;
        return node;
    }
}

-------------------------------------------------------------------
100. Same Tree || or identical is same question
Solved
Easy
Topics
Companies
Given the roots of two binary trees p and q, write a function to check if they are the same or not.

Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.

 

Example 1:


Input: p = [1,2,3], q = [1,2,3]
Output: true
Example 2:


Input: p = [1,2], q = [1,null,2]
Output: false
Example 3:


Input: p = [1,2,1], q = [1,1,2]
Output: false


class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null){
            return true;
        }

        if(p==null || q==null || p.val!=q.val){
            return false;
        }

        return isSameTree(p.left,q.left) & isSameTree(p.right,q.right);

    }

}
-------------------------------------------------------------------
103. Binary Tree Zigzag Level Order Traversal
Solved
Medium
Topics
Companies
Given the root of a binary tree, return the zigzag level order traversal of its nodes' values. (i.e., from left to right, then right to left for the next level and alternate between).

 

Example 1:


Input: root = [3,9,20,null,null,15,7]
Output: [[3],[20,9],[15,7]]
Example 2:

Input: root = [1]
Output: [[1]]
Example 3:

Input: root = []
Output: []

class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();

        if(root==null){
            return ans;
        }

        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        boolean leftToRight = true;

        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> temp=new ArrayList<>();
            
            for(int i=0;i<size;i++){
                TreeNode curr=q.remove();
                if(leftToRight){
                    temp.add(curr.val);
                }
                else{
                    temp.add(0,curr.val);
                }

                if(curr.left!=null){
                    q.add(curr.left);
                }

                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
            ans.add(temp);
            leftToRight = !leftToRight;
        }

        return ans;
        
    }
}
-------------------------------------------------------------------
101. Symmetric Tree
Solved
Easy
Topics
Companies
Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).

 

Example 1:


Input: root = [1,2,2,3,4,4,3]
Output: true
Example 2:


Input: root = [1,2,2,null,3,null,3]
Output: false



class Solution {
    public boolean isSymmetric(TreeNode root) {
        
        return solve(root.left,root.right);

    }

    public boolean solve(TreeNode left,TreeNode right){
        if(left==null && right==null){
            return true;
        }

        if(left==null || right==null || left.val!=right.val){
            return false;
        }

        return solve(left.left,right.right) & solve(left.right,right.left);
        
    }
}
-------------------------------------------------------------------
236. Lowest Common Ancestor of a Binary Tree
Solved
Medium
Topics
Companies
Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.

According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes p and q as the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself).”

 

Example 1:


Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1
Output: 3
Explanation: The LCA of nodes 5 and 1 is 3.
Example 2:


Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 4
Output: 5
Explanation: The LCA of nodes 5 and 4 is 5, since a node can be a descendant of itself according to the LCA definition.
Example 3:

Input: root = [1,2], p = 1, q = 2
Output: 1



class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        if(root==null || root==p || root==q){
        return root;
        }

        TreeNode left=lowestCommonAncestor(root.left,p,q);
        TreeNode right=lowestCommonAncestor(root.right,p,q);

        if(left==null){
            return right;
        }

        if(right==null){
            return left;
        }

        return root;
    }
}
-------------------------------------------------------------------
Root to Leaf Paths
Difficulty: MediumAccuracy: 43.65%Submissions: 103K+Points: 4
Given a Binary Tree of nodes, you need to find all the possible paths from the root node to all the leaf nodes of the binary tree.

Example 1:

Input:
       1
    /     \
   2       3
Output: 
1 2 
1 3 
Explanation: 
All possible paths:
1->2
1->3
Example 2:

Input:
         10
       /    \
      20    30
     /  \
    40   60
Output: 
10 20 40 
10 20 60 
10 30 
Your Task:
Your task is to complete the function Paths() which takes the root node as an argument and returns all the possible paths. (All the paths are printed in new lines by the driver's code.)

Expected Time Complexity: O(n)
Expected Auxiliary Space: O(height of the tree)

class Solution {
    public static ArrayList<ArrayList<Integer>> Paths(Node root) {
        
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        
       ArrayList<Integer> temp=new ArrayList<>();
       temp.add(root.data);
       
       ans.add(solve(root.left));
       ans.add(solve(root.right));
       
       return ans;
        
    }
    
    public static void solve(Node root,ArrayList<Integer> temp){
        temp.add(root.data);
        
        if(root.left!=null){
            solve(root.left,temp);
        }
        else{
            solve(root.right,temp);
        }
    }
}
-------------------------------------------------------------------
Transform to Sum Tree
Difficulty: EasyAccuracy: 70.5%Submissions: 72K+Points: 2
Given a Binary Tree of size N , where each node can have positive or negative values. Convert this to a tree where each node contains the sum of the left and right sub trees of the original tree. The values of leaf nodes are changed to 0.

Example 1:

Input:
             10
          /      \
        -2        6
       /   \     /  \
     8     -4   7    5

Output:
            20
          /    \
        4        12
       /  \     /  \
     0     0   0    0

Explanation:

           (4-2+12+6)
          /           \
      (8-4)          (7+5)
       /   \         /  \
      0     0       0    0
 

Your Task:  
You dont need to read input or print anything. Complete the function toSumTree() which takes root node as input parameter and modifies the given tree in-place.

Note: If you click on Compile and Test the output will be the in-order traversal of the modified tree.


Expected Time Complexity: O(N)
Expected Auxiliary Space: O(height of tree)



class Solution{
    public void toSumTree(Node root){
         if(root==null){
             return ;
         }
         
         solve(root);
         
    }
    
    public int solve(Node root){
        if(root==null){
            return 0;
        }
        
        int oldroot=root.data;
        
         int l=solve(root.left);
         int r=solve(root.right);
         
         root.data=l+r;
         
         return root.data+oldroot;
    }
    
    
}
-------------------------------------------------------------------
Tree Boundary Traversal
Difficulty: MediumAccuracy: 23.33%Submissions: 381K+Points: 4
Given a Binary Tree, find its Boundary Traversal. The traversal should be in the following order: 

Left boundary nodes: defined as the path from the root to the left-most node ie- the leaf node you could reach when you always travel preferring the left subtree over the right subtree. 
Leaf nodes: All the leaf nodes except for the ones that are part of left or right boundary.
Reverse right boundary nodes: defined as the path from the right-most node to the root. The right-most node is the leaf node you could reach when you always travel preferring the right subtree over the left subtree. Exclude the root from this as it was already included in the traversal of left boundary nodes.
Note: If the root doesn't have a left subtree or right subtree, then the root itself is the left or right boundary. 

Example 1:

Input:
        1 
      /   \
     2     3  
    / \   / \ 
   4   5 6   7
      / \
     8   9
   
Output: 1 2 4 8 9 6 7 3
Explanation:


 

Example 2:

Input:
            1
           /
          2
        /  \
       4    9
     /  \    \
    6    5    3
             /  \
            7     8

Output: 1 2 4 6 5 7 8
Explanation:

class Solution
{
	ArrayList <Integer> boundary(Node node)
	{
	    ArrayList <Integer> ans=new ArrayList<>();
	    if(node==null){
	        return ans;
	    }
	    
	    ans.add(node.data);
	    
	    //left part print 
	    solveLeft(node.left,ans);
	    
	    //left subtree for leaf node 
	    solveLeaf(node.left,ans);
	    //right subtree for right node
	    solveLeaf(node.right,ans);
	    
	    //right part print
	    solveRight(node.right,ans);
	    
	    
	    return ans;
	}
	
	public void solveLeft(Node node,ArrayList <Integer> ans){
	    if(node==null){
	        return;
	    }
	    
	    if(node.left==null && node.right==null){
	        return;
	    }
	    
	    ans.add(node.data);
	    
	    if(node.left!=null){
	        solveLeft(node.left,ans);
	    }
	    else{
	        solveLeft(node.right,ans);
	    }
	}
	
	public void solveLeaf(Node node,ArrayList <Integer> ans){
	    if(node==null){
	        return;
	    }
	    
	    if(node.left==null && node.right==null){
	        ans.add(node.data);
	        return;
	    }
	    
	    solveLeaf(node.left,ans);
	    solveLeaf(node.right,ans);
	    
	}
	
	public void solveRight(Node node,ArrayList <Integer> ans){
	    
	    if(node==null){
	        return;
	    }
	    
	    if(node.left==null && node.right==null){
	        return;
	    }
	    
	    if(node.right!=null){
	        solveRight(node.right,ans);
	    }
	    else{
	        solveRight(node.left,ans);
	    }
	    
	    ans.add(node.data);
	    
	}
	
}
-------------------------------------------------------------------
Top View of Binary Tree
Difficulty: MediumAccuracy: 38.43%Submissions: 318K+Points: 4
Given below is a binary tree. The task is to print the top view of binary tree. Top view of a binary tree is the set of nodes visible when the tree is viewed from the top. For the given below tree

       1
    /     \
   2       3
  /  \    /   \
4    5  6   7

Top view will be: 4 2 1 3 7
Note: Return nodes from leftmost node to rightmost node. Also if 2 nodes are outside the shadow of the tree and are at same position then consider the left ones only(i.e. leftmost). 
For ex - 1 2 3 N 4 5 N 6 N 7 N 8 N 9 N N N N N will give 8 2 1 3 as answer. Here 8 and 9 are on the same position but 9 will get shadowed.

Example 1:

Input:
      1
   /    \
  2      3
Output: 2 1 3
Example 2:

Input:
       10
    /      \
  20        30
 /   \    /    \
40   60  90    100
Output: 40 20 10 30 100



class Solution {
    // Function to return a list of nodes visible from the top view
    // from left to right in Binary Tree.
    
    static class Info{
        Node node;
        int hd;
        
        Info(Node node,int hd){
            this.node=node;
            this.hd=hd;
            
        }
    }
    
    
    static ArrayList<Integer> topView(Node root) {
        
        Queue<Info> q=new LinkedList<>();
        HashMap<Integer,Node> hm=new HashMap<>();
        int max=0;
        int min=0;
        q.add(new Info(root,0));
        q.add(null);
        
        while(!q.isEmpty()){
            Info curr=q.remove();
            if(curr==null){
                if(!q.isEmpty()){
                    q.add(null);
                }
            }
            
            else{
                if(!hm.containsKey(curr.hd)){
                    hm.put(curr.hd,curr.node);
                }
                
                if(curr.node.left!=null){
                   q.add(new Info(curr.node.left,curr.hd-1));
                    min=Math.min(min,curr.hd-1);
                }
                
                if(curr.node.right!=null){
                    q.add(new Info(curr.node.right,curr.hd+1));
                    max=Math.max(max,curr.hd+1);
                }
            }
        }
        
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=min;i<=max;i++){
            ans.add(hm.get(i).data);
        }
        
        return ans;
        
    }
}
-------------------------------------------------------------------
Bottom View of Binary Tree
Difficulty: MediumAccuracy: 54.18%Submissions: 259K+Points: 4
Given a binary tree, return an array where elements represent the bottom view of the binary tree from left to right.

Note: If there are multiple bottom-most nodes for a horizontal distance from the root, then the latter one in the level traversal is considered. For example, in the below diagram, 3 and 4 are both the bottommost nodes at a horizontal distance of 0, here 4 will be considered.

                      20
                    /    \
                  8       22
                /   \     /   \
              5      3 4     25
                     /    \      
                 10       14

For the above tree, the output should be 5 10 4 14 25.

Examples :

Input:
       1
     /   \
    3     2
Output: 3 1 2
Explanation: First case represents a tree with 3 nodes and 2 edges where root is 1, left child of 1 is 3 and right child of 1 is 2.

Thus bottom view of the binary tree will be 3 1 2.
Input:
         10
       /    \
      20    30
     /  \
    40   60
Output: 40 20 60 30
Expected Time Complexity: O(n)
Expected Auxiliary Space: O(n)

Constraints:
1 <= Number of nodes <= 105
1 <= Data of a node <= 105


class Solution
{

    class Info{
        Node  node;
        int hd;
        Info(Node node,int hd){
            this.node=node;
            this.hd=hd;
        }
    
    }    

    public ArrayList <Integer> bottomView(Node root)
    {
        
        Queue<Info> q=new LinkedList<>();
        HashMap<Integer,Node> hm=new HashMap<>();
        int min=0;
        int max=0;
        q.add(new Info(root,0));
        q.add(null);
        
        while(!q.isEmpty()){
            Info curr=q.remove();
            if(curr==null){
                if(!q.isEmpty()){
                    q.add(null);
                }
            }
            else{
               
                hm.put(curr.hd,curr.node);
            
                
                if(curr.node.left!=null){
                    q.add(new Info(curr.node.left,curr.hd-1));
                    min=Math.min(min,curr.hd-1);
                }
                
                
                if(curr.node.right!=null){
                    q.add(new Info(curr.node.right,curr.hd+1));
                    max=Math.max(max,curr.hd+1);
                }
                
                
                
            }
            
        }
        
        ArrayList <Integer> ans=new ArrayList <>();
        for(int i=min;i<=max;i++){
            ans.add(hm.get(i).data);
        }
        
        return ans;
        
    }
}
-------------------------------------------------------------------
Left View of Binary Tree
Difficulty: EasyAccuracy: 33.74%Submissions: 497K+Points: 2
Given a Binary Tree, return Left view of it. Left view of a Binary Tree is set of nodes visible when tree is visited from Left side. The task is to complete the function leftView(), which accepts root of the tree as argument. If no left view is possible, return an empty tree.

Left view of following tree is 1 2 4 8.

          1
       /     \
     2        3
   /     \    /    \
  4     5   6    7
   \
     8   

Examples :

Input:
   1
 /  \
3    2
Output: 1 3

Input:

Output: 10 20 40
Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N).


class Tree
{
    public static void solve(Node root,ArrayList<Integer> ans,int level){
        if(root==null){
            return;
        }
        
        if(level==ans.size()){
            ans.add(root.data);
        }
        
        solve(root.left,ans,level+1);
        solve(root.right,ans,level+1);
        
    }
    
    
    ArrayList<Integer> leftView(Node root)
    {
      ArrayList<Integer> ans=new ArrayList<>();
      solve(root,ans,0);
      return ans;
    }
}

//itretive way of left view
ArrayList<Integer> leftView(Node root) {
        ArrayList<Integer> ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            int n=q.size();
            ans.add(q.peek().data);
            for(int i=0;i<n;i++){
                Node curr=q.remove();
                
                if(curr.left!=null){
                    q.add(curr.left);
                }
                
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
        }
        
        return ans;
    }
-------------------------------------------------------------------
Right View of Binary Tree
Difficulty: EasyAccuracy: 65.18%Submissions: 177K+Points: 2
Given a Binary Tree, find Right view of it. Right view of a Binary Tree is set of nodes visible when tree is viewed from right side. Return the right view as a list. 

Right view of following tree is 1 3 7 8.

          1
       /     \
     2        3
   /   \      /    \
  4     5   6    7
    \
     8

Examples :

Input:
       1
    /    \
   3      2
Output: 1 2
Input:
     10
    /   \
  20     30
 /   \
40  60 
Output: 10 30 60
Expected Time Complexity: O(n).
Expected Auxiliary Space: O(Height of the Tree).



class Solution {
    
    public static void solve(Node root,ArrayList<Integer> ans,int level){
        if(root==null){
            return;
        }
        
        if(level==ans.size()){
            ans.add(root.data);
        }
        
        solve(root.right,ans,level+1);
        solve(root.left,ans,level+1);
        
        
    }
    
    ArrayList<Integer> rightView(Node root) {
        ArrayList<Integer> ans=new ArrayList<>();
      solve(root,ans,0);
      return ans;
    }
}


//itretive way of right view
ArrayList<Integer> rightView(Node root) {
        ArrayList<Integer> ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            int n=q.size();
            ans.add(q.peek().data);
            for(int i=0;i<n;i++){
                Node curr=q.remove();
                
                if(curr.right!=null){
                    q.add(curr.right);
                }
                
                if(curr.left!=null){
                    q.add(curr.left);
                }
            }
        }
        
        return ans;
    }
-------------------------------------------------------------------
Construct Tree from Inorder & Preorder
Difficulty: MediumAccuracy: 34.59%Submissions: 197K+Points: 4Average Time: 20m
Given two arrays representing the inorder and preorder traversals of a binary tree, construct the tree and return the root node of the constructed tree.

Note: The output is written in postorder traversal.

Examples:

Input: inorder[] = [1, 6, 8, 7], preorder[] = [1, 6, 7, 8]
Output: [8, 7, 6, 1]
Explanation: The tree will look like

Input: inorder[] = [3, 1, 4, 0, 2, 5], preorder[] = [0, 1, 3, 4, 2, 5]
Output: [3, 4, 1, 5, 2, 0]
Explanation: The tree will look like

Input: inorder[] = [2, 5, 4, 1, 3], preorder[] = [1, 4, 5, 2, 3]
Output: [2, 5, 4, 3, 1]


class Solution {
    public static Node buildTree(int inorder[], int preorder[]) {
       return tree(inorder,preorder,0,preorder.length-1,0);
    }
    
    public static Node tree(int inorder[], int preorder[],int inStart,int inEnd,int index){
        if(inStart>inEnd) return null;
        
        Node root=new Node(preorder[index]);
        int pos=find(inorder,preorder[index],inStart,inEnd);
        
        root.left=tree(inorder,preorder,inStart,pos-1,index+1);
        root.right=tree(inorder,preorder,pos+1,inEnd,index+(pos-inStart)+1);
        
        return root;
    }
    
    public static int find(int inorder[],int target,int start,int end){
        for(int i=start;i<=end;i++){
            if(inorder[i]==target){
                return i;
            }
        }
        return -1;
    }
}

-------------------------------------------------------------------
Binary Tree from Inorder and Postorder
Difficulty: MediumAccuracy: 64.78%Submissions: 83K+Points: 4Average Time: 45m
Given inorder and postorder traversals of a binary tree(having n nodes) in the arrays inorder[] and postorder[] respectively. The task is to construct a unique binary tree from these traversals and return its root.
Driver code will print the preorder traversal of the constructed tree.

Note: The inorder and postorder traversals contain unique values, and every value present in the postorder traversal is also found in the inorder traversal.

Examples:

Input: inorder[] = [4, 8, 2, 5, 1, 6, 3, 7], postorder[] = [8, 4, 5, 2, 6, 7, 3, 1]
Output: [1, 2, 4, 8, 5, 3, 6, 7]
Explanation: For the given postorder and inorder traversal of tree the resultant binary tree will be
          1
       /      \
     2        3
   /  \      /  \
  4   5     6    7
   \
    8

    class Solution {
    Node buildTree(int[] inorder, int[] postorder) {
        return tree(inorder,postorder,0,postorder.length-1,postorder.length-1);
    }
    
    Node tree(int inorder[], int postorder[],int inStart,int inEnd,int index){
        if(inStart>inEnd) return null;
        
        Node root=new Node(postorder[index]);
        int pos=find(inorder,postorder[index],inStart,inEnd);
        
        root.right=tree(inorder,postorder,pos+1,inEnd,index-1);
        root.left=tree(inorder,postorder,inStart,pos-1,index-(inEnd-pos)-1);
        
        return root;
    }
    
    int find(int inorder[],int target,int start,int end){
        for(int i=start;i<=end;i++){
            if(inorder[i]==target){
                return i;
            }
        }
        return -1;
    }
}
-------------------------------------------------------------------


-------------------------------------------------------------------


-------------------------------------------------------------------

-------------------------------------------------------------------

-------------------------------------------------------------------


-------------------------------------------------------------------

-------------------------------------------------------------------


-------------------------------------------------------------------

*/