
/*
 
Find occurrences of palindrome words in a string
Write a function which given a string, count and return the palindrome words present in the string. A word in a string is separated with space(s).

Sample Input 1

Mom and Dad are my best friends
Sample Output 1

2
Explanation 1

﻿This string contains two palindrome words (i.e., Mom, Dad) so the count is 2.
Sample Input 2

mohit speaks english
Sample Output 2

0
Explanation 2

This string contains no palindrome words.




static int countPalindrome(String str) {
  str=str.toUpperCase();
  String s[]=str.split(" ");
  int c=0;
  for(String w:s){
    if(pali(w)){
      c++;
    }
  }
  return c;
}
static boolean pali(String str) {
  char c[]=str.toCharArray();
  int s=0;
  int e=c.length-1;
  while(s<=e){
    if(c[s]!=c[e]){
      return false;
    }
    else{
      s++;
      e--;
    }
  }
  return true;
}




-----------------------------------------------------------------
Swap first and last character of each word in a string
Write a program which given a string, swap first and last character of each word in it.

Complete the function swapFirstLastChar() that accepts a multiword string and swaps the first and last character of every word in it.

Note: Every two adjacent words in the given string will be separated by exactly one space character.

Input Format

The first line of input consists number of testcases, T
The next T lines contains a string on which the said operation is to be performed
Output Format

For each testcase, print the string after doing the given operatio
Sample Input

2
Code Quotient
Get better at coding
Sample Output

eodC tuotienQ
teG retteb ta godinc



class Result{
  
  static String swapFirstLastChar(String str) {
    String s[]=str.split(" ");
     StringBuilder sb=new StringBuilder();
    for(String w:s){
      sb.append(solve(w)).append(" ");
    }
     return sb.toString().trim();
   }
   public static String solve(String s){
     char a[]=s.toCharArray();
     int e=a.length-1;
     char t=a[0];
     a[0]=a[e];
     a[e]=t;
     return String.valueOf(a);
   }
 }






//method 02
class Result{
  static String swapFirstLastChar(String str) {
    String []words=str.split("\\s+");
    StringBuilder modify=new StringBuilder();
    for(String word:words){
      int len=word.length()-1,i=0;
      char []ch=word.toCharArray();
      char temp=ch[0];
      ch[0]=ch[len];
      ch[len]=temp;
      modify.append(ch).append(" ");
    }
    return modify.toString().trim();
  }
}
-----------------------------------------------------------------
Capitalize the first letter of each word
Write a program which given a string, Capitalize first letter of each word in it.

Sample Input

code quotient
Sample Output

Code Quotient
Sample Input

get better at coding
Sample Output

Get Better At Coding



static String capitalizeFirstChar(String str)
{
  StringBuilder sb=new StringBuilder();
  char ch=Character.toUpperCase(str.charAt(0));
  sb.append(ch);
  for(int i=1;i<str.length();i++){
    if(str.charAt(i)==' ' && i<str.length()){
      sb.append(str.charAt(i));
      i++;
      sb.append(Character.toUpperCase(str.charAt(i)));
    }
    else{
      sb.append(str.charAt(i));
    }
  }
  return sb.toString();
}


//m-2
static String capitalizeFirstChar(String str)
{
  char a[]=str.toCharArray();
  for(int i=0;i<a.length;i++){
    if(i==0 || a[i-1]==' '){
      a[i]=Character.toUpperCase(a[i]);
    }
  }
  String s=new String(a);
  return s;
}
-----------------------------------------------------------------
Reverse a string star_border
Given a string, the task is to reverse it.

For example, if the string is "Hello" , reversed string is "olleH".

Complete the function reverseString() given in the editor that accepts a string & reverses it.

Input Format:

First line inputs number of Testcases t
Then t strings follow in each line
Output Format:

For each test case output the reversed string
Sample Input 1

1
codequotient
Sample Output 1

tneitouqedoc
Sample Input 2

1
programming
Sample Output 2

gnimmargorp



// Return the reversed string
static String reverseString(String str) {
  char a[]=str.toCharArray();
  int s=0;
  int e=a.length-1;
  while(s<=e){
    char t=a[s];
    a[s]=a[e];
    a[e]=t;
    s++;
    e--;
  }
  return String.valueOf(a);
}


-----------------------------------------------------------------
Reverse the order of words of a string
Given a string of words, reverse the order of words in the string individually, not the whole string.

Complete the function revWordsOrder(str) that accepts a string as parameter and reverses the order of words of string.

Input Format:

The first line of input contains an integer T denoting the no of test cases . Then T test cases follow. Each test case contains the string str. 
Output Format:

For each test case, print the resultant string in new lines.
Sample Input

2
Code Quotient Loves Code
Hello Coders
Sample Output

Code Loves Quotient Code
Coders Hello



class Result {
  static String revWordsOrder(String str) {
    StringBuilder sb=new StringBuilder();
    String s[]=str.split(" ");
    for(int i=s.length-1;i>=0;i--){
    sb.append(s[i]).append(" ");
    }
    return sb.toString().trim();
  }
}
-----------------------------------------------------------------
String is subsequence or not
Given two strings, find whether second string is subsequence of first string. A subsequence of a string is defined as a string that can be obtained by deleting any number of characters from the original string.

Complete the function strSubsequence(str1, str2) that accepts two strings as parameters and print YES if str2 is a subsequence of str1 and NO otherwise.

Input Format

The first line of input contains an integer T denoting the no of test cases . Then T test cases follow. 
Each test case contains a single line of input which contains two strings str1, str2 seperated by a space. 
Output Format

For each test case, print YES or NO in new lines.
Constraints

1 <= T <= 10
Given strings consist of uppercase and lowercase English letters.
Sample Input

3
CodeQuotient CQ
CodeQuotient QC
Hello Hi
Sample Output

YES
NO
NO


class Result{
  // Return true if the str2 is a subsequence of str1, else return false
  static boolean strSubsequence(String str1, String str2) {
    int j=0;
    for(int i=0;i<str1.length() && j<str2.length();i++){
      if(str1.charAt(i)==str2.charAt(j)){
        j++;
      }
    }
    return j==str2.length();
  }
}
-----------------------------------------------------------------
Technical Issue With The Keyboard
Aman likes to play with strings, so his friend Riya decided to send him a mail, containing a sorted string with unique characters. But, due to some technical issue with her keyboard, whenever she presses a key, the corresponding character gets printed multiple times. Now Riya needs your help for removing all the unwanted characters from her string. For example, If aabbbccdef is a sorted string generated by Riya, then you should output the following string as answer abcdef.

Complete the function getDesiredString(str) that will take the string as parameter and modify it as specified.

Input Format:

The first line of input contains an integer T denoting the no of test cases . Then T test cases follow. Each test case contains a string str. 
Output Format:

For each test case, print the new string in new lines.
Constraints:

1 <= T <= 10
1 <= length of string <= 10^5
Each string will contain only lower-case English letters.﻿
Sample Input

2
aabbccdef
abddddddd
Sample Output

abcdef
abd


class Result {
  // Return the updated string
  static String getDesiredString(String str) {
    LinkedHashSet<Character> h=new LinkedHashSet<>();
    for(int i=0;i<str.length();i++){
      char c=str.charAt(i);
      h.add(c);
    }
    StringBuilder sb=new StringBuilder();
    for(Character k:h){
        sb.append(k);
    }
    return sb.toString();
  }
}
-----------------------------------------------------------------
Implement strcat function
Implement the strcat() function from string library as your own function. The function will take two strings as arguments and concatenate the second string at the end of first string.

Input Format:

The first line of input contains an integer T denoting the no of test cases . 
Then T test cases follow. Each test case contains two strings str2 and str1. 
Function strcatCode(str1,str2) will take two parameters and concatenate the str2 string at end of str1.

Output Format:

For each test case, print the concatenated string in new lines.
Sample Input

1
Code Quotient
Sample Output

CodeQuotient


static String strcatCode(String a, String b) {
  StringBuilder sb=new StringBuilder();
  sb.append(a).append(b);
  return sb.toString();
}
-----------------------------------------------------------------
Count words
Write a function countWords() to count the numbers of words in a string.

A word is defined as text separated by space(' ') or multiple spaces.

The function will receive a string as input and return the numbers of words in this string. 

Input Format

A single line of input which consists of the string whose words is to be counted
Output Format

Print the count the numbers of words in a string
Sample Input

Codequotient get  better  at coding
Sample Output

5




class Result {
  static int countWords(String str) {
    if(str.length()==0){
      return 0;
    }
    String s[]=str.split("\\s+");
    return s.length;
  }
}
-----------------------------------------------------------------
Check if strings are rotations or not
Given two strings, find whether both are rotations of each other or not. For example,

Given str1 = abacd and str2 = acdab, we can get str1 by rotating str2 and,

Given str1 = coder and str2 = cored, we can not get str1 by rotating str2.

﻿Input Format

The first line of input contains an integer T denoting the no of test cases. Then T test cases follow. Each test case contains two strings str1 and str2. 
Output Format

For each test case, print YES or NO in new lines.
Sample Input

2  // Test Cases
abacd  // testcase 1
acdab
coder  // testcase 2
cored
Sample Output

YES
NO


class Result {
  // return 1 for YES and 0 for NO.
  static int isRotation(String str1, String str2) {
   String s=str2+str2;
 if(s.contains(str1)){
   return 1;
 }
  else{
    return 0;
  }
  }
}
-----------------------------------------------------------------

*/