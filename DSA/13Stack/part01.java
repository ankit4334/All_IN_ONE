/*

  what is Data structure and algorithm:
  Ans:-Data structures are ways of organizing and storing data in a computer. 
  Common data structures include arrays, linked lists, stacks, queues, trees, and graphs. 

  ->Algorithms are sets of steps for solving problems. Basic algorithms include sorting, searching, and recursion.
 
  ->Types of Data Structures.
  There are two types of data structures:
  1.Primitive data structure
  The primitive data structures are primitive data types. The int, char, float, double, 
  and pointer are the primitive data structures that can hold a single value.


  2.Non-primitive data structure
  The non-primitive data structure is divided into two types:

  1.Linear data structure
  The arrangement of data in a sequential manner is known as a linear data structure. 


  2.Non-linear data structure
  What Is a Non-Linear Data Structure? It is a form of data structure where the data elements don't stay arranged linearly or sequentially.
  example-bt,bst,heap etc.


  -------------------------------------------------------------------------------
  ->Data structures can also be classified as:
  1.Static data structure: It is a type of data structure where the size is allocated at the compile time. Therefore, the maximum size is fixed.
  2.Dynamic data structure: It is a type of data structure where the size is allocated at the run time. Therefore, the maximum size is flexible.


*/

/* 
 ->Collections in Java:-
   The Collection in Java is a framework that provides 
   an architecture to store and manipulate the group of objects.

  -Java Collection means a single unit of objects. Java Collection 
  framework provides many interfaces (Set, List, Queue, Deque) and 
  classes (ArrayList, Vector, LinkedList, PriorityQueue, HashSet, LinkedHashSet, TreeSet).
  

  ->What is a framework in Java.
  ans:-t provides readymade architecture.
    *It represents a set of classes and interfaces.
    *It is optional.
  

 Stack in java:-
 The stack is a linear data structure that is used to store the collection of objects.
 It is based on Last-In-First-Out (LIFO).

 Why use stack:-save the memory vastage(because we use arraylist then increase double size);

*/

//Opertions of Stack
/*
 stack is also called (LIFO=last in first out)
 push O(1)
 pop O(1)
 peek O(1) 
*/

/*
//Implemention  of stack using class(with array not linked list);
#include<iostream>
#include<stack>
using namespace std;

class Stack{
    //properties
    public:
     int *arr;
     int top;
     int size;
    //behaviour
    Stack(int size){
        this->size=size;
        arr=new int[size];
        top=-1;
    }


    void push(int element){
        if(size-top>1){
            top++;
            arr[top]=element;
        }
        else{
            cout<<"Stack Overflow"<<endl;
        }

    }

    void pop(){
        if(top>=0){
            top--;
        }
        else{
            cout<<"Stack underflow"<<endl;
        }

    }

    int peek(){
        if(top>=0){
            return arr[top];
        }
        else{
            cout<<"Stack is empty"<<endl;
            return -1;
        }

    }

    bool isEmpty(){
         if(top==-1){
            return true;
         }
         else{
            return false;
         }

    }

};

int main(){
    Stack s(5);

    s.push(5);
    s.push(10);
    s.push(15);
    s.push(20);

    cout<<s.peek()<<endl;

    s.pop();
    cout<<s.peek()<<endl;

    if(s.isEmpty()){
        cout<<"Stack is empty "<<endl;
    }
    else{
        cout<<"Stack is not empty"<<endl;
    }
    
    return 0;
}
*/




/* 
 //Implementing the stack using array in java
 
    public class Main{
    public static class Stack{
    int size;
    int top;
    int a[];
    Stack(int size){
        this.size=size;
        this.top=-1;
        this.a=new int[size];
    }
   

    public  boolean isEmpty(){
        return top==-1;
    }

    public  boolean isFull(){
        return top==size-1;
    }

    public  void push(int d){
        if(isFull()){
            return;
        }
        a[++top]=d;
    }

    public  int pop(){
        return a[top--];
    }

    public int  peek(){
        return a[top];
    }

}
    public static void main(String[] args) {
        Stack s=new Stack(3);
        s.push(1);
        s.push(2);
        s.push(3);
        s.pop();
        s.push(4);
        System.out.println(s.peek());
        
        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }
    }
}

*/









