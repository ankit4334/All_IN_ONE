/* 
01.Reverse a String


import java.util.*;
import java.io.*;
import java.lang.*;

class Driver
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- >0)
        {
            String str = read.readLine();
            System.out.println(new Reverse().reverseWord(str));
        }
    }
}
// } Driver Code Ends


//User function Template for Java


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



//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java


import java.io.*;
import java.util.*;


class Array {
	public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int a[] = new int[n];
            
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            
            Solution ob = new Solution();
            
            System.out.println(ob.findSum(a,n));
        }
        
	}
}
// } Driver Code Ends


//User function Template for Java

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

//{ Driver Code Starts
//Initial function template for C++

#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends
//User function template for C++

class Solution{
    public:
    // arr : given array
    // l : starting index of the array i.e 0
    // r : ending index of the array i.e size-1
    // k : find kth smallest element and return using this function
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


//{ Driver Code Starts.
 
int main()
{
    int test_case;
    cin>>test_case;
    while(test_case--)
    {
        int number_of_elements;
        cin>>number_of_elements;
        int a[number_of_elements];
        
        for(int i=0;i<number_of_elements;i++)
            cin>>a[i];
            
        int k;
        cin>>k;
        Solution ob;
        cout<<ob.kthSmallest(a, 0, number_of_elements-1, k)<<endl;
    }
    return 0;
}
// } Driver Code Ends





















----------------------------------------------------------
4.Sort an array of 0s, 1s and 2s(medium)

//{ Driver Code Starts
//Initial template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function template for Java

class Solution
{
    public static void sort012(int a[], int n)
    {
        
        int s=0,m=0,h=n-1;
        while(m<=h){
            if(a[m]==0){
                int t=a[m];
                a[m]=a[s];
                a[s]=t;
                s++;
                m++;
            }
            else if(a[m]==1){
                m++;
            }
            else{
                int t=a[m];
                a[m]=a[h];
                a[h]=t;
                h--;
            }
        }

    }
}

//{ Driver Code Starts.

class GFG {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            Solution ob=new Solution();
            ob.sort012(arr, n);
            StringBuffer str = new StringBuffer();
            for(int i=0; i<n; i++){
                str.append(arr[i]+" ");
            }
            System.out.println(str);
        }
    }
}


// } Driver Code Ends



---------------------------------------------------

Question:Move all negative elements to end
EasyAccuracy: 56.24%Submissions: 111K+Points: 2
Internship Alert!
Become an SDE Intern by topping this monthly leaderboard! 

banner
Given an unsorted array arr[] of size n having both negative and positive integers. The task is place all negative element at the end of array without changing the order of positive element and negative element.

 

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
 


Constraints:
1 ≤ n ≤ 106
-109 ≤ arr[i] ≤ 109

Topic Tags


//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
            PrintWriter ot = new  PrintWriter(System.out);
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Solution obj = new Solution();
            obj.segregateElements(a, n);
            
            for(int i=0;i<n;i++)
            ot.print(a[i]+" ");
            
            ot.println();
        }
        ot.close();
	}
}

// } Driver Code Ends


//User function Template for Java

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








-------------------------------------------------------
5.Union of two arrays


//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	    
	    //Taking input using class Scanner
		Scanner sc=new Scanner(System.in);
		
		//Taking total count of testcases
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0)
		{
		    
		    int n,m;
		    
		    //taking size of array a
		    n=sc.nextInt();
		    
		    //taking size of array b
		    m=sc.nextInt();
		    
		    //Creating 2 array of size n and m
		    int a[]=new int[n];
		    int b[]=new int[m];
		    
		    //inserting elements to array a
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    
		    //inserting elements to array b
		    for(int i=0;i<m;i++)
		    {
		        b[i]=sc.nextInt();
		    }
		    Solution ob=new Solution();
		    //calling doUnion method and printing the results
		    System.out.println(ob.doUnion(a,n,b,m));
		}
		
	}
}
// } Driver Code Ends


//User function Template for Java

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
7.Cyclically rotate an array by one

//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[n];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Compute obj = new Compute();
            obj.rotate(a, n);
            
            StringBuilder output = new StringBuilder();
            for(int i=0;i<n;i++)
                output.append(a[i]+" ");
            System.out.println(output);
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java

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












---------------------------------------------------------
8.Kadane's Algorithm
//or fine the maximum subarray of an array;


//{ Driver Code Starts
import java.io.*;

import java.util.*;

class Main {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    //size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //adding elements
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		    //calling maxSubarraySum() function
		    System.out.println(obj.maxSubarraySum(arr, n));
		}
	}
}


// } Driver Code Ends


class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
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















--------------------------------------------------------
9.Minimize the Heights II

//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

  public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int k = Integer.parseInt(inputLine[0]);
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().getMinDiff(arr, n, k);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends




// User function Template for Java

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


//{ Driver Code Starts
import java.lang.*;
import java.io.*;
import java.util.*;
class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	 
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int t = Integer.parseInt(br.readLine()); 

        while(t-- > 0){
            int size = Integer.parseInt(br.readLine());
            String[] arrStr = ((String)br.readLine()).split("\\s+");
            int[] arr= new int[size];
            for(int i = 0;i<size;i++){
                arr[i] = Integer.parseInt(arrStr[i]);
            }
            System.out.println(new Solution().minJumps(arr));
        }
	 }
	 
}

// } Driver Code Ends


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




//using java.
class Solution {
    public int maxProfit(int[] prices) {
        
       int n=prices.length;
       int maxpro=0;
       int mr=prices[n-1];
        for(int i=n-2;i>=0;i--){
            mr=Math.max(mr,prices[i]);
            maxpro=Math.max(maxpro,mr-prices[i]);
        }
        return maxpro;
        
    }
}











------------------------------------------------------------
16.Count pairs with given sum 
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




------------------------------------------------------------
17.Common elements using c++

class Solution
{
    public:    
       vector <int> commonElements (int a[], int b[], int c[], int n1, int n2, int n3)
        {
            
            
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
//{ Driver Code Starts
//Initial Template for Java

import java.util.*;

public class GFG
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) 
        {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int n3 = sc.nextInt();
            
            int A[] = new int[n1];
            int B[] = new int[n2];
            int C[] = new int[n3];
            
            for (int i = 0;i < n1;i++)
            {
                A[i] = sc.nextInt();
            }
            for (int i = 0;i < n2;i++)
            {
                B[i] = sc.nextInt();
            }
            for (int i = 0;i < n3;i++)
            {
                C[i] = sc.nextInt();
            }
            
            Solution sol = new Solution();
            ArrayList<Integer> res = sol.commonElements(A, B, C, n1, n2, n3);
            if (res.size() == 0)
            {
                System.out.print(-1);
            }
            else 
            {
                for (int i = 0;i < res.size();i++)
                {
                    System.out.print(res.get(i) + " ");
                }    
            }
            System.out.println();
        }
    }
}


// } Driver Code Ends


//User function Template for Java

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

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().rearrange(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java




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












------------------------------------------------------------
18.Subarray with 0 sum




class Solution{
    //Function to check whether there is a subarray present with 0-sum or not.
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
19.Maximum Product Subarray



class Solution {
    // Function to find maximum product subarray
   
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
------------------------------------------------------------
21.Triplet Sum in Array



//User function Template for Java

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
22.Chocolate Distribution Problem


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
23.Three way partitioning


//User function Template for Java

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



24.Minimum swaps and K together



//User function Template for Java



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



25.
/* 
Find triplets with zero sum
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

*/
------------------------------------------------------------





