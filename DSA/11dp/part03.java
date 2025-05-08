
/* 
//Longest Common Subsequence(LCS):-
A subsequence of string is a new string generated from the original string with some charecters (can be none)
deleted without changing the relative order of the remaining charecters.

str1="abcde" str2"ace"
ans=3 //"ace"



str1="abcdge" str2"abedg"
ans=4 //"abdg"





//01.Recursion method
public class part03 {
    public static int lcs(String str1,String str2,int n,int m){
        if(n==0 || m==0){
            return 0;
        }

        if(str1.charAt(n-1)==str2.charAt(m-1)){
            return lcs(str1, str2, n-1, m-1)+1;
        }
        else{
            int ans1=lcs(str1, str2, n-1, m);
            int ans2=lcs(str1, str2, n, m-1);
            return Math.max(ans1,ans2);
        }
       
        
    }

    //memoization code 
    public static int lcsWithMemo(String str1,String str2,int n,int m,int dp[][]){
        if(n==0 || m==0){
            return 0;
        }

        if(dp[n][m]!=-1){
            return dp[n][m];
        }


        if(str1.charAt(n-1)==str2.charAt(m-1)){
            return dp[n][m]=lcsWithMemo(str1, str2, n-1, m-1,dp)+1;
        }
        else{
            int ans1=lcsWithMemo(str1, str2, n-1, m,dp);
            int ans2=lcsWithMemo(str1, str2, n, m-1,dp);
            return Math.max(ans1,ans2);
        }
    }




    //03.tabulation method 
   public static int lcsTabu(String str1,String str2){
        int n=str1.length();
        int m=str2.length();
        int dp[][]=new int[n+1][m+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                }
            }
        }


        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else{
                    int ans1=dp[i-1][j];
                    int ans2=dp[i][j-1];
                    dp[i][j]=Math.max(ans1,ans2);
                }
            }
        }
        return dp[n][m];

    }



    public static void main(String[] args) {
        String str1="abcdge";
        String str2="abedg";
        //lcs="abdg"; lenght=4

        //recursion method
        //System.out.println(lcs(str1, str2, str1.length(),str2.length()));


        //02.mehtod memoization method
        // int n=str1.length();
        // int m=str2.length();
        // int dp[][]=new int[n+1][m+1];
        // for(int i=0;i<n+1;i++){
        //     for(int j=0;j<m+1;j++){
        //         dp[i][j]=-1;
        //     }
        // }
        // System.out.println(lcsWithMemo(str1,str2,n,m,dp));


        //03.Tabulation method
        System.out.println(lcsTabu(str1,str2));

    }
}

*/




























//dp part-04

/* 
 *Longest Common Substring:-
 a substring is contiguous sequence of characters within a string.
 S1="ABCDE" ,S2="ABGCE"
 ans=2 //"AB"

 S1="ABCDGH" ,S2="ACDGHR"
 ans=4 //"CDGH"




public class part03 {
    //tc=O(n*m)
    public static int LongestCommonSubstring(String str1,String str2){
       
        int n=str1.length();
        int m=str2.length();
        int dp[][]=new int[n+1][m+1];
        int ans=0;
        for(int i=0;i<n+1;i++){
            dp[i][0]=0;
        }

        for(int j=0;j<m+1;j++){
            dp[0][j]=0;
        }


        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                    ans=Math.max(ans,dp[i][j]);
                }
                else{
                    dp[i][j]=0;
                }
            }
        }
        return ans;
        
    }
    public static void main(String[] args) {

        String S1="ABCDE",S2="ABGCE";

    
        System.out.println(LongestCommonSubstring(S1,S2));

    }
}

*/


















