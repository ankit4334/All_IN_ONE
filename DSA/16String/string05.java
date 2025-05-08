//String understanding in java programing;
/*
//taking input in java
import java.util.*;
public class string05 {
    public static void main(String arge[]){
      
    // String name="ankit";
    // String fullname="ankit kumar";
    // System.out.println(name+"\n"+fullname);



    //taking input from user
    Scanner sc=new Scanner(System.in);
    String name=sc.nextLine();
    System.out.println("your name is:"+name);




    }
}
*/

/*

//concatinate the string
import java.util.*;
public class string05 {
    public static void main(String arge[]){
    String fn="ankit";
    String ln="kumar";

    String fulln=fn+ln;
    System.out.println(fulln);

    System.out.println(fulln.length());

    //charAt
    for(int i=0;i<fulln.length();i++){
        System.out.println(fulln.charAt(i));
    }


    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();


    //compare of string 
    //s1>s2 +value
    //s1==s2
    //s1<s2
    // if(fn.compareTo(ln)==0){
    //     System.out.println("Stirng are equal");
    // }
    // else{
    //     System.out.println("String are not equal");
    // }


    //== fail various cases;
    if(fn==ln){
        System.out.println("Stirng are equal");
    }
    else{
        System.out.println("String are not equal");
    }

    }
}

*/

/* 

//substring function in java
import java.util.*;
public class string05 {
    public static void main(String arge[]){
    String sentance="My name is ankit";
    //substring(beg index,end index)
    String name=sentance.substring(11,sentance.length());
    String a=sentance.substring(4);
    System.out.println(a);

    System.out.println(name);


    }
}

*/

/* 

//String in java are immutable

//String builder class->add,delete operation;
//Creating StringBuilder
import java.util.*;
public class string05 {
    public static void main(String arge[]){
    StringBuilder a=new StringBuilder("ankit");
    System.out.println(a);

    //print a particular char
    System.out.println(a.charAt(0));

    //set char at index->kisi particular jagah per char dal sakate hai
    a.setCharAt(0,'R');
    System.out.println(a);


    //insert funciton in java
    a.insert(0,'Y');
    System.out.println(a);


    //delete the element in setBuilder class
    a.delete(2,4);
    System.out.println(a);


    //append->add element at last index


    }
}
*/

/* 
//append function in java StringBuilder
import java.util.*;
public class string05 {
    public static void main(String arge[]){
    StringBuilder a=new StringBuilder("h");
    a.append("e");
    a.append("l");
    a.append("l");
    a.append("o");
    System.out.println(a);

    //.length() work in setBuilder  
    System.out.println(a.length());

    

    }
}
*/

/* 

//reverse the String
import java.util.*;
public class string05 {
    public static void main(String arge[]){
    StringBuilder a=new StringBuilder("hello");
    for(int i=0;i<a.length()/2;i++){
        int  s=i;
        int e=a.length()-1-i;

        char sChar=a.charAt(s);
        char eChar=a.charAt(e);

        a.setCharAt(s, eChar);
        a.setCharAt(e, sChar);

    }
   System.out.println(a);
    

    

    }
}


*/

/************************
*************************
*************************
*************************
*************************
 strirng from staring
*************************
*************************
*************************
*************************
*************************

*/

/*
What is String in Java?
Strings, one of the most common objects used in Java programming, are essentially
sequences of characters. As an example, the string "Scaler" contains the following
characters: "S", "c", "a", "l", "e", and "r". You can either create a string by using String
Literal or by using the NEW keyword. Additionally, String supports a variety of
methods to operate on Strings, such as the equals method to compare two Strings,
the replace method to replace String characters, the substring method to get a
substring, the toUpperCase method to convert String to upper case, the split method
to split a long String into multiple Strings, and so on.



1.How to declare a string in Java?
String declaration in Java can be done in two ways:
By string literal: Double quotes are used to create Java String literals.
Example: String str= "Scaler";  
By new keyword: Keyword "new" is used to create a Java string.
Example: String str=new String ("Scaler");



2. Is String a primitive or derived type in Java?
Strings are derived data types. Strings are Java objects that represent sequences of
characters. String objects are created using the java.lang.String class. There are many
functions that need to be called upon when processing a string, such as substring(),
indexof(), equals(), toUppercase(), etc, which primitives types do not have.


3.What is the difference between str1 == str2 and
str1.equals(str2)?
Java offers both the equals() method and the "==" operator for comparing objects.
However, here are some differences between the two:
Essentially, equals() is a method, while == is an operator.
The == operator can be used for comparing references (addresses) and the
.equals() method can be used to compare content. To put it simply, == checks if
the objects point to the same memory location, whereas .equals() compares the
values of the objects.


4. Is String immutable or final in Java? If so, then what are the
benefits of Strings being Immutable?
Yes, Strings are immutable in Java. Immutable objects mean they can't be changed
or altered once they've been created. However, we can only modify the reference to
the string object. The String is immutable in Java because of many reasons like
security, caching, synchronization and concurrency, and class loading.

5. State the difference between String and StringBuffer.
String objects in Java are immutable and final, so we can't change their value aer
they are created. 

A StringBuffer is a mutable object,
meaning it can be changed, but the string is an immutable object, so it cannot be
changed once it has been created.


8.State the difference between StringBuffer and StringBuilder
in Java.

StringBuffer and StringBuilder are two Java classes for manipulating strings. These
are mutable objects, i.e., they can be modified, and provide various methods such as
insert(), substring(), delete(), and append(), for String manipulation.

StringBuffer is synchronized i.e. thread safe. 
It means two threads can't call the
methods of StringBuffer simultaneously.


StringBuilder is non-synchronized i.e. not thread safe. 
It means two threads can call the methods 
of StringBuilder simultaneously.

*/

