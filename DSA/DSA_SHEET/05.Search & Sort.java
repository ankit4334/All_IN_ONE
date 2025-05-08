//in this page we are learn searching and sorting.

/* 
 * First and last occurrences of x
MediumAccuracy: 37.36%Submissions: 252K+Points: 4
Internship Alert
New month-> Fresh Chance to top the leaderboard and get SDE Internship! 

banner
Given a sorted array arr containing n elements with possibly some duplicate, the task is to find the first and last occurrences of an element x in the given array.
Note: If the number x is not found in the array then return both the indices as -1.


Example 1:

Input:
n=9, x=5
arr[] = { 1, 3, 5, 5, 5, 5, 67, 123, 125 }
Output:  
2 5
Explanation: 
First occurrence of 5 is at index 2 and last occurrence of 5 is at index 5. 
Example 2:

Input:
n=9, x=7
arr[] = { 1, 3, 5, 5, 5, 5, 7, 123, 125 }
Output:  
6 6
Explanation: 
First and last occurrence of 7 is at index 6.
Your Task:
Since, this is a function problem. You don't need to take any input, as it is already accomplished by the driver code. You just need to complete the function find() that takes array arr, integer n and integer x as parameters and returns the required answer.

Expected Time Complexity: O(logN)
Expected Auxiliary Space: O(1).

Constraints:
1 ≤ N ≤ 106
1 ≤ arr[i],x ≤ 109

Company Tags
Topic Tags
Related Interview Experiences

class GFG
{
    
    public static int firstOcc(int arr[],int n,int key){
	int s=0,e=n-1;
	int mid=s+(e-s)/2;
	int ans=-1;
	while(s<=e){
		if(arr[mid]==key){
		ans=mid;
		e=mid-1;	
			
		}
		else if(key>arr[mid]){
			s=mid+1;
		}
		else if(key<arr[mid]){
				e=mid-1;
		}
		
		mid=s+(e-s)/2;
	}
	return ans;
}


public static int LastOcc(int arr[],int n,int key){
	int s=0,e=n-1;
	int mid=s+(e-s)/2;
	int ans=-1;
	while(s<=e){
		if(arr[mid]==key){
		ans=mid;
		s=mid+1;	
			
		}
		else if(key>arr[mid]){
			s=mid+1;
		}
		else if(key<arr[mid]){
				e=mid-1;
		}
		
		mid=s+(e-s)/2;
	}
	return ans;
}
    
    ArrayList<Integer> find(int arr[], int n, int x)
    {
        ArrayList<Integer> ans=new ArrayList<>();
        int a=firstOcc(arr,n,x);
        int b=LastOcc(arr,n,x);
        ans.add(a);
        ans.add(b);
        return ans;
    }
}
*/













/* 
 * Value equal to index value
SchoolAccuracy: 54.83%Submissions: 191K+Points: 0
Internship Alert
New month-> Fresh Chance to top the leaderboard and get SDE Internship! 

banner
Given an array Arr of N positive integers. Your task is to find the elements whose value is equal to that of its index value ( Consider 1-based indexing ).

Note: There can be more than one element in the array which have the same value as its index. You need to include every such element's index. Follows 1-based indexing of the array.

Example 1:

Input:
N = 5
Arr[] = {15, 2, 45, 12, 7}
Output: 2
Explanation: Only Arr[2] = 2 exists here.
Example 2:

Input: 
N = 1
Arr[] = {1}
Output: 1
Explanation: Here Arr[1] = 1 exists.
Your Task:  
You don't need to read input or print anything. Your task is to complete the function valueEqualToIndex() which takes the array of integers arr[] and n as parameters and returns an array of indices where the given conditions are satisfied. When there is no such element exists then return an empty array of length 0.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)
 

Constraints:
1 ≤ N ≤ 105
1 ≤ Arr[i] ≤ 106

 

Company Tags
Topic Tags

class Solution {
    ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
         ArrayList<Integer> ans=new  ArrayList<>();
         for(int i=0;i<n;i++){
             if(arr[i]==i+1){
                ans.add(arr[i]);
             }
         }
         return ans;
         
    }
*/