/* 
//Implemention of stack using ArrayList
import java.util.ArrayList;
public class part01 {
    static class Stack{
    static ArrayList<Integer> list=new ArrayList<>();
    
    //isEmpty
    public static boolean isEmpty(){
        return list.size()==0;
    }

    //push
    public static void push(int data){
        list.add(data);
    }

    //pop
    public static int pop(){
        if(isEmpty()){
            return -1;   
        }
        int top=list.get(list.size()-1);
        list.remove(list.size()-1);
        return top;
    }

    //peek
    public static int peek(){
        if(isEmpty()){
            return -1;   
        }
        return list.get(list.size()-1);
    }
        
    }
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);


        while (!s.isEmpty()){
            System.out.print(s.peek()+" ");
            s.pop();
        }
    }
}
*/

/*

//Stack Implemention using LinkedList
import java.util.ArrayList;
public class part01 {

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null; 
        }
    }

    static class Stack{
        static Node head=null;
         
        //isEmpty
        public static boolean isEmpty(){
           return head==null;
        }

        //push
        public static void push(int data){
            Node newNode=new Node(data);
            if(isEmpty()){
                head=newNode;
                return;
            }
            else{
                newNode.next=head;
                head=newNode;
            }
        }


        //pop funtion
        public static int pop(){
            if(isEmpty()){
                return -1;
            }

            int top=head.data;
            head=head.next;
            return top;
        }
        

        //peek function
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);


        while (!s.isEmpty()){
            System.out.print(s.peek()+" ");
            s.pop();
        }
        
    }
}
*/

/* 
//Stack Implemention java framwork
import java.util.*;
public class part01 {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);


        while (!s.isEmpty()){
            System.out.print(s.peek()+" ");
            s.pop();
        }
    }
}

*/

/* 

//Question 01:-Push at the Bottom of the Stack
import java.util.*;
public class part01{

    public static void pushAtBottom(Stack<Integer> s,int data){

        if(s.isEmpty()){
            s.push(data);
            return;
        }

        int top=s.pop();
        pushAtBottom(s,data);
        s.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        pushAtBottom(s,4);
        while (!s.isEmpty()){
            System.out.println(s.pop()+" ");
        }
    }
}



//Itrative code
public Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
        Stack<Integer> temp=new Stack<>();
        while(!st.isEmpty()){
            temp.push(st.pop());
        }
        st.push(x);
        
        while(!temp.isEmpty()){
            st.push(temp.pop());
        }
        
        return st;
    }
}

*/







/*
//Question 02:-Reverse a String using a Stack
import java.util.*;
public class part01 {

    public static String reverseString(String str){

        Stack<Character> s=new Stack<>();
        int idx=0;
        while(idx < str.length()){
           s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder result=new StringBuilder("");
        while(!s.isEmpty()){
            char curr=s.pop();
            result.append(curr);
        }

        return result.toString();
    }
    public static void main(String[] args) {
       String str="abc";
       String result=reverseString(str);
       System.out.println(result);
    }
}

*/

/* 
//Question 03:-Reverse a Stack
import java.util.*;
public class part01 {

    public static void pushAtBottom(Stack<Integer> s,int data){

        if(s.isEmpty()){
            s.push(data);
            return;
        }

        int top=s.pop();
        pushAtBottom(s,data);
        s.push(top);
    }

    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }

        int top=s.pop();
        reverseStack(s);
        pushAtBottom(s, top);

    }

    public static void printStack(Stack<Integer> s){
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
    

    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
       
        reverseStack(s);
        printStack(s);
    }
}

*/