//----------------------------------------------------------------------------------------------------------------
/* 
 Print Longest Common Subsequence
 Example:
Input: ‘s1’  = “abcab”, ‘s2’ = “cbab”

Output: “bab”

public class Solution {
    public static String findLCS(int n, int m, String s1, String s2){
        int dp[][]=new int[n+1][m+1];

        for(int i=0;i<=n;i++){
            for(int j=0;j<=m;j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                }
            }
        }



        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }


        //Step:-2 Ab ham lcs construct karenge.....

        int i=n,j=m;
        StringBuilder sb=new StringBuilder();
        while(i>0 && j>0){
            if(s1.charAt(i-1)==s2.charAt(j-1)){
                sb.append(s1.charAt(i-1));
                i--;
                j--;
            }
            else if(dp[i-1][j]>dp[i][j-1]){
                i--;
            }
            else{
                j--;
            }
        }

        return sb.reverse().toString();
    }
}
 
*/




//----------------------------------------------------------------------------------------------------------------
/* 
1092. Shortest Common Supersequence 
Solved
Hard
Topics
Companies
Hint
Given two strings str1 and str2, return the shortest string that has both str1 and str2 as subsequences. If there are multiple valid strings, return any of them.

A string s is a subsequence of string t if deleting some number of characters from t (possibly 0) results in the string s.

 

Example 1:

Input: str1 = "abac", str2 = "cab"
Output: "cabac"

class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {

        //step:-1 jisme ham lcs find karenge using dp
        int m=str1.length();
        int n=str2.length();
        int dp[][]=new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                }
            }
        }



        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }


        //Step:-2 Ab ham lcs construct karenge.....

        int i=m,j=n;
        StringBuilder sb=new StringBuilder();
        while(i>0 && j>0){
            if(str1.charAt(i-1)==str2.charAt(j-1)){
                sb.append(str1.charAt(i-1));
                i--;
                j--;
            }
            else if(dp[i-1][j]>dp[i][j-1]){
                sb.append(str1.charAt(i - 1));
                i--;
            }
            else{
                sb.append(str2.charAt(j - 1));
                j--;
            }
        }

        //jinta code likhe use printing lcs ho jayega 

        //ab ham remaing element ko add karege

        while(i>0){
            sb.append(str1.charAt(i-1));
            i--;
        }

        while(j>0){
            sb.append(str2.charAt(j-1));
            j--;
        }

        return sb.reverse().toString();
        
    }
}


Note:-Esme length puche to only (m+n-dp[m][n]) kar dena lcs nikal string banane ka kam nahi hai.......
 
*/



//----------------------------------------------------------------------------------------------------------------
/* 
 Minimum number of deletions and insertions
Difficulty: MediumAccuracy: 65.29%Submissions: 71K+Points: 4
Given two strings s1 and s2. The task is to remove or insert the minimum number of characters from/in s1 to transform it into s2. It could be possible that the same character needs to be removed from one point of s1 and inserted into another point.

Examples :

Input: s1 = "heap", s2 = "pea"
Output: 3
Explanation: 'p' and 'h' deleted from heap. Then, 'p' is inserted at the beginning.

class Solution {
    public int minOperations(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        
        int dp[][]=new int[n+1][m+1];

        for(int i=0;i<=n;i++){
            for(int j=0;j<=m;j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                }
            }
        }



        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        
        int lcs=dp[n][m];
        int deletion=n-lcs;
        int inseriton=m-lcs;
        
        return deletion+inseriton;
        
        
    }
}
*/




//----------------------------------------------------------------------------------------------------------------
/* 
516. Longest Palindromic Subsequence
Solved
Medium
Topics
Companies
Given a string s, find the longest palindromic subsequence's length in s.

A subsequence is a sequence that can be derived from another sequence by deleting some or no elements without changing the order of the remaining elements.

 

Example 1:

Input: s = "bbbab"
Output: 4
Explanation: One possible longest palindromic subsequence is "bbbb".



class Solution {
    public int longestPalindromeSubseq(String s) {
        String t=reverse(s);

        return lcs(s,t);
    }

    public int lcs(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        
        int dp[][]=new int[n+1][m+1];

        for(int i=0;i<=n;i++){
            for(int j=0;j<=m;j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                }
            }
        }



        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        
        return dp[n][m];
        
    }

    public String reverse(String s){
        StringBuilder sb=new StringBuilder(s);
        return sb.reverse().toString();
    }
}
 
*/





