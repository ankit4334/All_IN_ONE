/* 
 1) What is Java?
 ans:-Java is the high-level, object-oriented, 
 robust, secure programming language, platform-independent, 
 high performance, Multithreaded, and portable programming language. 
 It was developed by James Gosling in June 1991. It can also be known 
 as the platform as it provides its own JRE and API.
*/



/* 

->diffrence between c++ and java
 c++                                           java
 1.it is platform dependent.                   1.it is platform independent.
 2.it supports goto statement,                 2.it does not support goto statement
 operator overloading,pointer and               operator overloading pointer,multple inheritance
 multiple inheritance.                          but it can be achived by interfaces.
 3.it use a compiler.                          3.it uses compiler and interpreter.
 4.it supports call by vlaue and               4.it supports only call by value.
 call by refernce.
 5.memory management is done using             5.memory  management is done by the system.
 a pointer.
*/

/* 
 * what is JVM,JRE, AND JDK?
 1.JVM(JAVA VIRTUAL MACHINE):-is a virtual machine that provides runtime 
 environment to execute java byte code.the JVM doen't understand java code
 directly,that's why you need t compile your *.java files to obtain *.class
 file that contain the bytecodes understandable by the JVM.
 
 2.JRE(JAVA RUNTIME ENVIRONMENT):-The java runtime environment(JRE) provides the
 libraries,the java virtual machine, and other components to run appets and applications written in the java programming language.
 JRE does not contain tools and utilities such as compilers or debuaager for developing applets and applications.

 3.JDK(JAVA DEVELOPMENT KIT):-The Java Development Kit (JDK) is a software development environment which is used to develop Java applications and applets. 
 It physically exists. It contains JRE + development tools.
*/




/* 
 ->java token:-
 Token are each individual elements of a programming language.
 to understand the concept if tokens we can that tokens are KILSO/KILPO.
 K-KEYWORDS
 I-IDENTIFIERS
 L-LITERALS (CONSTANTS)
 P/S-PUNCTUALRORS/SEPERATORS
 O-OPERATORS


 1.KEYWORD:-
 keyword are the reserved words that are specific to a programming language.
 like:int,float,char,double,if,while,do,for,public,private,protected etc.

 2.Identifers:-
 identifiers are the names given to any function/class/variable etc.there are 
 some certain rules for naming identifiers;

 ->variable:-
 variable is used to store values. values store in it can be changed 
 at  aby point of time as and when required.
 for example:-int a,float b,int,a,b;


 ->Data types:-
 A datatype defines the type of data a variable will store.
 for example:int float char double,long,boolean.
 There are two types of data types in Java:
 1.Primitive data types: The primitive data types include boolean, char, byte, short, int, long, float and double.
 2.Non-primitive data types: The non-primitive data types include Classes, Interfaces, and Arrays.
 

 ->Data Type	Default Value	Default size
   byte	        0	                 1 byte
   boolean	    false	             1 bit 
   char	        '\u0000'	         2 byte
   short	      0	                 2 byte
   int	        0	                 4 byte
   float	    0.0f	               4 byte
   long	        0L	               8 byte
   double	    0.0d	               8 byte

*/



/* 
 Why does Java not support pointers?
 ans:-
 The pointer is a variable that refers to the memory address.
 They are not used in Java because they are unsafe(unsecured) and complex to understand.
*/