/* 
//starting string with alpha batch
import java.util.*;
public class string05 {
    public static void main(String arge[]){
    //creating string
    char arr[]={'a','b','c','d'};
    System.out.println(arr);

    String str="abcd";
    String str2=new String("xyz");
    

    //String are immutable in case of java;
    



    //taking input in java

    Scanner sc=new Scanner(System.in);
    String  name=sc.next();
    String name2=sc.nextLine();

    System.out.print(name+"\n"+name2);

    }
} 

*/

/*

//find length in java
//length();
import java.util.*;
public class string05 {
    public static void main(String arge[]){
    // String fullName="ankit kumar";
    // System.out.println(fullName.length());




    //concatenation of string
    String firstName="ankit";
    String lastName="kumar";
    String fullname=firstName+" "+lastName;
    System.out.println(fullname);


    //ek element ko find charAt(i) se kiya jata hai
    System.out.println(fullname.charAt(4));

    }
} 

 */

/* 

//print each using charAt(i);

import java.util.*;
public class string05 {

   public static void printletters(String  str){
       for(int i=0;i<str.length();i++){
           System.out.print(str.charAt(i)+" ");
       }
       System.out.println();

   }
   public static void main(String arge[]){
   Scanner sc=new Scanner(System.in);
   String s=sc.nextLine();
   printletters(s);
   

   }
} 

*/

/*

//Question->given a route containing 4 direction (E,W,N,S) find the  shortest path to reach destination
import java.util.*;
public class string05 {

    public static float getShortestPaht(String  path){
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
          char dir=path.charAt(i);
          if(dir=='S'){
            y--;
          }

          else if(dir=='N'){
            y++;
          }

          else if(dir=='W'){
            x--;
          }
          else{
            x++;
          }
        }
        int X2=x*x;
        int  Y2=y*y;
       return (float)Math.sqrt(X2+Y2);
    }
    public static void main(String arge[]){
    String s="WNEENESENNN";
    System.out.println(getShortestPaht(s));
    

    }
} 

 */

/* 
    //String compresion in java
    import java.util.*;
    public class string05 {
    public static void main(String arge[]){
    String s1="ankit";
    String s2="ankit";
    String s3=new String("ankit");
    if(s1==s2){
        System.out.println("Strings are equal");
    }
    else{
        System.out.println("String are not equal");
    }


    if(s1==s3){
        System.out.println("Strings are equal");
    }
    else{
        System.out.println("String are not equal");
    }



    //jab ham dynamicaly memory access karte hai to == not  
    //properly work so we use->s1.equals(s3);
    if(s1.equals(s2)){
        System.out.println("Strings are equal");
    }
    else{
        System.out.println("String are not equal");
    }


    if(s1.equals(s3)){
        System.out.println("Strings are equal");
    }
    else{
        System.out.println("String are not equal");
    }



    

    }
} 

*/

/*
//subsrting in java
import java.util.*;
public class string05 {
    public static String subString(String str,int si,int ei){
        String substr="";
        for(int i=si;i<ei;i++){
         substr+=str.charAt(i);
        }

        return substr;
    }
    public static void main(String arge[]){
    
    String str="HelloWorld";
    //System.out.println(subString(str, 3, 5));

    //java me inbuilt function hota substring find karne  ke liye

    System.out.println(str.substring(3, 5));

    }
}

*/

/*

//question->for a given set of string print the largest string

//compareTo()->function compare value in laxicographi order me small value ke liye use hota hai
//compareToIgnoreCase->use small or capital  any  type of case
import java.util.*;
public class string05 {
   
    public static void main(String arge[]){

  String fruits[]={"apple","mango","banana"};
  String largest=fruits[0];
  for(int i=1;i<fruits.length;i++){
    if(largest.compareTo(fruits[i]) < 0){
        largest=fruits[i];
    }
  }

  System.out.println(largest);

    
    
    }
} 

 */

/* 

//String Builder understanding
//StringBuilder->
//tostring()->kisi bhi object ko string me change kar deta hai
import java.util.*;
public class string05 {
   
    public static void main(String arge[]){

 StringBuilder sb=new StringBuilder("");
 for(char ch='a';ch<='z';ch++){
    sb.append(ch); //String ke last me jodta hai
 }
  System.out.println(sb);
  System.out.println(sb.length());

    
    
    }
} 


*/

/* 

//Capitalise first charachter
import java.util.*;
public class string05 {

    public static String toUpperCase(String str){
        StringBuilder sb=new StringBuilder("");
        char ch=Character.toUpperCase(str.charAt(0));//toUpperCase character ko capitalize kar deta hai
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
   
    public static void main(String arge[]){
   
    String str="hi, i am ankit";
    System.out.println(toUpperCase(str));
 
    
    
    }
} 


*/