//----------------------------------------------------------------------------------------------------------------
/*
 Minimum number of deletions make palindrom.
Difficulty: MediumAccuracy: 65.47%Submissions: 27K+Points: 4Average Time: 30m
Given a string 'str' of size ‘n’. The task is to remove or delete the minimum number of characters from the string so that the resultant string is a palindrome. Find the minimum number of characters we need to remove.
Note: The order of characters should be maintained.

Example 1:

Input: n = 7, str = "aebcbda"
Output: 2
Explanation: We'll remove 'e' and
'd' and the string become "abcba".

class Solution 
{ 
    int minDeletions(String str, int n)
    {
        String s=reverse(str);
        int lcs=findlcs(str,s);
        return n-lcs;
    }
    
    public int findlcs(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        int ans=0;
        
        int dp[][]=new int[n+1][m+1];

        for(int i=0;i<=n;i++){
            for(int j=0;j<=m;j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                }
            }
        }



        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        
        return dp[n][m];
        
    }
    
    String reverse(String s){
        StringBuilder sb=new StringBuilder(s);
        return sb.reverse().toString();
    }
} 
*/




//----------------------------------------------------------------------------------------------------------------
/* 
1312. Minimum Insertion Steps to Make a String Palindrome
Solved
Hard
Topics
Companies
Hint
Given a string s. In one step you can insert any character at any index of the string.

Return the minimum number of steps to make s palindrome.

A Palindrome String is one that reads the same backward as well as forward.

 

Example 1:

Input: s = "zzazz"
Output: 0
Explanation: The string "zzazz" is already palindrome we do not need any insertions.
Example 2:

Input: s = "mbadm"
Output: 2
Explanation: String can be "mbdadbm" or "mdbabdm".

class Solution {
    public int minInsertions(String s) {
        int n=s.length();
        String str=reverse(s);
        int lcs=findlcs(s,str);
        return n-lcs;
    }

    public int findlcs(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        int ans=0;
        
        int dp[][]=new int[n+1][m+1];

        for(int i=0;i<=n;i++){
            for(int j=0;j<=m;j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                }
            }
        }



        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        
        return dp[n][m];
        
    }
    
    String reverse(String s){
        StringBuilder sb=new StringBuilder(s);
        return sb.reverse().toString();
    }
}
 
*/





//----------------------------------------------------------------------------------------------------------------
/* 
Longest Repeating Subsequence
Difficulty: MediumAccuracy: 48.54%Submissions: 136K+Points: 4Average Time: 20m
Given string str, find the length of the longest repeating subsequence such that it can be found twice in the given string.

The two identified subsequences A and B can use the same ith character from string s if and only if that ith character has different indices in A and B. For example, A = "xax" and B = "xax" then the index of the first "x" must be different in the original string for A and B.

Examples :

Input: s = "axxzxy"
Output: 2
Explanation: The given array with indexes looks like
a x x z x y 
0 1 2 3 4 5
The longest subsequence is "xx". It appears twice as explained below.
subsequence A
x x
0 1  <-- index of subsequence A
------
1 2  <-- index of s
subsequence B
x x
0 1  <-- index of subsequence B
------
2 4  <-- index of s
We are able to use character 'x' (at index 2 in s) in both subsequences as it appears on index 1 in subsequence A and index 0 in subsequence B.

class Solution {
    public int LongestRepeatingSubsequence(String s) {
        return lcs(s,s);
    }
    
    public int lcs(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        
        int dp[][]=new int[n+1][m+1];

        for(int i=0;i<=n;i++){
            for(int j=0;j<=m;j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                }
            }
        }



        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1) && i!=j){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        
        return dp[n][m];
        
    }
    
}
 
*/