/* 

//Question 04:-Stock Span Problem
    Input: arr[] = [100, 80, 60, 70, 60, 75, 85]
    Output: [1, 1, 1, 2, 1, 4, 6] 
    
    public ArrayList<Integer> calculateSpan(int[] arr) {
        ArrayList<Integer> ans=new ArrayList<>();
        Stack<Integer> s=new Stack<>();
        int n=arr.length;
        
        
        for(int i=0;i<n;i++){
            int span=1;
            
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }
            
            if(!s.isEmpty()){
                span=i-s.peek();
            }
            else{
                span=i+1;
            }
            
            ans.add(span);
            s.push(i);
        }
        
        return ans;
    }

*/

/* 
IMPORTENT
//Question 05:-Next Greater Elemennt->The next greater element of some element x in an array is the 
rist greater elelmnt that is to the right of x in the same array.
arr=[6,8,0,1,3]
nest Greater=[8,-1,1,3,-1]

Note:-this question has 4 types
1.next greater right:-solve already in bottom 
2.next greater left:for(int i=0;i<n;i++)
3.next small right:- for(int i=n-1;i>=0;i--) && arr[s.peek()] >= arr[i]
4.next small left:-for(int i=0;i<n;i++) && arr[s.peek()] >= arr[i]






import java.util.*;
public class part01 {

    public static void nestGre(int arr[]){  //O(n)
        Stack<Integer> s=new Stack<>();
        int nestGreater[]=new int[arr.length];
        int n=arr.length;
        for(int i=n-1;i>=0;i--){ 

            //1 while
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
               s.pop();
            }

            //2 if-else
            if(s.isEmpty()){
                nestGreater[i]=-1;
            }
            else{
                nestGreater[i]=arr[s.peek()];
            }

            //3 push in s
            s.push(i);
        }

        for(int i=0;i<nestGreater.length;i++){
            System.out.print(nestGreater[i]+" ");
        }
    } 
    public static void main(String[] args) {
       int arr[]={6,8,0,1,3};
       nestGre(arr);
    }
}

*/

/* 
Question 06:-Valid Parentheses->Given a string s containing just the characters
'(',')','{','}','[' and ']' determine if the input string is valid.
an input string is valid if:
1.Open brackets must be closed by the same type of brackets.
2.Opne bracktes must be closed in the correct order.
3.every close bracket has a conrespinding open bracket of the same type.


Exampe:-
s="()[]{}" ->true;
s="()" ->true
s="(]" ->false
s=")(" ->false


import java.util.*;
public class part01 {

    public static boolean isValid(String str){
        Stack<Character> s=new Stack<>();

        for(int i=0;i<str.length();i++){ //O(n)
            char ch=str.charAt(i);

            if(ch=='(' || ch=='{' || ch=='['){ //opening
                s.push(ch);
            }
            else{
                //closing
                if(s.isEmpty()){
                    return false;
                }

                if( (s.peek() == '(' && ch==')') || (s.peek() == '{' && ch=='}') || (s.peek() == '[' && ch==']')){
                    s.pop();
                }
                else{
                    return false;
                }
            }
        }

        if(s.isEmpty()){
            return true;
        }
        else{
            return false;
        }

    }
    
    public static void main(String[] args) {
       String str="({})[]"; //true;

       System.out.println(isValid(str));
    }
}
*/

//Duplicate parentheses :-08
/* 
->Given a balanced expression,find if it contains duplicate parentheses or not
A set of parentheses are duplicate if the same subexpression is surrounded by 
multiple parentheses.

return a true if it contains duplicates else return false.

Example:(((a+(b)))*(c+d))  :-true
        ((((a)+(b))c+d))   :-true
        ((a+b)+(c+d))      :-false
        (((a+b))+c)        :-true



import java.util.*;
public class part01 {

    public static boolean idDuplicate(String str){
        Stack<Character> s=new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            //closing
            if(ch==')'){
                int count=0;
                while(s.peek()!='('){
                    s.pop();
                    count++;
                }

                if(count < 1){
                    return true;  //dublicate
                }
                else{
                    s.pop(); //Opening pair
                }
            }

            else{
                //opening
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str="((a+b))"; //true;
        String str2="(a-b)";  //false
        System.out.println(idDuplicate(str));
    }
}

*/