/* 
 * Count Squares
BasicAccuracy: 41.44%Submissions: 127K+Points: 1
Internship Alert
New month-> Fresh Chance to top the leaderboard and get SDE Internship! 

banner
Consider a sample space S consisting of all perfect squares starting from 1, 4, 9 and so on. You are given a number N, you have to output the number of integers less than N in the sample space S.

 

Example 1:

Input :
N = 9
Output:
2
Explanation:
1 and 4 are the only Perfect Squares
less than 9. So, the Output is 2.
Example 2:

Input :
N = 3
Output:
1
Explanation:
1 is the only Perfect Square
less than 3. So, the Output is 1.
 

Your Task:
You don't need to read input or print anything. Your task is to complete the function countSquares() which takes an Integer N as input and returns the answer.

 

Expected Time Complexity: O(sqrt(N))
Expected Auxiliary Space: O(1)

 

Constraints:
1 <= N <= 108

Company Tags
Topic Tags


class Solution {
    /*
    //method 01
    
    static int countSquares(int N) {
        int ans = (int) Math.sqrt(N-1);
        return ans;
    }
    */
    
    
    
    
    //method -2 using banarySearch
    static int countSquares(int n) {
        int s=0;
        int e=n;
        long mid=s+(e-s)/2;
        
        int ans=0;
        while(s<=e){
        long square=mid*mid;
            if(square==(long)n)
            return (int)mid-1;
    
        if(square<n){
            ans=(int)mid;
            s=(int)mid+1;
        }
        else{
            e=(int)mid-1;
        }
        mid=s+(e-s)/2;
            }
            return ans;
            
        }
  }

*/













/*
 * 
 * Max Min
BasicAccuracy: 86.09%Submissions: 89K+Points: 1
Internship Alert
New month-> Fresh Chance to top the leaderboard and get SDE Internship! 

banner
Given an array A of size N of integers. Your task is to find the sum of minimum and maximum element in the array.

Example 1:

Input:
N = 5
A[] = {-2, 1, -4, 5, 3}
Output: 1
Explanation: min = -4, max =  5. Sum = -4 + 5 = 1
 

Example 2:

Input:
N = 4
A[]  = {1, 3, 4, 1}
Output: 5
Explanation: min = 1, max = 4. Sum = 1 + 4 = 5
 

Your Task:  
You don't need to read input or print anything. Your task is to complete the function findSum() which takes the array A[] and its size N as inputs and returns the summation of minimum and maximum element of the array.

 

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

 

Constraints:
1 <= N <= 105
-109 <= Ai <= 109

Topic Tags
Java (1.8)




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



*/











/*
 * Find Missing And Repeating
MediumAccuracy: 24.83%Submissions: 383K+Points: 4
Internship Alert
New month-> Fresh Chance to top the leaderboard and get SDE Internship! 

banner
Given an unsorted array Arr of size N of positive integers. One number 'A' from set {1, 2,....,N} is missing and one number 'B' occurs twice in array. Find these two numbers.

Example 1:

Input:.
N = 2
Arr[] = {2, 2}
Output: 2 1
Explanation: Repeating number is 2 and 
smallest positive missing number is 1.
Example 2:

Input:
N = 3
Arr[] = {1, 3, 3}
Output: 3 2
Explanation: Repeating number is 3 and 
smallest positive missing number is 2.
Your Task:
You don't need to read input or print anything. Your task is to complete the function findTwoElement() which takes the array of integers arr and n as parameters and returns an array of integers of size 2 denoting the answer ( The first index contains B and second index contains A.)

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

Constraints:
2 ≤ N ≤ 105
1 ≤ Arr[i] ≤ N

Company Tags
Topic Tags


class Solve {
    int[] findTwoElement(int arr[], int n) {
        int[] result = new int[2];
        for (int i = 0; i < n; i++) {
            int index = Math.abs(arr[i]) - 1;
            if (arr[index] > 0) {
                arr[index] = -arr[index];
            } else {
                result[0] = Math.abs(arr[i]);
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                result[1] = i + 1;
            }
        }

        return result;
    }
}
*/

