/*----------------------------------------------------------------------------
Count Digits
Difficulty: EasyAccuracy: 30.45%Submissions: 254K+Points: 2
Given a number n. Count the number of digits in n which evenly divide n. Return an integer, total number of digits of n which divides n evenly.

Note :- Evenly divides means whether n is divisible by a digit i.e. leaves a remainder 0 when divided.
 

Examples :

Input: n = 12
Output: 2
Explanation: 1, 2 when both divide 12 leaves remainder 0.
Input: n = 2446
Output: 1
Explanation: Here among 2, 4, 6 only 2 divides 2446 evenly while 4 and 6 do not.
Input: n = 23
Output: 0
Explanation: 2 and 3, none of them divide 23 evenly.
Expected Time Complexity: O(n)
Expected Space Complexity: O(1)
 

Constraints:
1<= n <=105

class Solution{
    static int evenlyDivides(int N){
        
        int  c=0;
        int n=N;
        while(n!=0){
            int  k=n%10;
            if(k>0){
                if(N%k==0){
                c++;
                }
            }
            
            n=n/10;
        }
        
        return c;
        
    }
}



----------------------------------------------------------------------------
7. Reverse Integer
Solved
Medium
Topics
Companies
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

 

Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21
 

Constraints:

-231 <= x <= 231 - 1

class Solution {
    public int reverse(int x) {

        int s=0;
        while(x!=0){
            int k=x%10;
            if(s>Integer.MAX_VALUE/10 || s<Integer.MIN_VALUE/10){
                return 0;
            }
            s=s*10+k;
            x=x/10;
        }
        return s;
    }
}

----------------------------------------------------------------------------
9.Palindrome Number
Solved
Easy
Topics
Companies
Hint
Given an integer x, return true if x is a 
palindrome
, and false otherwise.

 

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 

Constraints:

-231 <= x <= 231 - 1


class Solution {
public:
    bool isPalindrome(int x) {
       if(x<0){
           return false;
       }
        int k=x;
        long long int sum=0;
        while(x!=0){
         int k=x%10;
         sum=sum*10+k;
         x=x/10;
       }

        if(sum==k){
           return true;
        }
       
        return false;
    }
};



----------------------------------------------------------------------------
Sum of all divisors from 1 to n
Difficulty: EasyAccuracy: 43.37%Submissions: 135K+Points: 2
Given a positive integer N., The task is to find the value of Σi from 1 to N F(i) where function F(i) for the number i is defined as the sum of all divisors of i.

Example 1:

Input:
N = 4
Output:
15
Explanation:
F(1) = 1
F(2) = 1 + 2 = 3
F(3) = 1 + 3 = 4
F(4) = 1 + 2 + 4 = 7
ans = F(1) + F(2) + F(3) + F(4)
    = 1 + 3 + 4 + 7
    = 15
Example 2:

Input:
N = 5
Output:
21
Explanation:
F(1) = 1
F(2) = 1 + 2 = 3
F(3) = 1 + 3 = 4
F(4) = 1 + 2 + 4 = 7
F(5) = 1 + 5 = 6
ans = F(1) + F(2) + F(3) + F(4) + F(5)
    = 1 + 3 + 4 + 7 + 6
    = 21
Your Task:  
You don't need to read input or print anything. Your task is to complete the function sumOfDivisors() which takes an integer N as an input parameter and returns an integer.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

Constraints:
1 <= N <= 106

class Solution{
    static long sumOfDivisors(int N){
        long  s=0;
        for(int i=1;i<=N;i++){
            s+=(N/i)*i;
        }
        return s;
    }
----------------------------------------------------------------------------
import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        
        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
    
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}

----------------------------------------------------------------------------
Q:-Small to Capital And Capital to small letter;

import java.util.Scanner;
public class basic00 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);

        System.out.println(CapitalToSmall(ch));

        //System.out.println(smallToCapital(ch));
    }
    
    public static char CapitalToSmall(char ch){
        return (char)(ch - 'A' + 'a');
    }

    
    public static char smallToCapital(char ch){
        return (char)(ch - 'a' + 'A');
    }
}

----------------------------------------------------------------------------
Trailing zeroes in factorial
Difficulty: EasyAccuracy: 41.24%Submissions: 99K+Points: 2
For an integer N find the number of trailing zeroes in N!.

Example 1:

Input:
N = 5
Output:
1
Explanation:
5! = 120 so the number of trailing zero is 1.
Example 2:

Input:
N = 4
Output:
0
Explanation:
4! = 24 so the number of trailing zero is 0.

class Solution{
    static int trailingZeroes(int N){
        
        int k=5;
        int c=0;
        while(k<=N){
            c+=N/k;
            k*=5;
        }
        return c;
    }
}

----------------------------------------------------------------------------
258. Add Digits
Solved
Easy
Topics
Companies
Hint
Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.

 

Example 1:

Input: num = 38
Output: 2
Explanation: The process is
38 --> 3 + 8 --> 11
11 --> 1 + 1 --> 2 
Since 2 has only one digit, return it.
Example 2:

Input: num = 0
Output: 0
 

Constraints:

0 <= num <= 231 - 1

class Solution {
    public int addDigits(int num) {
        if(num<10){
            return num;
        }

        int ans=sumOfDigit(num);
        
        while(ans>=10){
            ans=sumOfDigit(ans);
        }
        return ans;
    }

    public static int sumOfDigit(int num){
        int  s=0;
        while(num!=0){
            s+=num%10;
            num/=10;
        }
        return s;
    }
}

----------------------------------------------------------------------------
231. Power of Two
Solved
Easy
Topics
Companies
Given an integer n, return true if it is a power of two. Otherwise, return false.

An integer n is a power of two, if there exists an integer x such that n == 2x.

 

Example 1:

Input: n = 1
Output: true
Explanation: 20 = 1
Example 2:

Input: n = 16
Output: true
Explanation: 24 = 16
Example 3:

Input: n = 3
Output: false
 

Constraints:

-231 <= n <= 231 - 1

class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<1){
            return false;
        }

        while(n>1){
            if(n%2!=0){
                return false;
            }
            n=n/2;
        }

        return true;
    }
}

----------------------------------------------------------------------------
1009. Complement of Base 10 Integer
Solved
Easy
Topics
Companies
Hint
The complement of an integer is the integer you get when you flip all the 0's to 1's and all the 1's to 0's in its binary representation.

For example, The integer 5 is "101" in binary and its complement is "010" which is the integer 2.
Given an integer n, return its complement.

 

Example 1:

Input: n = 5
Output: 2
Explanation: 5 is "101" in binary, with complement "010" in binary, which is 2 in base-10.
Example 2:

Input: n = 7
Output: 0
Explanation: 7 is "111" in binary, with complement "000" in binary, which is 0 in base-10.
Example 3:

Input: n = 10
Output: 5
Explanation: 10 is "1010" in binary, with complement "0101" in binary, which is 5 in base-10.
 

Constraints:

0 <= n < 109

class Solution {
    public int bitwiseComplement(int n) {
        if(n==0) return 1;
        return solve(n);
    }

    public static int solve(int n){
        int s=0;
        int i=1;
        while(n!=0){
            int k=n%2;
            k^=1;
            s+=k*i;
            i*=2;
            n/=2;
        }
        return s;
    }
    
}


----------------------------------------------------------------------------
263. Ugly Number
Solved
Easy
Topics
Companies
An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.

Given an integer n, return true if n is an ugly number.

 

Example 1:

Input: n = 6
Output: true
Explanation: 6 = 2 × 3
Example 2:

Input: n = 1
Output: true
Explanation: 1 has no prime factors, therefore all of its prime factors are limited to 2, 3, and 5.
Example 3:

Input: n = 14
Output: false
Explanation: 14 is not ugly since it includes the prime factor 7.
 

Constraints:

-231 <= n <= 231 - 1

class Solution {
    public boolean isUgly(int n) {
        if(n<1){
            return false;
        }
        while(n%2==0){
            n/=2;
        }

        while(n%3==0){
            n/=3;
        }

        while(n%5==0){
            n/=5;
        }

        return n==1;
    }
}

----------------------------------------------------------------------------
Squares in N*N Chessboard
Difficulty: EasyAccuracy: 66.14%Submissions: 31K+Points: 2
Find the total number of Squares in a N*N chessboard.

 

Example 1:

Input:
N = 1
Output:
1
Explanation:
A 1*1 chessboard has only 1 square.
Example 2:

Input:
N = 2
Output:
5
Explanation:
A 2*2 chessboard has 5 squares.
4 1*1 squares and a 2*2 square.
 

Your Task:
You don't need to read input or print anything. Your task is to complete the function squaresInChessBoard() which takes an Integer N as input and returns the number of squares in a N*N chessboard.

 

Expected Time Complexity: O(1)
Expected Auxiliary Space: O(1)

 

Constraints:
1 <= N <= 105

class Solution {
    static Long squaresInChessBoard(Long N) {
        long s=1;
        while(N!=1){
            s+=(N*N);
            N--;
        }
        
        return s;
    }
};

----------------------------------------------------------------------------
Distribute in Circle!
Programming
Math
easy
69.6% Success

139

64

Bookmark
Asked In:
Problem Description

A items are to be delivered in a circle of size B.

Find the position where the Ath item will be delivered if we start from a given position C.

NOTE: Items are distributed at adjacent positions starting from C.



Problem Constraints
1 <= A, B, C <= 108



Input Format
First argument is an integer A.

Second argument is an integer B.

Third argument is an integer C.



Output Format
Return an integer denoting the position where the Ath item will be delivered if we start from a given position C.



Example Input
Input 1:

 A = 2
 B = 5
 C = 1
Input 2:

 A = 8
 B = 5
 C = 2


Example Output
Output 1:

 2
Output 2:

 4



public class Solution {
    public int solve(int A, int B, int C) {
        
        if(A==1){
            return C;
        }
        
        while(A!=1){
            A--;
            C++;
            if(C>B){
                C=C%B;
            }
        }
        
        return C;
        
    }
}
----------------------------------------------------------------------------

Number of 1 Bits
Difficulty: EasyAccuracy: 76.5%Submissions: 140K+Points: 2
Given a positive integer n. Your task is to return the count of set bits.

Examples:

Input: n = 6
Output: 2
Explanation: Binary representation is '110', so the count of the set bit is 2.
Input: n = 8
Output: 1
Explanation: Binary representation is '1000', so the count of the set bit is 1.
Expected Time Complexity: O(logn)
Expected Auxiliary Space: O(1)

class Solution {
    static int setBits(int n) {
        // code here
        int c=0;
        while(n!=0){
            int k=n&1;
            if(k==1){
                c++;
            }
            n=n>>1;
        }
        return c;
    }
}

----------------------------------------------------------------------------
292. Nim Game
Solved
Easy
Topics
Companies
Hint
You are playing the following Nim Game with your friend:

Initially, there is a heap of stones on the table.
You and your friend will alternate taking turns, and you go first.
On each turn, the person whose turn it is will remove 1 to 3 stones from the heap.
The one who removes the last stone is the winner.
Given n, the number of stones in the heap, return true if you can win the game assuming both you and your friend play optimally, otherwise return false.

 

Example 1:

Input: n = 4
Output: false
Explanation: These are the possible outcomes:
1. You remove 1 stone. Your friend removes 3 stones, including the last stone. Your friend wins.
2. You remove 2 stones. Your friend removes 2 stones, including the last stone. Your friend wins.
3. You remove 3 stones. Your friend removes the last stone. Your friend wins.
In all outcomes, your friend wins.
Example 2:

Input: n = 1
Output: true
Example 3:

Input: n = 2
Output: true
 

Constraints:

1 <= n <= 231 - 1

class Solution {
    public boolean canWinNim(int n) {
        if(n%4==0){
            return false;
        }

        return true;
    }
}


----------------------------------------------------------------------------
Is Rectangle?
Programming
Math
easy
69.1% Success

95

125

Bookmark
Asked In:
Problem Description

Given four positive integers A, B, C, D, determine if there’s a rectangle such that the lengths of its sides are A, B, C and D (in any order).

If any such rectangle exist return 1 else return 0.



Problem Constraints
1 <= A, B, C, D <= 100



Input Format
First argument is an interger A.

Second argument is an interger B.

Third argument is an interger C.

Fourth argument is an interger D.



Output Format
If any such rectangle exist whose sides are A, B, C, D in any orde then return 1 else return 0.



Example Input
Input 1:

 A = 1
 B = 1
 C = 2
 D = 2
Input 2:

 A = 1
 B = 2
 C = 3
 D = 4


Example Output
Output 1:

 1
Output 2:

 0

 public class Solution {
    public int solve(int A, int B, int C, int D) {
        if((A==B && C==D) || (A==C && B==D) || (A==D && C==B))
        return 1;
        return 0;
    }
}


----------------------------------------------------------------------------
Total Moves For Bishop!
Programming
Math
very easy
78.6% Success

240

20

Bookmark
Asked In:
Problem Description

Given the position of a Bishop (A, B) on an 8 * 8 chessboard.

Your task is to count the total number of squares that can be visited by the Bishop in one move.

The position of the Bishop is denoted using row and column number of the chessboard.



Problem Constraints
1 <= A, B <= 8

 public class Solution {
    public int solve(int A, int B) {
        
        int ans=0;
        
        int a=A;
        int b=B;
        
        while(a<8 && b<8){
            ans++;
            a++;
            b++;
        }
        
        a=A;
        b=B;
        while(a>1 && b<8){
            ans++;
            a--;
            b++;
        }
        
        a=A;
        b=B;
        while(a>1 && b>1){
            ans++;
            a--;
            b--;
        }
        
        a=A;
        b=B;
        while(a<8 && b>1){
            ans++;
            a++;
            b--;
        }
        
        return ans;
        
    }
}

----------------------------------------------------------------------------



----------------------------------------------------------------------------



----------------------------------------------------------------------------


----------------------------------------------------------------------------
*/

import java.util.Scanner;
public class basic00 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);

        System.out.println(CapitalToSmall(ch));

        //System.out.println(smallToCapital(ch));
    }
    
    public static char CapitalToSmall(char ch){
        return (char)(ch - 'A' + 'a');
    }

    
    public static char smallToCapital(char ch){
        return (char)(ch - 'a' + 'A');
    }
}
