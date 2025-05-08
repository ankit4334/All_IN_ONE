//Practice Question based on String..
/*
 * Remove all duplicates from a given string
EasyAccuracy: 58.68%Submissions: 84K+Points: 2
Internship Alert!
New month-> Fresh Chance to top the leaderboard and get SDE Internship! 

banner
Given a string str which may contain lowercase and uppercase characters. The task is to remove all duplicate characters from the string and find the resultant string. The order of remaining characters in the output should be same as in the original string.

Example 1:

Input:
str = "geEksforGEeks"
Output: 
"geEksforG"
Explanation: 
After removing duplicate characters such as E, e, k, s, we have string as "geEksforG".
Example 2:

Input:
str = "HaPpyNewYear"
Output: 
"HaPpyNewYr"
Explanation: 
After removing duplicate characters such as e, a, we have string as "HaPpyNewYr".
Your Task:
Complete the function removeDuplicates() which takes a string str, as input parameters and returns a string denoting the answer. You don't have to print answer or take inputs.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)

Constraints:
1 ≤ N ≤ 105
String contains uppercase and lowercase english letters.

Company Tags



class Solution {
    String removeDuplicates(String str) {

    LinkedHashSet<Character> s=new LinkedHashSet<>();
    for(int i=0;i<str.length();i++){
        char c=str.charAt(i);
        s.add(c);
    }
    
    StringBuilder sb=new StringBuilder();
    for(Character i:s){
        sb.append(i);
    }
    
    return sb.toString();

    }
}


*/










/* 
 * Reverse words in a given string
EasyAccuracy: 56.08%Submissions: 295K+Points: 2
Internship Alert
New month-> Fresh Chance to top the leaderboard and get SDE Internship! 

banner
Given a String S, reverse the string without reversing its individual words. Words are separated by dots.

Example 1:

Input:
S = i.like.this.program.very.much
Output: much.very.program.this.like.i
Explanation: After reversing the whole
string(not individual words), the input
string becomes
much.very.program.this.like.i
Example 2:

Input:
S = pqr.mno
Output: mno.pqr
Explanation: After reversing the whole
string , the input string becomes
mno.pqr

Your Task:
You dont need to read input or print anything. Complete the function reverseWords() which takes string S as input parameter and returns a string containing the words in reversed order. Each word in the returning string should also be separated by '.' 


Expected Time Complexity: O(|S|)
Expected Auxiliary Space: O(|S|)


Constraints:
1 <= |S| <= 105

 

Company Tags
PaytmAccoliteAmazonMicrosoftSamsungMakeMyTripGoldman SachsAdobeSAP LabsCisco
Topic Tags


class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        StringBuilder sb=new StringBuilder();
        String w[]=S.split("\\.");
        for(int i=w.length-1;i>=0;i--){
            sb.append(w[i]);
            if(i!=0){
                sb.append(".");
            }
        }
        
        return sb.toString();
    }
}
*/
















/* 
 * Anagram
EasyAccuracy: 44.93%Submissions: 292K+Points: 2
Internship Alert
New month-> Fresh Chance to top the leaderboard and get SDE Internship! 

banner
Given two strings a and b consisting of lowercase characters. 
The task is to check whether two given strings are an anagram of each other or not. 
An anagram of a string is another string that contains the same characters, 
only the order of characters can be different. For example, act and tac are an anagram of each other.

Note:-

If the strings are anagrams you have to return True or else return False

|s| represents the length of string s.


Example 1:

Input:a = geeksforgeeks, b = forgeeksgeeks
Output: YES
Explanation: Both the string have same characters with
        same frequency. So, both are anagrams.
Example 2:

Input:a = allergy, b = allergic
Output: NO
Explanation: Characters in both the strings are 
        not same, so they are not anagrams.
Your Task:
You don't need to read input or print anything. Your task is to complete the function isAnagram() which takes the string a and string b as input parameter and check if the two strings are an anagram of each other. The function returns true if the strings are anagram else it returns false.

Expected Time Complexity:O(|a|+|b|).
Expected Auxiliary Space: O(Number of distinct characters).

Constraints:
1 ≤ |a|,|b| ≤ 105

Company Tags
FlipkartDirectiAdobeGoogleNagarroMedia.net

//{ Driver Code Starts
import java.util.*;
import java.util.stream.*; 
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    String str = br.readLine();
		    String s1 = str.split(" ")[0];
		    String s2 = str.split(" ")[1];
		    
		    Solution obj = new Solution();
		    
		    if(obj.isAnagram(s1,s2))
		    {
		        System.out.println("YES");
		    }
		    else
		    {
		        System.out.println("NO");
		    }
		    
		    
		    
		}
	}
}
// } Driver Code Ends


class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        
    //     if(a.length()!=b.length()){
    //         return false;
    //     }
        
        
    //   HashMap<Character,Integer> h1=new HashMap<>();
    //   HashMap<Character,Integer> h2=new HashMap<>();  
       
    //   for(int i=0;i<a.length();i++){
    //       char ch1=a.charAt(i);
    //       char ch2=b.charAt(i);
    //       h1.put(ch1, h1.getOrDefault(ch1, 0) + 1); 
    //         h2.put(ch2, h2.getOrDefault(ch2, 0) + 1);
    //     }
        
    //     int s1=0,s2=0;
        
    //     for(Character i:h1.keySet()){
    //         s1+=i*h1.get(i);
    //     }
        
    //     for(Character i:h2.keySet()){
    //         s2+=i*h2.get(i);
    //     }
         
    //   if(s1==s2 && h1.size()==h2.size()){
    //       return true;
    //   }
       
    //   return false;
    
    
    
    
    
    
    if (a.length() != b.length()) {
            return false;
        }

        
        HashMap<Character, Integer> A = new HashMap<>();
        HashMap<Character, Integer> B = new HashMap<>();

        for (char ch : a.toCharArray()) {
            A.put(ch, A.getOrDefault(ch, 0) + 1);
        }

        for (char ch : b.toCharArray()) {
            B.put(ch, B.getOrDefault(ch, 0) + 1);
        }

        return A.equals(B);
    
    }
}


*/