/* 
 * Majority Element
MediumAccuracy: 27.82%Submissions: 583K+Points: 4
Internship Alert
New month-> Fresh Chance to top the leaderboard and get SDE Internship! 

banner
Given an array A of N elements. Find the majority element in the array. A majority element in an array A of size N is an element that appears strictly more than N/2 times in the array.
 

Example 1:

Input:
N = 3 
A[] = {1,2,3} 
Output:
-1
Explanation:
Since, each element in 
{1,2,3} appears only once so there 
is no majority element.
Example 2:

Input:
N = 5 
A[] = {3,1,3,3,2} 
Output:
3
Explanation:
Since, 3 is present more
than N/2 times, so it is 
the majority element.

Your Task:
The task is to complete the function majorityElement() which returns the majority element in the array. If no majority exists, return -1.
 

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).
 

Constraints:
1 ≤ N ≤ 107
0 ≤ Ai ≤ 106

Company Tags
Topic Tags
Related Courses

class Solution{
  public:
     // Function to find majority element in the array
    // a: input array
    // size: size of input array
    int majorityElement(int a[], int n)
    {
        
        int c=1;
        int ele=0;
        for(int i=0;i<n;i++){
            if(a[ele]==a[i]){
                c++;
                
            }
            else{
                c--;
            }
            
            if(c==0){
                c=1;
                ele=i;
            }
        }
        
        c=0;
        for(int i=0;i<n;i++){
            if(a[ele]==a[i]){
                c++;
            }
        }
        if(c<=(n/2))
        return -1;
        else
        return a[ele];
            
    }
};
*/

















/* 
 * Searching in an array where adjacent differ by at most k
EasyAccuracy: 57.91%Submissions: 44K+Points: 2
Internship Alert
New month-> Fresh Chance to top the leaderboard and get SDE Internship! 

banner
A step array is an array of integers where each element has a difference of at most k with its neighbor. Given a key x, we need to find the index value of x if multiple elements exist, and return the first occurrence of the key.

Example 1:

Input : arr[ ] = {4, 5, 6, 7, 6}, K = 1 
        and X = 6
Output : 2
Explanation:
In an array arr 6 is present at index 2.
So, return 2.

Example 2:

Input : arr[ ] = {20 40 50}, K = 20 
        and X = 70
Output :  -1 
 

Your Task:
This is a function problem. The input is already taken care of by the driver code. You only need to complete the function search() that takes an array (arr), sizeOfArray (n), an integer value X, another integer value K, and return an integer displaying the index of the element X in the array arr. If the element is not present in the array return -1. The driver code takes care of the printing.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).

 

Constraints:
1 ≤ N ≤ 105
1 ≤ K ≤ 102
1 ≤ arr[i], X ≤ 105

// such that all elements differ by at-most k.
int search(int arr[], int n, int x, int k)
{
    for(int i=0;i<n;i++){
        if(arr[i]==x){
            return i;
        }
       
    }
     return -1;
}   
*/



















