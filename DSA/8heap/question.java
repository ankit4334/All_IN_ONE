/*
1.NearBy Car-we are given N points in a 2d plane which are location of N cars.
If we are at the origin, print the nearest K cars.

C0(3,3)
C1(5,-1)   K=2
C2(-2,4)

ANS=C0 & C2

*/

/* 
import java.util.PriorityQueue;
import java.util.*;

public class question {
    static class Point implements Comparable<Point>{
        int x;
        int y;
        int distSq;
        int idx;
        public Point(int x,int y,int distSq,int idx){
            this.x=x;
            this.y=y;
            this.distSq=distSq;
            this.idx=idx;
        }
        @Override
        public int compareTo(Point p2){
            return this.distSq-p2.distSq;
        }
    }
    public static void main(String[] args) {

        int pts[][]={{3,3},{5,-1},{-2,4} };
        int k=2;

        PriorityQueue<Point> pq=new PriorityQueue<>();
        for(int i=0;i<pts.length;i++){
            int distSq=pts[i][0]*pts[i][0]+pts[i][1]*pts[i][1];
            pq.add(new Point(pts[i][0],pts[i][1],distSq,i));
        }

        //print nearest k cars
        for(int i=0;i<k;i++){
            System.out.println("C"+pq.remove().idx);
        }
        
    }
    
}
*/

















/* 
 * Connect N Ropes:-Given are N ropes of diffrent lengths,the taak is to connect theae ropes into one rope with
 minumum cost,such that the cost to connect two ropes is equal to the sum of their lengths.
 
 ropes={4,3,2,6}
 ans=29

 connect 2 & 3 [5]
 connect 5 & 4 [9]
 connect 9 & 6 [15]

*/

/*
import java.util.*;

public class question {
    public static void main(String[] args) {

        int ropes[]={2,3,3,4,6};

        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<ropes.length;i++){
            pq.add(ropes[i]);
        }

        int cost =0;
        while(pq.size() > 1){
            int min=pq.remove();
            int min2=pq.remove();
            cost+=min+min2; 
            pq.add(min+min2);

        }

        System.out.println("cost of connecting n ropes = "+cost);
        
    }
    
}

*/










/*
//Question->Weakest Soldier:-we are given an mxn binary matrix of 1's(soliers) and O's(cililians).
The soldiers are positioned in front of the civilians.That is all the 1's will appear to the left of all
the O's in each row.
A row i is weaker than a row j if one of the following is true:
*The number of soldiers in row i is less than the number of soldier in row j.
*Both rows have the same number of soldiers and i<j.
Find the K weakest rows.

m=4,n=4,k2     ans =row0 & row2
1 0 0 0
1 1 1 1 
1 0 0 0 
1 0 0 0 


*/ 

/* 

 import java.util.*;
 public class question {

    static class Row implements Comparable<Row>{
        int soldier;
        int idx;
        public Row(int soldier,int idx){
            this.soldier=soldier;
            this.idx=idx;
        }
        @Override
        public int compareTo(Row r2){
            if(this.soldier==r2.soldier){
                return this.idx-r2.idx;
            }else{
                return this.soldier-r2.soldier;
            }
        }
    }
    public static void main(String[] args) {

        int army[][]={{1,0,0,0},
                      {1,1,1,1},
                      {1,0,0,0},
                      {1,0,0,0}};

        int k=2;


        PriorityQueue<Row> pq=new PriorityQueue<>();
        for(int i=0;i<army.length;i++){
            int count=0;
            for(int j=0;j<army[0].length;j++){
                count+=army[i][j]==1?1:0;
            }
            pq.add(new Row(count, i));
        }

        for(int i=0;i<k;i++){
            System.out.println("R"+pq.remove().idx);   
        }
        
    }
    
}

*/