26.
/* 
 * Union of Two Sorted Arrays
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

*/
------------------------------------------------------------



27.
/* 
 * Leaders in an array
EasyAccuracy: 29.94%Submissions: 610K+Points: 2
200+ people shotlisted last month for SDE Internship. Grab your spot this month via GfG Weekly Contest! 

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

//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.stream.*;

class Array {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter ot = new PrintWriter(System.out);
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		
		while(t-->0){
		    
		    //input size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //inserting elements in the array
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		    StringBuffer str = new StringBuffer();
		    ArrayList<Integer> res = new ArrayList<Integer>();
		  
		    //calling leaders() function
		    res = obj.leaders(arr, n);
		    

		    for(int i=0; i<res.size(); i++){
		        ot.print(res.get(i)+" ");
		    }
		    
		    ot.println();
		}
		ot.close();
		
	}
}

// } Driver Code Ends


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

*/
------------------------------------------------------------




28.
/* 
 * Equilibrium Point
EasyAccuracy: 28.13%Submissions: 538K+Points: 2
200+ people shotlisted last month for SDE Internship. Grab your spot this month via GfG Weekly Contest! 

banner
Given an array A of n non negative numbers. The task is to find the first equilibrium point in an array. Equilibrium point in an array is an index (or position) such that the sum of all elements before that index is same as sum of elements after it.

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

Constraints:
1 <= n <= 105
0 <= A[i] <= 109

Company Tags
//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.stream.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            
            //taking input n
            int n = Integer.parseInt(br.readLine().trim());
            long arr[] = new long[n];
            String inputLine[] = br.readLine().trim().split(" ");
            
            //adding elements to the array
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(inputLine[i]);
            }

            Solution ob = new Solution();
            
            //calling equilibriumPoint() function
            System.out.println(ob.equilibriumPoint(arr, n));
        }
    }
}
// } Driver Code Ends


class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
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

*/
------------------------------------------------------------




29.
------------------------------------------------------------



30.
------------------------------------------------------------





31.
------------------------------------------------------------




32.
------------------------------------------------------------



33.
------------------------------------------------------------



34.
------------------------------------------------------------


35.
------------------------------------------------------------

36.
------------------------------------------------------------





*/