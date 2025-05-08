
// class Sliding_Window{
// public static void main(String[] args) {
//     System.out.println( "ankit");
// }
// }

/*
----------------------------------------------------------------------------------------------------------------------
Zero Sum Subarrays
Difficulty: MediumAccuracy: 51.49%Submissions: 137K+Points: 4Average Time: 60m
You are given an array arr[] of integers. Find the total count of subarrays with their sum equal to 0.

Examples:

Input: arr[] = [0, 0, 5, 5, 0, 0]
Output: 6
Explanation: The 6 subarrays are [0], [0], [0], [0], [0,0], and [0,0].
Input: arr[] = [6, -1, -3, 4, -2, 2, 4, 6, -12, -7]
Output: 4
Explanation: The 4 subarrays are [-1, -3, 4], [-2, 2], [2, 4, 6, -12], 
and [-1, -3, 4, -2, 2]


//Method-01
class Solution {
    public int findSubarray(int[] arr) {
        int count=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum==0){
                    count++;
                }
            }
        }
        
        return count;
    }
}



//Method-02

class Solution {
    public int findSubarray(int[] arr) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int sum=0;
        int c=0;
        hm.put(0,1);
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(hm.containsKey(sum)){
                c+=hm.get(sum);
            }
            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        
        return c;
    }
}

----------------------------------------------------------------------------------------------------------------------

560. Subarray Sum Equals K
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
 

Constraints:

1 <= nums.length <= 2 * 104
-1000 <= nums[i] <= 1000
-107 <= k <= 107



class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int prefixSum=0;
        int c=0;
        hm.put(0,1);
        for(int i=0;i<nums.length;i++){
            prefixSum+=nums[i];
            if(hm.containsKey(prefixSum-k)){
                c+=hm.get(prefixSum-k);
            }
            hm.put(prefixSum,hm.getOrDefault(prefixSum,0)+1);
        }
        
        return c;
    }
}
----------------------------------------------------------------------------------------------------------------------
Subarray with given XOR
Programming
Hashing
medium
52.1% Success

984

20

Bookmark
Asked In:
Problem Description
 
 

Given an array of integers A and an integer B.

Find the total number of subarrays having bitwise XOR of all elements equals to B.



Problem Constraints
1 <= length of the array <= 105

1 <= A[i], B <= 109



Input Format
The first argument given is the integer array A.

The second argument given is integer B.



Output Format
Return the total number of subarrays having bitwise XOR equals to B.



Example Input
Input 1:

 A = [4, 2, 2, 6, 4]
 B = 6
Input 2:

 A = [5, 6, 7, 8, 9]
 B = 5


Example Output
Output 1:

 4
Output 2:

2


public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int preXor=0;
        hm.put(0,1);
        int ans=0;
        for(int i=0;i<A.size();i++){
            preXor^=A.get(i);
            if(hm.containsKey(preXor^B)){
                ans+=hm.get(preXor^B);
            }
            hm.put(preXor,hm.getOrDefault(preXor,0)+1);
        }
        
        return ans;
        
    }
}

----------------------------------------------------------------------------------------------------------------------
152. Maximum Product Subarray
Solved
Medium
Topics
Companies
Given an integer array nums, find a subarray that has the largest product, and return the product.

The test cases are generated so that the answer will fit in a 32-bit integer.

 

Example 1:

Input: nums = [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.
Example 2:

Input: nums = [-2,0,-1]
Output: 0
Explanation: The result cannot be 2, because [-2,-1] is not a subarray.

//Brute Force

class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int pro=1;
            for(int j=i;j<n;j++){
                pro*=nums[j];
                ans=Math.max(ans,pro);
            }
        }
        return ans;
    }
}


//Optimal
class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int ans=nums[0];;
        int maxPro=nums[0];
        int minPro=nums[0];
        for(int i=1;i<n;i++){
            if(nums[i]<0){
                int temp=maxPro;
                maxPro=minPro;
                minPro=temp;
            }
            maxPro=Math.max(maxPro*nums[i],nums[i]);
            minPro=Math.min(minPro*nums[i],nums[i]);
            ans=Math.max(ans,maxPro);
        }

        return ans;
    }
}
 

----------------------------------------------------------------------------------------------------------------------
974. Subarray Sums Divisible by K
Solved
Medium
Topics
Companies
Given an integer array nums and an integer k, return the number of non-empty subarrays that have a sum divisible by k.

A subarray is a contiguous part of an array.

 

Example 1:

Input: nums = [4,5,0,-2,-3,1], k = 5
Output: 7
Explanation: There are 7 subarrays with a sum divisible by k = 5:
[4, 5, 0, -2, -3, 1], [5], [5, 0], [5, 0, -2, -3], [0], [0, -2, -3], [-2, -3]
Example 2:

Input: nums = [5], k = 9
Output: 0





class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,1);
        int prefixSum=0;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            prefixSum+=nums[i];
            int mod=prefixSum%k;
            if(mod<0){
                mod=k+mod;
            }
            if(hm.containsKey(mod)){
                ans+=hm.get(mod);
            }
            hm.put(mod,hm.getOrDefault(mod,0)+1);
        }
        return ans;
    }
}
----------------------------------------------------------------------------------------------------------------------
713. Subarray Product Less Than K
Solved
Medium
Topics
Companies
Hint
Given an array of integers nums and an integer k, return the number of contiguous subarrays where the product of all the elements in the subarray is strictly less than k.

 

Example 1:

Input: nums = [10,5,2,6], k = 100
Output: 8
Explanation: The 8 subarrays that have product less than 100 are:
[10], [5], [2], [6], [10, 5], [5, 2], [2, 6], [5, 2, 6]
Note that [10, 5, 2] is not included as the product of 100 is not strictly less than k.
Example 2:

Input: nums = [1,2,3], k = 0
Output: 0




//method-01 (Brute force);
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        //Brute Force Approch
        int count=0;
        for(int i=0;i<nums.length;i++){
            int pro=1;
            for(int j=i;j<nums.length;j++){
                pro*=nums[j];
                if(pro<k){
                    count++;
                }
                else{
                    break;
                }
            }
        }
        return count;
    }
}

//method-02 (Optimal)
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int pro=1;
        int count=0;
        int start=0,end=0,n=nums.length;
        while(end<n){
            pro*=nums[end];

            //product chota hona chahiye mere k se sath hi start < end
            while(pro>=k && start<=end){
                pro/=nums[start];
                start++;
            }
            count+=1+(end-start);
            end++;
        }
        return count;
    }
}


----------------------------------------------------------------------------------------------------------------------
2302. Count Subarrays With Score Less Than K
Solved
Hard
Topics
Companies
Hint
The score of an array is defined as the product of its sum and its length.

For example, the score of [1, 2, 3, 4, 5] is (1 + 2 + 3 + 4 + 5) * 5 = 75.
Given a positive integer array nums and an integer k, return the number of non-empty subarrays of nums whose score is strictly less than k.

A subarray is a contiguous sequence of elements within an array.

 

Example 1:

Input: nums = [2,1,4,3,5], k = 10
Output: 6
Explanation:
The 6 subarrays having scores less than 10 are:
- [2] with score 2 * 1 = 2.
- [1] with score 1 * 1 = 1.
- [4] with score 4 * 1 = 4.
- [3] with score 3 * 1 = 3. 
- [5] with score 5 * 1 = 5.
- [2,1] with score (2 + 1) * 2 = 6.
Note that subarrays such as [1,4] and [4,3,5] are not considered because their scores are 10 and 36 respectively, while we need scores strictly less than 10.
Example 2:


class Solution {
    public long countSubarrays(int[] nums, long k) {
        long sum=0;
        long count=0;
        int n=nums.length;
        int start=0,end=0;
        while(end<n){
            sum+=nums[end];

            // While the score exceeds k, adjust the window
            while (sum * (end - start + 1) >= k) {
                sum -= nums[start];
                start++;
            }
           // Count valid subarrays ending at `end`
            count += (end - start + 1);
            end++;
        }
        return count;
    }
}
----------------------------------------------------------------------------------------------------------------------
209. Minimum Size Subarray Sum
Solved
Medium
Topics
Companies
Given an array of positive integers nums and a positive integer target, return the minimal length of a subarray whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.

 

Example 1:

Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: The subarray [4,3] has the minimal length under the problem constraint.
Example 2:

Input: target = 4, nums = [1,4,4]
Output: 1
Example 3:

Input: target = 11, nums = [1,1,1,1,1,1,1,1]
Output: 0
 

Constraints:

1 <= target <= 109
1 <= nums.length <= 105
1 <= nums[i] <= 104
 

Follow up: If you have figured out the O(n) solution, try coding another solution of which the time complexity is O(n log(n)).

//Method - 01

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int ans=Integer.MAX_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=nums[j];
                if(sum>=target){
                    ans=Math.min(ans,(j-i)+1);
                    break;
                }
            }
        }
        return ans==Integer.MAX_VALUE ? 0 : ans;
    }
}

//Method - 02

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int ans=Integer.MAX_VALUE;
        int n=nums.length;
        int start=0;
        int sum=0;
        for(int end=0;end<n;end++){
            sum+=nums[end];
            while(sum>=target ){
                ans=Math.min(ans,(end-start)+1);
                sum-=nums[start];
                start++;
            }
            
        }
         return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}
----------------------------------------------------------------------------------------------------------------------
76. Minimum Window Substring
Solved
Hard
Topics
Companies
Hint
Given two strings s and t of lengths m and n respectively, return the minimum window substring of s such that every character in t (including duplicates) is included in the window. If there is no such substring, return the empty string "".

The testcases will be generated such that the answer is unique.

 

Example 1:

Input: s = "ADOBECODEBANC", t = "ABC"
Output: "BANC"
Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.
Example 2:

Input: s = "a", t = "a"
Output: "a"
Explanation: The entire string s is the minimum window.
Example 3:

Input: s = "a", t = "aa"
Output: ""
Explanation: Both 'a's from t must be included in the window.
Since the largest window of s only has one 'a', return empty string.
 

Constraints:

m == s.length
n == t.length




class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";
        
        int total = t.length();
        HashMap<Character, Integer> hm = new HashMap<>();

        // Add characters of t to the map
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }

        int start = 0, ans = Integer.MAX_VALUE, index = -1;

        for (int end = 0; end < s.length(); end++) {
            char ch = s.charAt(end);
            if (hm.containsKey(ch)) {
                hm.put(ch, hm.get(ch) - 1);
                if (hm.get(ch) >= 0) total--;
            }

            // Try shrinking the window
            while (total == 0) {
                // Update minimum window length
                if (ans > end - start + 1) {
                    ans = end - start + 1;
                    index = start;
                }

                // Try removing start character from the window
                char startChar = s.charAt(start);
                if (hm.containsKey(startChar)) {
                    hm.put(startChar, hm.get(startChar) + 1);
                    if (hm.get(startChar) > 0) total++;
                }
                start++;
            }
        }

        // If no valid window found, return ""
        if (index == -1) return "";
        return s.substring(index, index + ans);
    }
}


----------------------------------------------------------------------------------------------------------------------

2958. Length of Longest Subarray With at Most K Frequency
Solved
Medium
Topics
Companies
Hint
You are given an integer array nums and an integer k.

The frequency of an element x is the number of times it occurs in an array.

An array is called good if the frequency of each element in this array is less than or equal to k.

Return the length of the longest good subarray of nums.

A subarray is a contiguous non-empty sequence of elements within an array.

 

Example 1:

Input: nums = [1,2,3,1,2,3,1,2], k = 2
Output: 6
Explanation: The longest possible good subarray is [1,2,3,1,2,3] since the values 1, 2, and 3 occur at most twice in this subarray. Note that the subarrays [2,3,1,2,3,1] and [3,1,2,3,1,2] are also good.
It can be shown that there are no good subarrays with length more than 6.
Example 2:

Input: nums = [1,2,1,2,1,2,1,2], k = 1
Output: 2
Explanation: The longest possible good subarray is [1,2] since the values 1 and 2 occur at most once in this subarray. Note that the subarray [2,1] is also good.
It can be shown that there are no good subarrays with length more than 2.
Example 3:

Input: nums = [5,5,5,5,5,5,5], k = 4
Output: 4
Explanation: The longest possible good subarray is [5,5,5,5] since the value 5 occurs 4 times in this subarray.
It can be shown that there are no good subarrays with length more than 4.





class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int len=0;
        int start=0;

        for(int end=0;end<nums.length;end++){
            hm.put(nums[end],hm.getOrDefault(nums[end],0)+1);

            while(hm.get(nums[end]) > k){
               hm.put(nums[start],hm.get(nums[start])-1);
                start++;
            }

            len=Math.max(len,(end-start)+1);
        }

        return len;

    }
}
----------------------------------------------------------------------------------------------------------------------
2962. Count Subarrays Where Max Element Appears at Least K Times
Solved
Medium
Topics
Companies
You are given an integer array nums and a positive integer k.

Return the number of subarrays where the maximum element of nums appears at least k times in that subarray.

A subarray is a contiguous sequence of elements within an array.

 

Example 1:

Input: nums = [1,3,2,3,3], k = 2
Output: 6
Explanation: The subarrays that contain the element 3 at least 2 times are: [1,3,2,3], [1,3,2,3,3], [3,2,3], [3,2,3,3], [2,3,3] and [3,3].
Example 2:

Input: nums = [1,4,2,1], k = 3
Output: 0
Explanation: No subarray contains the element 4 at least 3 times.
 

Constraints:

1 <= nums.length <= 105
1 <= nums[i] <= 106
1 <= k <= 105





class Solution {
    public long countSubarrays(int[] nums, int k) {
        int n=nums.length;
        int start=0;
        long total=0;
        int count=0;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            max=Math.max(nums[i],max);
        }

        for(int end=0;end<n;end++){
            if(nums[end]==max){
                count++;
            }
            while(count==k){
                total+=n-end;
                if(nums[start]==max){
                    count--;
                }
                start++;
            }
        }

        return total;
    }
}

----------------------------------------------------------------------------------------------------------------------
992. Subarrays with K Different Integers
Solved
Hard
Topics
Companies
Hint
Given an integer array nums and an integer k, return the number of good subarrays of nums.

A good array is an array where the number of different integers in that array is exactly k.

For example, [1,2,3,1,2] has 3 different integers: 1, 2, and 3.
A subarray is a contiguous part of an array.

 

Example 1:

Input: nums = [1,2,1,2,3], k = 2
Output: 7
Explanation: Subarrays formed with exactly 2 different integers: [1,2], [2,1], [1,2], [2,3], [1,2,1], [2,1,2], [1,2,1,2]
Example 2:

Input: nums = [1,2,1,3,4], k = 3
Output: 3
Explanation: Subarrays formed with exactly 3 different integers: [1,2,1,3], [2,1,3], [1,3,4].
 

Constraints:

1 <= nums.length <= 2 * 104
1 <= nums[i], k <= nums.length




class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMostK(nums, k) - atMostK(nums, k - 1);
    }

    private int atMostK(int[] nums, int k) {
        int n = nums.length;
        int start = 0;
        int count = 0;
        int total = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int end = 0; end < n; end++) {
            hm.put(nums[end], hm.getOrDefault(nums[end], 0) + 1);
            if (hm.get(nums[end]) == 1) {
                count++;
            }

            while (count > k) {
                hm.put(nums[start], hm.get(nums[start]) - 1);
                if (hm.get(nums[start]) == 0) {
                    count--;
                }
                start++;
            }

            total += (end - start + 1);
        }

        return total;
    }
}

----------------------------------------------------------------------------------------------------------------------








----------------------------------------------------------------------------------------------------------------------








----------------------------------------------------------------------------------------------------------------------

















----------------------------------------------------------------------------------------------------------------------









----------------------------------------------------------------------------------------------------------------------













----------------------------------------------------------------------------------------------------------------------










----------------------------------------------------------------------------------------------------------------------

*/