/* 
 *Question:-Sliding Window Maximum
 Maximum of all subarrays of size k




import java.util.*;
public class question {

   static class Pair implements Comparable<Pair>{
       int val;
       int idx;
       public Pair(int val,int idx){
           this.val=val;
           this.idx=idx;
       }
       @Override
       public int compareTo(Pair p2){
           return p2.val-this.val;
       }
   }
   public static void main(String[] args) {
    int arr[]={1,3,-1,-3,5,3,6,7};
    int k=3; //window size
    int res[]=new int[arr.length-k+1]; //n=k+1;
    PriorityQueue<Pair> pq=new PriorityQueue<>();

    //1st window
    for(int i=0;i<k;i++){
        pq.add(new Pair(arr[i],i));
    }
    
    res[0]=pq.peek().val;

    for(int i=k;i<arr.length;i++){
        while(pq.size()> 0 && pq.peek().idx <=(i-k)){
            pq.remove();
        }
        pq.add(new Pair(arr[i],i));
        res[i-k+1]=pq.peek().val;
    }

    for(int i=0;i<res.length;i++){
        System.out.print(res[i]+" ");
    }
    System.out.println();

       
   }
   
}
*/




//---------------------------------------------------------
//---------Coder Army Heap Question Practice---------------
//---------------------------------------------------------