/* 
 * Find Pair Given Difference
EasyAccuracy: 27.25%Submissions: 183K+Points: 2
Internship Alert
New month-> Fresh Chance to top the leaderboard and get SDE Internship! 

banner
Given an array Arr[] of size L and a number N, you need to write a program to find if there exists a pair of elements in the array whose difference is N.

Example 1:

Input:
L = 6, N = 78
arr[] = {5, 20, 3, 2, 5, 80}
Output: 1
Explanation: (2, 80) have difference of 78.
Example 2:

Input:
L = 5, N = 45
arr[] = {90, 70, 20, 80, 50}
Output: -1
Explanation: There is no pair with difference of 45.
Your Task:
You need not take input or print anything. Your task is to complete the function findPair() which takes array arr, size of the array L and N as input parameters and returns True if required pair exists, else return False.

Expected Time Complexity: O(L* Log(L)).
Expected Auxiliary Space: O(1).

Constraints:
1<=L<=104 
1<=Arr[i]<=105 

0<=N<=105

Company Tags
Topic Tags


bool findPair(int arr[], int size, int n){
     for(int i=0; i<size-1; i++){
        for(int j=i+1; j<size; j++){
            if(abs(arr[i]-arr[j])==n)return true;
        }
    }
    return false;
    
    
}
*/


























/* 
 * Find All Four Sum Numbers
MediumAccuracy: 19.94%Submissions: 189K+Points: 4
Internship Alert
New month-> Fresh Chance to top the leaderboard and get SDE Internship! 

banner
Given an array A of integers and another number K. Find all the unique quadruple from the given array that sums up to K.

Also note that all the quadruples which you return should be internally sorted, ie for any quadruple [q1, q2, q3, q4] the following should follow: q1 <= q2 <= q3 <= q4.

Example 1:

Input:
N = 5, K = 3
A[] = {0,0,2,1,1}
Output: 0 0 1 2 
Explanation: Sum of 0, 0, 1, 2 is equal
to K.
Example 2:

Input:
N = 7, K = 23
A[] = {10,2,3,4,5,7,8}
Output: 2 3 8 10 
        2 4 7 10 
        3 5 7 8 
Explanation: Sum of 2, 3, 8, 10 = 23,
sum of 2, 4, 7, 10 = 23 and sum of 3,
5, 7, 8 = 23.
Your Task:
You don't need to read input or print anything. Your task is to complete the function fourSum() which takes the array arr[] and the integer k as its input and returns an array containing all the quadruples in a lexicographical manner. In the output each quadruple is separate by $. The printing is done by the driver's code.

Expected Time Complexity: O(N3).
Expected Auxiliary Space: O(N2).

Constraints:
1 <= N <= 100
-1000 <= K <= 1000
-100 <= A[] <= 100

Company Tags


class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int tar) {
        Arrays.sort(arr);
        int n=arr.length;
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        for(int i=0;i<n-3;i++){
            for(int j=i+1;j<n-2;j++){
                int k=j+1,l=n-1;
                while(k<l){
                    int sum=arr[i]+arr[j]+arr[k]+arr[l];
                    if(sum==tar){
                        ArrayList<Integer> temp=new ArrayList<Integer>(Arrays.asList(arr[i],arr[j],arr[k],arr[l])) ; 
                            if(!ans.contains(temp)) ans.add(temp);
                        k++;
                        l--;
                    }
                    else if(sum>tar) 
                    l--;
                    else 
                    k++;
                }
            }
        }
            return ans;
        }
    }
*/


















/* 
 * Stickler Thief
MediumAccuracy: 37.98%Submissions: 212K+Points: 4
Internship Alert
New month-> Fresh Chance to top the leaderboard and get SDE Internship! 

banner
Stickler the thief wants to loot money from a society having n houses in a single line.
 He is a weird person and follows a certain rule when looting the houses. According to the 
 rule, he will never loot two consecutive houses. At the same time, he wants to maximize the 
 amount he loots. The thief knows which house has what amount of money but is unable to come up 
 with an optimal looting strategy. He asks for your help to find the maximum money he can get if 
 he strictly follows the rule. ith house has a[i] amount of money present in it.

Example 1:

Input:
n = 5
a[] = {6,5,5,7,4}
Output: 
15
Explanation: 
Maximum amount he can get by looting 1st, 3rd and 5th house. Which is 6+5+4=15.
Example 2:

Input:
n = 3
a[] = {1,5,3}
Output: 
5
Explanation: 
Loot only 2nd house and get maximum amount of 5.
Your Task:
Complete the functionFindMaxSum() which takes an array arr[] and n as input which returns the maximum money he can get following the rules.

Expected Time Complexity:O(N).
Expected Space Complexity:O(1).

Constraints:
1 ≤ n ≤ 105
1 ≤ a[i] ≤ 104

Company Tags
Topic Tags
Related Courses
Related Interview Experiences
class Solution
{
    public:
    //Function to find the maximum money the thief can get.
    int FindMaxSum(int arr[], int n)
    {
        long prev1=0, prev2=0;
        for(long i=0;i<n;i++){
            long temp = prev1;
            prev1 = max(prev2 + arr[i], prev1);
            prev2 = temp;
        }
        return prev1;
    }
};
*/

