//----------------------------------------------------------------------------------------------------------------
/* 
392. Is Subsequence
Solved
Easy
Topics
Companies
Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

 

Example 1:

Input: s = "abc", t = "ahbgdc"
Output: true

class Solution {
    public boolean isSubsequence(String s, String t) {
        int lcs=findlcs(s,t);
        if(lcs==s.length()) return true;
        return false;
    }

    public int findlcs(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        
        int dp[][]=new int[n+1][m+1];

        for(int i=0;i<=n;i++){
            for(int j=0;j<=m;j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                }
            }
        }



        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        
        return dp[n][m];
        
    }
}
 
*/





//----------------------------------------------------------------------------------------------------------------
/* 
 
*/





//----------------------------------------------------------------------------------------------------------------
/* 
 
*/





//----------------------------------------------------------------------------------------------------------------
/* 
 
*/























/* 
 Longest Increasing Subswquence
 arr[]={50,3,10,7,40,80};
 length of LIS=4;

import java.util.*;
public class part03 {

    public static int lcs(int arr1[],int arr2[]){
        int n=arr1.length;
        int m=arr2.length;
        int dp[][]=new int[n+1][m+1];
        
        for(int i=0;i<n+1;i++){
            dp[i][0]=0;
        }

        for(int j=0;j<m+1;j++){
            dp[0][j]=0;
        }


        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(arr1[i-1]==arr2[j-1]){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else{
                    int ans1=dp[i-1][j];
                    int ans2=dp[i][j-1];
                    dp[i][j]=Math.max(ans1,ans2);
                }
            }
        }
        return dp[n][m];

    }
    //tc=O(n*m)
    public static int lis(int arr1[]){
      HashSet<Integer> set=new HashSet<>();
      for(int i=0;i<arr1.length;i++){
        set.add(arr1[i]);
      }

       int arr2[]=new int[set.size()];  //sorted unique els
       int i=0;
       for(int num:set){
        arr2[i]=num;
        i++;
       }

       Arrays.sort(arr2);
       
       return lcs(arr1,arr2);
        
    }
    public static void main(String[] args) {
        int arr[]={50,3,10,7,40,80};
        System.out.println(lis(arr));
    }
}



*/
//not working above questions
























//Edit Distance problem
import java.util.*;
public class part03 {
    //o(n*m)
    public static int editDistance(String str1,String str2){

        int n=str1.length();
        int m=str2.length();
        int dp[][]=new int[n+1][m+1];
        
        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                if(i==0){
                    dp[i][j]=j;
                }
                if(j==0){
                    dp[i][j]=i;
                }
            }

        }

        
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];
                }
                else{
                    int add=dp[i][j-1]+1;
                    int del=dp[i-1][j]+1;
                    int rep=dp[i-1][j-1]+1;
                    dp[i][j]=Math.min(add,Math.min(del,rep));
                }
            }
        }
        return dp[n][m];
    }
    public static void main(String[] args) {
        String str1="intention";
        String str2="execution";
        System.out.println(editDistance(str1, str2));
    }
}
















//----------------------------------------------------------------------------------------------------------------
/* 
 
*/




//----------------------------------------------------------------------------------------------------------------
/* 
 
*/



//----------------------------------------------------------------------------------------------------------------
/* 
 
*/




//----------------------------------------------------------------------------------------------------------------
/* 
 
*/





//----------------------------------------------------------------------------------------------------------------





//----------------------------------------------------------------------------------------------------------------
/* 
 
*/





//----------------------------------------------------------------------------------------------------------------
/* 
 
*/






//----------------------------------------------------------------------------------------------------------------
/* 
 
*/





//----------------------------------------------------------------------------------------------------------------
/* 
 
*/





//----------------------------------------------------------------------------------------------------------------
/* 
 
*/





//----------------------------------------------------------------------------------------------------------------
/* 
 
*/