/*
-----------------------------------------------------------
Height of Heap
Difficulty: BasicAccuracy: 57.74%Submissions: 24K+Points: 1
Given a Binary Heap of size N in an array arr[]. Write a program to calculate the height of the Heap.

Note: Return 1 if the N is 1.

Example 1:

Input: N = 6
arr = {1, 3, 6, 5, 9, 8}
Output: 2
Explaination: The tree is like the following
        (1)
       /   \
    (3)    (6)
    / \     /
  (5) (9) (8)


static int heapHeight(int N, int arr[]){
        int c=0;
        while(N>1){
            N=N/2;
            c++;
        }
        return c;
}

-----------------------------------------------------------
Minimum Cost of ropes
Difficulty: EasyAccuracy: 42.73%Submissions: 234K+Points: 2
Given an array, arr[] of rope lengths, connect all ropes into a single rope with the minimum total cost. The cost to connect two ropes is the sum of their lengths. 

Input: arr[] = [4, 3, 2, 6]
Output: 29


public int minCost(int[] arr) {
        int ans=0;
        PriorityQueue<Integer> p=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            p.add(arr[i]);
        }
        
        while(p.size()>1){
            int a=p.remove();
            int b=p.remove();
            ans+=a+b;
            p.add(a+b);
        }
        
        return ans;
}
-----------------------------------------------------------
Magician and Chocolates
Programming
Heaps And Maps
medium
31.0% Success

Problem Description

Given N bags, each bag contains Bi chocolates. There is a kid and a magician. In one unit of time, kid chooses a random bag i, eats Bi chocolates, then the magician fills the ith bag with floor(Bi/2) chocolates.

Find the maximum number of chocolates that kid can eat in A units of time.

NOTE: 

floor() function returns the largest integer less than or equal to a given number.
Return your answer modulo 109+7

Example Input
Input 1:

 A = 3
 B = [6, 5]
Input 2:

 A = 5
 b = [2, 4, 6, 8, 10]


Example Output
Output 1:

 14
Output 2:

 33

import java.util.*;

public class Solution {
    public int nchoc(int A, ArrayList<Integer> B) {
        int MOD = 1000000007;
        long ans = 0;
        
        PriorityQueue<Integer> p = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int i = 0; i < B.size(); i++) {
            p.add(B.get(i));
        }
        
        for (int i = 0; i < A; i++) {
            if (p.isEmpty()) break;
            
            int ele = p.remove();
            ans = (ans + ele) % MOD;
            
            p.add(ele / 2);
        }
        
        return (int) ans;
    }
}

-----------------------------------------------------------

1046. Last Stone Weight
Solved
Easy
Topics
Companies
Hint
You are given an array of integers stones where stones[i] is the weight of the ith stone.

We are playing a game with the stones. On each turn, we choose the heaviest two stones and smash them together. Suppose the heaviest two stones have weights x and y with x <= y. The result of this smash is:

If x == y, both stones are destroyed, and
If x != y, the stone of weight x is destroyed, and the stone of weight y has new weight y - x.
At the end of the game, there is at most one stone left.

Return the weight of the last remaining stone. If there are no stones left, return 0.

 

Example 1:

Input: stones = [2,7,4,1,8,1]
Output: 1
class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> p=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<stones.length;i++){
            p.add(stones[i]);
        }

        while(p.size()>1){
            int a=p.remove();
            int b=p.remove();

            if(a<b){
                p.add(b-a);
            }
            else{
                p.add(a-b);
            }

        }
        return p.peek();
    }
}

-----------------------------------------------------------
2558. Take Gifts From the Richest Pile
Solved
Easy
Topics
Companies
Hint
You are given an integer array gifts denoting the number of gifts in various piles. Every second, you do the following:

Choose the pile with the maximum number of gifts.
If there is more than one pile with the maximum number of gifts, choose any.
Reduce the number of gifts in the pile to the floor of the square root of the original number of gifts in the pile.
Return the number of gifts remaining after k seconds.

 

Example 1:

Input: gifts = [25,64,9,4,100], k = 4
Output: 29
Explanation: 
The gifts are taken in the following way:
- In the first second, the last pile is chosen and 10 gifts are left behind.
- Then the second pile is chosen and 8 gifts are left behind.
- After that the first pile is chosen and 5 gifts are left behind.
- Finally, the last pile is chosen again and 3 gifts are left behind.
The final remaining gifts are [5,8,9,4,3], so the total number of gifts remaining is 29.
Example 2:

Input: gifts = [1,1,1,1], k = 4
Output: 4

import java.util.*;
class Solution {
    public long pickGifts(int[] gifts, int k) {
        
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());

        for(int gf:gifts){
            pq.add(gf);
        }
        while(k!=0){
            int t=(int) Math.sqrt(pq.remove());
            pq.add(t);
            k--;
        }

        long ans = 0;
        while (!pq.isEmpty()) {
            ans += pq.remove();
        }
        return ans;
    }
}


-----------------------------------------------------------
Profit Maximisation
Programming
Heaps And Maps
easy
78.6% Success
Given an array A , representing seats in each row of a stadium. You need to sell tickets to B people.

Each seat costs equal to the number of vacant seats in the row it belongs to. The task is to maximize the profit by selling the tickets to B people.

Example Input
Input 1:

A = [2, 3]
B = 3
Input 2:

A = [1, 4]
B = 2


Example Output
Output 1:

7
Output 2:

7



public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        int ans=0;
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        
        for(int a:A){
            pq.add(a);
        }
        
        while(B!=0){
            int ele=pq.remove();
            ans+=ele;
            pq.add(ele-1);
            B--;
        }
        
        return ans;

    }
}

-----------------------------------------------------------
215. Kth Largest Element in an Array
Solved
Medium
Topics
Companies
Given an integer array nums and an integer k, return the kth largest element in the array.

Note that it is the kth largest element in the sorted order, not the kth distinct element.

Can you solve it without sorting?

 

Example 1:

Input: nums = [3,2,1,5,6,4], k = 2
Output: 5
Example 2:

Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
Output: 4



class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<k;i++){
            pq.add(nums[i]);
        }
        for(int i=k;i<nums.length;i++){
            if(pq.peek()<nums[i]){
                pq.remove();
                pq.add(nums[i]);
            }
           
        }
        
        return pq.peek();
    }
    
}
-----------------------------------------------------------
Kth Smallest
Difficulty: MediumAccuracy: 35.17%Submissions: 676K+Points: 4Average Time: 25m
Given an array arr[] and an integer k where k is smaller than the size of the array, the task is to find the kth smallest element in the given array.

Follow up: Don't solve it using the inbuilt sort function.

Examples :

Input: arr[] = [7, 10, 4, 3, 20, 15], k = 3
Output:  7
Explanation: 3rd smallest element in the given array is 7.
Input: arr[] = [2, 3, 1, 20, 15], k = 4 
Output: 15




class Solution {
    public static int kthSmallest(int[] arr, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<k;i++){
            pq.add(arr[i]);
        }
        for(int i=k;i<arr.length;i++){
            if(pq.peek()>arr[i]){
                pq.remove();
                pq.add(arr[i]);
            }
        }
        
        return pq.peek();
    }
}

-----------------------------------------------------------
Kth Largest in a Stream
Difficulty: MediumAccuracy: 31.59%Submissions: 83K+Points: 4Average Time: 20m
Given an input stream arr[] of n integers. Find the Kth largest element (not Kth largest unique element) after insertion of each element in the stream and if the Kth largest element doesn't exist, the answer will be -1 for that insertion.  return a list of size n after all insertions.

Example 1:

Input:
k = 4, n = 6
arr[] = {1, 2, 3, 4, 5, 6}
Output:
-1 -1 -1 1 2 3
Explanation:
k = 4
For 1, the 4th largest element doesn't
exist so answer will be -1.
For 2, the 4th largest element doesn't
exist so answer will be -1.
For 3, the 4th largest element doesn't
exist so answer will be -1.
For 4, the 4th largest element is 1.
For 5, the 4th largest element is 2.
for 6, the 4th largest element is 3.
Example 2:

Input:
k = 1, n = 2
arr[] = {3, 4}
Output:
3 4 
Explanation: 
For the 1st and 2nd element the 1st largest 
element is itself.




static int[] kthLargest(int k, int[] arr, int n) {
        int ans[]=new int[n];
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        
        for(int i=0;i<n;i++){
            pq.add(arr[i]);
            
            if(pq.size() > k){
                pq.remove();
            }
            
            if(pq.size()>=k){
                ans[i]=pq.peek();
            }
            else{
                ans[i]=-1;
            }
           
        }
        return ans;
    }

-----------------------------------------------------------
Sum of elements between k1'th and k2'th smallest elements
Difficulty: EasyAccuracy: 32.02%Submissions: 46K+Points: 2
Given an array A[] of N positive integers and two positive integers K1 and K2. Find the sum of all elements between K1th and K2th smallest elements of the array. It may be assumed that (1 <= k1 < k2 <= n).

 

Example 1:

Input:
N  = 7
A[] = {20, 8, 22, 4, 12, 10, 14}
K1 = 3, K2 = 6
Output:
26

//method-01

public static long sumBetweenTwoKth(long A[], long N, long K1, long K2)
    {
        long sum=0;
        Arrays.sort(A);
        for(int i=(int)K1;i<(int)K2-1;i++){
            sum+=A[i];
        }
        
        return sum;
    }

//method-02
public static long sumBetweenTwoKth(long A[], long N, long K1, long K2)
    {
        //create two Max heap
        PriorityQueue<Long> pq1=new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Long> pq2=new PriorityQueue<>(Collections.reverseOrder());
        
        int k1 = (int) K1; // Convert long to int
        int k2 = (int) K2;
        
        //insert k1 element into pq1
        for(int i=0;i<k1;i++){
            pq1.add(A[i]);
        }
        
        //insert k2-1 elemnt into pq2
        for(int i=0;i<k2-1;i++){
            pq2.add(A[i]);
        }
        
        //find k1 smallest element in array
        for(int i=(int)K1;i<N;i++){
            if(pq1.peek()>A[i]){
                pq1.remove();
                pq1.add(A[i]);
            }
        }
        
        //find k2-1 smallest element in array;
        for(int i=(int)K2-1;i<N;i++){
            if(pq2.peek()>A[i]){
                pq2.remove();
                pq2.add(A[i]);
            }
        }
        
        //sum of firt max heap
        long sum1=0,sum2=0;
        while(!pq1.isEmpty()){
            sum1+=pq1.remove();
        }
        
        
        //sum of secon max heap
        while(!pq2.isEmpty()){
            sum2+=pq2.remove();
        }
        
        
        return sum2-sum1;
        
    }

-----------------------------------------------------------
Merge two binary Max heaps
Difficulty: EasyAccuracy: 58.65%Submissions: 51K+Points: 2
Given two binary max heaps as arrays, merge the given heaps to form a new max heap.

 

Example 1:

Input  : 
n = 4 m = 3
a[] = {10, 5, 6, 2}, 
b[] = {12, 7, 9}
Output : 
{12, 10, 9, 2, 5, 7, 6}

class Solution{
    public int[] mergeHeaps(int[] a, int[] b, int n, int m) {
        int ans[]=new int[n+m];
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<n;i++){
            pq.add(a[i]);
        }
        
        for(int i=0;i<m;i++){
            pq.add(b[i]);
        }
        
        for(int i=0;i<ans.length;i++){
            ans[i]=pq.remove();
        }
        
        return ans;
    }
}

-----------------------------------------------------------
Is Binary Tree Heap
Difficulty: MediumAccuracy: 34.41%Submissions: 113K+Points: 4
You are given a binary tree, and the task is to determine whether it satisfies the properties of a max-heap.

A binary tree is considered a max-heap if it satisfies the following conditions:

Completeness: Every level of the tree, except possibly the last, is completely filled, and all nodes are as far left as possible.
Max-Heap Property: The value of each node is greater than or equal to the values of its children.
Examples:

Input: root[] = [97, 46, 37, 12, 3, 7, 31, 6, 9]
 
Output: true
Explanation: The tree is complete and satisfies the max-heap property.




class Solution {
    
    int count(Node tree){
        if(tree==null) return 0;
        return 1+count(tree.left)+count(tree.right);
    }
    
    boolean cbt(Node tree,int index,int total_node){
        if(tree==null) return true;
        
        if(index>=total_node){
            return false;
        }
        
        //left side cbt && right side cbt
        return cbt(tree.left,2*index+1,total_node) && cbt(tree.right,2*index+1,total_node);
    }
    
    boolean maxHeap(Node root){
        if(root.left!=null){
            if(root.data < root.left.data){
                return false;
            }
            if(!maxHeap(root.left)) return false;
        }
        
        if(root.right!=null){
            if(root.data < root.right.data){
                return false;
            }
            return maxHeap(root.right);
        }
        
        return true;
    }
    
    boolean isHeap(Node tree) {
        //Count nodes in the tree
        int c=count(tree);
        
        //CBT hai ya nahi
        boolean ans=cbt(tree,0,c);
        if(!ans) return false;
        
        //Parent > child
       return maxHeap(tree);
    }
}
-----------------------------------------------------------
BST to max heap
Difficulty: MediumAccuracy: 67.16%Submissions: 23K+Points: 4
Given a Binary Search Tree. Convert a given BST into a Special Max Heap with the condition that all the values in the left subtree of a node should be less than all the values in the right subtree of the node. This condition is applied on all the nodes in the so converted Max Heap.

Example 1:

Input :
                 4
               /   \
              2     6
            /  \   /  \
           1   3  5    7  

Output : 1 2 3 4 5 6 7 
Exaplanation :
               7
             /   \
            3     6
          /   \  /   \
         1    2 4     5
The given BST has been transformed into a
Max Heap and it's postorder traversal is
1 2 3 4 5 6 7.





class Solution
{
    static int index;
    static void inorder(Node root,ArrayList<Integer> list){
        if(root==null) return;
        inorder(root.left,list);
        list.add(root.data);
        inorder(root.right,list);
    }
    
    static void postorder(Node root,ArrayList<Integer> list){
        if(root==null) return;
        
        //left
        postorder(root.left,list);
        //right
        postorder(root.right,list);
        //node
        root.data=list.get(index);
        index++;
    }
    
    public static void convertToMaxHeapUtil(Node root)
    {
        ArrayList<Integer> list=new ArrayList<>();
        //inorder Traversal
        inorder(root,list);
        
        //postorder Traversal
        index=0;
        postorder(root,list);
    }
}
-----------------------------------------------------------
Kth element in Matrix
Difficulty: MediumAccuracy: 61.42%Submissions: 60K+Points: 4Average Time: 35m
Given a N x N matrix, where every row and column is sorted in non-decreasing order. Find the kth smallest element in the matrix.

Example 1:
Input:
N = 4
mat[][] =     {{16, 28, 60, 64},
                   {22, 41, 63, 91},
                   {27, 50, 87, 93},
                   {36, 78, 87, 94 }}
K = 3
Output: 27
Explanation: 27 is the 3rd smallest element.
 

Example 2:
Input:
N = 4
mat[][] =     {{10, 20, 30, 40}
                   {15, 25, 35, 45}
                   {24, 29, 37, 48}
                   {32, 33, 39, 50}}
K = 7
Output: 30
Explanation: 30 is the 7th smallest element.


Your Task:
You don't need to read input or print anything. Complete the function kthsmallest() which takes the mat, N and K as input parameters and returns the kth smallest element in the matrix.
 

Expected Time Complexity: O(K*Log(N))
Expected Auxiliary Space: O(N)

//method-01

int kthSmallest(int mat[MAX][MAX], int n, int k)
{
  
  vector<int> v;
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            v.push_back(mat[i][j]);
            
        }
    }
   
   sort(v.begin(),v.end());
   return v[k-1];
  
}


//method-02

class Solution
{
    
    static class Pair{
        int value,row,col;
        Pair(int value,int row,int col){
            this.value=value;
            this.row=row;
            this.col=col;
        }
    }
    
	public static int kthSmallest(int[][]mat,int n,int k)
	{
	    //create Min heap
        PriorityQueue<Pair> pq=new PriorityQueue<>(Comparator.comparingInt(a->a.value));
        
        // push the first element of each row into the heap
        for(int i=0;i<n;i++){
            pq.add(new Pair(mat[i][0],i,0));
        }
        
        Pair curr=null;
        while(k!=0){
            curr=pq.remove();  //ye pair type ka class hai
            int row=curr.row;  //ye  row index hai
            int col=curr.col;  //ye col index hai
            
            if(col+1<n){
                pq.add(new Pair(mat[row][col+1],row,col+1));
            }
            
            k--;
        }
        
        return curr.value; 
    }
}



-----------------------------------------------------------
Find median in a stream
Difficulty: HardAccuracy: 30.34%Submissions: 145K+Points: 8Average Time: 45m
Given a data stream arr[] where integers are read sequentially, the task is to determine the median of the elements encountered so far after each new integer is read.

There are two cases for median on the basis of data set size.

1. If the data set has an odd number then the middle one will be consider as median.
2. If the data set has an even number then there is no distinct middle value and the median will be the arithmetic mean of the two middle values.

Examples:

Input:  arr[] = [5, 15, 1, 3, 2, 8]
Output: [5.0, 10.0, 5.0, 4.0, 3.0, 4.0] 
Explanation: 
After reading 1st element of stream – 5 -> median = 5.0
After reading 2nd element of stream – 5, 15 -> median = (5+15)/2 = 10.0 
After reading 3rd element of stream – 5, 15, 1 -> median = 5.0
After reading 4th element of stream – 5, 15, 1, 3 ->  median = (3+5)/2 = 4.0
After reading 5th element of stream – 5, 15, 1, 3, 2 -> median = 3.0
After reading 6th element of stream – 5, 15, 1, 3, 2, 8 ->  median = (3+5)/2 = 4.0





class Solution {
    public ArrayList<Double> getMedian(int[] arr) {
        ArrayList<Double> result = new ArrayList<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder()); // Left half (max heap)
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(); // Right half (min heap)
        
        for (int num : arr) {
            addNumber(num, maxHeap, minHeap);
            result.add(getMedian(maxHeap, minHeap));
        }
        
        return result;
    }
    
    
    private void addNumber(int num, PriorityQueue<Integer> maxHeap, PriorityQueue<Integer> minHeap) {
        if (maxHeap.isEmpty() || num <= maxHeap.peek()) {
            maxHeap.add(num);
        } else {
            minHeap.add(num);
        }
        
        // Balance heaps
        if (maxHeap.size() > minHeap.size() + 1) {
            minHeap.add(maxHeap.poll());
        } else if (minHeap.size() > maxHeap.size()) {
            maxHeap.add(minHeap.poll());
        }
    }
    
    private double getMedian(PriorityQueue<Integer> maxHeap, PriorityQueue<Integer> minHeap) {
        if (maxHeap.size() > minHeap.size()) {
            return maxHeap.peek();
        } else {
            return (maxHeap.peek() + minHeap.peek()) / 2.0;
        }
    }
    
}



-----------------------------------------------------------
Merge K sorted linked lists
Difficulty: MediumAccuracy: 57.01%Submissions: 105K+Points: 4Average Time: 60m
Given an array arr[] of n sorted linked lists of different sizes. The task is to merge them in such a way that after merging they will be a single sorted linked list, then return the head of the merged linked list.

Examples:

Input: arr[] = [1 -> 2 -> 3, 4 -> 5, 5 -> 6, 7 -> 8]
Output: 1 -> 2 -> 3 -> 4 -> 5 -> 5 -> 6 -> 7 -> 8
Explanation:
The arr[] has 4 sorted linked list of size 3, 2, 2, 2.
1st list: 1 -> 2-> 3
2nd list: 4 -> 5
3rd list: 5 -> 6
4th list: 7 -> 8
The merged list will be:
 
Input: arr[] = [1 -> 3, 8, 4 -> 5 -> 6]
Output: 1 -> 3 -> 4 -> 5 -> 6 -> 8
Explanation:
The arr[] has 3 sorted linked list of size 2, 3, 1.
1st list: 1 -> 3
2nd list: 8
3rd list: 4 -> 5 -> 6
The merged list will be:


//method0-1
class Solution {
    // Function to merge K sorted linked list.
    public static Node merge(Node a,Node b){
        Node ans=new Node(0);
        Node t=ans;
        while(a!=null && b!=null){
            if(a.data<=b.data){
                t.next=a;
                t=t.next;
                a=a.next;
            }
            else{
                t.next=b;
                t=t.next;
                b=b.next;
            }
        }
        
        while(a!=null){
            t.next=a;
            t=t.next;
            a=a.next;
        }
        
        while(b!=null){
            t.next=b;
            t=t.next;
            b=b.next;
        }
        
        return ans.next;
    }
    Node mergeKLists(List<Node> arr) {
        // Add your code here.
        if (arr == null || arr.isEmpty()) return null;
        
        Node head=arr.get(0);
        for(int i=1;i<arr.size();i++){
            head=merge(head,arr.get(i));
        }
        return head;
    }
}


//method-02
class Solution {
    // Function to merge K sorted linked list.
    Node mergeKLists(List<Node> arr) {
        PriorityQueue<Node> minHeap = new PriorityQueue<>((a, b) -> a.data - b.data);
        
        for (Node head : arr) {
            if (head != null) {
                minHeap.add(head);
            }
        }
        
        Node dummy = new Node(0);
        Node current = dummy;
        
        while (!minHeap.isEmpty()) {
            Node minNode = minHeap.poll();
            current.next = minNode;
            current = current.next;
            
            if (minNode.next != null) {
                minHeap.add(minNode.next);
            }
        }
        
        return dummy.next;
    }
}

-----------------------------------------------------------
Merge k Sorted Arrays
Difficulty: MediumAccuracy: 67.25%Submissions: 111K+Points: 4Average Time: 45m
Given k sorted arrays arranged in the form of a matrix of size k * k. The task is to merge them into one sorted array. Return the merged sorted array ( as a pointer to the merged sorted arrays in cpp, as an ArrayList in java, and list in python).


Examples :

Input: k = 3, arr[][] = {{1,2,3},{4,5,6},{7,8,9}}
Output: 1 2 3 4 5 6 7 8 9
Explanation: Above test case has 3 sorted arrays of size 3, 3, 3 arr[][] = [[1, 2, 3],[4, 5, 6],[7, 8, 9]]. The merged list will be [1, 2, 3, 4, 5, 6, 7, 8, 9].
Input: k = 4, arr[][]={{1,2,3,4},{2,2,3,4},{5,5,6,6},{7,8,9,9}}
Output: 1 2 2 2 3 3 4 4 5 5 6 6 7 8 9 9 
Explanation: Above test case has 4 sorted arrays of size 4, 4, 4, 4 arr[][] = [[1, 2, 2, 2], [3, 3, 4, 4], [5, 5, 6, 6], [7, 8, 9, 9 ]]. The merged list will be [1, 2, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 8, 9, 9].
Expected Time Complexity: O(k2*Log(k))
Expected Auxiliary Space: O(k2)


//method -01

public static ArrayList<Integer> mergeKArrays(int[][] arr,int K) 
{
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < arr.length ; i++){
            for(int j = 0; j < arr[0].length; j++){
                pq.add(arr[i][j]);
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        while(pq.size() > 0){
            ans.add(pq.remove());
        }
        return ans;
        
        
}

//method-02
class Solution
{
    static class Pair implements Comparable<Pair>{
        int value;
        int row;
        int col;
        Pair(int value,int row,int col){
            this.value=value;
            this.row=row;
            this.col=col;
        }
        
        @Override
        public int compareTo(Pair other) {
            return this.value - other.value;
        }
    }
    public static ArrayList<Integer> mergeKArrays(int[][] arr,int K) 
    {
        ArrayList<Integer> ans=new ArrayList<>();
        
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        for(int i=0;i<K;i++){
            pq.add(new Pair(arr[i][0],i,0));
        }
        
        
        while (!pq.isEmpty()){
            Pair curr=pq.remove();
            int value=curr.value;
            int row=curr.row;
            int col=curr.col;
            ans.add(value);
            if(col<K-1){
                pq.add(new Pair(arr[row][col+1],row,col+1));
            }
        }
        return ans;
    }
}


-----------------------------------------------------------
632. Smallest Range Covering Elements from K Lists
Solved
Hard
Topics
Companies
You have k lists of sorted integers in non-decreasing order. Find the smallest range that includes at least one number from each of the k lists.

We define the range [a, b] is smaller than range [c, d] if b - a < d - c or a < c if b - a == d - c.

 

Example 1:

Input: nums = [[4,10,15,24,26],[0,9,12,20],[5,18,22,30]]
Output: [20,24]
Explanation: 
List 1: [4, 10, 15, 24,26], 24 is in range [20,24].
List 2: [0, 9, 12, 20], 20 is in range [20,24].
List 3: [5, 18, 22, 30], 22 is in range [20,24].
Example 2:

Input: nums = [[1,2,3],[1,2,3],[1,2,3]]
Output: [1,1]

class Solution {

    class Pair implements Comparable<Pair>{
        int value;
        int row;
        int col;
        Pair(int value,int row,int col){
            this.value=value;
            this.row=row;
            this.col=col;
        }
        @Override
        public int compareTo(Pair other){
            return this.value-other.value;
        }
    }

    public int[] smallestRange(List<List<Integer>> nums) {
        int ans[]=new int[2];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int min,max=Integer.MIN_VALUE;

        //insert first element of each row into heap
        for(int i=0;i<nums.size();i++){
            pq.add(new Pair(nums.get(i).get(0),i,0));
            max=Math.max(max,nums.get(i).get(0));
        }

        min=pq.peek().value;
        ans[0]=min;
        ans[1]=max;

        while(pq.size()==nums.size()){
            Pair curr=pq.remove();
            int value=curr.value;
            int row=curr.row;
            int col=curr.col;
            if(col+1 <nums.get(row).size()){
                pq.add(new Pair(nums.get(row).get(col+1),row,col+1));
                max=Math.max(max,nums.get(row).get(col+1));
                min=pq.peek().value;

                //if I have got smallest range
                if(max-min < ans[1]-ans[0]){
                    ans[0]=min;
                    ans[1]=max;
                }

            }
        }

        return ans;

    }
}


-----------------------------------------------------------
1354. Construct Target Array With Multiple Sums
Solved
Hard
Topics
Companies
Hint
You are given an array target of n integers. From a starting array arr consisting of n 1's, you may perform the following procedure :

let x be the sum of all elements currently in your array.
choose index i, such that 0 <= i < n and set the value of arr at index i to x.
You may repeat this procedure as many times as needed.
Return true if it is possible to construct the target array from arr, otherwise, return false.

 

Example 1:

Input: target = [9,3,5]
Output: true
Explanation: Start with arr = [1, 1, 1] 
[1, 1, 1], sum = 3 choose index 1
[1, 3, 1], sum = 5 choose index 2
[1, 3, 5], sum = 9 choose index 0
[9, 3, 5] Done
Example 2:

Input: target = [1,1,1,2]
Output: false
Explanation: Impossible to create target array from [1,1,1,1].
Example 3:

Input: target = [8,5]
Output: true







class Solution {
    public boolean isPossible(int[] target) {
        //maxHeap
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        int sum=0;
        for(int i=0;i<target.length;i++){
            pq.add(target[i]);
            sum+=target[i];
        }

        int maxEle,remSum,Ele;
        while(pq.peek()!=1){
            maxEle=pq.remove();
            remSum=sum-maxEle;

            //Edges case
            if(remSum<=0 || remSum>=maxEle) return false;

            //changes will occur here
            Ele=maxEle%remSum;
            if(Ele==0){
                if(remSum!=1) return false;
                else return true;
            }
            sum=remSum+Ele;
            pq.add(Ele);

        }
        return true;
    }
}

-----------------------------------------------------------














*/