/* 
Question 09 :-Max Area in Histogram->Given an array of heights representing the 
histogram's bar height where the widht of each bar is 1, return the area of 
the largest rectange in the histogram.

heights={2,1,5,6,2,3}
ans=10;


import java.util.Stack;

public class part01 {
    public static void maxAreaOf(int arr[]) {// O(n)
        int maxArea = 0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];

        // Nest Smaller Right
        Stack<Integer> s = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = arr.length;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }
        // Nest Smaller left

        s = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        // Current area : width=j-i-1=nsr[i]-nsl[i]-1
        for (int i = 0; i < arr.length; i++) {
            int height = arr[i];
            int widht = nsr[i] - nsl[i] - 1;
            int currArea = height * widht;
            maxArea = Math.max(currArea, maxArea);
        }
        System.out.println("max area in histogram = " + maxArea);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 1, 5, 6, 2, 3 };
        maxAreaOf(arr);
    }
}






//LeetCode and rohit neggin problem................


class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int lse[] = new int[n];
        int rse[] = new int[n];
        Stack<Integer> s = new Stack<>();

        lseEle(heights, lse, s, n);
        s.clear(); // Clear stack before using in rseEle
        rseEle(heights, rse, s, n);

        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, heights[i] * (rse[i] - lse[i] - 1));
        }

        return ans;
    }

    public static void lseEle(int[] heights, int lse[], Stack<Integer> s, int n) {
        for (int i = 0; i < n; i++) {
            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }

            if (!s.isEmpty()) {
                lse[i] = s.peek();
            } else {
                lse[i] = -1; // No smaller element on the left
            }

            s.push(i);
        }
    }

    public static void rseEle(int[] heights, int rse[], Stack<Integer> s, int n) {
        for (int i = n - 1; i >= 0; i--) {
            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }

            if (!s.isEmpty()) {
                rse[i] = s.peek();
            } else {
                rse[i] = n; // No smaller element on the right
            }

            s.push(i);
        }
    }
}

*/






/* 
This problem is same is maximum ractangle problem........
85. Maximal Rectangle
Solved
Hard
Topics
Companies
Given a rows x cols binary matrix filled with 0's and 1's, find the largest rectangle containing only 1's and return its area.

 

Example 1:


Input: matrix = [["1","0","1","0","0"],["1","0","1","1","1"],["1","1","1","1","1"],["1","0","0","1","0"]]
Output: 6
Explanation: The maximal rectangle is shown in the above picture.
Example 2:

Input: matrix = [["0"]]
Output: 0
Example 3:

Input: matrix = [["1"]]
Output: 1


class Solution {
    public int maximalRectangle(char[][] matrix) {
        int ans=0;
        int row=matrix.length;
        int col=matrix[0].length;

        int temp[]=new int[col];
        for(int i=0;i<col;i++){
            temp[i]=0;
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]=='0'){
                    temp[j]=0;
                }
                else{
                    temp[j]+=1;
                }
            }

            ans=Math.max(ans,largestRectangleArea(temp));
        }

        return ans;
    }




    //all down querey are largestRectangleArea Querey...........
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int lse[] = new int[n];
        int rse[] = new int[n];
        Stack<Integer> s = new Stack<>();

        lseEle(heights, lse, s, n);
        s.clear(); // Clear stack before using in rseEle
        rseEle(heights, rse, s, n);

        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, heights[i] * (rse[i] - lse[i] - 1));
        }

        return ans;
    }

    public static void lseEle(int[] heights, int lse[], Stack<Integer> s, int n) {
        for (int i = 0; i < n; i++) {
            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }

            if (!s.isEmpty()) {
                lse[i] = s.peek();
            } else {
                lse[i] = -1; // No smaller element on the left
            }

            s.push(i);
        }
    }

    public static void rseEle(int[] heights, int rse[], Stack<Integer> s, int n) {
        for (int i = n - 1; i >= 0; i--) {
            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }

            if (!s.isEmpty()) {
                rse[i] = s.peek();
            } else {
                rse[i] = n; // No smaller element on the right
            }

            s.push(i);
        }
    }
}
 

*/






