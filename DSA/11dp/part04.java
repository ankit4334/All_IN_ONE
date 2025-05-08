//problem question:-
/*
 * WildCard Matching:-
 Given a   text and a wildcard pattern,implment wildcard pattern matching algorith taht finds if wildcard pattern is amtched with
 text.The matching should cover the entire text (not partiaal text).the wildcard pattern can include the character '?'  and '*'
 ->'?'-matches any single charecter
 ->'*' Matches any sequencce of  character(including the empty sequence)

 Text="baaabab"
 pattern="*****ba*****ab";
 output=true


 Text="baaaba"
 Pattern="a*ab"
 output:false




public class part04 {
    public static boolean isMatch(String s,String p){
        int n=s.length();
        int m=p.length();

        boolean dp[][]=new boolean[n+1][m+1];
        dp[0][0]=true;
        for(int i=1;i<n+1;i++){
            dp[i][0]=false;
        }

        for(int j=1;j<m+1;j++){
            if(p.charAt(j-1)=='*'){
                dp[0][j]=dp[0][j-1];
            }
        }

        //bottom up 
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                //case -> ith char== jth char || ?
                if(s.charAt(i-1)==p.charAt(j-1) || p.charAt(j-1)=='?'){
                    dp[i][j]=dp[i-1][j-1];
                }
                else if(p.charAt(j-1)=='*'){
                    dp[i][j]=dp[i-1][j] || dp[i][j-1];
                }
                else{
                    dp[i][j]=false;
                }
            }
        }

        return dp[n][m];

    }
    public static void main(String[] args) {
        
 String s="baaabab";
 String p="*****ba*****ab";
 System.out.println(isMatch(s,p));
        
    }
    
}


*/

//topic:-Catalan's Number

/* 
 * Catalan's Number
 co=1
 c1=
 c2=co.c1+c1.co=2
 c3=co.c2+c1.c1+c2.co=5
 Cn=CoCn-1+C1Cn-2+C2Cn-3+......+Cn-1C0;


import java.lang.reflect.Array;
import java.util.Arrays;

public class part04 {

    //catalan using recursion method  01
    public static int catalanRec(int n){
        if(n==0 || n==1){
            return 1;
        }
        int s=0;
        for(int i=0;i<=n-1;i++){
            s+=catalanRec(i)*catalanRec(n-i-1);
        }

        return s;

    }

    //catalan using Memoization method
    public static int catalanMemo(int n,int dp[]){
        if(n==0 || n==1){
            return 1;
        }
        if(dp[n]!=-1){
            return dp[n]; 
        }
        int s=0;
        for(int i=0;i<n;i++){
            s+=catalanMemo(i,dp)*catalanMemo(n-i-1,dp);
        }

        return dp[n]=s;

    }



    //catalan using tabulation method
    public static int catalanTabu(int n){
        int dp[]=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            for(int j=0;j<i;j++){
                dp[i]+=dp[j]*dp[i-j-1];  //Ci=Cj*Ci-j-1
            }
        }
        return dp[n];

    }      


public static void main(String[] args) {
 
        //int n=4;
        //01 using Recursion method
        //System.out.println(catalanRec(n));


        //02.memoization method

        // int dp[]=new int[n+1];
        // Arrays.fill(dp,-1);
        // System.out.println(catalanMemo(n,dp));
   


        //03.tabulation method to find catalan number
        System.out.println(catalanTabu(5));
    }
    
}

*/

//problem
/*
 *Counting Trees:-Find number of all possible BSTs with given n nodes.
 n=3(10,20,30)
 ans=5



public class part04 {
    public static int countBST(int n){
        int dp[]=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            for(int j=0;j<i;j++){
                int left=dp[j];
                int right=dp[i-j-1];
                dp[i]+=left*right;
            }
        }
        return dp[n];

    }
    public static void main(String[] args) {
        int n=3;
        //ans=5;
        System.out.println(countBST(n));
    }
    
}
*/

//problem
/*
->Mountain Ranges:-
Mountains and valleys, at any moment the number of down strokes cannot be more
than number of up strokes.



public class part04 {
    //Tc=O(n^2)
    public static int mountainRanges(int n){
        int dp[]=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<n+1;i++){
            for(int j=0;j<i;j++){
                int inside=dp[j];
                int outside=dp[i-j-1];
                dp[i]+=inside*outside;
            }
        }
        return dp[n];

    }
    public static void main(String[] args) {
        int n=4;
        //ans=14;
        System.out.println(mountainRanges(n));
    }
    
}

*/

