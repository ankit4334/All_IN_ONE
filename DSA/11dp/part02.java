/* 
 //0-1 Knapsack problems
 ->types of Knapsack problems
 01.fractional knapsack(greedy)->divide the goods(take a portion)
 02.0-1 knapsack ->don't divide the goods (take full)
 03.Unbounded knapsack ->add multiple item(take full portion)
*/



/*
 val[]={15,14,10,45,30}
 wt[]={2,5,1,3,4}
 W(total allowed weight)=7

 ans=Max profit
 */


/* 
//01.Recursion knapsack problem. 
public class part02 {
    public static int knapsack(int val[],int wt[],int W,int n){  //Tc=O(2^n*w)
        if(W==0 || n==0){
            return 0;
        }

        if(wt[n-1] <= W){ //valid
            //include
            int ans1=val[n-1]+knapsack(val, wt, W-wt[n-1],n-1);

            //exclude
            int ans2=knapsack(val, wt, W, n-1);
            return Math.max(ans1,ans2);
        }
        else{//not valid
            return knapsack(val, wt, W, n-1);
        }

    }
    public static void main(String[] args) {

    int val[]={15,14,10,45,30};
    int wt[]={2,5,1,3,4};
    int W=7;

    System.out.println(knapsack(val, wt, W,val.length));
        
    }
    
}
*/





/* 

//01.knapsack problem Using memoization. TC=O(n*W)
public class part02 {
    public static int knapsack(int val[],int wt[],int W,int n,int dp[][]){
        if(W==0 || n==0){
            return 0;
        }

        if(dp[n][W]!=-1){
            return dp[n][W];
        }

        if(wt[n-1] <= W){ //valid
            //include
            int ans1=val[n-1]+knapsack(val, wt, W-wt[n-1],n-1,dp);

            //exclude
            int ans2=knapsack(val, wt, W, n-1,dp);
            dp[n][W]=Math.max(ans1,ans2);
            return dp[n][W];
        }
        else{
            dp[n][W]=knapsack(val, wt, W, n-1,dp);
            return dp[n][W];
        }

    }
    public static void main(String[] args) {

    int val[]={15,14,10,45,30};
    int wt[]={2,5,1,3,4};
    int W=7;

    int dp[][]=new int[val.length+1][W+1];
    for(int i=0;i<dp.length;i++){
        for(int j=0;j<dp[0].length;j++){
            dp[i][j]=-1;
        }
    }

    System.out.println(knapsack(val, wt, W,val.length,dp));
        
    }
    
}

*/






/* 

//01.knapsack problem Using Tabulation method. TC=O(n*W)
public class part02 {

    public static void print(int dp[][]){
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static int knapsackTab(int val[],int wt[],int W){
        int n=val.length;
        int dp[][]=new int[n+1][W+1];
        for(int i=0;i<dp.length;i++){ //0th col
            dp[i][0]=0;
        }
        for(int j=0;j<dp[0].length;j++){  //0th row
            dp[0][j]=0;
        } 

        for(int i=1;i<n+1;i++){
            for(int j=1;j<W+1;j++){
                int v=val[i-1];  //ith item val
                int w=wt[i-1];   //ith item wt
                if(w<=j){  //valid
                    int incProfit=v+dp[i-1][j-w];
                    int excProfit=dp[i-1][j];
                    dp[i][j]=Math.max(incProfit,excProfit);
                }
                else{
                int excProfit=dp[i-1][j];
                dp[i][j]=excProfit;
                }
            }
        }
        print(dp);
        return dp[n][W];

    }
    public static void main(String[] args) {

    int val[]={15,14,10,45,30};
    int wt[]={2,5,1,3,4};
    int W=7;


    System.out.println(knapsackTab(val, wt, W));
        
    }
    
}

*/








//----------------------------------------------------------------------------------------------------------------