/* 
 The Celebrity Problem
Difficulty: MediumAccuracy: 38.33%Submissions: 301K+Points: 4Average Time: 30m
A celebrity is a person who is known to all but does not know anyone at a party. A party is being organized by some people.  A square matrix mat (n*n) is used to represent people at the party such that if an element of row i and column j is set to 1 it means ith person knows jth person. You need to return the index of the celebrity in the party, if the celebrity does not exist, return -1.

Note: Follow 0-based indexing.

Examples:

Input: mat[][] = [[0 1 0], [0 0 0], [0 1 0]]
Output: 1
Explanation: 0th and 2nd person both know 1. Therefore, 1 is the celebrity.

class Solution {
    // Function to find if there is a celebrity in the party or not.
    public int celebrity(int mat[][]) {
        int n=mat.length;
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            st.push(i);
        }
        
        while(st.size()>1){
            int first=st.pop();
            int second=st.pop();
            if(mat[first][second]==1 && mat[second][first]==0){
                st.push(second);
            }
            else if(mat[first][second]==0 && mat[second][first]==1){
                 st.push(first);
            }
        }
        
        if(st.isEmpty()) return -1;
        
        int ans=st.pop();
        int row=0,col=0;
        for(int i=0;i<n;i++){
            row+=mat[ans][i];
            col+=mat[i][ans];
        }
        
        if(row==0 && col==n-1) return ans;
        else return -1;
    }
}
*/




/* 
 Get Min from Stack
Difficulty: MediumAccuracy: 22.59%Submissions: 254K+Points: 4Average Time: 30m
Given q queries, implement a Stack with three functionalities:

Push an integer x onto the stack.
Pop the top element from the stack and return it. If the stack is empty, return -1.
GetMin, which retrieves the minimum element in the stack O(1) time. If the stack is empty, return -1.
Each query can be one of the following:

1 x: Push x onto the stack.
2: Pop the top element from the stack and return it.
3: Return the minimum element currently in the stack.
Examples:

Input: q = 6, queries = [(1, 2), (1, 3), (2), (3), (1, 1), (3)]
Output: 3, 2, 1

//method -1 push-O(1),pop-O(1),getmin-O(1) and space-O(n)


class GfG
{
    int minEle;
    Stack<Integer> s;
    Stack<Integer> m;
    
    // Constructor    
    GfG()
	{
	    this.minEle=minEle;
	    s=new Stack<>();
	    m=new Stack<>();

	}
	
   
    int getMin()
    {
        if (m.isEmpty()) {
            return -1; 
        }
        
        return m.peek();
	
    }
    
    int pop()
    {
    	if(s.isEmpty()){
	        return -1;
	    }
	    m.pop();
	    return s.pop();
	
    }

    void push(int x)
    {
	    if(s.isEmpty()){
	        s.push(x);
	        m.push(x);
	    }
	    else{
	        s.push(x);
	        m.push(Math.min(x,m.peek()));
	    }
    }	
}



//method -2  push-O(1),pop-O(1),getmin-O(1) and space-O(1)



class GfG
{
    int minEle;
    Stack<Integer> s;
    // Constructor    
    GfG()
	{
	    this.minEle=minEle;
	    s=new Stack<>();
	}
	
    int getMin()
    {
        if (s.isEmpty()) {
            return -1; 
        }
        
        return s.peek()%101;
	
    }
    
    int pop()
    {
    	if(s.isEmpty()){
	        return -1;
	    }
	  
	    return s.pop()/101;
	
    }

    void push(int x)
    {
	    if(s.isEmpty()){
	        s.push(x*101+x);
	    }
	    else{
	        s.push((x*101+Math.min(x,s.peek()%101)));
	    }
    }	
}
*/