//---------------------------------------------------------------------------------------------------
/* 

1108.Defanging an IP Address
Solved
Easy
Topics
Companies
Given a valid (IPv4) IP address, return a defanged version of that IP address.

A defanged IP address replaces every period "." with "[.]".

 

Example 1:

Input: address = "1.1.1.1"
Output: "1[.]1[.]1[.]1"
Example 2:

Input: address = "255.100.50.0"
Output: "255[.]100[.]50[.]0"
 

Constraints:

The given address is a valid IPv4 address.


class Solution {
    public String defangIPaddr(String address) {

        StringBuilder sb=new StringBuilder();
        for(int i=0;i<address.length();i++){
            char ch=address.charAt(i);
            if(ch=='.'){
                sb.append("["+ch+"]");
            }
            else{
                sb.append(ch);
            }
        }

        return sb.toString();
        
    }
}
 
*/




//---------------------------------------------------------------------------------------------------
/* 

1832. Check if the Sentence Is Pangram
Solved
Easy
Topics
Companies
Hint
A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.

 

Example 1:

Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.
Example 2:

Input: sentence = "leetcode"
Output: false


//Method-01
class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Character> uniqueLetters = new HashSet<>();
        for(int i=0;i<sentence.length();i++){
            char ch=sentence.charAt(i);
            if(ch>='a' && ch<='z'){
              uniqueLetters.add(ch);
            }
        }
        return uniqueLetters.size() == 26;
    }
}









//method-02
class Solution {
    public boolean checkIfPangram(String sentence) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<26;i++){
            list.add(0);
        }

        for(int i=0;i<sentence.length();i++){
            char ch=sentence.charAt(i);
            int index=ch-'a';
            list.set(index,1);
        }

        for(int i=0;i<list.size();i++){
            if(list.get(i)==0){
                return false;
            }
        }

        return true;
    }
}
 
*/








//---------------------------------------------------------------------------------------------------
/* 

String Rotated by 2 Places
Difficulty: EasyAccuracy: 32.7%Submissions: 234K+Points: 2
Given two strings s1 and s2. Return true if the string s2 can be obtained by rotating (in any direction) string s1 by exactly 2 places, otherwise, false.

Examples:

Input: s1 = "amazon", s2 = "azonam"
Output: true
Explanation: "amazon" can be rotated anti-clockwise by two places, which will make it as "azonam".
Input: s1 = "geeksforgeeks", s2 = "geeksgeeksfor"
Output: false
Explanation: If we rotate "geeksforgeeks" by two place in any direction, we won't get "geeksgeeksfor".
Input: s1 = "ab", s2 = "ab"
Output: false
Challenge: Try doing it in O(1) space complexity

Constraints:
1 ≤ s1.length, s2.length ≤ 105

public static boolean isRotated(String s1, String s2) {
    if (s1.length() != s2.length()) {
        return false;
    }

    String cl = rotateClockwise(s1);
    cl = rotateClockwise(cl);

    if (cl.equals(s2)) return true;

    String acl = rotateAntiClockwise(s1);
    acl = rotateAntiClockwise(acl);

    if (acl.equals(s2)) return true;

    return false;
}

public static String rotateClockwise(String str) {
    int n = str.length();
    char[] s = str.toCharArray();
    char last = s[n - 1];
    
    for (int i = n - 1; i > 0; i--) {
        s[i] = s[i - 1];
    }
    s[0] = last;

    return String.valueOf(s);
}

public static String rotateAntiClockwise(String str) {
    int n = str.length();
    char[] s = str.toCharArray();
    char first = s[0];
    
    for (int i = 0; i < n - 1; i++) {
        s[i] = s[i + 1];
    }
    s[n - 1] = first;

    return String.valueOf(s);
}
 
*/





//---------------------------------------------------------------------------------------------------
/* 

Sort a String
Difficulty: BasicAccuracy: 64.43%Submissions: 33K+Points: 1
Given a string consisting of lowercase letters, arrange all its letters in ascending order. 

Example 1:

Input:
S = "edcab"
Output: "abcde"
Explanation: characters are in ascending
order in "abcde".
Example 2:

Input:
S = "xzy"
Output: "xyz"
Explanation: characters are in ascending
order in "xyz".


Your Task:  
You don't need to read input or print anything. Your task is to complete the function sort() which takes the string as inputs and returns the modified string.

Expected Time Complexity: O(|S| * log |S|)
Expected Auxiliary Space: O(1)

class Solution 
{ 
    String sort(String s) 
    {
        char ch[]=s.toCharArray();
        Arrays.sort(ch);
        return String.valueOf(ch);
    }
} 



//method-02 using arr working.
String sort(String s) 
    {
        char ch[]=s.toCharArray();
        int a[]=new int[26];
        for(int i=0;i<ch.length;i++){
            int index=ch[i]-'a';
            a[index]++;
        }
        
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<a.length;i++){
            char c= (char) ('a' + i);
            while(a[i]!=0){
                sb.append(c);
                a[i]--;
            }
        }
        
        return sb.toString();
    }


//Method-03 using Arraylist working
 String sort(String s) 
    {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<26;i++){
            list.add(0);
        }
        
        for(int i=0;i<s.length();i++){
            int index=s.charAt(i)-'a';
            list.set(index,list.get(index)+1);
        }
        
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<list.size();i++){
            char ch=(char)(i+'a');
            while(list.get(i)!=0){
                sb.append(ch);
                list.set(i,list.get(i)-1);
            }
        }
        
        return sb.toString();
    }
 
*/