/* 
 *Subset sum problem:-
 * variation of 0-1 knapsack problem
 * number[]={4,2,7,1,3}
 * Target sum=10;

//Tc=(N*w)
public class part02 {

    //Tabulation code
    static Boolean isSubsetSum(int arr[], int sum) {
        int n=arr.length;
        boolean dp[][]=new boolean[n+1][sum+1];
        
        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=sum;j++){
                int wt=arr[i-1];
                if(wt<=j){
                    dp[i][j]=dp[i-1][j-wt] || dp[i-1][j];
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        
        return dp[n][sum];
        
    }

    public static void main(String[] args) {
    int number[]={4,2,7,1,3};
    int Target=10;
    System.out.println(targetSum(number,Target));
        
    }
    
}



//recusion code
static Boolean isSubsetSum(int arr[], int sum) {
        int n=arr.length;
        
        return solve(arr,sum,n);
    }
    public static Boolean solve(int arr[], int sum,int n){
        if(sum==0) return true;
        if(n==0) return false;
        
        if(arr[n-1]<=sum){
            return solve(arr,sum-arr[n-1],n-1) || solve(arr,sum,n-1);
        }
        else{
            return solve(arr,sum,n-1);
        }
        
    }



//memoization Code
static Boolean isSubsetSum(int arr[], int sum) {
        int n=arr.length;
        Boolean dp[][]=new Boolean[n+1][sum+1];
        
        return solve(arr,sum,n,dp);
    }
    public static Boolean solve(int arr[], int sum,int n,Boolean dp[][]){
        if(sum==0) return true;
        if(n==0) return false;
        
        if(dp[n][sum]!=null){
            return dp[n][sum];
        }
        
        if(arr[n-1]<=sum){
            dp[n][sum]=solve(arr,sum-arr[n-1],n-1,dp) || solve(arr,sum,n-1,dp);
        }
        else{
            dp[n][sum]=solve(arr,sum,n-1,dp);
        }
        
        return dp[n][sum];
    }

*/

//----------------------------------------------------------------------------------------------------------------


/* 
Partition Equal Subset Sum
Given an array arr[], determine if it can be partitioned into two subsets such that the sum of elements in both parts is the same.

Note: Each element must be in exactly one subset.

Input: arr = [1, 5, 11, 5]
Output: true
Explanation: The two parts are [1, 5, 5] and [11].


//recusion method


class Solution {
    static boolean equalPartition(int arr[]) {
       int n=arr.length;
       int sum=0;
       for(int i=0;i<n;i++){
           sum+=arr[i];
       }
       
       if (sum % 2 != 0) return false; 

        return solve(arr, sum / 2, n);
        
    }
    
    static boolean solve(int arr[],int sum,int n){
        if(sum==0) return true;
        if(n==0) return false;
        
        if(arr[n-1]<=sum){
            return solve(arr,sum-arr[n-1],n-1) || solve(arr,sum,n-1);
        }
        else{
            return solve(arr,sum,n-1);
        }
    }
}

//memoization method


class Solution {
    static boolean equalPartition(int arr[]) {
       int n=arr.length;
       int sum=0;
       for(int i=0;i<n;i++){
           sum+=arr[i];
       }
       
       Boolean dp[][]=new Boolean[n+1][sum+1];
       
       if (sum % 2 != 0) return false; 

        return solve(arr, sum / 2, n,dp);
        
    }
    
    public static Boolean solve(int arr[], int sum,int n,Boolean dp[][]){
        if(sum==0) return true;
        if(n==0) return false;
        
        if(dp[n][sum]!=null){
            return dp[n][sum];
        }
        
        if(arr[n-1]<=sum){
            dp[n][sum]=solve(arr,sum-arr[n-1],n-1,dp) || solve(arr,sum,n-1,dp);
        }
        else{
            dp[n][sum]=solve(arr,sum,n-1,dp);
        }
        
        return dp[n][sum];
    }
}



//tabulation method
static boolean equalPartition(int arr[]) {
        int n=arr.length;
       int sum=0;
       for(int i=0;i<n;i++){
           sum+=arr[i];
       }
       
       if (sum % 2 != 0) return false; 
       
       sum=sum/2;

        boolean dp[][]=new boolean[n+1][sum+1];
        
        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=sum;j++){
                int wt=arr[i-1];
                if(wt<=j){
                    dp[i][j]=dp[i-1][j-wt] || dp[i-1][j];
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        
        return dp[n][sum];
        
    }



*/ 




