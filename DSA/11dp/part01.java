//Dynamic programming:-

//fibbonaci  series
/*
public class part01 {
    public static int fib(int n,int f[]){  //now Tc=O(n)
        if(n==0 || n==1){
            return n;
        }

        if(f[n]!=0){ //fib(n) is already calculatedx
            return f[n];
        }
        
        f[n]=fib(n-1,f) +fib(n-2,f);
        return f[n];
    }

    public static void main(String[] args) {
        int n=8;
        int f[]=new int[n+1]; //n+1 because fibonaci 0 se n tak find kiya jata hai
        //in starting all values 0 0 0  in arrary by default
        System.out.println(fib(n,f));
    }
    
}  
    
*/

/* 
 ->What is DP:-
 dP is Optimized recursion.
 
 a.greeedy:-least,most ,min,max largest,smallest all are optimal problem.
 all find using greedy.

 b.some choice is given (multiple raches in recursion tree)

 definition of dp:-Dynamic programming(dp) is a technique in computer programming that helps to
 efficiently solve a class of problems that have overlapping subproblems and optimal substructure property.



 Ways of DP:-
 1.memoization(top down)

 2.Tabulation(bottom up):-tabulations means table forms.

*/










/* 
//tabulation method fibonacci sereies
public class part01 {
    public static int fib(int n,int f[]){  //now Tc=O(n)  //this is memoization method
        if(n==0 || n==1){
            return n;
        }

        if(f[n]!=0){ //fib(n) is already calculatedx
            return f[n];
        }
        
        f[n]=fib(n-1,f) +fib(n-2,f);
        return f[n];
    }

    public static int fibTabulation(int n){
        int dp[]=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1] + dp[i-2];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int n=8;
        int f[]=new int[n+1]; //n+1 because fibonaci 0 se n tak find kiya jata hai
        //in starting all values 0 0 0  in arrary by default
        System.out.println(fib(n,f));
        System.out.println(fibTabulation(n));
    }
    
}

*/



/* 
 ->7 Important Question
 1.Fibonacci
 ->climbing stairs
 ->number factors
 ->Min jumps to rh the end
 ->Min jumps with cost
 ->House thief

 2.0-1 Knapsack
 ->subset sum
 ->Equal Subset sum partion
 ->Min subsaet sum diffrence
 ->count of subset sum
 ->Target Sum

 3.Unbounded Knapsack
 ->Rod Cutting 
 ->Coin Change
 ->Min Coin Change
 ->Max Ribbon Cut
 
 4.lcs(Longest Common Subsequence)
 ->longest common substring
 ->Edit Distance
 ->Box Stacking
 ->Longest Incresing Subsequnce
 ->Longest Bitonic Subsequence
 ->Subsequnce Patern Mtching 
 ->Min Add/Delete to convert 
 ->One Sting to another.

 5.Kadane's alogrith(Arrays)


 6.Catalan Number
 ->No of BSTs
 ->N Parentheses
 ->Convex Polygons
 ->Disjoint Chors
 Cataln Tringle
 ->Mounjtain Ranges
 ->Dyck Words


 7.Dp on Grid(2D Arrays)

 
*/













/* 
 ->Climbing Stairs:-
 count ways to reach the nth stair.The person can climb either 1 stair or 2 stairs at a time.
*/

import java.util.Arrays;

public class part01 {
    //tc=O(n^2)
    public static int countWays(int n){  //method-01 recursion
       if(n<0){
        return 0;
       }
       if(n==0){
        return 1;
       }

       return countWays(n-1)+countWays(n-2);
    }

    //tc=O(n)
    public static int countWaysMemo(int n,int ways[]){  //method-02 memoization 
       if(n<0){
        return 0;
       }
       if(n==0){
        return 1;
       }

       if(ways[n]!=-1){ //already calculated
        return ways[n];
       }

       ways[n]=countWaysMemo(n-1,ways)+countWaysMemo(n-2,ways);

       return ways[n];
    }

    //method 03 using tabulation   Tc=O(n)
    public static int countWaysTabulation(int n){  
       int dp[]=new int[n+1];
       dp[0]=1;

       for(int i=1;i<=n;i++){
        if(i==1){
            dp[i]=dp[i-1];
        }
        else{
            dp[i]=dp[i-1] + dp[i-2];
        }
       
       }

       return dp[n];
    }

    public static void main(String[] args) {
        int n=5;  //n=3 & n=4 -> 5=>8ans
        //01 recursion
        //System.out.println(countWays(n));


        //02method memeization
        // int ways[]=new int[n+1];  //0 0 0 0
        // Arrays.fill(ways, -1);   //-1 -1 -1 -1
        // System.out.println(countWaysMemo(n,ways));


        //03 method using Tabulation
        System.out.println(countWaysTabulation(n));
    }
    
}