//---------------------------------------------------------------------------------------------------
/* 

409. Longest Palindrome
Solved
Easy
Topics
Companies
Given a string s which consists of lowercase or uppercase letters, return the length of the longest 
palindrome
 that can be built with those letters.

Letters are case sensitive, for example, "Aa" is not considered a palindrome.

 

Example 1:

Input: s = "abccccdd"
Output: 7
Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.
Example 2:

Input: s = "a"
Output: 1
Explanation: The longest palindrome that can be built is "a", whose length is 1.
 

Constraints:

1 <= s.length <= 2000
s consists of lowercase and/or uppercase English letters only.

import java.util.*;
class Solution {
    public int longestPalindrome(String s) {
        
        ArrayList<Integer> smallLater=new ArrayList<>();
        ArrayList<Integer> capitalLater=new ArrayList<>();
        for(int i=0;i<26;i++){
            smallLater.add(0);
            capitalLater.add(0);
        }
        
        for(int i=0;i<s.length();i++){
           char ch=s.charAt(i);
           if(ch>='a' && ch<='z'){
            int index=ch-'a';
            smallLater.set(index,smallLater.get(index)+1);
           }
           else if(ch>='A' && ch<='Z'){
            int index=ch-'A';
            capitalLater.set(index,capitalLater.get(index)+1);
           }
        }

        int ans=0;
        boolean odd=false;

        for(int i=0;i<26;i++){
            int sl=smallLater.get(i);
            int cl=capitalLater.get(i);
            if(sl%2!=0){
                ans+=sl-1;
                odd=true;
            }
            else{
                ans+=sl;
            }

            if(cl%2!=0){
                ans+=cl-1;
                odd=true;
            }
            else{
                ans+=cl;
            }
        }

        if (odd){
        ans += 1;
        }

        return ans;
        
    }
}
 
*/





//---------------------------------------------------------------------------------------------------
/* 
1859. Sorting the Sentence
Solved
Easy
Topics
Companies
Hint
A sentence is a list of words that are separated by a single space with no leading or trailing spaces. Each word consists of lowercase and uppercase English letters.

A sentence can be shuffled by appending the 1-indexed word position to each word then rearranging the words in the sentence.

For example, the sentence "This is a sentence" can be shuffled as "sentence4 a3 is2 This1" or "is2 sentence4 This1 a3".
Given a shuffled sentence s containing no more than 9 words, reconstruct and return the original sentence.

 

Example 1:

Input: s = "is2 sentence4 This1 a3"
Output: "This is a sentence"
Explanation: Sort the words in s to their original positions "This1 is2 a3 sentence4", then remove the numbers.
Example 2:

Input: s = "Myself2 Me1 I4 and3"
Output: "Me Myself and I"
Explanation: Sort the words in s to their original positions "Me1 Myself2 and3 I4", then remove the numbers.


class Solution {
    public String sortSentence(String s) {
        String sentence[]=s.split(" ");

        String []ans=new String[sentence.length];

        for(String word:sentence){
            int index=word.charAt(word.length()-1)-'0'-1;
            String actualWord=word.substring(0,word.length()-1);
           ans[index]=actualWord;
        }

        return String.join(" ",ans);
    }
}
 
*/





//---------------------------------------------------------------------------------------------------
/* 
2785. Sort Vowels in a String
Solved
Medium
Topics
Companies
Hint
Given a 0-indexed string s, permute s to get a new string t such that:

All consonants remain in their original places. More formally, if there is an index i with 0 <= i < s.length such that s[i] is a consonant, then t[i] = s[i].
The vowels must be sorted in the nondecreasing order of their ASCII values. More formally, for pairs of indices i, j with 0 <= i < j < s.length such that s[i] and s[j] are vowels, then t[i] must not have a higher ASCII value than t[j].
Return the resulting string.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in lowercase or uppercase. Consonants comprise all letters that are not vowels.

 

Example 1:

Input: s = "lEetcOde"
Output: "lEOtcede"
Explanation: 'E', 'O', and 'e' are the vowels in s; 'l', 't', 'c', and 'd' are all consonants. The vowels are sorted according to their ASCII values, and the consonants remain in the same places.
Example 2:

Input: s = "lYmpH"
Output: "lYmpH"
Explanation: There are no vowels in s (all characters in s are consonants), so we return "lYmpH".
 

Constraints:

1 <= s.length <= 105
s consists only of letters of the English alphabet in uppercase and lowercase.


//method 01 with TC=O(NlogN) SC=O(N)
class Solution {
    public String sortVowels(String s) {
        String vowel="AEOUIaeiou";
        List<Character> sortVowel=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(vowel.contains(Character.toString(ch))){
                sortVowel.add(ch);
            }
        }
        

        Collections.sort(sortVowel);
        StringBuilder ans=new StringBuilder();
        int j=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(vowel.contains(Character.toString(ch))){
                ans.append(sortVowel.get(j++));
            }
            else{
                ans.append(ch);
            }
        }

        return ans.toString();
    }

}

//method 02 with TC=O(N) SC=O(N)
class Solution {
    public String sortVowels(String s) {
        ArrayList<Integer> sv=new ArrayList<>();
        ArrayList<Integer> cv=new ArrayList<>();
        for(int i=0;i<26;i++){
            sv.add(0);
            cv.add(0);
        }

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                int index=ch-'a';
                sv.set(index,sv.get(index)+1);
            }
            else if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                int index=ch-'A';
                cv.set(index,cv.get(index)+1);
            }
        }

        StringBuilder sortedVowel=new StringBuilder();
        for(int i=0;i<26;i++){
            char ch=(char) ('A' + i);;
            int k=cv.get(i);
            while(k!=0){
                sortedVowel.append(ch);
                k--;
            }
        }


        for(int i=0;i<26;i++){
            char ch=(char) ('a' + i);;
            int k=sv.get(i);
            while(k!=0){
                sortedVowel.append(ch);
                k--;
            }
        }

        StringBuilder ans=new StringBuilder();
        int j=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'  
            || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                ans.append(sortedVowel.charAt(j++));
            }
            else{
                ans.append(ch);
            }
        }

        return ans.toString();

    }
}
 
*/