//----------------------------------------------------------------------------------------------------------------
/*

Perfect Sum Problem
Difficulty: MediumAccuracy: 20.58%Submissions: 507K+Points: 4
Given an array arr of non-negative integers and an integer target, the task is to count all subsets of the array whose sum is equal to the given target.

Examples:

Input: arr[] = [5, 2, 3, 10, 6, 8], target = 10
Output: 3
Explanation: The subsets {5, 2, 3}, {2, 8}, and {10} sum up to the target 10.
Input: arr[] = [2, 5, 1, 4, 3], target = 10
Output: 3
Explanation: The subsets {2, 1, 4, 3}, {5, 1, 4}, and {2, 5, 3} sum up to the target 10.



class Solution {
    // Function to calculate the number of subsets with a given sum
    public int perfectSum(int[] nums, int target) {
        int n=nums.length;
        int dp[][]=new int[n+1][target+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=target;j++){
                dp[i][j]=-1;
            }
        }
        return solve(nums,target,n,dp);
    }
    public int solve(int[] nums, int target,int n,int dp[][]){
         if (n == 0) {
            if (target == 0) return 1; 
            else return 0;
        }
        if(dp[n][target]!=-1){
            return dp[n][target];
        }
        if(nums[n-1]<=target){
            int a=solve(nums,target-nums[n-1],n-1,dp);
            int b=solve(nums,target,n-1,dp);
            dp[n][target]=a+b;
            return dp[n][target];
        }
        else{
            dp[n][target]= solve(nums,target,n-1,dp);
            return dp[n][target];
        }
    }
}



//tabulation method


class Solution {
    // Function to calculate the number of subsets with a given sum
    public int perfectSum(int[] nums, int target) {
        int n=nums.length;
        int dp[][]=new int[n+1][target+1];
        for(int i=0;i<=n;i++){
            dp[i][0]=1;
        }
        
        
        for(int i=1;i<=n;i++){
            for(int j=0;j<=target;j++){
                int val=nums[i-1];
                if(val<=j){
                    dp[i][j]=dp[i-1][j-val]+dp[i-1][j];
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        
        return dp[n][target];
        
    }
}
 
*/




//----------------------------------------------------------------------------------------------------------------
/* 
Minimum sum partition
Difficulty: HardAccuracy: 38.97%Submissions: 158K+Points: 8
Given an array arr[]  containing non-negative integers, the task is to divide it into two sets set1 and set2 such that the absolute difference between their sums is minimum and find the minimum difference.

Examples:

Input: arr[] = [1, 6, 11, 5]
Output: 1
Explanation: 
Subset1 = {1, 5, 6}, sum of Subset1 = 12 
Subset2 = {11}, sum of Subset2 = 11 
Hence, minimum difference is 1.  
Input: arr[] = [1, 4]
Output: 3
Explanation: 
Subset1 = {1}, sum of Subset1 = 1
Subset2 = {4}, sum of Subset2 = 4
Hence, minimum difference is 3.
Input: arr[] = [1]
Output: 1
Explanation: 
Subset1 = {1}, sum of Subset1 = 1
Subset2 = {}, sum of Subset2 = 0
Hence, minimum difference is 1.

//Memoization Method

// User function Template for Java

class Solution {

    public int minDifference(int arr[]) {
    int n = arr.length;
    int totalSum = 0;
    for (int a : arr) {
        totalSum += a;
    }

    int dp[][] = new int[n + 1][totalSum + 1];
    for (int i = 0; i <= n; i++) {
        Arrays.fill(dp[i], -1);
    }

    return solve(arr, n, 0, totalSum, dp);
}

public int solve(int arr[], int n, int currSum, int totalSum, int dp[][]) {
    if (n == 0) {
        return Math.abs((totalSum - currSum) - currSum);
    }

    if (dp[n][currSum] != -1) {
        return dp[n][currSum];
    }

    int include = solve(arr, n - 1, currSum + arr[n - 1], totalSum, dp);
    int exclude = solve(arr, n - 1, currSum, totalSum, dp);

    dp[n][currSum] = Math.min(include, exclude);
    return dp[n][currSum];
    
    
    }

}




//Tabulation method
class Solution {
    public int minDifference(int[] arr) {
        int n = arr.length;
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        boolean[][] dp = new boolean[n + 1][totalSum + 1];

        // Initialize: sum 0 is always possible (by taking no elements)
        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }

        // Fill the DP table
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= totalSum; j++) {
                // Exclude current element
                dp[i][j] = dp[i - 1][j];

                // Include current element if possible
                int curr = arr[i - 1];
                if (j >= curr) {
                    dp[i][j] = dp[i][j] || dp[i - 1][j - curr];
                }
            }
        }

        // Find the minimum difference
        int minDiff = Integer.MAX_VALUE;
        for (int s1 = 0; s1 <= totalSum / 2; s1++) {
            if (dp[n][s1]) {
                int s2 = totalSum - s1;
                minDiff = Math.min(minDiff, Math.abs(s2 - s1));
            }
        }

        return minDiff;
    }
}
 
*/


