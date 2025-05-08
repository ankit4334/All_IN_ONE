/* 
232. Implement Queue using Stacks
class MyQueue {
    Stack<Integer> st1;
    Stack<Integer> st2;
    public MyQueue() {
        st1=new Stack<>();
        st2=new Stack<>();
    }
    
    public void push(int x) {
        st1.push(x);
    }
    
    public int pop() {
        if(empty()){
            return 0;
        }
        else if(!st2.isEmpty()){
            return st2.pop();
        }
        else{
            while(!st1.isEmpty()){
            st2.push(st1.pop());
            }
            return st2.pop();
        }
    }
    
    public int peek() {
        if(empty()){
            return 0;
        }
        if(!st2.isEmpty()){
            return st2.peek();
        }
        else{
            while(!st1.isEmpty()){
            st2.push(st1.pop());
            }
            return st2.peek();
        }
    }
    
    public boolean empty() {
        return st1.isEmpty() && st2.isEmpty();
    }
}

-----------------------------------------------------------------------------------------------------------------------------------------

225. Implement Stack using Queues

node-:not running this code.

class MyStack {
    Queue<Integer> q1;
    Queue<Integer> q2;
    public MyStack() {
        q1=new LinkedList<>();
        q2=new LinkedList<>();
    }
    
    public void push(int x) {
        if(empty()){
            q1.add(x);   //staring me dono queue khali hai to aap kisi me add kra satke ho.
        }
        else if(q1.isEmpty()){
            q2.add(x);
        }
        else{
            q1.add(x);
        }
    }
    
    public int pop() {
        if(empty()){
            return -1;
        }
        else if(q1.isEmpty()){
            while(q2.size()>1){
                q1.add(q2.remove());
            }
            return q2.remove();
        }
        else{
            while(q1.size()>1){
                q2.add(q1.remove());
            }
            return q1.remove();
        }
    }
    
    public int top() {
        if(empty()) return -1;

        if(q1.isEmpty()) return q2.peek();

        else return q1.peek();
    }
    
    public boolean empty() {
        return q1.isEmpty() && q2.isEmpty();
    }
}
-----------------------------------------------------------------------------------------------------------------------------------------
2073. Time Needed to Buy Tickets
Solved
Easy
Topics
Companies
Hint
There are n people in a line queuing to buy tickets, where the 0th person is at the front of the line and the (n - 1)th person is at the back of the line.

You are given a 0-indexed integer array tickets of length n where the number of tickets that the ith person would like to buy is tickets[i].

Each person takes exactly 1 second to buy a ticket. A person can only buy 1 ticket at a time and has to go back to the end of the line (which happens instantaneously) in order to buy more tickets. If a person does not have any tickets left to buy, the person will leave the line.

Return the time taken for the person initially at position k (0-indexed) to finish buying tickets.

 

Example 1:

Input: tickets = [2,3,2], k = 2

Output: 6

//method with the help of queue
import java.util.*;
class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int time=0;
        Queue<Integer> q=new LinkedList<>();

        for(int i=0;i<tickets.length;i++){
            q.add(i);
        }

        while(tickets[k]!=0){
            int t=q.remove();
            tickets[t]--;
            time++;
            if(tickets[t]>0){
                q.add(t);
            }
            
        }

        return time;
    }
}

//method two without queue
class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int time=0;
        for(int i=0;i<tickets.length;i++){
            if(i<=k){
                time+=Math.min(tickets[k],tickets[i]);
            }
            else{
                time+=Math.min(tickets[k]-1,tickets[i]);
            }
        }
        return time;
    }
}
-----------------------------------------------------------------------------------------------------------------------------------------
First negative in every window of size k
Difficulty: MediumAccuracy: 48.61%Submissions: 176K+Points: 4Average Time: 15m
Given an array arr[]  and a positive integer k, find the first negative integer for each and every window(contiguous subarray) of size k.

Note: If a window does not contain a negative integer, then return 0 for that window.

Examples:

Input: arr[] = [-8, 2, 3, -6, 10] , k = 2
Output: [-8, 0, -6, -6]

    static List<Integer> FirstNegativeInteger(int arr[], int k) {
        List<Integer> ans=new ArrayList<>();
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<k-1;i++){
            if(arr[i]<0)
            q.add(i);
        }
        for(int i=k-1;i<arr.length;i++){
            if(arr[i]<0){
                q.add(i);
            }
            
            while(!q.isEmpty() && q.peek()<=(i-k)){
                q.remove();
            }
            
            ans.add(q.isEmpty() ? 0 : arr[q.peek()]);
        }
        return ans;
    }

-----------------------------------------------------------------------------------------------------------------------------------------











-----------------------------------------------------------------------------------------------------------------------------------------











-----------------------------------------------------------------------------------------------------------------------------------------





-----------------------------------------------------------------------------------------------------------------------------------------
-----------------------------------------------------------------------------------------------------------------------------------------


-----------------------------------------------------------------------------------------------------------------------------------------



-----------------------------------------------------------------------------------------------------------------------------------------















*/
