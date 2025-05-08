/* 
 704. Binary Search
Solved
Easy
Topics
Companies
Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4
Example 2:

Input: nums = [-1,0,3,5,9,12], target = 2
Output: -1
Explanation: 2 does not exist in nums so return -1



class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int s=0;
        int e=n-1;
        int m=s+(e-s)/2;
        while(s<=e){
            if(nums[m]==target){
                return m;
            }

            if(nums[m]>target){
                e=m-1;
            }
            else{
                s=m+1;
            }

            m=s+(e-s)/2;

        }

        return -1;
    }
}
-----------------------------------------------------------------------------------------------------------------------------------------
Floor in a Sorted Array
Difficulty: EasyAccuracy: 33.75%Submissions: 308K+Points: 2
Given a sorted array arr[] of size n without duplicates, and given a value x. Floor of x is defined as the largest element k in arr[] such that k is smaller than or equal to x. Find the index of k(0-based indexing).

Examples

Input: n = 7, x = 0 arr[] = {1,2,8,10,11,12,19}
Output: -1
Explanation: No element less than 0 is found. So output is "-1".
Input: n = 7, x = 5 arr[] = {1,2,8,10,11,12,19}
Output: 1
Explanation: Largest Number less than 5 is 2 (i.e k = 2), whose index is 1(0-based indexing).
Your Task:
The task is to complete the function findFloor() which returns an integer denoting the index value of K or return -1 if there isn't any such number.

Expected Time Complexity: O(log N).
Expected Auxiliary Space: O(1).

static int findFloor(long arr[], int n, long x){
        int s=0;
        int e=n-1;
        int ans=-1;
        int m=s+(e-s)/2;
        while(s<=e){
            if(arr[m]<=x){
                ans= m;
                s=m+1;
            }

            else{
                e=m-1;
            }

            m=s+(e-s)/2;

        }

        return ans;
    }


-----------------------------------------------------------------------------------------------------------------------------------------
540. Single Element in a Sorted Array
Solved
Medium
Topics
Companies
You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.

Return the single element that appears only once.

Your solution must run in O(log n) time and O(1) space.

 

Example 1:

Input: nums = [1,1,2,3,3,4,4,8,8]
Output: 2


class Solution {
    public int singleNonDuplicate(int[] nums) {
        int s=0;
        int e=nums.length-1;
        while(s<e){
            int m=s+(e-s)/2;
            if(m%2==1){
                m--;
            }

            if(nums[m]==nums[m+1]){
                s=m+2;;
            }
            else{
                e=m;
            }

        }
        return nums[s];
    }
}
-----------------------------------------------------------------------------------------------------------------------------------------
Ceil The Floor
Difficulty: EasyAccuracy: 43.76%Submissions: 87K+Points: 2
Given an unsorted array arr[] of integers and an integer x, find the floor and ceiling of x in arr[].

Floor of x is the largest element which is smaller than or equal to x. Floor of x doesn’t exist if x is smaller than smallest element of arr[].
Ceil of x is the smallest element which is greater than or equal to x. Ceil of x doesn’t exist if x is greater than greatest element of arr[].

Return an array of integers denoting the [floor, ceil]. Return -1 for floor or ceiling if the floor or ceiling is not present.

Examples:

Input: x = 7 , arr[] = [5, 6, 8, 9, 6, 5, 5, 6]
Output: 6, 8
Explanation: Floor of 7 is 6 and ceil of 7 is 8.
Input: x = 10 , arr[] = [5, 6, 8, 8, 6, 5, 5, 6]
Output: 8, -1
Explanation: Floor of 10 is 8 but ceil of 10 is not possible.
Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)


class Solution {
    public int[] getFloorAndCeil(int x, int[] arr) {
        int ans[]={-1,-1};
        ans[0]=flor(arr,x,ans);
        ans[1]=ceil(arr,x,ans);
        return ans;
    }
    
    public static int flor(int arr[],int x,int ans[]){
        int ma=-1;
        for(int i=0;i<arr.length;i++){
            if (arr[i] <= x && arr[i] > ma) {
                ma = arr[i];
            }
        }
        return ans[0]=ma;
    }
    
    public static int ceil(int arr[],int x,int ans[]){
        int ma=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if (arr[i] >= x && arr[i] < ma) {
                ma = arr[i];
            }
        }
        if(ma==Integer.MAX_VALUE){
            ma=-1;
        }
        return ans[1]=ma;
    }
}

-----------------------------------------------------------------------------------------------------------------------------------------
35. Search Insert Position
Solved
Easy
Topics
Companies
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4
 

class Solution {
    public int searchInsert(int[] nums, int target) {

        int s=0;
        int e=nums.length-1;
        int m=s+(e-s)/2;
        int ans=-1;
        while(s<=e){
            if(nums[m]==target){
                return m;
            }
            if(nums[m]<target){
               s=m+1;   
            }
            else{
                e=m-1;  
            }
            m=s+(e-s)/2;
        }
        return s;
        
    }
}


-----------------------------------------------------------------------------------------------------------------------------------------
Ceil The Floor
Moderate
80/80
Average time to solve is 40m
Contributed by
447 upvotes
Asked in companies
Problem statement
You're given a sorted array 'a' of 'n' integers and an integer 'x'.



Find the floor and ceiling of 'x' in 'a[0..n-1]'.



Note:
Floor of 'x' is the largest element in the array which is smaller than or equal to 'x'.
Ceiling of 'x' is the smallest element in the array greater than or equal to 'x'.


Example:
Input: 
n=6, x=5, a=[3, 4, 7, 8, 8, 10]   

Output:
4

Explanation:
The floor and ceiling of 'x' = 5 are 4 and 7, respectively.


Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1 :
6 8
3 4 4 7 8 10


Sample Output 1 :
8 8


Explanation of sample input 1 :
Since x = 8 is present in the array, it will be both floor and ceiling.


Sample Input 2 :
6 2
3 4 4 7 8 10


Sample Output 2 :
-1 3



import java.util.* ;
import java.io.*; 

public class Solution {
    public static int[] getFloorAndCeil(int[] a, int n, int x) {
      int[] ans=new int[2];
      ans[0]=findFloor(a,x);
      ans[1]=findCeil(a,x);
      return ans;
    }
     public static int findFloor(int[] arr, int x) {
        int s = 0;
        int e = arr.length - 1;
        int ans = -1;
        
        while (s <= e) {
            int m = s + (e - s) / 2;
            
            if (arr[m] <= x) {
                ans = arr[m]; 
                s = m + 1; 
            } else {
                e = m - 1;
            }
        }
        
        return ans;
    }

    public static int findCeil(int[] arr, int x) {
        int s = 0;
        int e = arr.length - 1;
        int ans = -1;
        
        while (s <= e) {
            int m = s + (e - s) / 2;
            
            if (arr[m] >= x) {
                ans = arr[m]; 
                e = m - 1; 
            } else {
                s = m + 1;
            }
        }
        
        return ans;
    }
}
-----------------------------------------------------------------------------------------------------------------------------------------
34. Find First and Last Position of Element in Sorted Array
Solved
Medium
Topics
Companies
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
Example 3:

Input: nums = [], target = 0
Output: [-1,-1]
 


class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int f=firstOcc(nums,n,target);
        int l=lastOcc(nums,n,target);
        int ans[]=new int[2];
        if(f==-1 || l==-1){
            ans[0]=-1;
            ans[1]=-1;
        }
        else{
            ans[0]=f;
            ans[1]=l;
        }
        return ans;
    }

    public static int firstOcc(int arr[],int n,int x){
        int s=0;
        int e=n-1;
        int m=s+(e-s)/2;
        int ans=-1;
        while(s<=e){
            if(arr[m]==x){
                ans=m;
                e=m-1;
            }
            else if(arr[m]<x){
                s=m+1;
            }
            else{
                e=m-1;
            }
            m=s+(e-s)/2;
        }
        
        return ans;
    }

    public static int lastOcc(int arr[],int n,int x){
        int s=0;
        int e=n-1;
        int m=s+(e-s)/2;
        int ans=-1;
        while(s<=e){
            if(arr[m]==x){
                ans=m;
                s=m+1;
            }
            else if(arr[m]<x){
                s=m+1;
            }
            else{
                e=m-1;
            }
            m=s+(e-s)/2;
        }
        
        return ans;
    }

}
-----------------------------------------------------------------------------------------------------------------------------------------
33. Search in Rotated Sorted Array
Solved
Medium
Topics
Companies
There is an integer array nums sorted in ascending order (with distinct values).

Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].

Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4
Example 2:

Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1
Example 3:

Input: nums = [1], target = 0
Output: -1
 


// class Solution {

//     public int pivot(int[] nums){
//         int s=0;
//         int e=nums.length-1;
//         int m=s+(e-s)/2;
//         while(s<e){
//             if(nums[m]>=nums[0]){
//                 s=m+1;
//             }
//             else{
//                 e=m;
//             }
//             m=s+(e-s)/2;
//         }

//         return s;
        
//     }

//     public int binary(int[] nums,int s,int e,int target) {
        
//         int m=s+(e-s)/2;
//         while(s<=e){
//             if(nums[m]==target){
//                 return m;
//             }
//             if(nums[m]<target){
//                 s=m+1;
//             }
//             else{
//                 e=m-1;
//             }
//             m=s+(e-s)/2;
//         }

//         return -1;
        
//     }

//     public int search(int[] nums, int target) {
//         int n=nums.length;
//         int p=pivot(nums);
//         if(target >= nums[p] && target<=nums[n-1]){
//             return binary(nums,p,n-1,target);
//         }
//         else{
//             return  binary(nums,0,p-1,target);
//         }
//     }
// }












class Solution {
    public int search(int[] nums, int k) {
        
        int low =0; int high = nums.length-1;

        while (low<=high){

            int mid = low+ (high-low)/2;

            if(nums[mid]==k) return mid;
            else if(nums[low]<=nums[mid]){
                
                if(k>=nums[low]&&k<=nums[mid]){

                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
            else{

                if(k>=nums[mid] && k<=nums[high]){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }

        }
        return -1;
    }
}
-----------------------------------------------------------------------------------------------------------------------------------------
Number of occurrence
Difficulty: MediumAccuracy: 59.34%Submissions: 222K+Points: 4
Given a sorted array Arr of size N and a number X, you need to find the number of occurrences of X in Arr.

Example 1:

Input:
N = 7, X = 2
Arr[] = {1, 1, 2, 2, 2, 2, 3}
Output: 4
Explanation: x = 2 occurs 4 times in the given array so the output is 4.
Example 2:

Input:
N = 7, X = 4
Arr[] = {1, 1, 2, 2, 2, 2, 3}
Output: 0
Explanation: X = 4 is not present in the given array so the output is 0.
Your Task:
You don't need to read input or print anything.
Your task is to complete the function count() which takes the array of integers arr, n, and x as parameters and returns an integer denoting the answer.
If x is not present in the array (arr) then return 0.

Expected Time Complexity: O(logN)
Expected Auxiliary Space: O(1)

class Solution {
    int count(int[] arr, int n, int x) {
        int f=firstOcc(arr,n,x);
        int l=lastOcc(arr,n,x);
        
        if(f==-1 || l==-1){
            return 0;
        }
        
        return (l-f)+1;
    }
    
    public static int firstOcc(int arr[],int n,int x){
        int s=0;
        int e=n-1;
        int m=s+(e-s)/2;
        int ans=-1;
        while(s<=e){
            if(arr[m]==x){
                ans=m;
                e=m-1;
            }
            else if(arr[m]<x){
                s=m+1;
            }
            else{
                e=m-1;
            }
            m=s+(e-s)/2;
        }
        
        return ans;
    }
    
    public static int lastOcc(int arr[],int n,int x){
        int s=0;
        int e=n-1;
        int m=s+(e-s)/2;
        int ans=-1;
        while(s<=e){
            if(arr[m]==x){
                ans=m;
                s=m+1;
            }
            else if(arr[m]<x){
                s=m+1;
            }
            else{
                e=m-1;
            }
            m=s+(e-s)/2;
        }
        
        return ans;
    }

-----------------------------------------------------------------------------------------------------------------------------------------
81. Search in Rotated Sorted Array II
Solved
Medium
Topics
Companies
There is an integer array nums sorted in non-decreasing order (not necessarily with distinct values).

Before being passed to your function, nums is rotated at an unknown pivot index k (0 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,4,4,5,6,6,7] might be rotated at pivot index 5 and become [4,5,6,6,7,0,1,2,4,4].

Given the array nums after the rotation and an integer target, return true if target is in nums, or false if it is not in nums.

You must decrease the overall operation steps as much as possible.

 

Example 1:

Input: nums = [2,5,6,0,0,1,2], target = 0
Output: true
Example 2:

Input: nums = [2,5,6,0,0,1,2], target = 3
Output: false

class Solution {
    public boolean search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return true;
            }

            // When duplicates are present, we can skip the duplicates
            if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
                low++;
                high--;
            } else if (nums[low] <= nums[mid]) {
                // Left part is sorted
                if (nums[low] <= target && target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                // Right part is sorted
                if (nums[mid] < target && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return false;
    }
}
-----------------------------------------------------------------------------------------------------------------------------------------
153. Find Minimum in Rotated Sorted Array
Solved
Medium
Topics
Companies
Hint
Suppose an array of length n sorted in ascending order is rotated between 1 and n times. 
For example, the array nums = [0,1,2,4,5,6,7] might become:

[4,5,6,7,0,1,2] if it was rotated 4 times.
[0,1,2,4,5,6,7] if it was rotated 7 times.
Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].

Given the sorted rotated array nums of unique elements, return the minimum element of this array.

You must write an algorithm that runs in O(log n) time.

 

Example 1:

Input: nums = [3,4,5,1,2]
Output: 1
Explanation: The original array was [1,2,3,4,5] rotated 3 times.
Example 2:

Input: nums = [4,5,6,7,0,1,2]
Output: 0
Explanation: The original array was [0,1,2,4,5,6,7] and it was rotated 4 times.
Example 3:

Input: nums = [11,13,15,17]
Output: 11
Explanation: The original array was [11,13,15,17] and it was rotated 4 times. 


class Solution {
    public int findMin(int[] nums) {
        int s=0;
        int e=nums.length-1;
        int m=s+(e-s)/2;
        while(s<e){
            if(nums[m] > nums[e]){
                s=m+1;
            }
            else{
                e=m;
            }
            m=s+(e-s)/2;
        }
        return nums[s];
    }
}
-----------------------------------------------------------------------------------------------------------------------------------------
154. Find Minimum in Rotated Sorted Array II
Solved
Hard
Topics
Companies
Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,4,4,5,6,7] might become:

[4,5,6,7,0,1,4] if it was rotated 4 times.
[0,1,4,4,5,6,7] if it was rotated 7 times.
Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].

Given the sorted rotated array nums that may contain duplicates, return the minimum element of this array.

You must decrease the overall operation steps as much as possible.

 

Example 1:

Input: nums = [1,3,5]
Output: 1
Example 2:

Input: nums = [2,2,2,0,1]
Output: 0



class Solution {
    public int findMin(int[] nums) {
        int s=0;
        int e=nums.length-1;
        int m=s+(e-s)/2;
        while(s<e){
            if(nums[m] > nums[e]){
                s=m+1;
            }
            else if(nums[m] < nums[e]){
                e=m;
            }
            else{
                e--;
            }
            m=s+(e-s)/2;
        }
        return nums[s];
    }
}

-----------------------------------------------------------------------------------------------------------------------------------------
Find Kth Rotation
Difficulty: EasyAccuracy: 23.16%Submissions: 207K+Points: 2
Given an increasing sorted rotated array arr of distinct integers. The array is right-rotated k times. Find the value of k.
Let's suppose we have an array arr = [2, 4, 6, 9], so if we rotate it by 2 times so that it will look like this:
After 1st Rotation : [9, 2, 4, 6]
After 2nd Rotation : [6, 9, 2, 4]

Examples:

Input: arr = [5, 1, 2, 3, 4]
Output: 1
Explanation: The given array is 5 1 2 3 4. The original sorted array is 1 2 3 4 5. We can see that the array was rotated 1 times to the right.
Input: arr = [1, 2, 3, 4, 5]
Output: 0
Explanation: The given array is not rotated.
Expected Time Complexity: O(log(n))
Expected Auxiliary Space: O(1)

Constraints:

class Solution {
    public int findKRotation(List<Integer> arr) {
       int s = 0;
        int e = arr.size() - 1;

        while (s < e) {
            int m = s + (e - s) / 2;

            if (arr.get(m) > arr.get(e)) {
                s = m + 1;
            } else {
                e = m;
            }
        }
        
        return s;
    }

} 
-----------------------------------------------------------------------------------------------------------------------------------------
852. Peak Index in a Mountain Array
Solved
Medium
Topics
Companies
You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.

Return the index of the peak element.

Your task is to solve it in O(log(n)) time complexity.

 

Example 1:

Input: arr = [0,1,0]

Output: 1

Example 2:

Input: arr = [0,2,1,0]

Output: 1

Example 3:

Input: arr = [0,10,5,2]

Output: 1

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int s=0;
        int e=arr.length-1;
        while(s<e){
            int m=s+(e-s)/2;
            if(arr[m]<arr[m+1]){
                s=m+1;
            }
            else
            e=m;
        }
        return s;
    }
}


-----------------------------------------------------------------------------------------------------------------------------------------
Count the Zeros
Difficulty: EasyAccuracy: 68.08%Submissions: 114K+Points: 2
Given an array arr of only 0's and 1's. The array is sorted in such a manner that all the 1's are placed first and then they are followed by all the 0's. Find the count of all the 0's.

Examples:

Input: arr[] = [1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0]
Output: 3
Explanation: There are 3 0's in the given array.
Input: arr[] = [0, 0, 0, 0, 0]
Output: 5
Explanation: There are 5 0's in the array.
Constraints:
1 <= arr.size <= 105
0 <= arr[i] <= 1

class Solution {
    int countZeroes(int[] arr) {
        
        int k=fistOcc(arr);
        if(k==-1){
            return 0;
        }
        return arr.length-k;
    }
    
    int fistOcc(int[] arr) {
        int s=0;
        int e=arr.length-1;
        int ans=-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(arr[m]==0){
                ans=m;
                e=m-1;
            }
            else{
                s=m+1;
            }
        }
        
        return ans;
    }
    
}
-----------------------------------------------------------------------------------------------------------------------------------------



-----------------------------------------------------------------------------------------------------------------------------------------



-----------------------------------------------------------------------------------------------------------------------------------------



-----------------------------------------------------------------------------------------------------------------------------------------
162. Find Peak Element
Solved
Medium
Topics
Companies
A peak element is an element that is strictly greater than its neighbors.

Given a 0-indexed integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.

You may imagine that nums[-1] = nums[n] = -∞. In other words, an element is always considered to be strictly greater than a neighbor that is outside the array.

You must write an algorithm that runs in O(log n) time.

 

Example 1:

Input: nums = [1,2,3,1]
Output: 2
Explanation: 3 is a peak element and your function should return the index number 2.
Example 2:

Input: nums = [1,2,1,3,5,6,4]
Output: 5
Explanation: Your function can return either index number 1 where the peak element is 2, or index number 5 where the peak element is 6.

class Solution {
    public int findPeakElement(int[] nums) {

        int s=0;
        int e=nums.length-1;
        while(s<e){
            int m=s+(e-s)/2;
            if(nums[m]<nums[m+1]){
                s=m+1;
            }
            else{
                e=m;
            }
        }
        return s;
    }
}
-----------------------------------------------------------------------------------------------------------------------------------------
Square root of a number
Difficulty: EasyAccuracy: 54.03%Submissions: 251K+Points: 2
Given an integer n, find the square root of n. If n is not a perfect square, then return the floor value.

Floor value of any number is the greatest Integer which is less than or equal to that number

Examples:

Input: n = 5
Output: 2
Explanation: Since, 5 is not a perfect square, floor of square_root of 5 is 2.
Input: n = 4
Output: 2
Explanation: Since, 4 is a perfect square, so its square root is 2.
Expected Time Complexity: O(logn)
Expected Auxiliary Space: O(1)

class Solution {
    long floorSqrt(long n) {
       long s=0;
       long e=n;
       long ans=-1;
       while(s<=e){
           long m=s+(e-s)/2;
           long sq=m*m;
           if(n==sq){
               return m;
           }
           
           if(sq<n){
               ans=m;
               s=m+1;
           }
           else{
               e=m-1;
           }
       }
       return ans;
    }
}
-----------------------------------------------------------------------------------------------------------------------------------------
Find Nth root of M
Difficulty: EasyAccuracy: 25.06%Submissions: 139K+Points: 2
You are given 2 numbers (n , m); the task is to find n√m (nth root of m).
 

Example 1:

Input: n = 2, m = 9
Output: 3
Explanation: 32 = 9
Example 2:

Input: n = 3, m = 9
Output: -1
Explanation: 3rd root of 9 is not
integer.
 

Your Task:
You don't need to read or print anyhting. Your task is to complete the function NthRoot() which takes n and m as input parameter and returns the nth root of m. If the root is not integer then returns -1.
 

Expected Time Complexity: O(n* log(m))
Expected Space Complexity: O(1)

class Solution
{
    public int NthRoot(int n, int m)
    {
        int s=0;
        int e=m;
        int ans=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            long k = 1; 

            for (int i = 0; i < n; i++) {
                k *= mid;
                if (k > m) break; 
            }
            
            if(k==m){
                return mid;
            }
            if(k<m){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
            
        }
        
        return -1;
    }
}

-----------------------------------------------------------------------------------------------------------------------------------------
Allocate Books
Moderate
80/80
Average time to solve is 10m
897 upvotes
Asked in companies
Problem statement
Given an array ‘arr’ of integer numbers, ‘arr[i]’ represents the number of pages in the ‘i-th’ book.



There are ‘m’ number of students, and the task is to allocate all the books to the students.



Allocate books in such a way that:

1. Each student gets at least one book.
2. Each book should be allocated to only one student.
3. Book allocation should be in a contiguous manner.


You have to allocate the book to ‘m’ students such that the maximum number of pages assigned to a student is minimum.



If the allocation of books is not possible, return -1.



Example:
Input: ‘n’ = 4 ‘m’ = 2 
‘arr’ = [12, 34, 67, 90]

Output: 113


import java.util.ArrayList;

public class Solution {

    private static int countStudent(ArrayList<Integer> arr, int pages) {

        int student = 1;

        int pageCount = 0;

        for (int i = 0; i < arr.size(); i++) {

            if (pageCount + arr.get(i) <= pages) {

                pageCount += arr.get(i);

            } else {

                student++;

                pageCount = arr.get(i);

            }

        }

        return student;

    }

    public static int findPages(ArrayList<Integer> arr, int n, int m) {

        if (arr.size() < m) {

            return -1; // More students than books

        }

        int sum = 0, max = Integer.MIN_VALUE;

        for (int num : arr) {

            sum += num;

            max = Math.max(max, num);

        }

        int low = max;

        int high = sum;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            int countStd = countStudent(arr, mid);

            if (countStd > m) {

                low = mid + 1;

            } else {

                high = mid - 1;

            }

        }

        return low;

    }

}



+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//this code is coder army and this code run for down three question.........
class Solution {
    public static int findPages(int[] arr, int k) {
        if(k>arr.length){
            return -1;
        }
        
        int ans=0;
        int s=0;
        int e=0;
        for(int i=0;i<arr.length;i++){
            s=Math.max(s,arr[i]);
            e+=arr[i];
        }
        
        
        while(s<=e){
            
            int mid=s+(e-s)/2;
            
            int page=0,count=1;
            for(int i=0;i<arr.length;i++){
                
                page+=arr[i];
                
                if(page>mid){
                    count++;
                    page=arr[i];
                }
            }
            
            if(count<=k){
                ans=mid;
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        
        return ans;
    }
}




+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
The Painter's Partition Problem-II
Difficulty: HardAccuracy: 27.52%Submissions: 123K+Points: 8
Dilpreet wants to paint his dog's home that has n boards with different lengths. The length of ith board is given by arr[i] where arr[] is an array of n integers. He hired k painters for this work and each painter takes 1 unit time to paint 1 unit of the board.

Return the minimum time to get this job done if all painters start together with the constraint that any painter will only paint continuous boards, say boards numbered [2,3,4] or only board [1] or nothing but not boards [2,4,5].

Examples:

Input: arr[] = [5, 10, 30, 20, 15], k = 3
Output: 35
Explanation: The most optimal way will be: Painter 1 allocation : [5,10], Painter 2 allocation : [30], Painter 3 allocation : [20,15], Job will be done when all painters finish i.e. at time = max(5+10, 30, 20+15) = 35
Input: arr[] = [10, 20, 30, 40], k = 2
Output: 60
Explanation: The most optimal way to paint: Painter 1 allocation : [10,20,30], Painter 2 allocation : [40], Job will be complete at time = 60
Input: arr[] = [100, 200, 300, 400], k = 1
Output: 1000
Explanation: There is only one painter, so the painter must paint all boards sequentially. The total time taken will be the sum of all board lengths, i.e., 100 + 200 + 300 + 400 = 1000.
Constraints:
1 ≤ arr.size() ≤ 105
1 ≤ arr[i] ≤ 105
1 ≤ k ≤ 105

Company Tags
MicrosoftGoogleCodenation

class Solution {
    public long minTime(int[] arr, int k) {
        
        long ans=0;
        long s=0;
        long e=0;
        for(int i=0;i<arr.length;i++){
            s=Math.max(s,arr[i]);
            e+=arr[i];
        }
        
        
        while(s<=e){
            
            long mid=s+(e-s)/2;
            
            long page=0,count=1;
            for(int i=0;i<arr.length;i++){
                
                page+=arr[i];
                
                if(page>mid){
                    count++;
                    page=arr[i];
                }
            }
            
            if(count<=k){
                ans=mid;
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        
        return ans;
    }
}

+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
1011. Capacity To Ship Packages Within D Days
Solved
Medium
Topics
Companies
Hint
A conveyor belt has packages that must be shipped from one port to another within days days.

The ith package on the conveyor belt has a weight of weights[i]. Each day, we load the ship with packages on the conveyor belt (in the order given by weights). We may not load more weight than the maximum weight capacity of the ship.

Return the least weight capacity of the ship that will result in all the packages on the conveyor belt being shipped within days days.

 

Example 1:

Input: weights = [1,2,3,4,5,6,7,8,9,10], days = 5
Output: 15
Explanation: A ship capacity of 15 is the minimum to ship all the packages in 5 days like this:
1st day: 1, 2, 3, 4, 5
2nd day: 6, 7
3rd day: 8
4th day: 9
5th day: 10

Note that the cargo must be shipped in the order given, so using a ship of capacity 14 and splitting the packages into parts like (2, 3, 4, 5), (1, 6, 7), (8), (9), (10) is not allowed.
Example 2:

Input: weights = [3,2,2,4,1,4], days = 3
Output: 6
Explanation: A ship capacity of 6 is the minimum to ship all the packages in 3 days like this:
1st day: 3, 2
2nd day: 2, 4
3rd day: 1, 4
Example 3:

Input: weights = [1,2,3,1,1], days = 4
Output: 3
Explanation:
1st day: 1
2nd day: 2
3rd day: 3
4th day: 1, 1

class Solution {
    public int shipWithinDays(int[] arr, int k) {
        int ans=0;
        int s=0;
        int e=0;
        for(int i=0;i<arr.length;i++){
            s=Math.max(s,arr[i]);
            e+=arr[i];
        }
        
        
        while(s<=e){
            
            int mid=s+(e-s)/2;
            
            int page=0,count=1;
            for(int i=0;i<arr.length;i++){
                
                page+=arr[i];
                
                if(page>mid){
                    count++;
                    page=arr[i];
                }
            }
            
            if(count<=k){
                ans=mid;
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        
        return ans;
    }
}
+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
Split Array Largest Sum
Difficulty: HardAccuracy: 58.9%Submissions: 48K+Points: 8
Given an array arr[] of N elements and a number K., split the given array into K subarrays such that the maximum subarray sum achievable out of K subarrays formed is minimum possible. Find that possible subarray sum.

Example 1:

Input:
N = 4, K = 3
arr[] = {1, 2, 3, 4}
Output: 4
Explanation:
Optimal Split is {1, 2}, {3}, {4}.
Maximum sum of all subarrays is 4,
which is minimum possible for 3 splits. 
Example 2:

Input:
N = 3, K = 2
A[] = {1, 1, 2}
Output:
2
Explanation:
Splitting the array as {1,1} and {2} is optimal.
This results in a maximum sum subarray of 2.
Your Task:
You do not have to take any input or print anything. The task is to complete the function splitArray() which returns the maximum sum subarray after splitting the array into K subarrays such that maximum sum subarray is minimum possible.

Expected Time Complexity: O(N*log(sum(arr))).
Expected Auxiliary Space: O(1).

class Solution {
    static int splitArray(int[] arr , int N, int k) {
        // code here
        int ans=0;
        int s=0;
        int e=0;
        for(int i=0;i<arr.length;i++){
            s=Math.max(s,arr[i]);
            e+=arr[i];
        }
        
        
        while(s<=e){
            
            int mid=s+(e-s)/2;
            
            int page=0,count=1;
            for(int i=0;i<arr.length;i++){
                
                page+=arr[i];
                
                if(page>mid){
                    count++;
                    page=arr[i];
                }
            }
            
            if(count<=k){
                ans=mid;
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        
        return ans;
    }
};




-----------------------------------------------------------------------------------------------------------------------------------------
Note:-AGGRESSIVE COWS AND 1552. Magnetic Force Between Two Balls BOTH QUESTION ARE SSSSSAAAAAAMMMMMMEEEEE
Aggressive Cows
Difficulty: MediumAccuracy: 59.57%Submissions: 76K+Points: 4
You are given an array with unique elements of stalls[], which denote the position of a stall. You are also given an integer k which denotes the number of aggressive cows. Your task is to assign stalls to k cows such that the minimum distance between any two of them is the maximum possible.

Examples :

Input: stalls[] = [1, 2, 4, 8, 9], k = 3
Output: 3
Explanation: The first cow can be placed at stalls[0], 
the second cow can be placed at stalls[2] and 
the third cow can be placed at stalls[3]. 
The minimum distance between cows, in this case, is 3, which also is the largest among all possible ways.
Input: stalls[] = [10, 1, 2, 7, 5], k = 3
Output: 4
Explanation: The first cow can be placed at stalls[0],
the second cow can be placed at stalls[1] and
the third cow can be placed at stalls[4].
The minimum distance between cows, in this case, is 4, which also is the largest among all possible ways.
Input: stalls[] = [2, 12, 11, 3, 26, 7], k = 5
Output: 1
Explanation: Each cow can be placed in any of the stalls, as the no. of stalls are exactly equal to the number of cows.
The minimum distance between cows, in this case, is 1, which also is the largest among all possible ways.
Constraints:
2 <= stalls.size() <= 106
0 <= stalls[i] <= 108
1 <= k <= stalls.size()

class Solution {
    public static int aggressiveCows(int[] stalls, int k) {
        Arrays.sort(stalls);
        int n=stalls.length;
        int s=1;
        int e=stalls[n-1]-stalls[0];
        
        int ans=0;
        while(s<=e){
            
            int m=s+(e-s)/2;
            
            int count=1;
            int dis=stalls[0];
            for(int i=1;i<n;i++){
                if(dis+m<=stalls[i]){
                    count++;
                    dis=stalls[i];
                }
            }
            
            if(count<k){
                e=m-1;
                
            }
            else{
                ans=m;
                s=m+1;
            }
            
        }
        
        return ans;
    }
}


+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

1552. Magnetic Force Between Two Balls
Solved
Medium
Topics
Companies
Hint
In the universe Earth C-137, Rick discovered a special form of magnetic force between two balls if they are put in his new invented basket. Rick has n empty baskets, the ith basket is at position[i], Morty has m balls and needs to distribute the balls into the baskets such that the minimum magnetic force between any two balls is maximum.

Rick stated that magnetic force between two different balls at positions x and y is |x - y|.

Given the integer array position and the integer m. Return the required force.

 

Example 1:


Input: position = [1,2,3,4,7], m = 3
Output: 3
Explanation: Distributing the 3 balls into baskets 1, 4 and 7 will make the magnetic force between ball pairs [3, 3, 6]. The minimum magnetic force is 3. We cannot achieve a larger minimum magnetic force than 3.
Example 2:

Input: position = [5,4,3,2,1,1000000000], m = 2
Output: 999999999
Explanation: We can use baskets 1 and 1000000000.
 

Constraints:

n == position.length
2 <= n <= 105
1 <= position[i] <= 109
All integers in position are distinct.
2 <= m <= position.length

class Solution {
    public int maxDistance(int[] position, int k) {
        Arrays.sort(position);
        int n=position.length;
        int s=1;
        int e=position[n-1]-position[0];
        
        int ans=0;
        while(s<=e){
            
            int m=s+(e-s)/2;
            
            int count=1;
            int dis=position[0];
            for(int i=1;i<n;i++){
                if(dis+m<=position[i]){
                    count++;
                    dis=position[i];
                }
            }
            
            if(count<k){
                e=m-1;
                
            }
            else{
                ans=m;
                s=m+1;
            }
            
        }
        
        return ans;
    }
}

-----------------------------------------------------------------------------------------------------------------------------------------
875. Koko Eating Bananas
Solved
Medium
Topics
Companies
Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. The guards have gone and will come back in h hours.

Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of bananas and eats k bananas from that pile. If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.

Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.

Return the minimum integer k such that she can eat all the bananas within h hours.

 

Example 1:

Input: piles = [3,6,7,11], h = 8
Output: 4
Example 2:

Input: piles = [30,11,23,4,20], h = 5
Output: 30
Example 3:

Input: piles = [30,11,23,4,20], h = 6
Output: 23
 

Constraints:

1 <= piles.length <= 104
piles.length <= h <= 109
1 <= piles[i] <= 109

class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        if (piles == null || piles.length == 0 || h < piles.length) {
            return -1; 
        }
        int n=piles.length;
        int ans=0;
        int s=1;
        int e=0;
        for(int i=0;i<n;i++){
            e=Math.max(e,piles[i]);
        }
        
        
        while(s<=e){
            
            int mid=s+(e-s)/2;
            
            long takeTime=0;
            for(int i=0;i<n;i++){
                takeTime +=piles[i] / mid;
                if (piles[i] % mid != 0) {
                    takeTime += 1;
                }
            }
            
            if(takeTime<=h){
                ans=mid;
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        
        return ans;
    }
}


+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
Note:-This quesiton base on banana koko problem.

1283. Find the Smallest Divisor Given a Threshold
Solved
Medium
Topics
Companies
Hint
Given an array of integers nums and an integer threshold, we will choose a positive integer divisor, divide all the array by it, and sum the division's result. Find the smallest divisor such that the result mentioned above is less than or equal to threshold.

Each result of the division is rounded to the nearest integer greater than or equal to that element. (For example: 7/3 = 3 and 10/2 = 5).

The test cases are generated so that there will be an answer.

 

Example 1:

Input: nums = [1,2,5,9], threshold = 6
Output: 5
Explanation: We can get a sum to 17 (1+2+5+9) if the divisor is 1. 
If the divisor is 4 we can get a sum of 7 (1+1+2+3) and if the divisor is 5 the sum will be 5 (1+1+1+2). 
Example 2:

Input: nums = [44,22,33,11,1], threshold = 5
Output: 44

class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        if (nums == null || nums.length == 0 || threshold < nums.length) {
            return -1; 
        }
        int n=nums.length;
        int s=1;
        int e=0;
        for(int i=0;i<n;i++){
            e=Math.max(e,nums[i]);
        }
        int ans=0;
        while(s<=e){
            int mid=s+(e-s)/2;
            int divisor=0;
            for(int i=0;i<n;i++){
                divisor+=nums[i]/mid;
                if(nums[i]%mid!=0){
                    divisor+=1;
                }
            }

            if(divisor<=threshold){
                ans=mid;
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }

        return ans;
    }
}

-----------------------------------------------------------------------------------------------------------------------------------------
74. Search a 2D Matrix
Solved
Medium
Topics
Companies
You are given an m x n integer matrix matrix with the following two properties:

Each row is sorted in non-decreasing order.
The first integer of each row is greater than the last integer of the previous row.
Given an integer target, return true if target is in matrix or false otherwise.

You must write a solution in O(log(m * n)) time complexity.

 

Example 1:


Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true
Example 2:


Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
Output: false

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //method 01
        int r=matrix.length;
        int c=matrix[0].length;
        int ri=0;
        int ci=c-1;
        while(ri<r && ci>=0){
            int ele=matrix[ri][ci];
            if(ele==target){
                return true;
            }
            else if(ele < target){
                ri++;
            }
            else{
                ci--;
            }
        }

        return false;
        
    }
}



//METHOD  02
        
//         int n=matrix.size();
//         int m=matrix[0].size();
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 if(matrix[i][j]==target){
//                     return true;
//                 }
//             }
//         }
//         return false; 
-----------------------------------------------------------------------------------------------------------------------------------------


-----------------------------------------------------------------------------------------------------------------------------------------


-----------------------------------------------------------------------------------------------------------------------------------------


-----------------------------------------------------------------------------------------------------------------------------------------


-----------------------------------------------------------------------------------------------------------------------------------------


-----------------------------------------------------------------------------------------------------------------------------------------


-----------------------------------------------------------------------------------------------------------------------------------------


-----------------------------------------------------------------------------------------------------------------------------------------


-----------------------------------------------------------------------------------------------------------------------------------------


-----------------------------------------------------------------------------------------------------------------------------------------


*/