//----------------------------------------------------------------------------------------------------------------
/*

Partitions with Given Difference
Difficulty: MediumAccuracy: 36.76%Submissions: 173K+Points: 4Average Time: 20m
Given an array arr[], partition it into two subsets(possibly empty) such that each element must belong to only one subset. Let the sum of the elements of these two subsets be sum1 and sum2. Given a difference d, count the number of partitions in which sum1 is greater than or equal to sum2 and the difference between sum1 and sum2 is equal to d. 

Examples :

Input: arr[] =  [5, 2, 6, 4], d = 3
Output: 1
Explanation: There is only one possible partition of this array. Partition : {6, 4}, {5, 2}. The subset difference between subset sum is: (6 + 4) - (5 + 2) = 3.

class Solution {
    int countPartitions(int[] arr, int d) {
       int n=arr.length;
       int totalSum=0;
       for(int a:arr){
           totalSum+=a;
       }
       if((totalSum+d)%2!=0 || totalSum<0) return 0;
       int target=(totalSum+d)/2;
       
       return solve(arr,n,target);
    }
    
    public int solve(int[] arr, int n,int target){
        int dp[][]=new int[n+1][target+1];
        
        for(int i=0;i<=n;i++){
            dp[i][0]=1;
        }
        
        for(int i=1;i<=n;i++){
            for(int j=0;j<=target;j++){
                int v=arr[i-1];
                if(v<=j){
                    dp[i][j]=dp[i-1][j-v]+dp[i-1][j];
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        
        return dp[n][target];
    }
}
 
*/



//----------------------------------------------------------------------------------------------------------------
/*

->it is similar to the previos question......

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
    public int findTargetSumWays(int[] arr, int target) {
       int n=arr.length;
       int totalSum=0;
       for(int a:arr){
           totalSum+=a;
       }
      
       if ((totalSum + target) % 2 != 0 || totalSum < Math.abs(target)) return 0;

       int sum = (totalSum + target) / 2;

       return solve(arr,n,sum);
    }

     public int solve(int[] arr, int n,int target){
        int dp[][]=new int[n+1][target+1];
        
        for(int i=0;i<=n;i++){
            dp[i][0]=1;
        }
        
        for(int i=1;i<=n;i++){
            for(int j=0;j<=target;j++){
                int v=arr[i-1];
                if(v<=j){
                    dp[i][j]=dp[i-1][j-v]+dp[i-1][j];
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        
        return dp[n][target];
    }
}
*/






//----------------------------------------------------------------------------------------------------------------

//03.Unbounded knapsack

/*
 val[]={15,14,10,45,30}
 wt[]={2,5,1,3,4}
 W(total allowed weight)=7

 ans=Max profit
 */


public class part02 {

