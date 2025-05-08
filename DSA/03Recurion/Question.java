/*
70. Climbing Stairs
Solved
Easy
Topics
Companies
Hint
You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

 

Example 1:

Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
Example 2:

Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step
 
class Solution {
    public int climbStairs(int n) {
        int dp[]=new int[n+1];

        dp[0]=1;
        dp[1]=1;

        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }

        return dp[n];

    }
}
--------------------------------------------------------------------------------------------------------------------
GCD of two numbers
Difficulty: BasicAccuracy: 51.03%Submissions: 93K+Points: 1
Given two positive integers a and b, find GCD of a and b.

Note: Don't use the inbuilt gcd function

Example 1:

Input: 
a = 3
b = 6
Output: 3
Explanation: GCD of 3 and 6 is 3



class Solution {
    public static int gcd(int a, int b) {
        if(b==0){
           return a;
       }
       return gcd(b,a%b);
    }
}




--------------------------------------------------------------------------------------------------------------------
342. Power of Four
Solved
Easy
Topics
Companies
Given an integer n, return true if it is a power of four. Otherwise, return false.

An integer n is a power of four, if there exists an integer x such that n == 4x.

 

Example 1:

Input: n = 16
Output: true
Example 2:

Input: n = 5
Output: false
Example 3:

Input: n = 1
Output: true


class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==0) return false;
        if(n==1) return true;

        if(n%4==0){
            return isPowerOfFour(n/4);
        }

        return false;
    }
}

--------------------------------------------------------------------------------------------------------------------
78. Subsets
Solved
Medium
Topics
Companies
Given an integer array nums of unique elements, return all possible 
subsets
 (the power set).

The solution set must not contain duplicate subsets. Return the solution in any order.

 

Example 1:

Input: nums = [1,2,3]
Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
Example 2:

Input: nums = [0]
Output: [[],[0]]


class Solution {

   public void  solve(int[] nums,int index,List<Integer> output,List<List<Integer>> ans) {
        if(index>=nums.length){
            ans.add(new ArrayList<>(output));
            return;
        }

        //exclude
        solve(nums,index+1,output,ans);

        //include
        int ele=nums[index];
        output.add(ele);

        solve(nums, index + 1, new ArrayList<>(output), ans); // Create a new ArrayList instance

        //solve(nums,index+1,output,ans);
        output.remove(output.size() - 1);
    } 


    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> output=new ArrayList<>();
        int index=0;
        solve(nums,index,output,ans);
        return ans;
    }
}

--------------------------------------------------------------------------------------------------------------------
22. Generate Parentheses
Solved
Medium
Topics
Companies
Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

 

Example 1:

Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]
Example 2:

Input: n = 1
Output: ["()"]

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        String temp="";
        int l=0,r=0;
        solve(ans,n,l,r,temp);
        return ans;
    }

    public static void solve(List<String> ans,int  n,int l,int r,String temp){
        if(n==r && n==l){
            ans.add(temp);
            return;
        }

        if(l<n){
            solve(ans,n,l+1,r,temp+"(");
        }

        if(r<l){
            solve(ans,n,l,r+1,temp+")");
        }

    }

}

--------------------------------------------------------------------------------------------------------------------
Subset Sums
Difficulty: MediumAccuracy: 72.55%Submissions: 135K+Points: 4
Given a list arr of n integers, return sums of all subsets in it. Output sums can be printed in any order.

Examples:

Input: n = 2, arr[] = {2, 3}
Output: 0 2 3 5
Explanation: When no elements is taken then Sum = 0. When only 2 is taken then Sum = 2. When only 3 is taken then Sum = 3. When element 2 and 3 are taken then Sum = 2+3 = 5.
Example 2:

Input: n = 3, arr = {1, 2, 1}
Output: 0 1 1 2 2 3 3 4
 
Your Task:  
You don't need to read input or print anything. Your task is to complete the function subsetSums() which takes a list/vector and an integer n as an input parameter and returns the list/vector of all the subset sums.

Expected Time Complexity: O(2n)
Expected Auxiliary Space: O(2n)



class Solution {
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int n) {
        ArrayList<Integer> ans=new ArrayList<>();
        solve(arr,ans,n,0);
        return ans;
    }
    
    public static void solve(ArrayList<Integer> arr,ArrayList<Integer> ans,int n,int s){
        if(n==0){
            ans.add(s);
            return;
        }
        
        solve(arr,ans,n-1,s+arr.get(n-1));
        solve(arr,ans,n-1,s);
        
    }
    
}
--------------------------------------------------------------------------------------------------------------------
494. Target Sum
Solved
Medium
Topics
Companies
You are given an integer array nums and an integer target.

You want to build an expression out of nums by adding one of the symbols '+' and '-' before each integer in nums and then concatenate all the integers.

For example, if nums = [2, 1], you can add a '+' before 2 and a '-' before 1 and concatenate them to build the expression "+2-1".
Return the number of different expressions that you can build, which evaluates to target.

 

Example 1:

Input: nums = [1,1,1,1,1], target = 3
Output: 5
Explanation: There are 5 ways to assign symbols to make the sum of nums be target 3.
-1 + 1 + 1 + 1 + 1 = 3
+1 - 1 + 1 + 1 + 1 = 3
+1 + 1 - 1 + 1 + 1 = 3
+1 + 1 + 1 - 1 + 1 = 3
+1 + 1 + 1 + 1 - 1 = 3
Example 2:

Input: nums = [1], target = 1
Output: 1


class Solution {
    static int  ans=0;
    public int findTargetSumWays(int[] nums, int target) {
        ans=0;
        solve(nums,target,nums.length,0);
        return  ans;
    }

    public static void solve(int nums[],int target,int n,int s){
        if(n==0){
            if(s==target){
            ans++;
            }
            return;
        }
        

        solve(nums,target,n-1,s+nums[n-1]);
        solve(nums,target,n-1,s-nums[n-1]);
    }


}


--------------------------------------------------------------------------------------------------------------------
//Subset Sum Of repeting element.
public class Question {

    public static int subset(int a[],int n,int sum,int index){
        if(sum==0)
            return 1;

           if(index==n || sum<0)
           return 0;
        
        return subset(a,n,sum,index+1)+subset(a,n,sum-a[index],index);
    }
     public static void main(String[] args){
        int a[]={2,3,4}; //ans=3
        int n=a.length;
        int sum=6;
        System.out.println(subset(a,n,sum,0));

    }
}



--------------------------------------------------------------------------------------------------------------------
Subset Sum
Moderate
72/80
Average time to solve is 25m
Contributed by
82 upvotes
Problem statement
You are given an array 'A' of 'N' integers. You have to return true if there exists a subset of elements of 'A' that sums up to 'K'. Otherwise, return false.



For Example
'N' = 3, 'K' = 5, 'A' = [1, 2, 3].
Subset [2, 3] has sum equal to 'K'.
So our answer is True.
Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1 :
4 13
4 3 5 2
Sample Output 1 :
No
Sample Input 2 :
5 14
4 2 5 6 7
Sample Output 2 :
Yes
Constraints :
1 <= 'N' <= 10^3
1 <= 'A[i]' <= 10^3
1 <= 'K' <= 10^3
Time Limit: 1 sec


public class Solution {
    public static boolean isSubsetPresent(int n, int k,int []a) {
        // Write your code here
        return solve(n,k,a,0,0);
    }

    public static boolean solve(int n,int k,int a[],int sum,int i){
        if(sum==k){
            return true;
        }

        if(i==n || sum>k){
            return false;
        }

        return solve(n,k,a,sum,i+1) || solve(n,k,a,sum+a[i],i+1);
    }
}


--------------------------------------------------------------------------------------------------------------------

39. Combination Sum
Medium
Topics
Companies
Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where
the chosen numbers sum to target. You may return the combinations in any order.

The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the 
frequency
 of at least one of the chosen numbers is different.

The test cases are generated such that the number of unique combinations that sum up to target is less than 150 combinations for the given input.

 

Example 1:

Input: candidates = [2,3,6,7], target = 7
Output: [[2,2,3],[7]]
Explanation:
2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
7 is a candidate, and 7 = 7.
These are the only two combinations.
Example 2:

Input: candidates = [2,3,5], target = 8
Output: [[2,2,2,2],[2,3,3],[3,5]]
Example 3:

Input: candidates = [2], target = 1
Output: []


class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ArrayList<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        solve(candidates,target,ans,temp,0);
        return ans;
    }

    public static void solve(int[] candidates, int target,ArrayList<List<Integer>> ans,List<Integer> temp,int i){
        if(target==0){
            ans.add(new ArrayList<>(temp));
            return;
        }

        if(i>=candidates.length || target < 0){
            return;
        }

        temp.add(candidates[i]);
        solve(candidates,target-candidates[i],ans,temp,i);
        temp.remove(temp.size()-1);
        solve(candidates,target,ans,temp,i+1);
    }

}


--------------------------------------------------------------------------------------------------------------------
40. Combination Sum II
Solved
Medium
Topics
Companies
Given a collection of candidate numbers (candidates) and a target number (target), find all unique combinations in candidates where
the candidate numbers sum to target.

Each number in candidates may only be used once in the combination.

Note: The solution set must not contain duplicate combinations.

 

Example 1:

Input: candidates = [10,1,2,7,6,1,5], target = 8
Output: 
[
[1,1,6],
[1,2,5],
[1,7],
[2,6]
]
Example 2:

Input: candidates = [2,5,2,1,2], target = 5
Output: 
[
[1,2,2],
[5]
]

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        findCombinationsSum(candidates,target,ans,temp,0);
        return ans;
    }

    public static void findCombinationsSum(int[] candidates, int target,List<List<Integer>> ans,List<Integer> temp,int start){
        if(target==0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(start>=candidates.length || target<0){
            return;
        }

        for(int i=start;i<candidates.length;i++){
            if(i>start && candidates[i-1]==candidates[i]) continue;
            temp.add(candidates[i]);
            findCombinationsSum(candidates,target-candidates[i],ans,temp,i+1);
            temp.remove(temp.size()-1);
            
        }
    }
}



--------------------------------------------------------------------------------------------------------------------
90. Subsets II
Solved
Medium
Topics
Companies
Given an integer array nums that may contain duplicates, return all possible 
subsets
 (the power set).

The solution set must not contain duplicate subsets. Return the solution in any order.

 

Example 1:

Input: nums = [1,2,2]
Output: [[],[1],[1,2],[1,2,2],[2],[2,2]]
Example 2:

Input: nums = [0]
Output: [[],[0]]
 

Constraints:

1 <= nums.length <= 10
-10 <= nums[i] <= 10


import java.util.*;

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums); 
        List<List<Integer>> ans = new ArrayList<>();
        findSubSet(nums, ans, new ArrayList<>(), 0);
        return ans;
    }

    private void findSubSet(int[] nums, List<List<Integer>> ans, List<Integer> temp, int index) {
        ans.add(new ArrayList<>(temp));

        for (int i = index; i < nums.length; i++) {
            if (i > index && nums[i] == nums[i - 1]) continue;
            temp.add(nums[i]);
            findSubSet(nums, ans, temp, i + 1); 
            temp.remove(temp.size() - 1); 
        }
    }
}


--------------------------------------------------------------------------------------------------------------------
216. Combination Sum III
Solved
Medium
Topics
Companies
Find all valid combinations of k numbers that sum up to n such that the following conditions are true:

Only numbers 1 through 9 are used.
Each number is used at most once.
Return a list of all possible valid combinations. The list must not contain the same combination twice, and the combinations may be returned in any order.

 

Example 1:

Input: k = 3, n = 7
Output: [[1,2,4]]
Explanation:
1 + 2 + 4 = 7
There are no other valid combinations.
Example 2:

Input: k = 3, n = 9
Output: [[1,2,6],[1,3,5],[2,3,4]]
Explanation:
1 + 2 + 6 = 9
1 + 3 + 5 = 9
2 + 3 + 4 = 9
There are no other valid combinations.
Example 3:

Input: k = 4, n = 1
Output: []
Explanation: There are no valid combinations.
Using 4 different numbers in the range [1,9], the smallest sum we can get is 1+2+3+4 = 10 and since 10 > 1, there are no valid combination.

class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        findCombinationSum(ans,temp,k,n,1,0);
        return ans;
    }

    public static void findCombinationSum( List<List<Integer>> ans,List<Integer> temp,int k, int n,int start,int sum){
        if(k==0 && sum==n){
            ans.add(new ArrayList<>(temp));
            return;
        }

        if(k==0 || sum>n){
            return;
        }

        for(int i=start;i<=9;i++){
            temp.add(i);
            findCombinationSum(ans,temp,k-1,n,i+1,sum+i);
            temp.remove(temp.size()-1);
        }

    }

}
--------------------------------------------------------------------------------------------------------------------
131. Palindrome Partitioning
Solved
Medium
Topics
Companies
Given a string s, partition s such that every 
substring
 of the partition is a 
palindrome
. Return all possible palindrome partitioning of s.

 

Example 1:

Input: s = "aab"
Output: [["a","a","b"],["aa","b"]]
Example 2:

Input: s = "a"
Output: [["a"]]
 

Constraints:

1 <= s.length <= 16
s contains only lowercase English letters.

class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        findPartition(s,ans,new ArrayList<>(), 0);
        return ans;
    }

    public static void findPartition(String s,List<List<String>> ans,List<String> temp,int start){
       if (start == s.length()) {
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int end=start;end<s.length();end++){
            String substring = s.substring(start, end + 1);
            if (isPalindrom(substring)) {
                temp.add(substring);  
                findPartition(s, ans, temp, end + 1);  
                temp.remove(temp.size() - 1);  
            }

        }
        
        
    }

    public static boolean isPalindrom(String str){
        int s=0;
        int e=str.length()-1;
        while(s<=e){
            if(str.charAt(s)!=str.charAt(e)){
                return false;
            }
            else{
                s++;
                e--;
            }
        }

        return true;
    }
}

--------------------------------------------------------------------------------------------------------------------


--------------------------------------------------------------------------------------------------------------------


--------------------------------------------------------------------------------------------------------------------
--------------------------------------------------------------------------------------------------------------------
--------------------------------------------------------------------------------------------------------------------
--------------------------------------------------------------------------------------------------------------------
--------------------------------------------------------------------------------------------------------------------
--------------------------------------------------------------------------------------------------------------------
--------------------------------------------------------------------------------------------------------------------
--------------------------------------------------------------------------------------------------------------------
--------------------------------------------------------------------------------------------------------------------
--------------------------------------------------------------------------------------------------------------------
--------------------------------------------------------------------------------------------------------------------

--------------------------------------------------------------------------------------------------------------------
46. Permutations
Solved
Medium
Topics
Companies
Given an array nums of distinct integers, return all the possible 
permutations
. You can return the answer in any order.

 

Example 1:

Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
Example 2:

Input: nums = [0,1]
Output: [[0,1],[1,0]]
Example 3:

Input: nums = [1]
Output: [[1]]

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        boolean[] vis = new boolean[nums.length];
        solve(nums,ans,temp,vis);
        return ans;
    }
    
    public static void solve(int[] nums,List<List<Integer>> ans,List<Integer> temp,boolean[] vis){
        if(nums.length==temp.size()){
            ans.add(new ArrayList<>(temp));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(!vis[i]){
                vis[i]=true;
                temp.add(nums[i]);
                solve(nums,ans,temp,vis);
                vis[i]=false;
                temp.remove(temp.size()-1);
            }
        }
    }
}


--------------------------------------------------------------------------------------------------------------------
47. Permutations II
Solved
Medium
Topics
Companies
Given a collection of numbers, nums, that might contain duplicates, return all possible unique permutations in any order.

 

Example 1:

Input: nums = [1,1,2]
Output:
[[1,1,2],
 [1,2,1],
 [2,1,1]]
Example 2:

Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]

class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        
        solve(nums,ans,0);

        return ans;
    }

    public static void solve(int[] nums,List<List<Integer>> ans,int index){

        if(index==nums.length){
            List<Integer> permutation = Arrays.stream(nums).boxed().toList();
            ans.add(new ArrayList<>(permutation));
            return;
        }

        int  use[]=new int[21];

        for(int i = index; i < nums.length; i++){
            if(use[nums[i]+10]==0){
                use[nums[i] + 10] = 1;
                swap(nums, i, index);
                solve(nums,ans,index+1);
                swap(nums, i, index);
            }
        }
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}


--------------------------------------------------------------------------------------------------------------------
Ways to sum to N
Difficulty: MediumAccuracy: 31.97%Submissions: 13K+Points: 4
Given a set of m distinct positive integers and a value ‘N’. Count the total number of ways we can form ‘N’ by  adding the array elements. Repetitions and different arrangements are allowed.
Note: Answer can be quite large output the answer modulo 109+7.

Example 1:

Input:
m = 3 , N = 7
Arr[] = {1,5,6}
Output: 6
Explanation: The different ways are:
1+1+1+1+1+1+1
1+1+5
1+5+1
5+1+1
1+6
6+1

class Solution
{
    public int countWays(int arr[], int m, int N) { 
    if (N == 0) {
        return 1;
    }
    if (N < 0) {
        return 0;
    }

    long ans = 0;
    for (int i = 0; i < m; i++) {
        ans = (ans + countWays(arr, m, N - arr[i])) % 1000000007;
    }
    return (int) ans;
}

    
}


->Note:-this code do note pass all test case solve using dp.

--------------------------------------------------------------------------------------------------------------------
Permutations of a given string
Difficulty: MediumAccuracy: 34.65%Submissions: 274K+Points: 4
Given a string s. The task is to return a vector of string of all unique permutations of the given string, s that may contain dulplicates in lexicographically sorted order. 

Examples:

Input: ABC
Output: [ABC, ACB, BAC, BCA, CAB, CBA]
Explanation: Given string ABC has permutations in 6 forms as ABC, ACB, BAC, BCA, CAB and CBA .
Input: ABSG
Output: [ABGS, ABSG, AGBS, AGSB, ASBG, ASGB, BAGS, BASG, BGAS, BGSA, BSAG, BSGA, GABS, GASB, GBAS, GBSA, GSAB, GSBA, SABG, SAGB, SBAG, SBGA, SGAB, SGBA]
Explanation: Given string ABSG has 24 permutations.
Expected Time Complexity: O(n! * n)
Expected Space Complexity: O(n! * n)

class Solution {
    public List<String> find_permutation(String s) {
    Set<String>ans = new TreeSet<>();
    boolean vis[] = new boolean[s.length()];
    solve(s, ans, vis, "");
     return new ArrayList<>(ans);
}

public static void solve(String s,Set<String>ans, boolean vis[], String temp) {
    if (s.length() == temp.length()) {
        ans.add(temp);
        return;
    }
    
    for (int i = 0; i < s.length(); i++) {
        char ch = s.charAt(i);
        if (!vis[i]) {
            vis[i] = true;
            solve(s, ans, vis, temp + ch);
            vis[i] = false;
        }
    }
}

    
}

--------------------------------------------------------------------------------------------------------------------
1823. Find the Winner of the Circular Game
Solved
Medium
Topics
Companies
Hint
There are n friends that are playing a game. The friends are sitting in a circle and are numbered from 1 to n in clockwise order. More formally, moving clockwise from the ith friend brings you to the (i+1)th friend for 1 <= i < n, and moving clockwise from the nth friend brings you to the 1st friend.

The rules of the game are as follows:

Start at the 1st friend.
Count the next k friends in the clockwise direction including the friend you started at. The counting wraps around the circle and may count some friends more than once.
The last friend you counted leaves the circle and loses the game.
If there is still more than one friend in the circle, go back to step 2 starting from the friend immediately clockwise of the friend who just lost and repeat.
Else, the last friend in the circle wins the game.
Given the number of friends, n, and an integer k, return the winner of the game.

 

Example 1:


Input: n = 5, k = 2
Output: 3
Explanation: Here are the steps of the game:
1) Start at friend 1.
2) Count 2 friends clockwise, which are friends 1 and 2.
3) Friend 2 leaves the circle. Next start is friend 3.
4) Count 2 friends clockwise, which are friends 3 and 4.
5) Friend 4 leaves the circle. Next start is friend 5.
6) Count 2 friends clockwise, which are friends 5 and 1.
7) Friend 1 leaves the circle. Next start is friend 3.
8) Count 2 friends clockwise, which are friends 3 and 5.
9) Friend 5 leaves the circle. Only friend 3 is left, so they are the winner.
Example 2:

Input: n = 6, k = 5
Output: 1
Explanation: The friends leave in this order: 5, 4, 6, 2, 3. The winner is friend 1.


class Solution {

    public static int solve(boolean person[], int n, int index, int person_left, int k) {
        if (person_left == 1) {
            for (int i = 0; i < n; i++) {
                if (!person[i])  // Find the last remaining person
                    return i;
            }
        }

        // Count `k` steps forward to find the person to kill
        int steps = k;
        while (steps > 1) {  // Move `k-1` steps forward to find the `k-th` person
            index = (index + 1) % n;
            if (!person[index]) {
                steps--;
            }
        }

        // Mark the current person as killed
        person[index] = true;

        // Move to the next person (alive) for the next recursive call
        index = (index + 1) % n;
        while (person[index]) {
            index = (index + 1) % n;
        }

        return solve(person, n, index, person_left - 1, k);
    }

    public int findTheWinner(int n, int k) {
        boolean person[] = new boolean[n];
        return solve(person, n, 0, n, k) + 1;  // +1 for 1-based indexing
    }
}


--------------------------------------------------------------------------------------------------------------------
Tower Of Hanoi
Difficulty: MediumAccuracy: 35.23%Submissions: 153K+Points: 4
The tower of Hanoi is a famous puzzle where we have three rods and n disks. The objective of the puzzle is to move the entire stack to another rod. You are given the number of discs n. Initially, these discs are in the rod 1. You need to print all the steps of discs movement so that all the discs reach the 3rd rod. Also, you need to find the total moves.

You only need to complete the function toh() that takes following parameters: n (number of discs), from (The rod number from which we move the disc), to (The rod number to which we move the disc), aux (The rod that is used as an auxiliary rod) and prints the required moves inside function body (See the example for the format of the output) as well as return the count of total moves made.

Note: The discs are arranged such that the top disc is numbered 1 and the bottom-most disc is numbered n. Also, all the discs have different sizes and a bigger disc cannot be put on the top of a smaller disc. Refer the provided link to get a better clarity about the puzzle.

Examples:

Input: n = 2
Output:
move disk 1 from rod 1 to rod 2
move disk 2 from rod 1 to rod 3
move disk 1 from rod 2 to rod 3
3
Explanation: For N=2 , steps will be as follows in the example and total 3 steps will be taken.
Input: n = 3
Output:
move disk 1 from rod 1 to rod 3
move disk 2 from rod 1 to rod 2
move disk 1 from rod 3 to rod 2
move disk 3 from rod 1 to rod 3
move disk 1 from rod 2 to rod 1
move disk 2 from rod 2 to rod 3
move disk 1 from rod 1 to rod 3
7
Explanation: For N=3 , steps will be as follows in the example and total 7 steps will be taken.
Expected Time Complexity: O(2n).
Expected Auxiliary Space: O(n).


class Solution {
  public:
    void solve(int n, int sour, int help, int dest)  {
        if(n==1) {
           cout << "move disk " << n << " from rod " << sour << " to rod " << dest << endl;
           return;
       }
       solve(n-1,sour,dest,help);
       cout << "move disk " << n << " from rod " << sour << " to rod " << dest << endl;
       solve(n-1,help,sour,dest);
    }
    long long toh(int n, int from, int to, int aux) {
        solve(n,from,aux,to);
        return pow(2,n) - 1;
    }
};




--------------------------------------------------------------------------------------------------------------------
--------------------------------------------------------------------------------------------------------------------
--------------------------------------------------------------------------------------------------------------------
--------------------------------------------------------------------------------------------------------------------
--------------------------------------------------------------------------------------------------------------------
--------------------------------------------------------------------------------------------------------------------
--------------------------------------------------------------------------------------------------------------------
--------------------------------------------------------------------------------------------------------------------
--------------------------------------------------------------------------------------------------------------------
Rat in a Maze Problem - I
Difficulty: MediumAccuracy: 35.75%Submissions: 300K+Points: 4
Consider a rat placed at (0, 0) in a square matrix mat of order n* n. It has to reach the destination at (n - 1, n - 1). Find all possible paths that the rat can take to reach from source to destination. The directions in which the rat can move are 'U'(up), 'D'(down), 'L' (left), 'R' (right). Value 0 at a cell in the matrix represents that it is blocked and rat cannot move to it while value 1 at a cell in the matrix represents that rat can be travel through it.
Note: In a path, no cell can be visited more than one time. If the source cell is 0, the rat cannot move to any other cell. In case of no path, return an empty list. The driver will output "-1" automatically.

Examples:

Input: mat[][] = [[1, 0, 0, 0],
                [1, 1, 0, 1], 
                [1, 1, 0, 0],
                [0, 1, 1, 1]]
Output: DDRDRR DRDDRR
Explanation: The rat can reach the destination at (3, 3) from (0, 0) by two paths - DRDDRR and DDRDRR, when printed in sorted order we get DDRDRR DRDDRR.
Input: mat[][] = [[1, 0],
                [1, 0]]
Output: -1
Explanation: No path exists and destination cell is blocked.
Expected Time Complexity: O(3n^2)
Expected Auxiliary Space: O(l * x)
Here l = length of the path, x = number of paths.


class Solution {
    public ArrayList<String> findPath(int[][] mat) {
        // Your code here
        int n=mat.length;
        ArrayList<String> ans=new ArrayList<>();
        boolean vis[][]=new boolean[n][n];
        
        if(mat[0][0]==1){
            solve(mat,n,0,0,vis,"",ans);
        }
        
        return ans;
    }
    
    public static boolean valid(int i,int j,int n){
        return i>=0 && j>=0 && i<n && j<n;
    }
    
    public static void solve(int[][] mat,int n,int i,int j,boolean vis[][],String temp,ArrayList<String> ans){
        if(i==n-1 && j==n-1){
            ans.add(temp);
            return;
        }
        
        vis[i][j]=true;
        
        //up
        if(valid(i-1,j,n) && mat[i-1][j]==1 && !vis[i-1][j]){
            solve(mat,n,i-1,j,vis,temp+"U",ans);
        }
        
        
        //Down
        if(valid(i+1,j,n) && mat[i+1][j]==1 && !vis[i+1][j]){
            solve(mat,n,i+1,j,vis,temp+"D",ans);
        }
        
        
        //left
        if(valid(i,j-1,n) && mat[i][j-1]==1 && !vis[i][j-1]){
            solve(mat,n,i,j-1,vis,temp+"L",ans);
        }
        
        
        //right
        if(valid(i,j+1,n) && mat[i][j+1]==1 && !vis[i][j+1]){
            solve(mat,n,i,j+1,vis,temp+"R",ans);
        }
        
        vis[i][j]=false;
        
    }
    
}

--------------------------------------------------------------------------------------------------------------------
Print N-bit binary numbers having more 1s than 0s
Difficulty: MediumAccuracy: 56.08%Submissions: 45K+Points: 4
Given a positive integer n. Your task is to generate a string list of all n-bit binary numbers where, for any prefix of the number, there are more or an equal number of 1's than 0's. The numbers should be sorted in decreasing order of magnitude.

Example 1:

Input:  
n = 2
Output: 
{"11", "10"}
Explanation: Valid numbers are those where each prefix has more 1s than 0s:
11: all its prefixes (1 and 11) have more 1s than 0s.
10: all its prefixes (1 and 10) have more 1s than 0s.
So, the output is "11, 10".
Example 2:

Input:  
n = 3
Output: 
{"111", "110", "101"}
Explanation: Valid numbers are those where each prefix has more 1s than 0s.
111: all its prefixes (1, 11, and 111) have more 1s than 0s.
110: all its prefixes (1, 11, and 110) have more 1s than 0s.
101: all its prefixes (1, 10, and 101) have more 1s than 0s.
So, the output is "111, 110, 101".
User Task:
Your task is to complete the function NBitBinary() which takes a single integer n as input and returns the list of strings in decreasing order. You need not take any input or print anything.

Expected Time Complexity: O(|2n|)
Expected Auxiliary Space: O(2n)

Constraints:
1 <= n <= 15


ArrayList<String> NBitBinary(int N) {
        ArrayList<String> ans=new ArrayList<>();
        solve(ans,N,0,0,"");
        return ans;
    }
    
    public static void solve( ArrayList<String> ans,int N,int zero,int one,String temp){
        if(N==temp.length()){
            ans.add(temp);
            return;
        }
        
        
        solve(ans,N,zero,one+1,temp+"1");
        
        
        if(zero<one){
            solve(ans,N,zero+1,one,temp+"0");
        }
        
    }

--------------------------------------------------------------------------------------------------------------------
Generate all binary strings
Difficulty: MediumAccuracy: 64.72%Submissions: 12K+Points: 4
Given an integer N , Print all binary strings of size N which do not contain consecutive 1s.

A binary string is that string which contains only 0 and 1.

Example 1:

Input:
N = 3
Output:
000 , 001 , 010 , 100 , 101
Explanation:
None of the above strings contain consecutive 1s. "110" is not an answer as it has '1's occuring consecutively. 
Your Task:

You don't need to read input or print anything. Your task is to complete the function generateBinaryStrings() which takes an integer N as input and returns a list of all valid binary strings in lexicographically increasing order.

Expected Time Complexity: O(2N)
Expected Auxiliary Space: O(N)

Constraints:
1 <= N <= 20

class Solution {
  public static List<String> generateBinaryStrings(int n) {
    List<String> ans=new ArrayList<>();
    solve(n,ans,"",0);
    return ans;
  }
  
  public static void solve(int n,List<String> ans,String temp,int count){
    if(n==count){
        ans.add(temp);
        return;
    }
    
    solve(n,ans,temp+"0",count+1);
    
    
    if (temp.isEmpty() || (count >-1 && temp.charAt(count-1) != '1')) {
        solve(n, ans, temp + "1",count+1);
    }
    
  }
  
}

--------------------------------------------------------------------------------------------------------------------
51. N-Queens
Solved
Hard
Topics
Companies
The n-queens puzzle is the problem of placing n queens on an n x n chessboard such that no two queens attack each other.

Given an integer n, return all distinct solutions to the n-queens puzzle. You may return the answer in any order.

Each solution contains a distinct board configuration of the n-queens' placement, where 'Q' and '.' both indicate a queen and an empty space, respectively.

 

Example 1:


Input: n = 4
Output: [[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."]]
Explanation: There exist two distinct solutions to the 4-queens puzzle as shown above
Example 2:

Input: n = 1
Output: [["Q"]]
 

Constraints:

1 <= n <= 9


class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans=new ArrayList<>();

       char [][]board=new char[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               board[i][j]='.';
            }
        }

        solve(n,ans,board,0);
        
        return ans;
    }

    public static void solve(int n,List<List<String>> ans,char [][]board,int row){
        if(row==n){

            List<String> temp=new ArrayList<>();
            for(int i=0;i<n;i++){
                String str="";
                for(int j=0;j<n;j++){
                    str+=board[i][j];
                }
                temp.add(str);
            }

            ans.add(temp);
            return;
        }

        for(int j=0;j<n;j++){
            if(isSafe(n,board,row,j)){
            board[row][j]='Q';
            solve(n,ans,board,row+1);
            board[row][j]='.';
            }
        }
        

    }

    public static boolean isSafe(int n,char [][]board,int row,int col){

        //check the same column
        for(int i=0;i<row;i++){
            if(board[i][col]=='Q'){
                return false;
            }
        }

        //check northwest
        int i=row;
        int j=col;
        while(i>=0 && j>=0){
            if(board[i][j]=='Q'){
                return false;
            }
            i--;
            j--;
        }


        //check northeast
         i=row;
         j=col;
        while(i>=0 && j<n){
            if(board[i][j]=='Q'){
                return false;
            }
            i--;
            j++;
        }

        return true;

    }
}

--------------------------------------------------------------------------------------------------------------------
37. Sudoku Solver
Solved
Hard
Topics
Companies
Write a program to solve a Sudoku puzzle by filling the empty cells.

A sudoku solution must satisfy all of the following rules:

Each of the digits 1-9 must occur exactly once in each row.
Each of the digits 1-9 must occur exactly once in each column.
Each of the digits 1-9 must occur exactly once in each of the 9 3x3 sub-boxes of the grid.
The '.' character indicates empty cells.

 

Example 1:


Input: board = [["5","3",".",".","7",".",".",".","."],["6",".",".","1","9","5",".",".","."],[".","9","8",".",".",".",".","6","."],["8",".",".",".","6",".",".",".","3"],["4",".",".","8",".","3",".",".","1"],["7",".",".",".","2",".",".",".","6"],[".","6",".",".",".",".","2","8","."],[".",".",".","4","1","9",".",".","5"],[".",".",".",".","8",".",".","7","9"]]
Output: [["5","3","4","6","7","8","9","1","2"],["6","7","2","1","9","5","3","4","8"],["1","9","8","3","4","2","5","6","7"],["8","5","9","7","6","1","4","2","3"],["4","2","6","8","5","3","7","9","1"],["7","1","3","9","2","4","8","5","6"],["9","6","1","5","3","7","2","8","4"],["2","8","7","4","1","9","6","3","5"],["3","4","5","2","8","6","1","7","9"]]
Explanation: The input board is shown above and the only valid solution is shown below:


 

Constraints:

board.length == 9
board[i].length == 9
board[i][j] is a digit or '.'.
It is guaranteed that the input board has only one solution.


//Tc=(9^m) & Sc=(1);

class Solution {
    public void solveSudoku(char[][] board) {
        solve(0,0,board);
    }

    public static boolean solve(int i,int j,char[][] board){
        if(i==9){
            return true;
        }

        if(j==9){
            return solve(i+1,0,board);
        }

        if(board[i][j]!='.'){
            return solve(i,j+1,board);
        }

        for(int num=1;num<10;num++){
            if(cheak(num,board,i,j)){
                board[i][j]=(char)(num+'0');
                if(solve(i,j+1,board)){
                    return true;
                }
                board[i][j]='.';
            }
        }

        return false;

    }


    public static boolean cheak(int num,char[][] board,int i,int j){
        char c=(char)(num+'0');

        //cheak at same row
        for(int col=0;col<9;col++){
            if(board[i][col]==c){
                return false;
            }
        }

        //cheak at same col
        for(int row=0;row<9;row++){
            if(board[row][j]==c){
                return false;
            }
        }

        //cheak at same box
        int row=i/3*3;
        int col=j/3*3;
        for(int a=row;a<row+3;a++){
            for(int b=col;b<col+3;b++){
                if(board[a][b]==c){
                    return false;
                }
            }
        }
        return true;
    }

}

--------------------------------------------------------------------------------------------------------------------


--------------------------------------------------------------------------------------------------------------------


--------------------------------------------------------------------------------------------------------------------


--------------------------------------------------------------------------------------------------------------------


--------------------------------------------------------------------------------------------------------------------


--------------------------------------------------------------------------------------------------------------------


--------------------------------------------------------------------------------------------------------------------


--------------------------------------------------------------------------------------------------------------------


--------------------------------------------------------------------------------------------------------------------



*/