//---------------------------------------------------------------------------------------------------
/* 

Case-specific Sorting of Strings
Difficulty: MediumAccuracy: 69.88%Submissions: 60K+Points: 4
Given a string str consisting of only uppercase and lowercase characters. The task is to sort uppercase and lowercase letters separately such that if the ith place in the original string had an Uppercase character then it should not have a lowercase character after being sorted and vice versa.

Examples :

Input: n = 12, str = defRTSersUXI
Output: deeIRSfrsTUX
Explanation: Sorted form of given string with the same case of character as that in original string is deeIRSfrsTUX
Input: n = 6, str = srbDKi
Output: birDKs
Explanation: Sorted form of given string with the same case of character will result in output as birDKs.
Your Task:
You only need to complete the function caseSort that takes a string str and length of the string n and returns sorted string.

Expected Time Complexity: O(nlog(n)).
Expected Auxiliary Space: O(n).


public static String caseSort(String s)
    {
        List<Character> lC=new ArrayList<>();
        List<Character> uC=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z'){
                lC.add(ch);
            }
            else if(ch>='A' && ch<='Z'){
                uC.add(ch);
            }
        }
        

        Collections.sort(lC);
        Collections.sort(uC);
        StringBuilder ans=new StringBuilder();
        int j=0;
        int k=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            
            if(ch>='a' && ch<='z'){
                ans.append(lC.get(j++));
            }
            else if(ch>='A' && ch<='Z'){
                ans.append(uC.get(k++));
            }
        }

        return ans.toString();
    }
 
*/











//---------------------------------------------------------------------------------------------------
/* 
415. Add Strings
Solved
Easy
Topics
Companies
Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.

You must solve the problem without using any built-in library for handling large integers (such as BigInteger). You must also not convert the inputs to integers directly.

 

Example 1:

Input: num1 = "11", num2 = "123"
Output: "134"
Example 2:

Input: num1 = "456", num2 = "77"
Output: "533"
Example 3:

Input: num1 = "0", num2 = "0"
Output: "0"

class Solution {
    public String addStrings(String num1, String num2) {
        int index1=num1.length()-1;
        int index2=num2.length()-1;

        StringBuilder ans=new StringBuilder();
        int carray=0;
        while(index1>=0 || index2>=0 || carray>0){
            int a=index1>=0 ? num1.charAt(index1)-'0' : 0;
            int b=index2>=0 ? num2.charAt(index2)-'0' : 0;
            int sum=(a+b+carray);
            carray=sum/10;
            ans.append(sum%10);
            index1--;
            index2--;
        }

        return ans.reverse().toString();
    }
}
 
*/











//---------------------------------------------------------------------------------------------------
/* 
 13. Roman to Integer
Solved
Easy
Topics
Companies
Hint
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.

 

Example 1:

Input: s = "III"
Output: 3
Explanation: III = 3.
Example 2:

Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.
Example 3:

Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);

        int ans=hm.get(s.charAt(s.length()-1));
        for(int i=s.length()-2;i>=0;i--){
            if(hm.get(s.charAt(i))<hm.get(s.charAt(i+1))){
                ans-=hm.get(s.charAt(i));
            }
            else{
                ans+=hm.get(s.charAt(i));
            }
        }

        return ans;

    }
}


//method -2
class Solution {
    public int romanToInt(String s) {
        int ans=0;
        int index=0;
        while(index < s.length()-1){
            if(changeValue(s.charAt(index))<changeValue(s.charAt(index+1))){
                ans-=changeValue(s.charAt(index));
            }
            else{
                ans+=changeValue(s.charAt(index));
            }
            index++;
        }

        ans+=changeValue(s.charAt(s.length()-1));

        return ans;
    }

    public static int changeValue(char ch){
        if(ch=='I'){
            return 1;
        }
        else if(ch=='V'){
            return 5;
        }
        else if(ch=='X'){
            return 10;
        }
        else if(ch=='L'){
            return 50;
        }
        else if(ch=='C'){
            return 100;
        }
        else if(ch=='D'){
            return 500;
        }
        else{
            return 1000;
        }
    }

}
*/