    public static void print(int dp[][]){
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                 System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static int knapsackTab(int val[],int wt[],int W){
        int n=val.length;
        int dp[][]=new int[n+1][W+1];
        for(int i=0;i<dp.length;i++){
            dp[i][0]=0;
        }
        for(int j=0;j<dp[0].length;j++){  
            dp[0][j]=0;
        }

        for(int i=1;i<n+1;i++){
            for(int j=1;j<W+1;j++){  
                if(wt[i-1] <= j){  
                    dp[i][j]=Math.max(val[i-1]+dp[i][j-wt[i-1]],dp[i-1][j]);
                }
                else{
                dp[i][j]=dp[i-1][j];
                
                }
            }
        }
        print(dp);
        return dp[n][W];

    }
    public static void main(String[] args) {

    int val[]={15,14,10,45,30};
    int wt[]={2,5,1,3,4};
    int W=7;


    System.out.println(knapsackTab(val, wt, W));
        
    }
    
}






/*
 * Some basic things about recursion
 * case01.min,max,largest smallest(comperision)
 * 
 * case02.count,sum ways,total ways,all ways(Addition)
*/



/*
  * Coin Change (Variation of Unbounded Knapsack)
  coins[]={1,2,3}
  sum=4
  find total no's of ways or count of ways or all ways
  {1,1,1,1},{1,1,2},{2,2},{1,3} this total ways

  coins[]={2,5,3,6}
  {2,2,2,2,2},{2,2,3,3},{2,2,6},{2,3,5} and {5,5}
  sum=10





public class part03 {
    public static int coinsChange(int coins[],int sum){
        int n=coins.length;
        int dp[][]=new int[n+1][sum+1];
        //initialize - sum is 0
        //i -> coins; j-> sum/change
        for(int i=0;i<n+1;i++){
            dp[i][0]=1;
        }

        for(int j=0;j<sum+1;j++){
            dp[0][j]=0;
        }

        for(int i=1;i<n+1;i++){
            for(int j=1;j<sum+1;j++){
                if(coins[i-1] <= j){
                    dp[i][j]=dp[i][j-coins[i-1]] +dp[i-1][j];
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][sum];
    }
    public static void main(String[] args) {
    int coins[]={1,2,3};
    int sum=4;  //ans=4
    System.out.println("total no's of ways"+coinsChange(coins, sum));
    }
    
}
*/








//----------------------------------------------------------------------------------------------------------------
/* 
//Coin Change promlem-II thoda tricky hai
322. Coin Change
Solved
Medium
Topics
Companies
You are given an integer array coins representing coins of different denominations and an integer amount representing a total amount of money.

Return the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.

You may assume that you have an infinite number of each kind of coin.

 

Example 1:

Input: coins = [1,2,5], amount = 11
Output: 3
Explanation: 11 = 5 + 5 + 1
Example 2:

Input: coins = [2], amount = 3
Output: -1

class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[][] dp = new int[n + 1][amount + 1];
        int INF = amount + 1;

        for (int i = 0; i <= n; i++) {
            dp[i][0] = 0;
        }

        for (int i = 1; i <= amount; i++) {
            dp[0][i] = INF;
        }

        for (int i = 1; i <= n; i++) {
            int c = coins[i - 1];
            for (int j = 1; j <= amount; j++) {
                if (c <= j) {
                    dp[i][j] = Math.min(1 + dp[i][j - c], dp[i - 1][j]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[n][amount] == INF ? -1 : dp[n][amount];
    }
}



 
*/











/* 
 ->Rod cutting:-Given a rod of length n inches and an array of prices that includes prices of all pieces of size
 smaller than n.Determine the maximum value obtainable by cutting up the rod and selling the pieces 
 length=1,2,3,4,5,6,,7,8
 price=1,5,8,9,10,17,17,20
 rodLength=8




public class part03 {
    //weight => lenght;  val=>price; w=>totRod
    public static int rodCutting(int len[],int price[],int totRod){
        int n=price.length;
        int dp[][]=new int[n+1][totRod+1];

        for(int i=0;i<n+1;i++){
            for(int j=0;j<totRod+1;j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                }
            }
        }

        for(int i=1;i<n+1;i++){
            for(int j=1;j<totRod+1;j++){
                if(len[i-1] <= j){
                    dp[i][j]=Math.max(price[i-1] +dp[i][j-len[i-1]],dp[i-1][j]);
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][totRod];
        
    }
    public static void main(String[] args) {

    int len[]={1,2,3,4,5,6,7,8}; //pieces length
    int price[]={1,5,8,9,10,17,17,20};
    int totRod=8;
    System.out.println(rodCutting(len, price, totRod));


    }
}


*/











//----------------------------------------------------------------------------------------------------------------
/* 
//Rod Cutting only price array diya ho tab.........
Rod Cutting
Difficulty: MediumAccuracy: 60.66%Submissions: 164K+Points: 4Average Time: 20m
Given a rod of length n(size of price) inches and an array of prices, price. price[i] denotes the value of a piece of length i. Determine the maximum value obtainable by cutting up the rod and selling the pieces.

Example:

Input: price[] = [1, 5, 8, 9, 10, 17, 17, 20]
Output: 22
Explanation: The maximum obtainable value is 22 by cutting in two pieces of lengths 2 and 6, i.e., 5+17=22.
Input: price[] = [3, 5, 8, 9, 10, 17, 17, 20]
Output: 24
Explanation: The maximum obtainable value is 24 by cutting the rod into 8 pieces of length 1, i.e, 8*price[1]= 8*3 = 24.
Input: price[] = [1, 10, 3, 1, 3, 1, 5, 9]
Output: 40

class Solution {
    public int cutRod(int[] price) {
        int n=price.length;
        int dp[][]=new int[n+1][n+1];
        
        for(int i=0;i<=n;i++){
            dp[i][0]=0;
        }
        
        for(int i=0;i<=n;i++){
            dp[0][i]=0;
        }
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i<=j){
                    dp[i][j]=Math.max(price[i-1]+dp[i][j-i],dp[i-1][j]);
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        
        return dp[n][n];
    }
}
 
*/