/* 
 * Count triplets with sum smaller than X
MediumAccuracy: 40.33%Submissions: 84K+Points: 4
Internship Alert
New month-> Fresh Chance to top the leaderboard and get SDE Internship! 

banner
Given an array arr[] of distinct integers of size N
and a value sum, the task is to find the count of triplets 
(i, j, k), having (i<j<k) with the sum of (arr[i] + arr[j] + arr[k])
smaller than the given value sum.


Example 1:


Input: N = 4, sum = 2
arr[] = {-2, 0, 1, 3}
Output:  2
Explanation: Below are triplets with 
sum less than 2 (-2, 0, 1) and (-2, 0, 3). 
 

Example 2:


Input: N = 5, sum = 12
arr[] = {5, 1, 3, 4, 7}
Output: 4
Explanation: Below are triplets with 
sum less than 12 (1, 3, 4), (1, 3, 5), 
(1, 3, 7) and (1, 4, 5).

Your Task:
This is a function problem. You don't need 
to take any input, as it is already accomplished 
by the driver code. You just need to complete the
function countTriplets() that take array arr[], integer
N  and integer sum as parameters and returns the count of triplets.


Expected Time Complexity: O(N2).
Expected Auxiliary Space: O(1).


Constraints:
3 ≤ N ≤ 103
-103 ≤ arr[i] ≤ 103
Company Tags
Topic Tags


class Solution
{
    long countTriplets(long arr[], int n,int sum)
    {
        long c=0;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            int s=i+1;
            int e=n-1;
            while(s<e){
                if(arr[i]+arr[s]+arr[e]<sum){
                    c+=e-s;
                    s++;
                }
                else{
                    e--;
                }
                
            }
        }
        return c;

    }
}


*/























/* 
 * Merge Two Sorted Arrays
Moderate
80/80
Average time to solve is 15m
Contributed by
239 upvotes
Asked in companies
Problem statement
Ninja has been given two sorted integer arrays/lists ‘ARR1’ and ‘ARR2’ of size ‘M’ and ‘N’. Ninja has to merge these sorted arrays/lists into ‘ARR1’ as one sorted array. You may have to assume that ‘ARR1’ has a size equal to ‘M’ + ‘N’ such that ‘ARR1’ has enough space to add all the elements of ‘ARR2’ in ‘ARR1’.

For example:

‘ARR1’ = [3 6 9 0 0]
‘ARR2’ = [4 10]
After merging the ‘ARR1’ and ‘ARR2’ in ‘ARR1’. 
‘ARR1’ = [3 4 6 9 10]
Detailed explanation ( Input/output format, Notes, Images )
Constraints:
1 <= ‘T’ <= 100
1 <= ‘M’, ‘N’ <= 5000
1 <= ‘ARR1[i], ARR2[i]’ <= 100000

Time Limit: 1 second
Sample Input 1:
2
3 2
1 2 3 0 0 
4 5
4 2
1 4 6 10 0 0
2 5
Sample Output 1:
1 2 3 4 5
1 2 4 5 6 10
Explanation for Sample Output 1:
For sample test case 1: 
In this test case, After merging ‘ARR2’ into ‘ARR1’. 
‘ARR1’ = [1 2 3 4 5]

For sample test case 2: 
In this test case, After merging ‘ARR2’ into ‘ARR1’. 
‘ARR1’ = [1 2 4 5 6 10] 
Sample Input 2:
2
2 3
1 10 0 0 0 
3 8 11
3 3
3 4 6 0 0 0
1 8 10
Sample Output 2:
1 3 8 10 11
1 3 4 6 8 10 
Explanation for Sample Output 2:
For sample test case 1: 
In this test case, After merging ‘ARR2’ into ‘ARR1’. 
‘ARR1’ = [1 3 8 10 11]

For sample test case 2: 
In this test case, After merging ‘ARR2’ into ‘ARR1’. 
‘ARR1’ = [1 3 4 6 8 10]

import java.io.*;
import java.util.* ;

public class Solution {
    public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {
       int ans[]=new int[m+n];
       int i=0,j=0,k=0;
       while(i<m && j<n){
           if(arr1[i]<arr2[j]){
               ans[k++]=arr1[i++];
           }
           else{
               ans[k++]=arr2[j++];
           }
       }

       while(i<m){
           ans[k++]=arr1[i++];
       }

       while(j<n){
           ans[k++]=arr2[j++];
       }

       return ans;
    }
}

*/