//---------------------------------------------------------------------------------------------------
/* 
12. Integer to Roman
Solved
Medium
Topics
Companies
Seven different symbols represent Roman numerals with the following values:

Symbol	Value
I	1
V	5
X	10
L	50
C	100
D	500
M	1000
Roman numerals are formed by appending the conversions of decimal place values from highest to lowest. Converting a decimal place value into a Roman numeral has the following rules:

If the value does not start with 4 or 9, select the symbol of the maximal value that can be subtracted from the input, append that symbol to the result, subtract its value, and convert the remainder to a Roman numeral.
If the value starts with 4 or 9 use the subtractive form representing one symbol subtracted from the following symbol, for example, 4 is 1 (I) less than 5 (V): IV and 9 is 1 (I) less than 10 (X): IX. Only the following subtractive forms are used: 4 (IV), 9 (IX), 40 (XL), 90 (XC), 400 (CD) and 900 (CM).
Only powers of 10 (I, X, C, M) can be appended consecutively at most 3 times to represent multiples of 10. You cannot append 5 (V), 50 (L), or 500 (D) multiple times. If you need to append a symbol 4 times use the subtractive form.
Given an integer, convert it to a Roman numeral.

 

Example 1:

Input: num = 3749

Output: "MMMDCCXLIX"

Explanation:

3000 = MMM as 1000 (M) + 1000 (M) + 1000 (M)
 700 = DCC as 500 (D) + 100 (C) + 100 (C)
  40 = XL as 10 (X) less of 50 (L)
   9 = IX as 1 (I) less of 10 (X)
Note: 49 is not 1 (I) less of 50 (L) because the conversion is based on decimal places
Example 2:

Input: num = 58

Output: "LVIII"

Explanation:

50 = L
 8 = VIII
Example 3:

Input: num = 1994

Output: "MCMXCIV"

Explanation:

1000 = M
 900 = CM
  90 = XC
   4 = IV
 

Constraints:

1 <= num <= 3999

class Solution {
    public String intToRoman(int num) {
        int[] n = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] s = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int i =0;
        String ans="";
        while(num!=0){
            if(num>=n[i]){
                ans+=s[i];
                num-=n[i];
            }
            else{
                i++;
            }
        }

        return ans;
    }
}
*/









//---------------------------------------------------------------------------------------------------
/* 
Factorials of large numbers
Difficulty: MediumAccuracy: 36.57%Submissions: 154K+Points: 4
Given an integer n, find its factorial. Return a list of integers denoting the digits that make up the factorial of n.

Examples:

Input: n = 5
Output: [1, 2, 0]
Explanation: 5! = 1*2*3*4*5 = 120
Input: n = 10
Output: [3, 6, 2, 8, 8, 0, 0]
Explanation: 10! = 1*2*3*4*5*6*7*8*9*10 = 3628800
Input: n = 1
Output: [3]
Explanation: 1! = 1 
Constraints:
1 ≤ n ≤ 103

public static ArrayList<Integer> factorial(int n) {
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(1);
        while(n>1){
            
            int carray=0;
            for(int i=0;i<ans.size();i++){
                int pro=ans.get(i)*n+carray;
                carray=pro/10;
                ans.set(i,pro%10);
            }   
            while(carray!=0){
                ans.add(carray%10);
                carray/=10;
            }
            n--;
        }
        
        Collections.reverse(ans);
        return ans;
    }
 
*/



// ************************************************************
// ************************************************************ 
// ************************************************************
// ************************************************************
// ************************************************************
//Sliding Window Sliding Window Sliding Window Sliding Window 
//Concetpt Concept







//---------------------------------------------------------------------------------------------------
/* 
3.Longest Substring Without Repeating Characters
Solved
Medium
Topics
Companies
Hint
Given a string s, find the length of the longest 
substring
without repeating characters.

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 

Constraints:

0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces.


//Method-01
class Solution {
    public int lengthOfLongestSubstring(String s) {
        ArrayList<Integer> cheak=new ArrayList<>();
        for(int i=0;i<255;i++){
            cheak.add(0);
        }
        int first=0;
        int ans=0;
        for(int second=0;second<s.length();second++){
            while(cheak.get(s.charAt(second))!=0){
                cheak.set(s.charAt(first),0);
                first++;
            }
            cheak.set(s.charAt(second),1);
            ans=Math.max(ans,second-first+1);
        }
        return ans;
    }
}


//Method-02
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        int i=0;
        int ma=0;
        for(int j=0;j<s.length();j++){
            while(set.contains(s.charAt(j))){
                set.remove(s.charAt(i));
                i++;
            }
            set.add(s.charAt(j));
            ma=Math.max(ma,j-i+1);
        }

        return ma;
    }
}
*/










