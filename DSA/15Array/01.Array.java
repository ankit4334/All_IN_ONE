/* 
01.Reverse a String

class Reverse
{
    
    public static String reverseWord(String str)
    {
       char a[]=str.toCharArray();
       int e=a.length-1;
       int i=0;
       while(i<=e){
       char t=a[i];
       a[i]=a[e];
       a[e]=t;
       i++;
       e--;
       }
    
       return String.valueOf(a);
       
    }
}


---------------------------------------------------------------------
2.Max Min(Given an array A of size N of integers. Your task is to find the sum of minimum and maximum element in the array.)

class Solution
{ 
    public static int findSum(int A[],int N) 
    {
      int ma=Integer.MIN_VALUE;
      int sa=Integer.MAX_VALUE;
      
      for(int i=0;i<N;i++){
          if(A[i]>ma){
              ma=A[i];
          }
      }
      
      for(int i=0;i<N;i++){
          if(A[i]<sa){
              sa=A[i];
          }
      }
      
      return ma+sa;
      
    }
}



-----------------------------------------------------------
3.Kth smallest element(in c++)(medium)

class Solution{
    public:
    int kthSmallest(int arr[], int l, int r, int k) {
        priority_queue<int> p;
        int n=r-l+1;
        
        for(int i=0;i<k;i++){
            p.push(arr[i]);
        }
        
        for(int i=k;i<n;i++){
            if(arr[i]<p.top()){
                p.pop();
                p.push(arr[i]);
            }
        }
        
        return p.top();
    }
};




-------------------------------------------------------
7.Cyclically rotate an array by one

class Compute {
    
    public void rotate(int arr[], int n)
    {
        
       int t=arr[n-1];
      
        n--;
        for(int i=n-1;i>=0;i--){
            arr[i+1]=arr[i];
        }
        arr[0]=t;
    }
}



----------------------------------------------------------
4.Sort an array of 0s, 1s and 2s(medium)
class Solution {
    public void sortColors(int[] nums) {
        int s=0;
        int m=0;
        int e=nums.length-1;
        while(m<=e){
            if(nums[m]==0){
                int t=nums[s];
                nums[s]=nums[m];
                nums[m]=t;
                s++;
                m++;
            }
            else if(nums[m]==1){
                m++;
            }
            else{
                int t=nums[m];
                nums[m]=nums[e];
                nums[e]=t;
                e--;
            }
        }
        
    }
}

---------------------------------------------------------------------------------------------------------------

189. Rotate Array
Solved
Medium
Topics
Companies
Hint
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

 

Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
Example 2:

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
 

Constraints:

1 <= nums.length <= 105
-231 <= nums[i] <= 231 - 1
0 <= k <= 105

class Solution {
    public void rotate(int[] nums, int k) {

        int n = nums.length;
        k = k % n; 

        if (k == 0) return;
        
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
        
    }


    public void reverse(int[] nums,int  s,int e) {
    
        while(s<=e){
            int t=nums[s];
            nums[s]=nums[e];
            nums[e]=t;
            s++;
            e--;
        }
        
    }

}
---------------------------------------------------------------------------------------------------------------
268. Missing Number
Solved
Easy
Topics
Companies
Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

 

Example 1:

Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
Example 2:

Input: nums = [0,1]
Output: 2
Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.
Example 3:

Input: nums = [9,6,4,2,3,5,7,0,1]
Output: 8
Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.


class Solution {
    public int missingNumber(int[] nums) {
        int  s=0;
        int m=0;
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            s+=nums[i];
            m=Math.max(nums[i],m);
        }

        int s2=n*(n+1)/2;
    

        return Math.abs(s-s2);

        
    }
}
---------------------------------------------------------------------------------------------------------------
485. Max Consecutive Ones
Solved
Easy
Topics
Companies
Hint
Given a binary array nums, return the maximum number of consecutive 1's in the array.

 

Example 1:

Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
Example 2:

Input: nums = [1,0,1,1,0,1]
Output: 2

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int c=0;
        int m=0;
        for(int i=0;i<nums.length;i++){
            int k=nums[i];
            if(k==1){
                c++;
                m=Math.max(m,c);
            }
            else{
                c=0;
            }
        }
        return m;
        
    }
}

---------------------------------------------------------------------------------------------------------------


---------------------------------------------------------------------------------------------------------------
 
---------------------------------------------------------------------------------------------------------------
***********************************************************************************************
***********************************************************************************************
***********************************************************************************************
***********************************************************************************************
***********************************************************************************************
---------------------------------------------------------------------------------------------------------------

Question:Move all negative elements to end

banner
Given an unsorted array arr[] of size n having both negative and positive integers. 
The task is place all negative element at the end of array 
without changing the order of positive element and negative element.

 

Example 1:

Input : 
n = 8
arr[] = {1, -1, 3, 2, -7, -5, 11, 6 }
Output : 
1  3  2  11  6  -1  -7  -5

Example 2:

Input : 
n = 8
arr[] = {-5, 7, -3, -4, 9, 10, -1, 11}
Output :
7  9  10  11  -5  -3  -4  -1
 

Your Task:  
You don't need to read input or print anything. Your task is to complete the function segregateElements() which takes the array arr[] and its size N as inputs and store the answer in the array arr[] itself.

 

Expected Time Complexity: O(n)
Expected Auxiliary Space: O(n)
 

class Solution {
    
    public void segregateElements(int arr[], int n)
    {
        ArrayList<Integer> p=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]>=0){
                p.add(arr[i]);
            }
        }
        
        
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                p.add(arr[i]);
            }
        }
        
        for(int i=0;i<n;i++){
            int t=p.get(i);
            arr[i]=t;
        }
    }
}


---------------------------------------------------------
6.Move All Negative Numbers To


#include <bits/stdc++.h> 
vector<int> separateNegativeAndPositive(vector<int> &nums){
    // Write your code here.
    
    int i=-1;
    int j=0;
    for(j=0;j<nums.size();j++){
        if(nums[j]<0){
             i++;
            swap(nums[i],nums[j]);
            
        }
        
    }
    return nums;
}




-------------------------------------------------------
QUESTION:-Alternate positive and negative numbers
EasyAccuracy: 33.86%Submissions: 160K+Points: 2
Internship Alert!
Become an SDE Intern by topping this monthly leaderboard! 

banner
Given an unsorted array Arr of N positive and negative numbers. Your task is to create an array of alternate positive and negative numbers without changing the relative order of positive and negative numbers.
Note: Array should start with a positive number and 0 (zero) should be considered a positive element.
 

Example 1:

Input: 
N = 9
Arr[] = {9, 4, -2, -1, 5, 0, -5, -3, 2}
Output:
9 -2 4 -1 5 -5 0 -3 2
Explanation : Positive elements : 9,4,5,0,2
Negative elements : -2,-1,-5,-3
As we need to maintain the relative order of
postive elements and negative elements we will pick
each element from the positive and negative and will
store them. If any of the positive and negative numbers
are completed. we will continue with the remaining signed
elements.The output is 9,-2,4,-1,5,-5,0,-3,2.

Example 2:

Input:
N = 10
Arr[] = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8}
Output:
5 -5 2 -2 4 -8 7 1 8 0
Explanation : Positive elements : 5,2,4,7,1,8,0
Negative elements : -5,-2,-8
As we need to maintain the relative order of
postive elements and negative elements we will pick
each element from the positive and negative and will
store them. If any of the positive and negative numbers
are completed. we will continue with the remaining signed
elements.The output is 5,-5,2,-2,4,-8,7,1,8,0.
Your Task:  

You don't need to read input or print anything. Your task is to complete the function rearrange() which takes the array of integers arr[] and n as parameters. You need to modify the array itself.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)


//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

class Solution {
    void rearrange(int arr[], int n) {
        
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        
        for(int num : arr){
            if(num<0){
                neg.add(num);
            }else{
                pos.add(num);
            }
        }
        
        
        int i =0, j =0, k=0;
        
        while (k < arr.length) {
            if (i < pos.size()) {
                arr[k++] = pos.get(i++);
            }

            if (j < neg.size()) {
                arr[k++] = neg.get(j++);
            }
        }
      
        
        
        
    }
}


---------------------------------------------------------------------------------------------------------------


283. Move Zeroes
Solved
Easy
Topics
Companies
Hint
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

 

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]

class Solution {
    public void moveZeroes(int[] nums) {

        int j=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                j++;
                int t=nums[i];
                nums[i]=nums[j];
                nums[j]=t;
            }
        }
        
    }
}
---------------------------------------------------------------------------------------------------------------
2149. Rearrange Array Elements by Sign
Solved
Medium
Topics
Companies
Hint
You are given a 0-indexed integer array nums of even length consisting of an equal number of positive and negative integers.

You should return the array of nums such that the the array follows the given conditions:

Every consecutive pair of integers have opposite signs.
For all integers with the same sign, the order in which they were present in nums is preserved.
The rearranged array begins with a positive integer.
Return the modified array after rearranging the elements to satisfy the aforementioned conditions.

 

Example 1:

Input: nums = [3,1,-2,-5,2,-4]
Output: [3,-2,1,-5,2,-4]
Explanation:
The positive integers in nums are [3,1,2]. The negative integers are [-2,-5,-4].
The only possible way to rearrange them such that they satisfy all conditions is [3,-2,1,-5,2,-4].
Other ways such as [1,-2,2,-5,3,-4], [3,1,2,-2,-5,-4], [-2,3,-5,1,-4,2] are incorrect because they do not satisfy one or more conditions.  
Example 2:

Input: nums = [-1,1]
Output: [1,-1]
Explanation:
1 is the only positive integer and -1 the only negative integer in nums.
So nums is rearranged to [1,-1].


class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> p=new ArrayList<>();
        ArrayList<Integer> n=new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            int k=nums[i];
            if(k>0){
                p.add(k);
            }
            else{
                n.add(k);
            }
        }

        int j=0;
        for(int i=0;i<p.size();i++){
            nums[j++]=p.get(i);
            nums[j++]=n.get(i);
        }

        return nums;

    }
}
---------------------------------------------------------------------------------------------------------------


---------------------------------------------------------------------------------------------------------------

---------------------------------------------------------------------------------------------------------------
***********************************************************************************************
***********************************************************************************************
***********************************************************************************************
***********************************************************************************************
***********************************************************************************************
---------------------------------------------------------------------------------------------------------------
-------------------------------------------------------
5.Union of two arrays

class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        HashSet<Integer> h=new HashSet<>();
        for(int i=0;i<n;i++){
            h.add(a[i]);
        }
        
         for(int i=0;i<m;i++){
            h.add(b[i]);
        }
        
        return h.size();
    }
}


------------------------------------------------------------
17.Common elements using c++

class Solution
{
    public:    
       vector <int> commonElements (int a[], int b[], int c[], int n1, int n2, int n3){
            
            
            vector<int> v;
            int i=0;
            int j=0;
            int k=0;
        while(i<n1 && j<n2 && k<n3){
            if(a[i]==b[j] && b[j]==c[k]){
                v.push_back(a[i]);
                i++;
                j++;
                k++;
            }
            else if(a[i]<b[j]){
                i++;
            }
            else if(b[j]<c[k]){
                j++;
            }
            else{
                k++;
            }
    
            int xx=a[i-1];
            while(a[i]==xx)
            i++;
    
           int yy=b[j-1];
            while(b[j]==yy)
            j++;
    
            int zz=c[k-1];
            while(c[k]==zz)
            k++;
    
        }
        return v;
    }

};





//in java


class Solution
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        NavigableSet<Integer> set=new TreeSet<>();
        NavigableSet<Integer> set1=new TreeSet<>();
        NavigableSet<Integer> set2=new TreeSet<>();
        for(int i=0;i<A.length;i++){
            set.add(A[i]);   
        }
        for(int i=0;i<B.length;i++){
            if(set.contains(B[i])){
                set1.add(B[i]);
            }
        }
        for(int i=0;i<C.length;i++){
            if(set1.contains(C[i])){
                set2.add(C[i]);
            }
        }
        
        return new ArrayList<>(set2);
    }
}

-----------------------------------------------------------------------------------------


Union of Two Sorted Arrays
MediumAccuracy: 31.39%Submissions: 167K+Points: 4
Internship Alert
New month-> Fresh Chance to top the leaderboard and get SDE Internship! 

banner
Union of two arrays can be defined as the common and distinct elements in the two arrays.
Given two sorted arrays of size n and m respectively, find their union.

Example 1:

Input: 
n = 5, arr1[] = {1, 2, 3, 4, 5}  
m = 3, arr2 [] = {1, 2, 3, 6, 7}
Output: 
1 2 3 4 5 6 7
Explanation: 
Distinct elements including both the arrays are: 1 2 3 4 5 6 7.
Example 2:

Input: 
n = 5, arr1[] = {2, 2, 3, 4, 5}  
m = 5, arr2[] = {1, 1, 2, 3, 4}
Output: 
1 2 3 4 5
Explanation: 
Distinct elements including both the arrays are: 1 2 3 4 5.
Example 3:

Input:
n = 5, arr1[] = {1, 1, 1, 1, 1}
m = 5, arr2[] = {2, 2, 2, 2, 2}
Output: 
1 2
Explanation: 
Distinct elements including both the arrays are: 1 2.
Your Task: 
You do not need to read input or print anything. Complete the function findUnion() that takes two arrays arr1[], arr2[], and their size n and m as input parameters and returns a list containing the union of the two arrays.

Expected Time Complexity: O(n+m).
Expected Auxiliary Space: O(n+m).

Constraints:
1 <= n, m <= 105
-109 <= arr1[i], arr2[i] <= 109

Company Tags
class Solution
{
    //Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        
        //Method 01.
        // TreeSet<Integer> t=new TreeSet<>();
        // for(int i=0;i<n;i++){
        //     t.add(arr1[i]);
        // }
        
        // for(int i=0;i<m;i++){
        //     t.add(arr2[i]);
        // }
        
        // ArrayList<Integer> ans=new ArrayList<>();
        // for(int i:t){
        //     ans.add(i);
        // }
        
        // return ans;
        
        
        
        
        
        //Mehtod 02.
        
        
        ArrayList<Integer> list=new ArrayList<>();
        
        int i=0;
        int j=0;
        
        while(i<n && j< m){
            if(arr1[i]<arr2[j]){
                if(list.size()==0 || arr1[i]!=list.get(list.size()-1))
                    list.add(arr1[i]);
                i++;
            }
            else if(arr1[i]==arr2[j]){
                i++;
            }
            else{
                if(list.size()==0 || arr2[j]!=list.get(list.size()-1) )
                    list.add(arr2[j]);
                j++;
            }
        }
        
        while(i<n){
            if(arr1[i]!=list.get(list.size()-1))
                list.add(arr1[i]);
            i++;
        }
        while(j<m){
            if(arr2[j]!=list.get(list.size()-1))
                list.add(arr2[j]);
            j++;
        }
        
        return list;
    }
}





---------------------------------------------------------------------------------------------------------------
***********************************************************************************************
***********************************************************************************************
***********************************************************************************************
***********************************************************************************************
***********************************************************************************************
---------------------------------------------------------------------------------------------------------------

1.Kadane's Algorithm
//or fine the maximum subarray of an array;
53. Maximum Subarray

class Solution{

    long maxSubarraySum(int arr[], int n){
        
        long sum=0;
        long ma=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
            ma=Math.max(sum,ma);
            if(sum<0){
                sum=0;
            }
        }
        return ma;
        
    }
    
}






------------------------------------------------------------
2.Subarray with 0 sum

class Solution{
    static boolean findsum(int arr[],int n)
    {   
        HashSet<Integer> h=new HashSet<>();
        int s=0;
        for(int i=0;i<n;i++){
            s+=arr[i];
            if(s==0 || arr[i]==0){
                return true;
            }
            if(!h.contains(s)){
                h.add(s);
            }
            else{
               return true;
            }
        }
        
        return false;
        
    }
}

------------------------------------------------------------
3.Maximum Product Subarray

class Solution {
 
    long maxProduct(int[] arr, int n) {
       long ans=arr[0];
       long ma=ans;
       long mi=ans;
       
       
       for(int i=1;i<n;i++){
           if(arr[i]<0){
            //   swap(ma,mi);
            long t=ma;
            ma=mi;
            mi=t;
           }
           ma=Math.max(arr[i],ma*arr[i]);
           mi=Math.min(arr[i],mi*arr[i]);
           ans=Math.max(ans,ma);
       }
       
       return ans;
    }
}


------------------------------------------------------------
Longest Sub-Array with Sum K
Difficulty: MediumAccuracy: 24.64%Submissions: 366K+Points: 4
Given an array arr containing n integers and an integer k. Your task is to find the length of the longest Sub-Array with the sum of the elements equal to the given value k.

 

Examples:
 

Input :
arr[] = {10, 5, 2, 7, 1, 9}, k = 15
Output : 4
Explanation:
The sub-array is {5, 2, 7, 1}.
Input : 
arr[] = {-1, 2, 3}, k = 6
Output : 0
Explanation: 
There is no such sub-array with sum 6.
Expected Time Complexity: O(n).
Expected Auxiliary Space: O(n).

class Solution{
    
   
    // Function for finding maximum and value pair
    public static int lenOfLongSubarr (int A[], int N, int K) {
        
        Map<Integer,Integer> hm=new HashMap<>();
        int sum=0;
        int ans=0;
        hm.put(0,-1);
        for(int i=0;i<N;i++){
            sum+=A[i];
            if(hm.containsKey(sum-K)){
                int windowLength=i-hm.get(sum-K);
                ans=Math.max(ans,windowLength);
            }
            
            if(!hm.containsKey(sum)){
                hm.put(sum,i);
            }
        }
        
        
        return ans;
        
    }
    
    
}
------------------------------------------------------------
560.Subarray Sum Equals K
Solved
Medium
Topics
Companies
Hint
Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

A subarray is a contiguous non-empty sequence of elements within an array.

 

Example 1:

Input: nums = [1,1,1], k = 2
Output: 2
Example 2:

Input: nums = [1,2,3], k = 3
Output: 2


class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int s=0;
        int c=0;
        hm.put(0,1);
        for(int i=0;i<nums.length;i++){
            s+=nums[i];
            int t=s-k;
            if(hm.containsKey(t)){
                c+=hm.get(t);
            }
            hm.put(s,hm.getOrDefault(s,0)+1);
        }
        return c;
    }
}

------------------------------------------------------------
128. Longest Consecutive Sequence
Solved
Medium
Topics
Companies
Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.

 

Example 1:

Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
Example 2:

Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9
 

class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length==0){
            return 0;
        }

        Set<Integer> s=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            s.add(nums[i]);
        }

        
        int m=1;
        for(Integer t:s){
            if(!s.contains(t-1)){
                int c=1;
                int x=t;
                while(s.contains(x+1)){
                    c=c+1;
                    x=x+1;
                }
                m=Math.max(m,c);
            }
        }
        return m;
    }
}

------------------------------------------------------------
Largest subarray with 0 sum
Difficulty: MediumAccuracy: 41.84%Submissions: 318K+Points: 4
Given an array having both positive and negative integers. The task is to compute the length of the largest subarray with sum 0.

Examples:

Input: arr[] = {15,-2,2,-8,1,7,10,23}, n = 8
Output: 5
Explanation: The largest subarray with sum 0 is -2 2 -8 1 7.
Input: arr[] = {2,10,4}, n = 3
Output: 0
Explanation: There is no subarray with 0 sum.
Input: arr[] = {1, 0, -4, 3, 1, 0}, n = 6
Output: 5
Explanation: The subarray is 0 -4 3 1 0.
Expected Time Complexity: O(n).
Expected Auxiliary Space: O(n).

int maxLen(int arr[], int n)
    {
        HashMap<Integer,Integer> hm=new HashMap<>(); //hm me sum and index strore karege

        int mLen=0;
        int sum=0;
        hm.put(0,-1);  //here 0 is sum and -1 is index 
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(hm.containsKey(sum)){
                int k=hm.get(sum);
                mLen=Math.max(mLen,i-k);
            }
            else{
                hm.put(sum,i);
            }
        }
        
        return mLen;
    }
---------------------------------------------------------------------------------------------------------------

---------------------------------------------------------------------------------------------------------------

---------------------------------------------------------------------------------------------------------------


---------------------------------------------------------------------------------------------------------------
***********************************************************************************************
***********************************************************************************************
***********************************************************************************************
***********************************************************************************************
***********************************************************************************************
---------------------------------------------------------------------------------------------------------------
-----------------------------------------------------------
15.Best Time to Buy and Sell Stock  in c++


class Solution {
public:
    int maxProfit(vector<int>& a) {
        int n=a.size();
       int maxpro=0;
       int mr=a[n-1];
        for(int i=n-2;i>=0;i--){
            mr=max(mr,a[i]);
            maxpro=max(maxpro,mr-a[i]);
        }
        return maxpro;
    }
};


------------------------------------------------------------
121. Best Time to Buy and Sell Stock
Solved
Easy
Topics
Companies
You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

 

Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.
 

//using java.
class Solution {
    public int maxProfit(int[] prices) {
        int maxPro=0;
        int minSoFar=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            minSoFar=Math.min(prices[i],minSoFar);
            maxPro=Math.max(maxPro,(prices[i]-minSoFar));
        }

        return maxPro;
    }
}

------------------------------------------------------------
122. Best Time to Buy and Sell Stock II
Solved
Medium
Topics
Companies
You are given an integer array prices where prices[i] is the price of a given stock on the ith day.

On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time. However, you can buy it then immediately sell it on the same day.

Find and return the maximum profit you can achieve.

 

Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 7
Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
Total profit is 4 + 3 = 7.
Example 2:

Input: prices = [1,2,3,4,5]
Output: 4
Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
Total profit is 4.
Example 3:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: There is no way to make a positive profit, so we never buy the stock to achieve the maximum profit of 0.


class Solution {
    public int maxProfit(int[] prices) {
        int maxP=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                maxP+=(prices[i]-prices[i-1]);
            }
        }

        return maxP;
    }
}
------------------------------------------------------------


------------------------------------------------------------








---------------------------------------------------------------------------------------------------------------
***********************************************************************************************
***********************************************************************************************
***********************************************************************************************
***********************************************************************************************
***********************************************************************************************
---------------------------------------------------------------------------------------------------------------

20.229. Majority Element II



class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> l = new ArrayList<>();

        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }

        int n=nums.length/3;

        for(Integer k:hm.keySet()){
            if(hm.get(k)>n){
                l.add(k);
            }
        }
        return l;
    }
}

---------------------------------------------------------------------------------------------------------------
169. Majority Element
Solved
Easy
Topics
Companies
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
 

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            h.put(nums[i],h.getOrDefault(nums[i],0)+1);
        }

        int ans=-1;
        for(Integer k:h.keySet()){
            if(h.get(k)>nums.length/2){
                ans=k;
            }
        }
        return ans;

    }
}

---------------------------------------------------------------------------------------------------------------

---------------------------------------------------------------------------------------------------------------
***********************************************************************************************
***********************************************************************************************
***********************************************************************************************
***********************************************************************************************
***********************************************************************************************
---------------------------------------------------------------------------------------------------------------
1. Two Sum
Solved
Easy
Topics
Companies
Hint
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]



class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a[]=new int[2];
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                    a[0]=i;
                    a[1]=j;
                    break;
                }
            }
        }
        
        return a;
    }
}


---------------------------------------------------------------------------------------------------------------
1.Find triplets with zero sum

MediumAccuracy: 25.81%Submissions: 303K+Points: 4
Internship Alert
New month-> Fresh Chance to top the leaderboard and get SDE Internship! 

banner
Given an array arr[] of n integers. Check whether it contains a triplet that sums up to zero. 

Note: Return 1, if there is at least one triplet following the condition else return 0.

Example 1:

Input: n = 5, arr[] = {0, -1, 2, -3, 1}
Output: 1
Explanation: 0, -1 and 1 forms a triplet
with sum equal to 0.
Example 2:

Input: n = 3, arr[] = {1, 2, 3}
Output: 0
Explanation: No triplet with zero sum exists. 

Your Task:
You don't need to read input or print anything. Your task is to complete the boolean function findTriplets() which takes the array arr[] and the size of the array (n) as inputs and print 1 if the function returns true else print 0 if the function returns false. 

Expected Time Complexity: O(n2)
Expected Auxiliary Space: O(1)

Constraints:
1 <= n <= 104
-106 <= Ai <= 106

Company Tags
Topic Tags
Related Courses



class Solution
{
    // arr[]: input array
    // n: size of the array
    //Function to find triplets with zero sum.
	public boolean findTriplets(int arr[] , int n)
    {
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            int s=i+1;
            int e=n-1;
            while(s<e){
                if(arr[i]+arr[s]+arr[e]==0){
                    return true;
                }
                else if(arr[i]+arr[s]+arr[e]>0){
                    e--;
                }
                else{
                    s++;
                }
            }
        }
        
        return false;
    }
}






------------------------------------------------------------
2.Triplet Sum in Array

class Solution
{
    //Function to find if there exists a triplet in the 
    //array A[] which sums up to X.
    public static boolean find3Numbers(int A[], int n, int x) { 
    
      Arrays.sort(A);
      
      for(int i=0;i<n;i++){
      
        int s=i+1;
        int e=n-1;
        while(s<e){
            if(A[i]+A[s]+A[e]==x){
                return true;
            }
            else if(A[i]+A[s]+A[e]>x){
                e--;
            }
            else if(A[i]+A[s]+A[e]<x){
                s++;
            }
        }
      }
      
      return false;
    }
}


------------------------------------------------------------
15. 3Sum
Solved
Medium
Topics
Companies
Hint
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.

 

Example 1:

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation: 
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.
Example 2:

Input: nums = [0,1,1]
Output: []
Explanation: The only possible triplet does not sum up to 0.
Example 3:

Input: nums = [0,0,0]
Output: [[0,0,0]]
Explanation: The only possible triplet sums up to 0.

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> ans=new HashSet<>();

        if(nums.length==0){
            return new ArrayList<>(ans);
        }

        Arrays.sort(nums);

        for(int i=0;i<nums.length-2;i++){
            int s=i+1;
            int e=nums.length-1;

            while(s<e){

                int sum=nums[i]+nums[s]+nums[e];
                
                if(sum==0){
                   ans.add(Arrays.asList(nums[i], nums[s], nums[e]));
                   s++;
                   e--;
                    
                }
                else if(sum>0){
                    e--;
                }
                else{
                    s++;
                }
            }
            
           
        }

        return new ArrayList<>(ans);
    }
}
------------------------------------------------------------
18. 4Sum
Solved
Medium
Topics
Companies
Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:

0 <= a, b, c, d < n
a, b, c, and d are distinct.
nums[a] + nums[b] + nums[c] + nums[d] == target
You may return the answer in any order.

 

Example 1:

Input: nums = [1,0,-1,0,-2,2], target = 0
Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
Example 2:

Input: nums = [2,2,2,2,2], target = 8
Output: [[2,2,2,2]]


class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        Set<List<Integer>> ans=new HashSet<>();

        if(nums.length==0){
            return new ArrayList<>(ans);
        }

        Arrays.sort(nums);

        for(int i=0;i<nums.length-3;i++){
            
            for(int j=i+1;j<nums.length-2;j++){

                int s=j+1;
                int e=nums.length-1;

            while(s<e){

                long sum=(long)nums[i]+ (long)nums[j] +(long)nums[s]+(long)nums[e];
                
                if(sum==target){
                   ans.add(Arrays.asList(nums[i],nums[j],nums[s], nums[e]));
                   s++;
                   e--;
                    
                }
                else if(sum>target){
                    e--;
                }
                else{
                    s++;
                }
            }

            }
           
        }

        return new ArrayList<>(ans);

    }
}
------------------------------------------------------------


------------------------------------------------------------


------------------------------------------------------------




---------------------------------------------------------------------------------------------------------------
***********************************************************************************************
***********************************************************************************************
***********************************************************************************************
***********************************************************************************************
***********************************************************************************************
---------------------------------------------------------------------------------------------------------------

Question:-Leaders in an array


banner
Given an array A of positive integers. Your task is to find the leaders in the array. An element of array is a leader if it is greater than or equal to all the elements to its right side. The rightmost element is always a leader. 

Example 1:

Input:
n = 6
A[] = {16,17,4,3,5,2}
Output: 17 5 2
Explanation: The first leader is 17 
as it is greater than all the elements
to its right.  Similarly, the next 
leader is 5. The right most element 
is always a leader so it is also 
included.
Example 2:

Input:
n = 5
A[] = {1,2,3,4,0}
Output: 4 0
Explanation: 0 is the rightmost element
and 4 is the only element which is greater
than all the elements to its right.
Your Task:
You don't need to read input or print anything. The task is to complete the function leader() which takes array A and n as input parameters and returns an array of leaders in order of their appearance.

Expected Time Complexity: O(n)
Expected Auxiliary Space: O(n)

Constraints:
1 <= n <= 107
0 <= Ai <= 107

Company Tags
PayuAdobe

class Solution{
    //Function to find the leaders in the array.
    
    static ArrayList<Integer> reverse(ArrayList<Integer> a){
        int s=0;
        int e=a.size()-1;
        
        while(s<=e){
            int t=a.get(s);
            a.set(s,a.get(e));
            a.set(e,t);
            s++;
            e--;
        }
        
        return a;
    }
    
    static ArrayList<Integer> leaders(int arr[], int n){
        ArrayList<Integer> a=new ArrayList<>();
        int ma=arr[n-1];
        for(int i=n-1;i>=0;i--){
            if(arr[i]>=ma){
                ma=arr[i];
                a.add(ma);
            }
        }
        
        return reverse(a);
    }
}



////////java code////
class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> p=new ArrayList<>();
        ArrayList<Integer> n=new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            int k=nums[i];
            if(k>0){
                p.add(k);
            }
            else{
                n.add(k);
            }
        }

        int j=0;
        for(int i=0;i<p.size();i++){
            nums[j++]=p.get(i);
            nums[j++]=n.get(i);
        }

        return nums;

    }
}



---------------------------------------------------------------------------------------------------------------
***********************************************************************************************
***********************************************************************************************
***********************************************************************************************
***********************************************************************************************
***********************************************************************************************
---------------------------------------------------------------------------------------------------------------



Questin:-Equilibrium Point


banner
Given an array A of n non negative numbers. The task is to find the first equilibrium point in an array. 
Equilibrium point in an array is an index (or position) such that the sum of all elements before that index 
is same as sum of elements after it.

Note: Return equilibrium point in 1-based indexing. Return -1 if no such point exists. 

Example 1:

Input: 
n = 5 
A[] = {1,3,5,2,2} 
Output: 
3 
Explanation:  
equilibrium point is at position 3 as sum of elements before it (1+3) = sum of elements after it (2+2). 
Example 2:

Input:
n = 1
A[] = {1}
Output: 
1
Explanation:
Since there's only element hence its only the equilibrium point.
Your Task:
The task is to complete the function equilibriumPoint() which takes the array and n as input parameters and returns the point of equilibrium. 

Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)

class Solution {

    public static int equilibriumPoint(long arr[], int n) {
        //method 1
        // if(n==1){
        //     return 1;
        // }

        // long t=0;
        // for(int i=0;i<n;i++){
        //     t=t+arr[i];
            
        // }
        
        // long s=0;
        // for(int i=0;i<n;i++){
        //     t=t-arr[i];
            
        //     if(t==s){
        //         return i+1;
        //     }
        //     s+=arr[i];
            
        // }
        // return -1;
        
        
        
        
        
        
        
        
        
        
        //method 02
        
        long leftSum=0,rightSum=0;
        int i=0,j=n-1;
        while(i<j){
            if(leftSum<rightSum){
                leftSum+=arr[i];
                i++;
            }else{
                rightSum+=arr[j];
                j--;
            }
        }

        if(leftSum==rightSum){
            return i+1;
        }
        return -1;
        
        
    }
}

------------------------------------------------------------------------------------------------------------------------------------

Question.Count pairs with given sum 
//User function template for C++

class Solution{   
public:
    int getPairsCount(int arr[], int n, int k) {
       int c=0;
       unordered_map<int,int> m;
       for(int i=0;i<n;i++){
           int target=k-arr[i];
           if(m[target]!=0){
               c+=m[target];
              
           }
            m[arr[i]]++;
       }
       return c;
    }
};





//java

HashMap<Integer,Integer> m=new HashMap<>();
int c=0;
for(int i=0;i<n;i++){
  int com=k-arr[i];
  if(m.containsKey(com)){
    c+=m.get(com);
  }
  m.put(arr[i],m.getOrDefault(arr[i],0)+1);
}
return c;


------------------------------------------------------------------------------------------------------------------------

1.Minimize the Heights II

class Solution {
    int getMinDiff(int[] arr, int n, int k) {
        Arrays.sort(arr);
        
        int ans=arr[n-1]-arr[0];
        int smallest=arr[0]+k;
        int largest=arr[n-1]-k;
        int mi,ma;
        
        for(int i=0;i<n-1;i++){
            mi=Math.min(smallest,arr[i+1]-k);
            ma=Math.max(largest,arr[i]+k);
            if(mi<0) continue;
            ans=Math.min(ans,ma-mi);
        }
        
        return ans;
        
    }
}




------------------------------------------------------------
10.Minimum number of jumps

class Solution{
    static int minJumps(int[] arr){
       int n=arr.length;
       if(n<=1)
       return 0;
       
       if(arr[0]==0){
           return -1;
       }
       
       int maxReach=arr[0];
       int step=arr[0];
       int jump=1;
       for(int i=1;i<n;i++){
           if(i==n-1){
               return jump;
           }
           maxReach=Math.max(maxReach,i+arr[i]);
           step--;
           
           if(step==0){
               jump++;
               if(i>=maxReach){
                   return -1;
               }
               step=maxReach-i;
           }
       }
       
       return jump;
       
    }
}










------------------------------------------------------------

11.Find the Duplicate Number

class Solution {
    public int findDuplicate(int[] nums) {

        //method=1;
        // int k=0;
        // Arrays.sort(nums);
        // for(int i=1;i<nums.length;i++){
        //     if(nums[i-1]==nums[i]){
        //         k=nums[i];
        //         break;
        //     }
        // }
        // return k;



    //method=2;
    int n=nums.length;
    Arrays.sort(nums);
    int cc=1;
    int mc=1;
    int ele=nums[0];
    for(int i=1;i<n;i++){
      if(nums[i]==nums[i-1]){
        cc++;
      }
      else{
        cc=1;
      }
      if(cc>mc){
        mc=cc;
        ele=nums[i-1];
      }
    }
    return ele;
    }
}




-----------------------------------------------------------
12.Merge Intervals

//c++ solution
class Solution {
public:
    vector<vector<int>> merge(vector<vector<int>>& intervals) {
        
        sort(intervals.begin(),intervals.end());
        vector<vector<int>> ans;
        
        ans.push_back(intervals[0]);
        int id=0;
        for(int i=1;i<intervals.size();i++){
            if(ans[id][1]>=intervals[i][0]){
                ans[id][1]=max(ans[id][1],intervals[i][1]);
            }
            else{
                ans.push_back(intervals[i]);
                id++;
            }
        }
        return ans;
        
    }
};








//java solution 

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));

         List<int[]> ans = new ArrayList<>();
        
        for (int[] interval : intervals) {
            if (ans.isEmpty() || interval[0] > ans.get(ans.size() - 1)[1]) {
                ans.add(interval);
            } else {
                ans.get(ans.size() - 1)[1] = Math.max(interval[1], ans.get(ans.size() - 1)[1]);
            }
        }
        
        return ans.toArray(new int[ans.size()][]);
    }
}




---------------------------------------------------
13.next premutaion using c++;

class Solution {
public:
    void nextPermutation(vector<int>& a) {
        
        
        int idx=-1;
        int n=a.size();
        for(int i=n-1;i>0;i--){
            if(a[i]>a[i-1]){
                idx=i;
                break;
            }
        }
        
        if(idx==-1){
            reverse(a.begin(),a.end());
            
        }
        else{
            int prev=idx;
            for(int i=idx+1;i<n;i++){
                if(a[i]>a[idx-1] && a[i]<=a[prev]){
                    prev=i;
                }
            }
            swap(a[idx-1],a[prev]);
            reverse(a.begin()+idx,a.end());
            
        }
        
    }
};






//in java solution of next permutaion;

class Solution {

    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    public void reverse(int[] nums, int start){
        int end = nums.length-1;
        while(start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }



    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while(i >= 0 && nums[i] >= nums[i+1]){
            i--;
        }
        if(i>=0) {
            int j = nums.length-1;
            while(j >= 0 && nums[j] <= nums[i]) j--;
            swap(nums, i, j);
        }
        
        reverse(nums, i+1);
    }

}



-----------------------------------------------------------
14.Count Inversions


long long merge(long long arr[], long long l, long long m, long long r) {
        long long left = l, right = m + 1;
        vector<long long> temp;
        long long cnt = 0;
        while(left <= m && right <= r) {
            if(arr[left] <= arr[right]) {
                temp.push_back(arr[left]);
                left++;
            }
            else {
                cnt += (m - left + 1);
                temp.push_back(arr[right]);
                right++;
            }
        }
        
        while(left <= m) {
            temp.push_back(arr[left]);
            left++;
        }
        
        while(right <= r) {
            temp.push_back(arr[right]);
            right++;
        }
        
        for(long long i=0; i<temp.size(); i++) {
            arr[l+i] = temp[i];
        }
        
        return cnt;
    }
    
    
    long long mergeSort(long long arr[], long long left, long long right) {
        long long cnt = 0;
        if(left < right) {
            long long mid = left + (right-left)/2;
            cnt += mergeSort(arr, left, mid);
            cnt += mergeSort(arr, mid+1, right);
            cnt += merge(arr, left, mid, right);
        }
        return cnt;
}


------------------------------------------------------------

1.Chocolate Distribution Problem

//User function Template for Java

class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
     long ans = Integer.MAX_VALUE;
        Collections.sort(a);
        for(int i=0; i<=n-m; i++){
            long diff = a.get(i+m-1) - a.get(i);
            ans = Math.min(ans,diff);
        }
        return ans;
    }
}
------------------------------------------------------------
2.Three way partitioning

class Solution{
    //Function to partition the array around the range such 
    //that array is divided into three parts.
    public void threeWayPartition(int array[], int a, int b)
    {
        int start=0;
        int mid=0;
        int last=array.length-1;
        
        while(mid<=last){
            if(array[mid]<a){
                int temp=array[mid];
                array[mid]=array[start];
                array[start]=temp;
                
               start++;
               mid++;
            }
            else if(array[mid] >=a && array[mid]<=b){
                mid++;
            }
            else{
                int temp=array[mid];
                array[mid]=array[last];
                array[last]=temp;
                last--;
            }
        }
    }
}
------------------------------------------------------------

3.Minimum swaps and K together

class Complete{
    
   
    // Function for finding maximum and value pair
    public static int minSwap (int arr[], int n, int k) {
        int fav=0;
        for(int i=0;i<n;i++){
            if(arr[i]<=k){
                fav++;
            }
        }
        int nonfav=0;
        int winSize = n-1-fav;
        for(int i=n-1;i>winSize;i--){
            if(arr[i]>k){
                nonfav++;
            }
        }
        int l=n-1;
        int r=n-fav;
        int minSwap = Integer.MAX_VALUE;
        while(r>=0){
            minSwap = Math.min(minSwap,nonfav);
            r--;
            if(r<0){
                break;
            }
            if(arr[r]>k) nonfav++;
            if(arr[l]>k) nonfav--;
            l--;
        }
        return (minSwap==Integer.MAX_VALUE?0:minSwap);
    }
    
    
}

------------------------------------------------------------
26. Remove Duplicates from Sorted Array

Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
Return k.
Custom Judge:

The judge will test your solution with the following code:

int[] nums = [...]; // Input array
int[] expectedNums = [...]; // The expected answer with correct length

int k = removeDuplicates(nums); // Calls your implementation

assert k == expectedNums.length;
for (int i = 0; i < k; i++) {
    assert nums[i] == expectedNums[i];
}
If all assertions pass, then your solution will be accepted.

 

Example 1:

Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
Example 2:

Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
 

Constraints:

1 <= nums.length <= 3 * 104
-100 <= nums[i] <= 100
nums is sorted in non-decreasing order.


class Solution {
    public int removeDuplicates(int[] nums) {

        if (nums.length == 0) return 0;

        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }

        }

        return i+1;
    }
}

------------------------------------------------------------
1752. Check if Array Is Sorted and Rotated
Solved
Easy
Topics
Companies
Hint
Given an array nums, return true if the array was originally sorted in non-decreasing order, then rotated some number of positions (including zero). Otherwise, return false.

There may be duplicates in the original array.

Note: An array A rotated by x positions results in an array B of the same length such that A[i] == B[(i+x) % A.length], where % is the modulo operation.

 

Example 1:

Input: nums = [3,4,5,1,2]
Output: true
Explanation: [1,2,3,4,5] is the original sorted array.
You can rotate the array by x = 3 positions to begin on the the element of value 3: [3,4,5,1,2].
Example 2:

Input: nums = [2,1,3,4]
Output: false
Explanation: There is no sorted array once rotated that can make nums.
Example 3:

Input: nums = [1,2,3]
Output: true
Explanation: [1,2,3] is the original sorted array.
You can rotate the array by x = 0 positions (i.e. no rotation) to make nums.
 

Constraints:

1 <= nums.length <= 100
1 <= nums[i] <= 100

class Solution {
    public boolean check(int[] nums) {

        int k=0;
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[(i+1)%n]){
                k++;
            }
        }

        if(k > 1){
            return false;
        }

        return true;
        
    }
}
------------------------------------------------------------



------------------------------------------------------------



------------------------------------------------------------


------------------------------------------------------------



------------------------------------------------------------


------------------------------------------------------------





*/