/* 
 * Zero Sum Subarrays
MediumAccuracy: 51.49%Submissions: 121K+Points: 4
Internship Alert
New month-> Fresh Chance to top the leaderboard and get SDE Internship! 

banner
You are given an array arr[] of size n. Find the total count of sub-arrays having their sum equal to 0.


Example 1:

Input:
n = 6
arr[] = {0,0,5,5,0,0}
Output: 6
Explanation: The 6 subarrays are 
[0], [0], [0], [0], [0,0], and [0,0].

Example 2:

Input:
n = 10
arr[] = {6,-1,-3,4,-2,2,4,6,-12,-7}
Output: 4
Explanation: The 4 subarrays are [-1 -3 4]
[-2 2], [2 4 6 -12], and [-1 -3 4 -2 2]

Your Task:
You don't need to read input or print anything. Complete the function findSubarray() that takes the array arr and its size n as input parameters and returns the total number of sub-arrays with 0 sum. 
 

Expected Time Complexity: O(n*log(n))
Expected Auxilliary Space: O(n)
 

Constraints:    
1 <= n <= 10^6
-10^9 <= arr[ i ] <= 10^9

Company Tags
Topic Tags


class Solution{
    //Function to count subarrays with sum equal to 0.
    public static long findSubarray(long[] arr ,int n) 
    {
        HashMap<Long,Integer> map = new HashMap<>();
        int count=0;
        long sum=0;
        map.put(0L,1);
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(map.containsKey(sum)){
                count+=map.get(sum);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
*/


















/* 
 * Product array puzzle
EasyAccuracy: 33.46%Submissions: 194K+Points: 2
Internship Alert
New month-> Fresh Chance to top the leaderboard and get SDE Internship! 

banner
Given an array nums[] of size n, construct a Product Array P (of same size n) such that P[i] is equal to the product of all the elements of nums except nums[i].

 

Example 1:

Input:
n = 5
nums[] = {10, 3, 5, 6, 2}
Output:
180 600 360 300 900
Explanation: 
For i=0, P[i] = 3*5*6*2 = 180.
For i=1, P[i] = 10*5*6*2 = 600.
For i=2, P[i] = 10*3*6*2 = 360.
For i=3, P[i] = 10*3*5*2 = 300.
For i=4, P[i] = 10*3*5*6 = 900.
Example 2:

Input:
n = 2
nums[] = {12,0}
Output:
0 12

Your Task:
You do not have to read input. Your task is to complete the function productExceptSelf() that takes array nums[] and n as input parameters and returns a list of n integers denoting the product array P. If the array has only one element the returned list should should contains one value i.e {1}
Note: Try to solve this problem without using the division operation.
 

Expected Time Complexity: O(n)
Expected Auxiliary Space: O(n)
 

Constraints:
1 <= n <= 1000
0 <= numsi <= 200
Array may contain duplicates.

Company Tags

class Solution 
{ 
	public static long[] productExceptSelf(int nums[], int n) 
	{ 
         long[] arr = new long[n];
        int count = 0;
        long prod = 1;
        int j=-1;
        for(int i=0; i< n;i++){
            if(nums[i] != 0) {
                prod = prod*nums[i];
            }  
                
            else{
                j=i;
                count++;
            }
                
        }
        
        if(count == 0){
            for(int i=0;i<n;i++){
                arr[i] = prod/nums[i];
            }
        }
        else if(count == 1){
            arr[j] = prod;
        }
        
        return arr;
	} 
} 
*/