/* 
 * Non Repeating Character
EasyAccuracy: 40.43%Submissions: 204K+Points: 2
Internship Alert
New month-> Fresh Chance to top the leaderboard and get SDE Internship! 

banner
Given a string S consisting of lowercase Latin Letters. Return the first non-repeating character in S. 
If there is no non-repeating character, return '$'.

Example 1:

Input:
S = hello
Output: h
Explanation: In the given string, the
first character which is non-repeating
is h, as it appears first and there is
no other 'h' in the string.
Example 2:

Input:
S = zxvczbtxyzvy
Output: c
Explanation: In the given string, 'c' is
the character which is non-repeating. 
Your Task:
You only need to complete the function nonrepeatingCharacter() that takes string S as a parameter and returns the character. If there is no non-repeating character then return '$' .

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(Number of distinct characters).
Note: N = |S|

Constraints:
1 <= N <= 105

 

Company Tags
FlipkartAmazonMicrosoftD-E-ShawMakeMyTripOla CabsPayuTeradataGoldman SachsMAQ SoftwareInfoEdgeOATS SystemsTejas Network


//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String st = sc.next();
            
            char ans=new Solution().nonrepeatingCharacter(st);
            
            if(ans!='$')
            System.out.println(ans);
            else
            System.out.println(-1);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find the first non-repeating character in a string.
    static char nonrepeatingCharacter(String S)
    {
        LinkedHashMap<Character,Integer> h=new LinkedHashMap<>();
        for(int i=0;i<S.length();i++){
            char c=S.charAt(i);
            h.put(c,h.getOrDefault(c,0)+1);
        }
        
        for(Character k:h.keySet()){
            if(h.get(k)==1){
                return k;
            }
        }
        return '$';
    }
}



*/














/* 
 *Run Length Encoding
EasyAccuracy: 43.33%Submissions: 56K+Points: 2
Given a string s, Your task is to complete the function encode that returns the run length encoded string for the given string.
eg if the input string is “wwwwaaadexxxxxx”, then the function should return “w4a3d1e1x6″.
You are required to complete the function encode that takes only one argument the string which is to be encoded and returns the encoded string.

Example 1:

Input:
s = aaaabbbccc
Output: a4b3c3
Explanation: a repeated 4 times consecutively b 3 times, c also 3 times.
Example 2:

Input:
s = abbbcdddd
Output: a1b3c1d4
Explanation:  a repeated 1 time, b 3 times, c 1 time and d repeated 4 times.

Your Task:
Complete the function encode() which takes a string s as an input parameter and returns the encoded string.

Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)

Constraints:
1<=( n = length of s )<=106
 

Company Tags


//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            String s;
            s = br.readLine();
            
            Solution obj = new Solution();
            String res = obj.encode(s);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static String encode(String s) {
        StringBuilder sb=new StringBuilder();
        int c=1;
        for(int i=0;i<s.length();i++){
            if(i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)){
                c++;
            }
            else{
                sb.append(s.charAt(i));
                sb.append(c);
                c=1;
            }
        }
        
        return sb.toString();
    }
}
    
*/















/* 
 * Convert an Roman Number in to Integer
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, two is written as II in Roman numeral, just two one's added together. Eleven is written as, XI, which is simply X + I. The number twenty eight is written as XXVIII, which is XX + V + III.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
Your task is that given a roman numeral, convert it to an integer. Input is guaranteed to be within the range from 1 to 3999.

Example 1:

Input: "IV"
Output: 4
Example 2:

Input: "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.
Example 3:

Input: "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
Sample Input

2  // no. of test cases
LVIII
MCMXCIV
Sample Output

58
1994


class Result {
  static int romanToInt(String str) {
    HashMap<Character,Integer> m=new HashMap<>();
    m.put('I',1);
    m.put('V',5);
    m.put('X',10);
    m.put('L',50);
    m.put('C',100);
    m.put('D',500);
    m.put('M',1000);
    int ans=m.get(str.charAt(str.length()-1));
    for(int i=str.length()-2;i>=0;i--){
      if(m.get(str.charAt(i))<m.get(str.charAt(i+1))){
        ans-=m.get(str.charAt(i));
      }else{
        ans+=m.get(str.charAt(i));
      }
    }
      return ans;
  }
}

*/


















