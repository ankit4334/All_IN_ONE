/* 
151. Reverse Words in a String
Solved
Medium
Topics
Companies
Given an input string s, reverse the order of the words.

A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

Return a string of the words in reverse order concatenated by a single space.

Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.

 

Example 1:

Input: s = "the sky is blue"
Output: "blue is sky the"
Example 2:

Input: s = "  hello world  "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.
Example 3:

Input: s = "a good   example"
Output: "example good a"
Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
 

class Solution {
    public String reverseWords(String s) {
        StringBuilder sb=new StringBuilder();
        String str[]=s.split("\\s+");
        for(int i=str.length-1;i>=0;i--){
            
            sb.append(str[i]).append(" ");
            
        }
        return sb.toString().trim();
    }
}
-----------------------------------------------------------
1903. Largest Odd Number in String
Solved
Easy
Topics
Companies
Hint
You are given a string num, representing a large integer. 
Return the largest-valued odd integer (as a string) that 
is a non-empty substring of num, or an empty string "" if 
no odd integer exists.

A substring is a contiguous sequence of characters within a string.

 

Example 1:

Input: num = "52"
Output: "5"
Explanation: The only non-empty substrings are "5", "2", and "52". "5" is the only odd number.
Example 2:

Input: num = "4206"
Output: ""
Explanation: There are no odd numbers in "4206".
Example 3:

Input: num = "35427"
Output: "35427"
Explanation: "35427" is already an odd number.

class Solution {
    public String largestOddNumber(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            if ((num.charAt(i) - '0') % 2 != 0) {
                return num.substring(0, i + 1);
            }
        }
        return "";
    }
}
-----------------------------------------------------------
14. Longest Common Prefix
Solved
Easy
Topics
Companies
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.


class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        
        String s1=strs[0];
        String s2=strs[strs.length-1];
        int i=0;
        while(i<s1.length()){
            if(s1.charAt(i)==s2.charAt(i)){
                i++;
            }
            else{
                break;
            }
        }

        return i==0 ? "" : s1.substring(0,i);
        
    }
}
-----------------------------------------------------------
205. Isomorphic Strings
Solved
Easy
Topics
Companies
Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. 
No two characters may map to the same character, but a character may map to itself.

 

Example 1:

Input: s = "egg", t = "add"
Output: true
Example 2:

Input: s = "foo", t = "bar"
Output: false
Example 3:

Input: s = "paper", t = "title"
Output: true

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }

        HashMap<Character,Character> hm1=new HashMap<>();
        HashMap<Character,Boolean> hm2=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);
            char ch2=t.charAt(i);

            if(hm1.containsKey(ch1)){
                if(hm1.get(ch1)!=ch2){
                    return false;
                }
            }
            else{
                if(hm2.containsKey(ch2)){
                    return false;
                }
                else{
                    hm1.put(ch1,ch2);
                    hm2.put(ch2,true);
                }
            }
        }

        return true;

    }
}
-----------------------------------------------------------
796. Rotate String
Solved
Easy
Topics
Companies
Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.

A shift on s consists of moving the leftmost character of s to the rightmost position.

For example, if s = "abcde", then it will be "bcdea" after one shift.
 

Example 1:

Input: s = "abcde", goal = "cdeab"
Output: true
Example 2:

Input: s = "abcde", goal = "abced"
Output: false

class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }

        return (s+s).contains(goal);
    }
}
-----------------------------------------------------------
242. Valid Anagram
Solved
Easy
Topics
Companies
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false


class Solution {
    public boolean isAnagram(String a, String b) {
        
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

-----------------------------------------------------------
125. Valid Palindrome
Solved
Easy
Topics
Companies
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

 

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
 

Constraints:

1 <= s.length <= 2 * 105
s consists only of printable ASCII characters.


class Solution {
    public boolean isPalindrome(String s) {
         s=s.toUpperCase();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>='A' && s.charAt(i)<='Z') || (s.charAt(i)>='0' && s.charAt(i)<='9')){
                sb.append(s.charAt(i));
            }
        }

        String str=sb.toString();

       
        return pal(str);
        
    }

    public boolean pal(String str){
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



-----------------------------------------------------------




-----------------------------------------------------------




-----------------------------------------------------------




-----------------------------------------------------------




-----------------------------------------------------------


-----------------------------------------------------------



-----------------------------------------------------------




























*/