/* 
 * Bishu and Soldiers
5457
49%
20
Share
Details
Submissions
Discussion
Similar Problems
Editorial
Problem
Bishu went to fight for Coding Club. There were N soldiers with various powers. There will be Q rounds to fight and in each round, Bishu's power will be varied. With power M, Bishu can kill all the soldiers whose power is less than or equal to M(<=M). After each round, All the soldiers who are dead in the previous round will reborn. Such that in each round there will be N soldiers to fight. As Bishu is weak in mathematics, help him to count the number of soldiers that he can kill in each round and the total sum of their powers.

INPUT:

The first line of the input contains N, the number of soldiers.

The second line contains an array of N numbers denoting the power of each soldier

This third line contains Q, which denotes the number of rounds.

Q lines follow, each line having one number denoting the power of Bishu.

OUTPUT:

For each round, the output should be an array of two numbers. The first number should be the number of soldiers that Bishu can beat, and the second number denotes the cumulative strength of all the soldiers that Bishu can beat.

CONSTRAINTS:

1<=N<=10000

1<=power of each soldier<=100

1<=Q<=10000

import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
       
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int a[]=new int[n];
       for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
       }

    int r=sc.nextInt();
       
    while(r!=0){
        int m=sc.nextInt();
        int c=0;
        int sum=0;
        for(int i=0;i<n;i++){
            if(m>=a[i]){
                c++;
                sum+=a[i];
            }
        }
        System.out.println(c+" "+sum);

        r--;
    }


    }
}
*/



















/* 
 * Game of largest element
Easy
40/40
6 upvotes
Asked in companies
Problem statement
Ninja and his friend are playing a game of finding the largest element in an array/list ‘ARR’ consisting of ‘N’ unique elements. To make it difficult for Ninja to win, his friend rotates 'ARR' K(possibly zero) times to the left about the largest element. Now, it is Ninja’s turn to find and tell the largest element to his friend.

For Example: 'ARR' = [1, 2, 3, 4, 5] after rotating 2 times to the left about its largest element (here, 5) becomes [3, 4, 5, 1, 2].

Your task is to help Ninja determine the largest element in the sorted and rotated ‘ARR’.

For Example: For the rotated 'ARR’ = [4, 5, 1, 2, 3], the largest element is ‘5’ which is at index 1(0 based indexing).

Detailed explanation ( Input/output format, Notes, Images )
Constraints:
1 <= T <= 100
1 <= N <= 10^5
1 <= ARR[i] <= 10^5

Where ‘T’ is the number of test cases, ‘ARR’ is the given array and ‘N’ denotes the number of elements in the ‘ARR’.

Time Limit: 1 sec 
Sample Input 1:
2
3
2 3 1
4
1 2 3 4
Sample Output 1:
3
4
Explanation of Sample Input 1:
For the first test case:
The largest element in the given ‘ARR’ is 3 which is at index 1 (0 based indexing). 

For the second test case:
The largest element in the given ‘ARR’ is 4 which is at index 3. 
Sample Input 2:
2
3
3 1 2
1
10 
Sample Output 2:
3
10
Explanation of Sample Input 2:
For the first test case:
3 is the largest element in ‘ARR’ which is at index 0.

For the second test case:
10 is the largest element in ‘ARR’ which is at index 0.    

#include <bits/stdc++.h> 
int findTheLargestElement(vector<int> &arr, int n) {
	  

    sort(arr.begin(),arr.end());

    return arr[n-1];
}

*/




















