/* 
Create a binary tree from array
Given an array of integer elements, create a binary tree from this array in level order fashion.

Input Format

The array of elements is given and you have to build the tree from it in level order i.e. elements from left in the array will be filled in the tree level wise starting from level 0.
Do not write the whole program, just complete the function buildTree(int arr[], int n) which takes the array and total number of nodes as parameter and return the root of the binary tree.

Note: Do not read any input from stdin/console. Just complete the functions provided. You can write more functions if required, but just above the given function.
﻿Output Format

Print the tree in inorder.
Constraints

0 <= n <= 10^5
Sample Input

6  // n
1
2
3
4
5
6
Sample Tree

        1
       / \
      2    3
     / \  /
    4  5 6
Sample Output

4 2 5 1 6 3



static Node solve(int a[],int i,int n){
  if(i>=n){
    return null;
  }
  Node t=new Node(a[i]);
  t.left=solve(a,2*i+1,n);
  t.right=solve(a,2*i+2,n);
  return t;
}
static Node buildTree(int arr[], int n) {
  int i=0;
  return solve(arr,i,n);
 // return root;
}
------------------------------------------------------------
Print binary tree with level order traversal
Given a binary tree, print all nodes of the tree in level order traversal. print nodes at same level separated by space and give new line between every level. (There should be no space after last node of each level)

Input

The root node of binary tree is given to you, and you have to complete the function void printLevelWise(Node root) to print the nodes at all levels of the binary tree.
Note: Do not read any input from stdin/console. Just complete the function provided. You can write more functions if required, but just above the given function.

Output

Print the nodes level wise separated by space and new line. There should be no space after last node of each level.
Constraints

0 <= no. of nodes <= 10^5
Sample Input

        1
       / \
      2    3
     / \  /
    4  5 6
Sample Output

1
2 3
4 5 6


static void printLevelWise(Node root) {
    if(root==null){
      return;
    }
    Queue<Node> q=new LinkedList<>();
    q.add(root);
    q.add(null);
    while(!q.isEmpty()){
      Node curr=q.remove();
      if(curr==null){
        if(!q.isEmpty()){
          System.out.println();
          q.add(null);
        }
      }
      else{
        System.out.print(curr.data);
        if(curr.left!=null){
          q.add(curr.left);
        }
        if(curr.right!=null){
          q.add(curr.right);
        }
        if(q.peek()!=null){
          System.out.print(" ");
        }
      }
    }
  }
------------------------------------------------------------
Print nodes at odd levels of the binary tree
Given a binary tree, print all nodes at odd levels of the tree. Assume the root node is at level 1 i.e. odd level.

Complete the function printOdd() which will take the root node of the tree as parameter and print the nodes at odd levels of the binary tree.

Input Format

First Line contains an integer N, denoting the number of integers to follow in the serialized representation of the tree.
Second line contains N space separated integers, denoting the level order description of left and right child of nodes, where -1 signifies a NULL child.
Output Format

Print the nodes at odd levels separated by space.
Constraints

0 <= N <= 10^5
Sample Input

6
1 2 3 4 5 6
Sample Output

1 4 5 6
Explanation:

        1            // level-1
       / \
      2    3
     / \  /
    4  5 6           // level-3




class Result {
  static void printOdd(Node root) {
	if(root==null){
      return;
    }
    Queue<Node> q=new LinkedList<>();
    q.add(root);
    q.add(null);
    int c=0;
    while(!q.isEmpty()){
      Node curr=q.remove();
      if(curr==null){
        c++;
        if(!q.isEmpty()){
          q.add(null);
        }
      }
      else{
        if(c%2==0){
          System.out.print(curr.data+" ");
        }
        if(curr.left!=null){
          q.add(curr.left);
        }
        if(curr.right!=null){
          q.add(curr.right);
        }
      }
    }
  }
}

------------------------------------------------------------

Write iterative version of inorder traversal
Given a binary tree, print it in inorder fashion.

Input Format

The root node of binary tree is given to you, and you have to complete the function void printInorder(Node root) to print the nodes of tree. (The function should use iteration not recursion).
Note: Do not read any input from stdin/console. Just complete the function provided. You can write more functions if required, but just above the given function.

Output Format

Print the nodes of tree separated by space.
Constraints

0 <= N <= 10^5
Sample Input

        1
       / \
      2    3
     / \  /
    4  5 6
Sample Output

4 2 5 1 6 3



static void printInorder(Node root)
{
  if(root==null){
    return;
  }
  printInorder(root.leftChild);
  System.out.print(root.data+" ");
  printInorder(root.rightChild);
}



------------------------------------------------------------

Complete the inorder(), preorder() and postorder() functions for traversal with recursion
Given a binary tree, print it in inorder, preorder and postorder fashion with recursion.

Input

The root node of binary tree is given to you, and you have to complete the function

void inorder(Node root), void preorder(Node root) & void postorder(Node root) 
to print the nodes of tree. (The function should use recursion).

Note: Do not read any input from stdin/console. Just complete the function provided. You can write more functions if required, but just above the given function.

Output

Print the nodes of tree separated by space by all three traversals in new lines.
Sample Input

6
1 2 3 4 5 6
Above input corresponds to below tree.
        1
       / \
      2    3
     / \  /
    4  5 6
Sample Output

4 2 5 1 6 3
1 2 4 5 3 6
4 5 2 6 3 1





static void inorder(Node root)
{
  if(root==null){
    return;
  }
  inorder(root.leftChild);
  System.out.print(root.data+" ");
  inorder(root.rightChild);
}
static void preorder(Node root)
{
  if(root==null){
    return;
  }
  System.out.print(root.data+" ");
  preorder(root.leftChild);
  preorder(root.rightChild);
}
static void postorder(Node root)
{
  if(root==null){
    return;
  }
  postorder(root.leftChild);
  postorder(root.rightChild);
  System.out.print(root.data+" ");
}

------------------------------------------------------------

Count the number of leaf and non-leaf nodes in a binary tree
A leaf in a tree is a node which has no children, i.e. for a binary tree, both its left and right point to NULL. Given a binary tree count the number of leaf and non-leaf nodes in it.

Complete the functions countLeafs() & countNonLeafs() which takes the address of the root node as parameter and return the count of the leaves and non-leafs respectively.

﻿Input Format

First Line contains an integer N, denoting the number of integers to follow in the serialized representation of the tree.
Second line contains N space separated integers, denoting the level order description of left and right child of nodes, where -1 signifies a NULL child.
Output Format

For each test case, print the number of leaf and non-leaf nodes separated by space in new lines.
Constraints

0 <= N <= 10^5
Sample Input

7
1 2 3 4 5 -1 6
Sample Output

3 3
Explanation:

The above tree is:
         1
       /  \
      2    3
     / \    \
    4   5    6




class Result {
  static int c1=0,c2=0;
  static int countLeafs(Node root) {
	if(root==null){
      return c1;
    }
    if(root.left==null && root.right==null){
      c1++;
    }
    countLeafs(root.left);
    countLeafs(root.right);
    return c1;
  }
  static int countNonLeafs(Node root) {
	if(root==null){
      return c2;
    }
    if(root.left!=null || root.right!=null){
      c2++;
    }
    countNonLeafs(root.left);
    countNonLeafs(root.right);
    return c2;
  }
}


------------------------------------------------------------
Print all paths to leaves and their details of a binary tree
Given a binary tree print all paths from root node to leaf nodes with their respective lengths and total number of paths in it.

The root node of binary tree is given to you. A path from root to leaf in a tree is a sequence of adjacent nodes from root to any leaf node.

Do not write the whole program, just complete the function void printAllPaths(Node root) which takes the address of the root as a parameter and print all details as shown below.

Note: If the tree is empty, do not print anything.

Input Format

First line contains an integer N, denoting the number of integers to follow in the serialized representation of the tree.
Second line contains N space separated integers, denoting the level order description of left and right child of nodes, where -1 signifies a NULL child.
Output

For each test case, print the paths with their length and total paths in new lines.
Constraints

0 <= N <= 10^5
0 <= node data <= 1000
Sample Input

        1
       / \
      2    3
     / \  /
    4  5 6
Sample Output

1 2 4 2
1 2 5 2
1 3 6 2
3
Explanation:

First path is from 1 to 4 having 2 edges, so 1 2 4 is path and 2 is length of it. 
Similarly for other two leaf nodes. And at last line total number of paths are printed.





static int count=0;
  static void printAllPaths(Node root) {
    if(root==null){
      return;
    }
    ArrayList<Integer>a=new ArrayList<>();
    Printpath(a,root);
    System.out.println(count);
  }
static void Printpath(ArrayList<Integer>a,Node root){
  if(root==null){
    return;
  }
  a.add(root.data);
  if(root.left==null && root.right==null){
    for(int i=0;i<a.size();i++){
    System.out.print(a.get(i)+" ");
  }
  System.out.println(a.size()-1);
    count++;
  }
  else{
    Printpath(new ArrayList<>(a),root.left);
    Printpath(new ArrayList<>(a),root.right);
  }
}

------------------------------------------------------------
Find the right node of a given node
Given a binary tree and a key in it, find the node which is on same level and on right of this given key. If no such node present return -1.

Complete the function findRightSibling() which takes the address of the root node and an integer key as a parameter and return the right sibling (if exists, otherwise return -1).

﻿Input Format

First Line contains an integer N, denoting the number of integers to follow in the serialized representation of the tree.
Second line contains N space separated integers, denoting the level order description of left and right child of nodes, where -1 signifies a NULL child.
Third line contains an integer key whose right sibling is desired.
Output Format

Print the right sibling if any, otherwise print -1.
Sample Input 1

7
1 2 3 5 -1 -1 8
5
Sample Output 1

8
Explanation 1

        1
       / \
      2    3
     /      \
    5        8
﻿For 5, the right sibling is 8.
Sample Input 2

6
1 2 3 5 6 7
7
Sample Output 2

-1
Explanation 2

        1
       / \
      2    3
     / \  /
    5  6 7
For 7, there is no node present in its right on the same level.
Therefore, the answer is -1.

class Result {
  static int findRightSibling(Node root, int key) {
    if(root==null){
      return -1;
    }
    Queue<Node> q=new LinkedList<>();
    q.add(root);
    while(!q.isEmpty()){
      int n=q.size();
      boolean f=false;
      for(int i=0;i<n;i++){
        Node curr=q.remove();
        if(f){
          return curr.data;
        }
        if(curr.data==key){
          f=true;
        }
        if(curr.left!=null){
          q.add(curr.left);
        }
        if(curr.right!=null){
          q.add(curr.right);
        }
      }
    }
    return -1;
  }
}


------------------------------------------------------------
Convert a binary tree into its mirror tree
Given a binary tree, convert it in its mirror image. Mirror of a Binary Tree is another Binary Tree in which left and right children of all non-leaf nodes are interchanged.

Input

The root node of binary tree is given to you. Do not write the whole program, just complete the function findMirror(Node root) which takes the address of the root as a parameter and change the tree in its mirror image.
Note: Do not read any input from stdin/console. Just complete the function provided. You can write more functions if required, but just above the given function.

Output

For each test case, print the tree in inorder in new lines.
Sample Input

        1
       / \
      2    3
     / \  /
    4  5 6
Sample Output

       1
      / \
     3   2
     \  / \
      6 5  4

Inorder: 3 6 1 5 2 4



static Node findMirror(Node root) {
  if(root==null){
    return null;
  }
  Node left=findMirror(root.left);
  Node right=findMirror(root.right);
  root.left=right;
  root.right=left;
  return root;
}


------------------------------------------------------------
Print nodes in a top view of Binary Tree
Given a binary tree, print top view of the binary tree.

For Example:



Top view of the given binary tree will be: 4 2 1 3 9

Complete the function printTopView() which takes the address of the root as a parameter and print the tree from top view.

Input Format

First Line contains an integer N, denoting the number of integers to follow in the serialized representation of the tree.
Second line contains N space separated integers, denoting the level order description of left and right child of nodes, where -1 signifies a NULL child.
Output Format

For each test case, print the tree nodes from top view separated by space in new lines.
Sample Input

7
1 2 3 4 5 -1 6
Sample Output

4 2 1 3 6
Explanation:

        1
       / \
      2   3
     / \   \
    4   5   6
So, from top, first node is the left most node i.e. 4, and then 2, 1, 3 and lastly 6.
﻿Note that, 5 is not seen from top.




class Result {
  static class Info{
        Node node;
        int hd;
        public Info(Node node,int hd){
            this.node=node;
            this.hd=hd;
        }
    }
  static void printTopView(Node root) {
    if(root==null){
      return;
    }
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
}



------------------------------------------------------------
Find out if the tree can be folded or not
Given a binary tree, find out if it can be folded or not. 
A tree can be folded if left and right sub-trees of root are structure wise mirror images.

Note: A tree with zero or one node is foldable inherently.

Complete the function isFoldable() which takes the address of the root as parameter and return 1 if tree can be folded and 0 otherwise.

Input Format

First line contains an integer T, denoting the number of test cases.
For each test case:
  First Line contains an integer N, denoting the number of integers to follow in the serialized representation of the tree.
  Second line contains N space separated integers, denoting the level order description of left and right child of nodes, where -1 signifies a NULL child.
Output Format

For each test case, print 1 if tree is foldable and 0 otherwise, in new lines.
Sample Input 1

      1
     / \
    2   3
Sample Output 1

1
Sample Input 2

        1
       / \
      2    3
     / \ 
    4  5
Sample Output 2

0

class Result {
  static int solve(Node a,Node b){
    if(a==null && b==null){
      return 1;
    }
    if(a==null || b==null){
      return 0;
    }
    return solve(a.left,b.right) & solve(a.right,b.left);
  }
  static int isFoldable(Node root) {
	if(root==null){
      return 1;
    }
    return solve(root.left,root.right);
  }
}





------------------------------------------------------------
Given two trees are identical or not
Given two binary trees, find out both are same or not. Two trees are considered same if they have same nodes and same structure.

So complete the function areSameTree() which takes the address of the root nodes of two trees as parameters and return 1 if both are same and 0 otherwise.

Input Format

The first line contains the number of testcases, T.
For each Testcase:
  First line contains the number of nodes in first tree and second line contains the node labels in level-wise order.
  Third line contains the number of nodes in second tree and fourth line contains the node labels in level-wise order.
Output Format

For each test case, print 1 if both tree are same and 0 otherwise.
Sample Input 1

1 // Number of testcases
3
1 2 3
3
1 2 3
Sample Output 1

1
Explanation 1

      1               1
     / \             / \
    2   3           2   3
As both the trees have same number of nodes and all same labels so trees are same.
Sample Input 2

1 // Number of testcases
5
1 2 3 4 5
3
1 2 3
Sample Output 2

0
Explanation 2

      1                1
     / \              / \
    2   3            2   3
   / \ 
  4   5

In this case, trees are not same




 static int areSameTree(Node t1, Node t2) {
    if(t1==null && t2==null){
      return 1; 
    }
    if(t1==null || t2==null){
      return 0; 
    }
    if(t1.data!=t2.data){
      return 0; 
    }
    return areSameTree(t1.left,t2.left) & areSameTree(t1.right,t2.right);
  }


------------------------------------------------------------

Find maximum depth or height of a binary tree
Height of a tree is defined as the length of the longest downward path from root node to any leaf. If tree is empty, height is considered as -1 and for tree with only one node height is considered as 0.

Your task is that given a binary tree, find out the maximum depth of tree (also called height of tree).

Complete the function treeHeight() which takes the address of the root node of tree as parameter and return the height of the tree.

Input Format

First Line contains an integer N, denoting the number of integers to follow in the serialized representation of the tree.
Second line contains N space separated integers, denoting the level order description of left and right child of nodes, where -1 signifies a NULL child.
Output Format

For each test case, print the height of tree.
Constraints

0 <= N <= 10^5
Sample Input

5
1 2 3 4 5 
Sample Output

2
Explanation:

        1
       / \
      2   3
     / \ 
    4  5 
The longest path are 1



class Result {
  static int treeHeight(Node root) {
	if(root==null){
      return -1;
    }
    int l=treeHeight(root.left);
    int r=treeHeight(root.right);
    return Math.max(l,r)+1;
  }
}

------------------------------------------------------------


Binary Search Tree
Binary Search Tree
Binary Search Tree
Binary Search Tree
Binary Search Tree
Binary Search Tree
Binary Search Tree
Binary Search Tree
Binary Search Tree
Binary Search Tree


------------------------------------------------------------

Binary Search Tree

Given binary tree is binary search tree or not
A binary tree is called binary search tree if it holds following three properties: -

a. The left subtree of a node contains nodes whose keys are less than that node’s key.
b. The right subtree of a node contains nodes whose keys are greater than that node’s key.
c. Both the left and right subtrees must also be binary search trees.
Your task is that, given a binary tree check if it is binary search tree or not. Complete the function isBinarySearchTree() which takes the address of the root node of tree as parameter and return 1 if the tree is binary search tree and 0 otherwise.

Input Format

First line contains an integer T, denoting the number of test cases.
For each test case:
  First Line contains an integer N, denoting the number of integers to follow in the serialized representation of the tree.
  Second line contains N space separated integers, denoting the level order description of left and right child of nodes, where -1 signifies a NULL child.
Output Format

For each test case, print 0 or 1, in new lines.
Constraints

1 <= T <= 10
0 <= N <= 10^5﻿
Sample Input

1  // testcases
7  // N
4 2 7 1 3 5 8
Sample Output

1
Explanation:

Given tree is: 
        4
      /   \
     2     7
   / \    / \
  1   3  5   8
Which satisfies the property of binary search tree, so return value is 1.



class Result {
  static boolean solve(Node root,Node min,Node max){
    if(root==null){
      return true;
    }
    if(min!=null && root.data<=min.data){
      return false;
    }
    if(max!=null && root.data >= max.data){
      return false;
    }
    return solve(root.left,min,root) && solve(root.right,root,max);
  }
  static int isBinarySearchTree(Node root) {
    if(solve(root,null,null)){
      return 1;
    }
    return 0;
  }
}

------------------------------------------------------------

Find the kth smallest element in the binary search tree
Given a binary search tree and a number k, print the kth smallest number in tree.

Input

The root node of binary search tree is given to you. Do not write the whole program, just complete the function int kSmallest(Node root, int k) which takes the address of the root node of tree and an integer k as parameters and return the kth smallest number from tree.
Note: Do not read any input from stdin/console. Just complete the function provided. You can write more functions if required, but just above the given function.

Output

Print the kth smallest number from the binary search tree.
Sample Input

        4
       / \
      2   7
     / \  / \
    1  3 5  8

k = 4
k = 6
Sample Output

4
7






 static int kSmallest(Node root, int k) {
    if(root==null && k==0){
      return 0;
    }
    if(root==null){
      return -1;
    }
    int  left=kSmallest(root.left,k);
    if(left!=-1){
      return left;
    }
    c++;
    if(c==k){
      return root.data;
    }
    return kSmallest(root.right,k);
  }

------------------------------------------------------------
Convert Level Order Traversal to BST
Given an array of integer elements representing the level order traversal of a binary search tree, create the binary search tree from this array.

Write the function buildSearchTree() which takes the array and total number of nodes as parameters and return the root of the binary search tree.

Input Format

First line contains the number of elements in the array(containing the level order traversal) and second line contains the elements separated by space.
﻿Output Format

Print the tree with inorder traversal.
Sample Input

7
4 2 7 1 3 5 8
Sample Output

1 2 3 4 5 7 8
Explanation:

The tree from above level order traversal will be:
       4
      / \
     2   7
    / \  / \
   1  3 5  8



import java.util.*;
class Result {
  static Node buildSearchTree(int t[], int n) {
   if (n == 0)
      return null;

        Node root = new Node(t[0]);
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;
        
        while (i < n) {
            Node current = queue.poll();
            if (i < n && t[i] < current.data) {
                current.leftChild = new Node(t[i]);
                queue.add(current.leftChild);
                i++;
            }
            if (i < n && t[i] > current.data) {
                current.rightChild = new Node(t[i]);
                queue.add(current.rightChild);
                i++;
            }
        }
        return root;
  }
}

------------------------------------------------------------

Find a lowest common ancestor of a given two nodes in a binary search tree
The Lowest Common Ancestor (LCA) of two nodes in a Binary Search Tree (BST) is defined as the deepest node from the root which lies in the path of both the nodes from the root.

So, given a binary search tree, find the Lowest Common Ancestor of two given nodes in it.

Complete the function lowestCommonAncestor() which takes the address of the root node of tree and two integer keys as parameters and return the lowest common ancestor of these two nodes (For empty tree return -1).

You can assume that both the given keys are present in the tree and are different from each other.

Input Format

First line contains an integer N, denoting the number of integers to follow in the serialized representation of the tree.
Second line contains N space separated integers, denoting the level order description of left and right child of nodes, where -1 signifies a NULL child.
Third line contains two integers k1 and k2 separated by space.
Output Format

Print the lowest common ancestor of given two nodes from the binary search tree.
Constraints

0 <= N <= 10^5
Sample Input

7
4 2 7 1 3 5 8
1 5
Sample Output

4
Explanation:

       4
      /  \
     2    7
    / \  / \
   1  3 5   8



class Result {
  static int lowestCommonAncestor(Node root, int k1, int k2) {
    if(root==null){
      return -1;
    }
    if(k1 < root.data && k2 < root.data){
      return lowestCommonAncestor(root.left,k1,k2);
    }
    if(k1 > root.data && k2 > root.data){
      return lowestCommonAncestor(root.right,k1,k2);
    }
    return root.data;
  }
}

------------------------------------------------------------
Find the floor and ceil of a key in binary search tree
Given a binary search tree, find the floor and ceil of an key in the tree. They are defined as below:

floor value of k: largest node value which is smaller than or equal to k.
ceil value of k: smallest node value which is greater than or equal to k.
Complete the functions floorOf() & ceilOf() which takes the address of the root node of tree and an integer key as parameters and return the floor and ceil of that key respectively, and -1 if not found.

Input Format:

First line contains the number of nodes, second line contains the node labels in level-wise order. Third line contains an integer k whose floor and ceil are desired.
Output Format:

Print the floor and ceil node values of given key from the binary search tree. If not exists, print -1.
Sample Input

7
4 2 7 1 3 5 8
2
Sample Output

2 2
Explanation:

        4
       / \
      2   7
     / \  / \
     1  3 5  8
For 2, As 2 is itself present in the tree so 2 will be the floor and ceil of itself.
Furthermore, for 6, the largest node value which is smaller than or equal to 6 is 5, and smallest node value which is greater than or equal to 6 is 7.
And for 9, the largest node value which is smaller than or equal to 9 is 8, and smallest node value which is greater than or equal to 9 is not in the tree so -1 will be printed.




class Result {
  static int floorOf(Node root, int key) {
	int f=-1;
    while(root!=null){
      if(root.data==key){
        return root.data;
      }
      else if(root.data > key){
        root=root.leftChild;
      }
      else{
        f=root.data;
        root=root.rightChild;
      }
    }
    return f;
  }
  static int ceilOf(Node root, int key) {
	int c=-1;
    while(root!=null){
      if(root.data==key){
        return root.data;
      }
      else if(root.data < key){
        root=root.rightChild;
      }
      else{
        c=root.data;
        root=root.leftChild;
      }
    }
    return c;
  }
}

------------------------------------------------------------
Heap
Heap
Heap
Heap
HeapHeap
HeapHeap


------------------------------------------------------------
Find K largest elements in array
Given an array of integer elements and an integer k, print the k largest elements from array separated by space in descending sorted order. For example, if array a = [2, 56, 3, 87, 42, 1, 45, 8, 2, 98] and k=3 then output must be 98 87 56.

Input Format:

First line of input contain T = number of test cases. Each test case contain two lines, in first line, total number of elements in array and value of k are provided and next line will contain the elements.
The array of numbers and integer k is given to you. 
Note: Do not write the whole program, just complete the functions void printKLargest(int array[], int k) which takes the array and integer k as parameters and print the k largest elements in descending order separated by space.

Note: Do not read any input from stdin/console. Just complete the functions provided. You can write more functions if required, but just above the given function.

Output Format:

Print the k largest element in descending order separated by space.
Do not print the space after last element.
Sample Input

2
10 3
2 56 3 87 42 1 45 8 2 98
6 2
1 87 2 67 3 45
Sample Output

98 87 56
87 67





static void printKLargest(int array[], int n, int k){
	Arrays.sort(array);
  for(int i=n-1;i>=n-k;i--){
    System.out.print(array[i]);
    if(i>n-k){
      System.out.print(" ");
    }
  }
}

------------------------------------------------------------
Convert min Heap to max Heap
Given array representation of a min-heap convert it in a max-heap representation. For example, if array a = [13 15 19 16 18 120 110 112 118] the array must be modified as a = [120 118 110 112 18 19 13 15 16].

The array of numbers is given to you. Do not write the whole program, just complete the functions void modifyMintoMax(int array[], int n) which takes the array and total number of elements n as parameters and modify the array elements with heapify() to convert it in max-heap.

Note: Do not read any input from stdin/console. Just complete the functions provided. You can write more functions if required, but just above the given function.

Input Format:

First line of input contain T = number of test cases. 
Each test case contain two lines, in first line, total number of elements in array and next line will contain the elements.
Output Format:

For each test case, print the max-heap elements separated by space in new lines.
Sample Input

2
9
13 15 19 16 18 120 110 112 118
6
1 2 3 4 5 6
Sample Output

120 118 110 112 18 19 13 15 16
6 5 3 4 2 1




static void modifyMintoMax(int array[], int n)
{
  for(int i=n/2;i>=0;i--){
    heapify(array,n,i);
  }
}
static void heapify(int array[],int n,int i){
  int left=2*i+1;
  int right=2*i+2;
  int m=i;
  if(left < n && array[left] > array[m]){
    m=left;
  }
  if(right < n && array[right] > array[m]){
    m=right;
  }
  if(m!=i){
    int t=array[i];
    array[i]=array[m];
    array[m]=t;
    heapify(array,n,m);
  }
}



------------------------------------------------------------
Check if a given tree is max-heap or not
A max-heap is a kind of tree which must satisfy the property as “Every node’s value should be greater than its children’s value”.

Your task is given level wise array representation of a binary tree, check if it is a max-heap or not.

Complete the functions isMaxHeap() which takes the array and total number of elements n as parameters and return 1 if array represents a max-heap and 0 otherwise.

Input Format

First line of input contain T = number of test cases. Each test case contain two lines, in first line, total number of elements in tree and next line will contain the elements in level order fashion.
Output Format

For each test case, print 1 if array represents max-heap or 0 otherwise in new lines.
Sample Input

2
9
120 118 110 112 18 19 13 15 16
6
1 2 3 4 5 6
Sample Output

1
0
Explanation:

First tree is like below:
           120 
          /   \
       118     110 
      /   \    /  \
    112   18  19   13 
    / \
  15   16
It satisfies the properties of max-heap.


static int isMaxHeap(int array[], int n){
  for(int i=0;i<n;i++){
    if(2*i+1 < n){
      if(array[2*i+1] > array[i]){
        return 0;
      }
    }
    if(2*i+2 < n){
      if(array[2*i+1] > array[i]){
        return 0;
      }
    }
  }
  return 1;
}



------------------------------------------------------------

Connect the sticks of different lengths with minimum cost
Given n sticks of different length you have to connect them. The cost of connecting sticks is the sum of their length. You have to find the minimum cost for connecting all sticks. For example, if 3 sticks are there having length respectively 3, 6, 1 then we can connect them in many ways like:

Connect 3 and 6 (Cost 9), then we have 2 sticks of length 9 and 1 connect them (cost 10), So total cost is 19.
Connect 3 and 1 (Cost 4), then we have 2 sticks of length 4 and 6 connect them (cost 10), So total cost is 14.
So your function must return 14 in this case.

Complete the function connectCost() which takes the array and total number of sticks as input and returns the minimum cost of connecting all these sticks.

Input Format

First line of input contain T = number of test cases. 
Each test case contain two lines, in first line, total number of sticks and next line will contain the lengths of each stick.
Output Format

For each test case, print the total cost of connecting all sticks in new lines.
Constraints

1 <= T <= 10
1 <= n <= 10^5
1 <= lengths[i] <= 1000
Sample Input

2
3
3 6 1
4
4 2 3 6
Sample Output

14
29





class Result
{
  static int connectCost(int lengths[], int n){
	PriorityQueue<Integer> p=new PriorityQueue<>();
    for(int i=0;i<n;i++){
      p.add(lengths[i]);
    }
    int s=0;
    while(p.size() > 1){
      int a=p.remove();
      int b=p.remove();
      s+=a+b;
      p.add(a+b);
    }
    return s;
  }
}




------------------------------------------------------------










------------------------------------------------------------






------------------------------------------------------------





------------------------------------------------------------







------------------------------------------------------------








*/