/* 

Two Stacks in an Array
Difficulty: MediumAccuracy: 56.49%Submissions: 163K+Points: 4Average Time: 20m
Your task is to implement  2 stacks in one array efficiently. You need to implement 4 methods.

twoStacks : Initialize the data structures and variables to be used to implement  2 stacks in one array.
push1 : pushes element into the first stack.
push2 : pushes element into the second stack.
pop1 : pops an element from the first stack and returns the popped element. If the first stack is empty, it should return -1.
pop2 : pops an element from the second stack and returns the popped element. If the second stack is empty, it should return -1.

Examples:

Input:
push1(2)
push1(3)
push2(4)
pop1()
pop2()
pop2()
Output: [3, 4, -1]
Explanation:
push1(2) the stack1 will be {2}
push1(3) the stack1 will be {2,3}
push2(4) the stack2 will be {4}
pop1()   the poped element will be 3 from stack1 and stack1 will be {2}
pop2()   the poped element will be 4 from stack2 and now stack2 is empty
pop2()   the stack2 is now empty hence returned -1.




class twoStacks {
    int arr[];
    int size;
    int top1;
    int top2;
    
    twoStacks() {
        size=100;
        top1=-1;
        top2=size;
        arr=new int[size];
    }

    // Function to push an integer into the stack1.
    void push1(int x) {
        arr[++top1]=x;
    }

    // Function to push an integer into the stack2.
    void push2(int x) {
        arr[--top2]=x;
    }

    // Function to remove an element from top of the stack1.
    int pop1() {
        if(top1==-1){
            return -1;
        }
        return arr[top1--];
    }

    // Function to remove an element from top of the stack2.
    int pop2() {
        if(top2==size){
            return -1;
        }
        return  arr[top2++];
    }
}

*/







/* 

Problem statement
Design a data structure to implement ‘N’ stacks using a single array of size ‘S’. It should support the following operations:

push(X, M): Pushes an element X into the Mth stack. Returns true if the element is pushed into the stack, otherwise false.

pop(M): Pops the top element from Mth Stack. Returns -1 if the stack is empty, otherwise, returns the popped element.
Two types of queries denote these operations :

Type 1: for push(X, M) operation.
Type 2: for pop(M) operation.
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= N <= S <= 1000
1 <= Q <= 10^5 
1 <= P <= 2
1 <= X <= 10^5

Time Limit: 1 sec

Where ‘S’ represents the size of the array, ‘N’ represents the number of stacks, ‘Q’ represents the number of queries, ‘P’ represents the type of operation and ‘X’ represents the element.
Sample Input 1 :
3 6 5
1 10 1
1 20 1
1 30 2
2 1
2 2
Sample Output 1 :
True 
True
True
20
30

import java.util.* ;
import java.io.*; 

class Node{
    int index;
    Node next;
    Node(int index){
        this.index=index;
        next=null;
    }
}

public class NStack {
    int arr[]; //Original array
    Node top[];  //top element's index of particular stack
    Stack<Integer> st;  //contain empty index
    public NStack(int N, int S) {
        arr=new int[S];
        top=new Node[N];
        st=new Stack<>();
        
        for (int i = S - 1; i >= 0; i--) { 
            st.push(i);  // Pushing all indices to stack (from last to first)
        }

        for(int i=0;i<N;i++){
            top[i]=null;
        }
    }

    // Pushes 'X' into the Mth stack. Returns true if it gets pushed into the stack, and false otherwise.
    public boolean push(int x, int m) {
        if(st.isEmpty()) return false;

        int index = st.pop(); // Get the available index
        arr[index]=x; 
        Node temp=new Node(index);
        temp.next=top[m-1];
        top[m-1]=temp;
        return true;
    }

    // Pops top element from Mth Stack. Returns -1 if the stack is empty, otherwise returns the popped element.
    public int pop(int m) {
        if(top[m-1]==null) return -1;

        int ele=arr[top[m-1].index];
        st.push(top[m-1].index); // Mark this index as free
        top[m-1] = top[m-1].next; // Update top to the next element
        return ele;
    }
}


*/