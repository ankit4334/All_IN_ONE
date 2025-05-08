/* 
Implement the stack using array
Implement the stack using array representation

Input

First line of input contains the number of test cases.
First line of each test case contains an integer Q denoting the number of queries.
A Query is of 2 Types
(a) 1 item  (a query of this type means push 'item' onto the stack)
(b) 2   (a query of this type means to pop element from stack and print the popped element)
The next Q lines of each test case contains Q queries.
Output

The output for each test case will be space separated integers having -1 if the stack is empty else the element popped out from the stack.
You are required to complete the methods given.
Sample Input

1
8
1
3
2
1
4
1
2
2
1
6
2
2
Sample Output

3 2 6 4
Explanation:

First query is push 3, 
then pop will print 3, 
3rd query is push 4, 
then push 2, 
5th query is pop which prints 2, 
6th query is push 6, 
then pop will print 6 and 
last query of pop will print 4.




class CQStack
{
  public int maxSize; // size of stack array
  public int[] stackArray;
  public int top; // top of stack
  public CQStack(int s) // constructor
  {
    maxSize=s;
    stackArray=new int[maxSize];
    top=-1;
  }
  public void push(int j) // put item on top of stack
  {
    if(isFull()){
      return;
    }
    top++;
    stackArray[top]=j;
  }
  public int pop() // take item from top of stack
  {
    if(isEmpty()){
      return -1;
    }
    return stackArray[top--];
  }
  public boolean isEmpty() // true if stack is empty
  {
    return top==-1;
  }
  public boolean isFull() // true if stack is full
  {
    return (maxSize-1)==top;
  }
}
-------------------------------------------------------------
Reverse a string using stack
Given a string, the task is to reverse the string using stack data structure.

Complete the function reverseString() that accepts the string, and reverses the string.

Input Format

The first line of input will contains an integer T denoting the no of test cases. Then T test cases follow. 
Each test case contains a number N.
Then N strings follow which are to be reversed
Output Format

For each test case, you have to reverse the string in the array given. You are required to complete the methods given only.
Constraints

1 <= T <= 10
﻿0 <= N <= 100
Given strings consist of uppercase and lowercase English letters.
Sample Input

1 // No. of test cases
2 // No. of strings
CodeQuotient
Code
Sample Output

tneitouQedoC
edoC﻿


tatic String reverseString(CQStack p, String st)
{
  Stack<Character> s=new Stack<>();
  for(int i=0;i<st.length();i++){
    s.push(st.charAt(i));
  }
  StringBuilder sb=new StringBuilder();
  while(!s.isEmpty()){
    sb.append(s.pop());
  }
  return sb.toString();
}
-------------------------------------------------------------
Implement the stack using Linked List
Implement the stack using linked list representation

Input

First line of input contains number of test cases.
First line of each test case contains an integer Q denoting the number of queries.
A Query is of 2 Types
(a) 1 item  (a query of this type means push 'item' onto the stack)
(b) 2   (a query of this type means to pop element from stack and print the popped element)
Then Q lines follow of each test case containing the queries.
Output

The output for each test case will be space separated integers having -1 if the stack is empty else the element popped out from the stack.
Sample Input

1
8
1 3 2 1 4 1 2 2 1 6 2 2
Sample Output

3 2 6 4
Explanation:

First query is push 3, 
then pop will print 3, 
3rd query is push 4, 
then push 2, 
5th query is pop which prints 2, 
6th query is push 6, 
then pop will print 6 and 
last query of pop will print 4.



class LinkStack
{
  private LinkList first; // ref to first item on list
  public LinkStack() // constructor
  {
    first=null;
  }
  public boolean isEmpty()
  {
    return first==null;
  }
  public void push(int dd)
  {
    LinkList ans=new LinkList(dd);
    if(first==null){
      first=ans;
    }
    else{
      ans.next=first;
      first=ans;
    }
  }
  public int pop()
  {
    if(isEmpty()){
      return -1;
    }
    int d=first.data;
    first=first.next;
    return d;
  }
}
-------------------------------------------------------------
Design stack for push, pop and min functions
Implement the stack using array which supports, push, pop and getMin functions with constant time complexity.

Input Format

First Line of Input contains number of test cases
Each test case has Q+1 lines, where first line contains an integer Q denoting the number of queries.
A Query is of 3 Types
(a) 1 item  (a query of this type means push 'item' onto the stack)
(b) 2 (a query of this type means to pop element from stack and print the popped element)
(c) 3 (a query of this type means to print the minimum of the stack, it will not remove the element from stack)
The next Q lines of each test case contains Q queries.
Output Format

The output for each test case will be space separated integers having -1 if the stack is empty else the element popped out from the stack.
You are required to complete the methods given.

﻿Sample Input

1
8
1
4
1
3
3
2
3
1
1
3
2
Sample Output

3 3 4 1 1
Explanation:

First query is push 4, then 2nd is push 3. So stack is { 3 4 }
3rd query is getmin which prints 3, then pop will print 3. So stack is { 4 }
5th query is getmin which prints 4, then push 1 on stack. So stack is { 1 4 }
7th query is getmin which prints 1, then last query is pop which prints 1.





public void push(int j) // put item on top of stack
{
  if(isFull()){
    return;
  }
  top++;
  stackArray[top]=j;
}
public int pop() // take item from top of stack
{
  if(isEmpty()){
    return -1;
  }
  return stackArray[top--];
}
public int getMin()
{
  int m=stackArray[0];
  for(int i=0;i<=top;i++){
    if(m>stackArray[i]){
      m=stackArray[i];
    }
  }
  return m;
}
-------------------------------------------------------------
Find the minimum bracket reversals for balanced expression star_border
Given an expression having only square brackets ‘[‘ and ‘]’. Find the minimum number of brackets reversals required to make the expression balanced. If expression cannot be made balanced, print -1 and if it is already balanced, print 0.

Input Format

The first line of input contains a single integer T denoting the number of test cases. Then T test cases follow. 
Each test case contains an expression consisting of square brackets only.
Output Format

The output for each test case will be the minimum number of bracket reversals required to make the expression balanced if possible.
Sample Input 1

2
[]
][
Sample Output 1

0
2
Explanation 1

First expression is already balanced, so print 0.
Second expression requires 2 reversals (both the brackets needs to be changed as []) so prints 2.
Sample Input 2

1
[[[[
Sample Output 2

2
Sample Input 3

1
[[[[[
Sample Output 3

-1






class Result
{
  static int minReversal(String expr){
    if(expr.length()%2!=0){
      return -1;
    }
    int s=0;
    int e=0;
    int rev=0;
    for(int i=0;i<expr.length();i++){
      char c=expr.charAt(i);
      if(c=='['){
        s++;
      }
      else{
        if(s==0){
          e++;
        }
        else{
            s--;
        }
      }
    }
    rev=(int)(Math.ceil(s/2.0) + Math.ceil(e/2.0));
    return rev;
  }
}


-------------------------------------------------------------

Evaluate the postfix expression using Stack
Given a postfix expression, evaluate it using stack and print the final output.

Input Format

The first line of input contains an integer T denoting the number of test cases. 
The next T line contains a postfix expression.
An expression in postfix form will consist of all digits and following five operators: +, -, *, /, ^
Output Format

Print the final output of postfix expression evaluation in new line for each test case.
Sample Input

2  // Testcases
8425+-*
546+*493/+*
Sample Output

-24
350
Explanation

Testcase 1 will be evaluated as: 
8 * (4 - (2 + 5)) = -24

Testcase 2 will be evaluated as:
(5 * (4 + 6)) * (4 + (9 / 3)) = 350





static int evalPostfix(CQStack s, String exp) {
    int a=0,b=0;
    for(int i=0;i<exp.length();i++){
      char c=exp.charAt(i);
      if(c=='+'){
        a=s.pop();
        b=s.pop();
        s.push(a+b);
      }
      else if(c=='*'){
        a=s.pop();
        b=s.pop();
        s.push(a*b);
      }
       else if(c=='-'){
        a=s.pop();
        b=s.pop();
        s.push(b-a);
      }
       else if(c=='/'){
        a=s.pop();
        b=s.pop();
        s.push(b/a);
      }
       else if(c=='^'){
        a=s.pop();
        b=s.pop();
        s.push((int)Math.pow(b,a));
      }
      else{
        s.push(Integer.parseInt(String.valueOf(c)));
      }
    }
    return s.pop();
  }

-------------------------------------------------------------

Evaluate the prefix expression using Stack
Given a prefix expression, evaluate it using stack and print the final output.

Complete the evalPrefix() function and return the final output.

Input Format

The first line of input contains an integer T denoting the number of test cases. The next T lines contain a prefix expression.
An expression in prefix form will consist of all digits and following five operators: +, -, *, /, ^
Output Format

Print the final output of prefix expression evaluation in new line for each test case.
Sample Input

1
+-*235/^234
Sample Output

3




class Result {
  static int evalPrefix(CQStack s, String exp) {
    int a=0,b=0;
  for(int i=exp.length()-1;i>=0;i--){
    char c=exp.charAt(i);
    if(c=='+'){
      a=s.pop();
      b=s.pop();
      s.push(a+b);
    }
    else if(c=='*'){
      a=s.pop();
      b=s.pop();
      s.push(a*b);
    }
     else if(c=='-'){
      a=s.pop();
      b=s.pop();
      s.push(a-b);
    }
     else if(c=='/'){
      a=s.pop();
      b=s.pop();
      s.push(a/b);
    }
     else if(c=='^'){
      a=s.pop();
      b=s.pop();
      s.push((int)Math.pow(a,b));
    }
    else{
      s.push(Integer.parseInt(String.valueOf(c)));
    }
  }
  return s.pop();
  }
}

-------------------------------------------------------------








-------------------------------------------------------------









-------------------------------------------------------------








-------------------------------------------------------------







-------------------------------------------------------------







-------------------------------------------------------------





*/