/* 

//Matrix Chain Multiplication

import java.lang.reflect.Array;
import java.util.Arrays;

public class part04 {
    //01.recurtion Method...
    public static int mcm(int arr[],int i,int j){
        if(i==j){
            return 0;//sing matrix case
        }

        int ans=Integer.MAX_VALUE;
        for(int k=i;k<=j-1;k++){
            int cost1=mcm(arr, i, k);  //Ai...Ak=>arr[i-1] X arr[k];
            int cost2=mcm(arr,k+1,j);  //Ai+1...Aj=>arr[k] X arr[j];
            int cost3=arr[i-1]*arr[k]*arr[j];
            int finalCost=cost1+cost2+cost3;
            ans=Math.min(ans, finalCost);
        }

        return ans;  //mincost

    }  

    //02.memoization code find mcm
    public static int mcmMemo(int arr[],int i,int j,int dp[][]){
        if(i==j){
            return 0;//sing matrix case
        }

        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        int ans=Integer.MAX_VALUE;
        for(int k=i;k<=j-1;k++){
            int cost1=mcmMemo(arr, i, k,dp);
            int cost2=mcmMemo(arr,k+1,j,dp);
            int cost3=arr[i-1]*arr[k]*arr[j];
            int finalCost=cost1+cost2+cost3;
            ans=Math.min(ans, finalCost);
        }

        return dp[i][j]=ans;  //mincost

    }




    //02.Tabulation code find mcm
    public static int mcmTabu(int arr[]){
       int n=arr.length;
       int dp[][]=new int[n][n];

       //initialization
       for(int i=0;i<n;i++){
        dp[i][i]=0;
       }

       //bottom-up
       for(int len=2;len<=n-1;len++){
        for(int i=1;i<=n-len;i++){
            int j=i+len-1;  //col
            dp[i][j]=Integer.MAX_VALUE;
            for(int k=i;k<=j-1;k++){
                int cost1=dp[i][k];
                int cost2=dp[k+1][j];
                int cost3=arr[i-1]*arr[k]*arr[j];
                int finalCost=cost1+cost2+cost3;
                dp[i][j]=Math.min(dp[i][j], finalCost);
            }

        }
       }
       return dp[1][n-1];

    }


    public static void main(String[] args) {
        int arr[]={1,2,3,4,3};   //n=5;
        int n=arr.length;
        //System.out.println(mcm(arr,1,n-1 ));


        //02.memoization code
        // int dp[][]=new int[n][n];
        // for(int i=0;i<n;i++){
        //     Arrays.fill(dp[i],-1);
        // }
        // System.out.println(mcmMemo(arr,1,n-1,dp));




        //03.tabulation code....
        System.out.println(mcmTabu(arr));

    }
    
}


*/

/*
 * Minimum Partitioning /minimum subset sum diffrence/partitioing subset.
 numbers[]={1,6,11,5};
 min diff=1




public class part04 {
    //Tc=O(n*W)
    public static int minPartition(int arr[]){
        int n=arr.length;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        
        int W=sum/2;
        int dp[][]=new int[n+1][W+1];


        //bottom up
        for(int i=1;i<n+1;i++){
            for(int j=1;j<W+1;j++){
                if(arr[i-1]<=j){
                    dp[i][j]=Math.max(arr[i-1]+dp[i-1][j-arr[i-1]],dp[i-1][j]);

                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }

        int sum1=dp[n][W];
        int sum2=sum-sum1;
        return Math.abs(sum1-sum2);

    }
    public static void main(String[] args) {
        int arr[]={1,6,11,5};
        //ans=1;
        System.out.println(minPartition(arr));
    }
    
}
*/

//Min Array Jumps problem:-
//int arr[]={2,3,1,1,4};
//min jummps=2

import java.lang.reflect.Array;
import java.util.Arrays;

public class part04 {

    public static int minJump(int nums[]) {
        int n = nums.length;

        int dp[] = new int[n];

        Arrays.fill(dp, -1);
        dp[n - 1] = 0;

        for (int i = n - 2; i >= 0; i--) {
            int steps = nums[i];
            int ans = Integer.MAX_VALUE;
            for (int j = i + 1; j <= i + steps && j < n; j++) {
                if (dp[j] != -1) {
                    ans = Math.min(ans, dp[j] + 1);
                }
            }
            if (ans != Integer.MAX_VALUE) {
                dp[i] = ans;
            }
        }
        return dp[0];

    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 1, 1, 4 };
        // ans=2;
        System.out.println(minJump(arr));
    }

}