/*
 Remove Duplicates
EasyAccuracy: 52.35%Submissions: 106K+Points: 2
200+ people shotlisted last month for SDE Internship. Grab your spot this month via GfG Weekly Contest! 

banner
Given a string without spaces, the task is to remove duplicates from it.

Note: The original order of characters must be kept the same. 

Example 1:

Input: S = "zvvo"
Output: "zvo"
Explanation: Only keep the first
occurrence
Example 2:

Input: S = "gfg"
Output: gf
Explanation: Only keep the first
occurrence
Your task:
Your task is to complete the function removeDups() which takes a single string as input and returns the string. You need not take any input or print anything.
 

Expected Time Complexity: O(|s|)
Expected Auxiliary Space: O(constant)

Constraints:
1 <= |S| <= 105
S conatins lowercase english alphabets

Company Tags


//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();
            
            Solution ob = new Solution();
            String result = ob.removeDups(s);
            
            System.out.println(result);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    String removeDups(String S) {
        //method 01
        
        //  LinkedHashSet<Character> str=new LinkedHashSet<>();
        // for(int i=0;i<S.length();i++){
        //     str.add(S.charAt(i));
        // }
        // String s="";
        
        // for(Character element:str) {
        //     s+=element;
        // }
        // return s;
        
        
        
        
        
        
        //method 02
         String str="";
        for(int i=0;i<S.length();i++)
        {
            if(!str.contains(Character.toString(S.charAt(i))))
            str=str+S.charAt(i);
        }
        return str;
        
        
        
    }
}

*/








/* 
78.Subsets
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
 

Constraints:

1 <= nums.length <= 10
-10 <= nums[i] <= 10
All the numbers of nums are unique.
Seen this question in a real interview before?
1/4


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



*/

















/* 
*Subsequences of String
Moderate
80/80
Average time to solve is 15m
Contributed by
191 upvotes
Asked in companies
Problem statement
You are given a string 'STR' containing lowercase English letters from a to z inclusive. Your task is to find all non-empty possible subsequences of 'STR'.

A Subsequence of a string is the one which is generated by deleting 0 or more letters from the string and keeping the rest of the letters in the same order.
Detailed explanation ( Input/output format, Notes, Images )
Constraints:
1 <= T <= 10 
1 <=  |STR| <= 16

Where |STR| represents the length of the string 'STR'.

Time Limit: 1 sec
Sample Input 1:
1 
abc
Sample Output 1:
a ab abc ac b bc c
Explanation of sample input 1:
All possible subsequences of abc are :  
“a” , “b” , “c” , “ab” , “bc” , “ac”, “abc”
Sample Input 2:
1
bbb
Sample Output 2:
b b b bb bb bb bbb

import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

class Solution {

    public static void solve(String str, int index, StringBuilder current, ArrayList<String> ans) {
        if (index >= str.length()) {
            if (current.length() > 0)
                ans.add(current.toString());
            return;
        }

        // Exclude current character
        solve(str, index + 1, current, ans);

        // Include current character
        current.append(str.charAt(index));
        solve(str, index + 1, current, ans);

        // Backtrack to maintain the original 'current' state
        current.deleteCharAt(current.length() - 1);
    }


    public static ArrayList<String> subsequences(String str) {
       ArrayList<String> ans = new ArrayList<>();
        solve(str, 0, new StringBuilder(), ans);
        return ans;

    }
}
*/












/* 
 Convert String to LowerCase
Difficulty: BasicAccuracy: 75.27%Submissions: 76K+Points: 1
Given a string s. The task is to convert characters of string to lowercase.

Example 1:

Input: 
s = "ABCddE"
Output: "abcdde"
Explanation: A, B, C and E are converted to a, b, c and e thus all uppercase characters of the string converted to lowercase letter.

 static String toLower(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char  c=s.charAt(i);
            if(c>='A' && c<='Z')
            sb.append((char)('a' + c - 'A'));
            
            else{
                sb.append(c);
            }
        }
        
        return  sb.toString();
    }
*/




/* 
 Lower case to upper case
Difficulty: BasicAccuracy: 74.85%Submissions: 30K+Points: 1
Given a string str containing only lowercase letters, generate a string with the same letters, but in uppercase.

Example 1:

Input:
str = "geeks"
Output: GEEKS

String to_upper(String str) 
    { 
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char  c=str.charAt(i);
            sb.append((char)('A' + c - 'a'));
        }
        
        return  sb.toString();
    }

*/