/* 
 * K-th element of two Arrays
MediumAccuracy: 37.4%Submissions: 202K+Points: 4
Internship Alert
New month-> Fresh Chance to top the leaderboard and get SDE Internship! 

banner
Given two sorted arrays arr1 and arr2 of size N and M respectively and an element K. The task is to find the element that would be at the kth position of the final sorted array.
 

Example 1:

Input:
arr1[] = {2, 3, 6, 7, 9}
arr2[] = {1, 4, 8, 10}
k = 5
Output:
6
Explanation:
The final sorted array would be -
1, 2, 3, 4, 6, 7, 8, 9, 10
The 5th element of this array is 6.
Example 2:
Input:
arr1[] = {100, 112, 256, 349, 770}
arr2[] = {72, 86, 113, 119, 265, 445, 892}
k = 7
Output:
256
Explanation:
Final sorted array is - 72, 86, 100, 112,
113, 119, 256, 265, 349, 445, 770, 892
7th element of this array is 256.

Your Task:  
You don't need to read input or print anything. Your task is to complete the function kthElement() which takes the arrays arr1[], arr2[], its size N and M respectively and an integer K as inputs and returns the element at the Kth position.


Expected Time Complexity: O(Log(N) + Log(M))
Expected Auxiliary Space: O(Log (N))


Constraints:
1 <= N, M <= 106
0 <= arr1i, arr2i < INT_MAX
1 <= K <= N+M

Company Tags

class Solution {
    public long kthElement( int arr1[], int arr2[], int m, int n, int k) {
        
        int arr[] = new int[m+n];
        int i=0,j=0,c=0;
        while(i<m && j<n){
            if(arr1[i] <= arr2[j]){
                arr[c++] = arr1[i];
                i++;
            }
            else{
                arr[c++] = arr2[j];
                j++;
            }
        }
        
        while(i<m){
            arr[c++] = arr1[i];
            i++;
        }
        
        while(j<n){
            arr[c++] = arr2[j];
            j++;
        }
        
        return arr[k-1];
    }
}
*/





















/* 
 * Arithmetic Number
EasyAccuracy: 16.63%Submissions: 170K+Points: 2
Internship Alert
New month-> Fresh Chance to top the leaderboard and get SDE Internship! 

banner
Given three integers  'A' denoting the first term of an arithmetic sequence , 'C' denoting the common difference of an arithmetic sequence and an integer 'B'. you need to tell whether 'B' exists in the arithmetic sequence or not. Return 1 if B is present in the sequence. Otherwise, returns 0.

Example 1:

Input: A = 1, B = 3, C = 2
Output: 1
Explaination: 3 is the second term of the 
sequence starting with 1 and having a common 
difference 2.
Example 2:

Input: A = 1, B = 2, C = 3
Output: 0
Explaination: 2 is not present in the sequence.
Your Task:
You do not need to read input or print anything. Your task is to complete the function inSequence() which takes A, B and C and returns 1 if B is present in the sequence. Otherwise, returns 0.

Expected Time Complexity: O(1)
Expected Auxiliary Space: O(1)

Constraints:
-109 ≤ A, B, C ≤ 109  

Company Tags


class Solution{
    static int inSequence(int A, int B, int C){
         if(A==B){
            return 1;
        }
        if(C==0){
            return 0;
        }
        B = B-A;
        if(B/C>=0 && B%C==0){
            return 1;
        }
        return 0;
    }
*/



















/* 
 * 
*/



















/* 
 * 
*/

























/* 
 * 
*/





















/* 
 * 
*/


















/* 
 * 
*/





















/* 
 * 
*/




















/* 
 * 
*/