//---------------------------------------------------------------------------------------------------
/* 
 Smallest distinct window
Difficulty: MediumAccuracy: 31.85%Submissions: 98K+Points: 4
Given a string s, your task is to find the smallest window length that contains all the characters of the given string at least one time.

Example:

Input: s = "AABBBCBBAC"
Output: 3
Explanation: Sub-string -> "BAC"
Input: s = "aaab"
Output: 2
Explanation: Sub-string -> "ab"
Input: s = "GEEKSGEEKSFOR"
Output: 8
Explanation: Sub-string -> "GEEKSFOR"

public int findSubString(String s) {
    HashSet<Character> set = new HashSet<>();
    for (int i = 0; i < s.length(); i++) {
        set.add(s.charAt(i));
    }
    
    ArrayList<Integer> collect = new ArrayList<>();
    for (int i = 0; i < 255; i++) {
        collect.add(0);
    }
    
    int diff = set.size();
    int ans = s.length();
    int j = 0;
    
    for (int i = 0; i < s.length(); i++) {
        if (collect.get(s.charAt(i)) == 0) {
            diff--;
        }
        collect.set(s.charAt(i), collect.get(s.charAt(i)) + 1);
        
        while (diff == 0) {
            ans = Math.min(ans, i - j + 1);
            collect.set(s.charAt(j), collect.get(s.charAt(j)) - 1);
            if (collect.get(s.charAt(j)) == 0) {
                diff++;
            }
            j++;
        }
    }
    
    return ans;
}
*/




/* 
 ************************************************************
  ************************************************************
 ************************************************************
 ************************************************************
************************************************************
Kmp alogirthi

Kmp alogirthi



Kmp alogirthi


Kmp alogirthi

Kmp alogirthi

*/






//---------------------------------------------------------------------------------------------------
/* 

Longest Prefix Suffix
Difficulty: HardAccuracy: 27.91%Submissions: 140K+Points: 8
Given a string of characters s, find the length of the longest prefix which is also a suffix.
Note: Prefix and suffix can be overlapping but they should not be equal to the entire string.

Examples :

Input: s = "abab"
Output: 2
Explanation: "ab" is the longest prefix and suffix. 
Input: s = "aabcdaabc"
Output: 4
Explanation: The string "aabc" is the longest prefix and suffix.
Input: s = "aaaa"
Output: 3
Explanation: "aaa" is the longest prefix and suffix. 
Constraints:
1 ≤ s.size() ≤ 106
s contains only lowercase English alphabets.


int longestPrefixSuffix(String s) {
        int n=s.length();
        int lps[]=new int[n];
        int pre=0;
        int suf=1;
        while(suf<n){
            
            if(s.charAt(pre)==s.charAt(suf)){
                lps[suf]=pre+1;
                pre++;
                suf++;
            }
            else{
                if(pre==0){
                    lps[suf]=0;
                    suf++;
                }
                else{
                    pre=lps[pre-1];
                }
            }
            
        }
        
        return lps[n-1];
    }
 
*/








//---------------------------------------------------------------------------------------------------
/* 

Search Pattern (KMP-Algorithm)
Difficulty: HardAccuracy: 45.04%Submissions: 104K+Points: 8
Given two strings, one is a text string txt and the other is a pattern string pat. The task is to print the indexes of all the occurrences of the pattern string in the text string. Use 0-based indexing while returning the indices. 
Note: Return an empty list in case of no occurrences of pattern.

Examples :

Input: txt = "abcab", pat = "ab"
Output: [0, 3]
Explanation: The string "ab" occurs twice in txt, one starts at index 0 and the other at index 3. 
Input: txt = "abesdu", pat = "edu"
Output: []
Explanation: There's no substring "edu" present in txt.
Input: txt = "aabaacaadaabaaba", pat = "aaba"
Output: [0, 9, 12]
Explanation:

Constraints:
1 ≤ txt.size() ≤ 106
1 ≤ pat.size() < txt.size()
Both the strings consist of lowercase English alphabets.


class Solution {

    ArrayList<Integer> search(String pat, String txt) {
        ArrayList<Integer> ans = new ArrayList<>();
        int lps[] = new int[pat.length()];

        findlps(lps, pat);

        int first = 0, second = 0;
        while (second < txt.length()) {
            if (pat.charAt(first) == txt.charAt(second)) {
                first++;
                second++;
            }

            if (first == pat.length()) {
                ans.add(second - first);
                first = lps[first - 1];
            } 
            else if (second < txt.length() && pat.charAt(first) != txt.charAt(second)) {
                if (first == 0) {
                    second++;
                } else {
                    first = lps[first - 1];
                }
            }
        }
        return ans;
    }
    
    public void findlps(int lps[],String s){
        int n=s.length();
        int pre=0;
        int suf=1;
        while(suf<n){
            if(s.charAt(suf)==s.charAt(pre)){
                lps[suf]=pre+1;
                suf++;
                pre++;
            }
            else{
                if(pre==0){
                    lps[suf]=0;
                    suf++;
                }
                else{
                    pre=lps[pre-1];
                }
            }
        }
    }
}

*/








//---------------------------------------------------------------------------------------------------
/* 

28. Find the Index of the First Occurrence in a String
Solved
Easy
Topics
Companies
Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

 

Example 1:

Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
Example 2:

Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.
 

Constraints:

1 <= haystack.length, needle.length <= 104
haystack and needle consist of only lowercase English characters.


class Solution {
    public int strStr(String haystack, String needle) {
        int n=needle.length();
        int lps[]=new int[n];
        findLps(needle,lps);
        int first=0;
        int second=0;
        while(first<haystack.length() && second<needle.length()){
            if(haystack.charAt(first)==needle.charAt(second)){
                first++;
                second++;
            }
            else{
                if(second==0){
                    first++;
                }
                else{
                    second=lps[second-1];
                }
            }
        }

        if(second==needle.length()){
            return first-second;
        }

        return -1;

    }

    public void findLps(String needle,int lps[]){
        int n=needle.length();
        int pre=0;
        int suf=1;
        while(suf<n){
            if(needle.charAt(pre)==needle.charAt(suf)){
                lps[suf]=pre+1;
                pre++;
                suf++;
            }
            else{
                if(pre==0){
                    lps[suf]=0;
                    suf++;
                }
                else{
                    pre=lps[pre-1];
                }
            }
        }
    }
}
 
*/












//---------------------------------------------------------------------------------------------------
/* 
 Min Chars to Add for Palindrome
Difficulty: HardAccuracy: 46.79%Submissions: 73K+Points: 8
Given a string s, the task is to find the minimum characters to be added at the front to make the string palindrome.

Note: A palindrome string is a sequence of characters that reads the same forward and backward.

Examples:

Input: s = "abc"
Output: 2
Explanation: Add 'b' and 'c' at front of above string to make it palindrome : "cbabc"
Input: s = "aacecaaaa"
Output: 2
Explanation: Add 2 a's at front of above string to make it palindrome : "aaaacecaaaa"
Constraints:
1 <= s.size() <= 106

public static int minChar(String s) {
        int n=s.length();
        
        String st=reverse(s);
        s+='$';
        s+=st;
        
        int lps[]=new int[s.length()];
        solveLps(s,lps);
        
        return n-lps[s.length()-1];
    }
    
    public static String reverse(String s){
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
    
    public static void solveLps(String s,int lps[]){
        int n=s.length();
        int pre=0;
        int suf=1;
        while(suf<n){
            if(s.charAt(pre)==s.charAt(suf)){
                lps[suf]=pre+1;
                pre++;
                suf++;
            }
            else{
                if(pre==0){
                    lps[suf]=0;
                    suf++;
                }
                else{
                    pre=lps[pre-1];
                }
            }
        }
    }
}
*/









//---------------------------------------------------------------------------------------------------
/* 
 686. Repeated String Match
Solved
Medium
Topics
Companies
Given two strings a and b, return the minimum number of times you should repeat string a so that string b is a substring of it. If it is impossible for b​​​​​​ to be a substring of a after repeating it, return -1.

Notice: string "abc" repeated 0 times is "", repeated 1 time is "abc" and repeated 2 times is "abcabc".

 

Example 1:

Input: a = "abcd", b = "cdabcdab"
Output: 3
Explanation: We return 3 because by repeating a three times "abcdabcdabcd", b is a substring of it.
Example 2:

Input: a = "a", b = "aa"
Output: 2
 

Constraints:

1 <= a.length, b.length <= 104
a and b consist of lowercase English letters.

class Solution {
    public int repeatedStringMatch(String a, String b) {
        if(a==b){
            return 1;
        }
        int repeat=1;
        String temp=a;
        while(temp.length()<b.length()){
            temp+=a;
            repeat++;
        }

        //kmp pattern search
        if(KMP_MATCH(temp,b)==1)
        return repeat;

        //temp+a , kmp search
        if(KMP_MATCH(temp+a,b)==1)
        return repeat+1;

        return -1;
    }

    public int KMP_MATCH(String haystack, String needle) {
        int n=needle.length();
        int lps[]=new int[n];
        findLps(needle,lps);
        int first=0;
        int second=0;
        while(first<haystack.length() && second<needle.length()){
            if(haystack.charAt(first)==needle.charAt(second)){
                first++;
                second++;
            }
            else{
                if(second==0){
                    first++;
                }
                else{
                    second=lps[second-1];
                }
            }
        }

        if(second==needle.length()){
            return 1;
        }

        return 0;

    }

    public void findLps(String needle,int lps[]){
        int n=needle.length();
        int pre=0;
        int suf=1;
        while(suf<n){
            if(needle.charAt(pre)==needle.charAt(suf)){
                lps[suf]=pre+1;
                pre++;
                suf++;
            }
            else{
                if(pre==0){
                    lps[suf]=0;
                    suf++;
                }
                else{
                    pre=lps[pre-1];
                }
            }
        }
    }
}
*/







//---------------------------------------------------------------------------------------------------
/* 
 
*/








//---------------------------------------------------------------------------------------------------
/* 
 
*/














//---------------------------------------------------------------------------------------------------
/* 
 
*/






//---------------------------------------------------------------------------------------------------
/* 
 
*/





//---------------------------------------------------------------------------------------------------
/* 
 
*/












//---------------------------------------------------------------------------------------------------
/* 
 
*/











//---------------------------------------------------------------------------------------------------
/* 
 
*/













//---------------------------------------------------------------------------------------------------
/* 
 
*/






//question->String Compression
//input->aaabbcccdd
//output->a3b2c3d2
import java.util.*;

public class string05 {

    public static String compress(String str) {
        String newStr = "";
        // future me string me change karna hai Integer use karte hai
        for (int i = 0; i < str.length(); i++) {
            Integer c = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                c++;
                i++;
            }
            newStr += str.charAt(i);
            if (c > 1) {
                newStr += c.toString();
            }

        }

        return newStr;

    }

    public static void main(String arge[]) {

        String str = "aaabbcccdd";
        System.out.println(compress(str));

    }
}
