//Dequeue By rohit neggi Bhai...
/* 
*Operation of Dequeue
 1.addFirst()
 2.addLast()
 3.removeFirst()
 4.removeLast()
 5.getFirst()
 6.getLast()
*/






/* 

//Implementions of Dequeue using Doubly Linked List;
public class Dequeue {
    static class Node{
        int data;
        Node next;
        Node pre;
        Node(int data){
            this.data=data;
            next=null;
            pre=null;
        }
    }

    static class deQueue{
        Node front,rear;
        deQueue(){
            front=rear=null;
        }

        void addFirst(int data){
            Node t=new Node(data);
            if(front==null && rear==null){
                front=rear=t;
                return;
            }
            t.next=front;
            front.pre=t;
            front=t;
        }


        void addLast(int data){
            Node t=new Node(data);
            if(front==null && rear==null){
                front=rear=t;
                return;
            }
            rear.next=t;
            t.pre=rear;
            rear=t;
        }


        int removeFirst(){
            if(front==null) return -1;

            int ele=front.data;
            if(front==rear){
                front=rear=null;
            }
            else{
                front=front.next;
                front.pre=null;
            }
           
            return ele;
        }


        int removeLast(){
            if(rear==null) return -1;

            int ele=rear.data;
            if(rear==front){
                rear=front=null;
            }
            else{
                rear=rear.pre;
                rear.next=null;
            }
           
            return ele;
        }


        int getFirst(){
            if(front==null) return -1;

            return front.data;
        }



        int getLast(){
            if(rear==null) return -1;

            return rear.data;
        }
    }
    public static void main(String[] args) {
        
        deQueue q=new deQueue();
        q.addFirst(1);
        q.addFirst(2);
        q.addLast(5);
        q.addLast(22);
        q.removeFirst();
        q.removeFirst();
        
        System.out.println(q.getFirst());
        System.out.println(q.getLast());
    }
}
*/








/* 
//Implementions of Dequeue using Array;
public class Dequeue {
    static class deQueue{
        int size;
        int arr[];
        int front;
        int rear;
        deQueue(int n){
            size=n;
            arr=new int[size];
            front=rear=-1;
        }

        boolean isFull(){
            return (rear+1)%size==front;
        }

        boolean isEmpty(){
            return front==-1;
        }

        void addFirst(int x){
            if(isEmpty()){
                front=rear=0;
                arr[0]=x;
            }
            else if(isFull()){
                return;
            }
            else{
                front=(front-1+size)%size;
                arr[front]=x;
            }
        }


        void addLast(int x){
            if(isEmpty()){
                front=rear=0;
                arr[0]=x;
            }
            else if(isFull()){
                return;
            }
            else{
                rear=(front+1)%size;
                arr[rear]=x;
            }
        }


        int removeFirst(){
            if(isEmpty()){
                return -1;
            }
            int ele=arr[front];

            if(front==rear){
                front=rear=-1;
            }
            else{
                front=(front+1)%size;
            }
            return ele;
        }


        int removeLast(){
            if(isEmpty()){
                return -1;
            }
            int ele=arr[rear];

            if(front==rear){
                front=rear=-1;
            }
            else{
                rear=(rear-1+size)%size;
            }
            return ele;
        }


        int getFirst(){
            if(isEmpty()) return -1;

            return arr[front];
        }

        int getLast(){
            if(isEmpty()) return -1;

            return arr[rear];
        }
    }
    public static void main(String[] args) {
        
        deQueue q=new deQueue(100);
        
        q.addLast(5);
        q.addLast(22);
        q.addFirst((19));
        
        System.out.println(q.getFirst());
        System.out.println(q.getLast());
    }
}
*/







//Implementions of Dequeue STL;
import java.util.*;
public class Dequeue {
public static void main(String[] args) {   
    Deque<Integer> deque=new LinkedList<>();
    deque.addFirst(1);
    deque.addFirst(2);
    deque.addFirst(3);
    deque.addFirst(4);

    System.out.println(deque);
    deque.removeFirst();
    System.out.println(deque);

    System.out.println("first el="+deque.getFirst());
    System.out.println("last el="+deque.getLast());
    }
}





/* 
//Stack and Queue using Deque:-
import java.util.*;
public class part01 {
    static class Stack{
        Deque<Integer> deque=new LinkedList<>();
        public void push(int data){
            deque.addLast(data);
        }

        public int pop(){
            return deque.removeLast();
        }

        public int peek(){
            return deque.getLast();
        }
    }
    public static void main(String[] args) {
        
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println("peek = "+s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());

    }
}


*/














/*
//Stack and Queue using Deque:-
import java.util.*;
public class part01 {
    static class Queue{
        Deque<Integer> deque=new LinkedList<>();
        public void add(int data){
            deque.addLast(data);
        }

        public int remove(){
            return deque.removeFirst();
        }

        public int peek(){
            return deque.getFirst();
        }
    }
    public static void main(String[] args) {
        
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println("peek = "+q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());

    }
}
*/



/*
239. Sliding Window Maximum
Solved
Hard
Topics
Companies
Hint
You are given an array of integers nums, there is a sliding window of size k which is moving from the very left of the array to the very right. You can only see the k numbers in the window. Each time the sliding window moves right by one position.

Return the max sliding window.

 

Example 1:

Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
Output: [3,3,5,5,6,7]

import java.util.*;
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int ans[]=new int[n-k+1];
        int j=0;
        Deque<Integer> dq=new LinkedList<>();
        for(int i=0;i<k-1;i++){
            if(dq.isEmpty()) dq.addLast(i);

            else{
                while(!dq.isEmpty() && nums[dq.getLast()]<nums[i]){
                dq.removeLast();
            }
                dq.addLast(i);
            }
            
        }

        for(int i=k-1;i<n;i++){
            //remove smaller element form back
            while(!dq.isEmpty() && nums[dq.getLast()]<nums[i]){
                dq.removeLast();
            }
            dq.addLast(i);

            //if front element is outside the window pop form front
            if(dq.getFirst()<=(i-k)){
                dq.removeFirst();
            }
            //answer add kar do
            ans[j++]=nums[dq.getFirst()];
        }

        return ans;
    }
}
*/







/* 
 995. Minimum Number of K Consecutive Bit Flips
Solved
Hard
Topics
Companies
You are given a binary array nums and an integer k.

A k-bit flip is choosing a subarray of length k from nums and simultaneously changing every 0 in the subarray to 1, and every 1 in the subarray to 0.

Return the minimum number of k-bit flips required so that there is no 0 in the array. If it is not possible, return -1.

A subarray is a contiguous part of an array.

 

Example 1:

Input: nums = [0,1,0], k = 1
Output: 2
Explanation: Flip nums[0], then flip nums[2].
Example 2:

Input: nums = [1,1,0], k = 2
Output: -1
Explanation: No matter how we flip subarrays of size 2, we cannot make the array become [1,1,1].
Example 3:

Input: nums = [0,0,0,1,0,1,1,0], k = 3
Output: 3
Explanation: 
Flip nums[0],nums[1],nums[2]: nums becomes [1,1,1,1,0,1,1,0]
Flip nums[4],nums[5],nums[6]: nums becomes [1,1,1,1,1,0,0,0]
Flip nums[5],nums[6],nums[7]: nums becomes [1,1,1,1,1,1,1,1]
 

Constraints:

1 <= nums.length <= 105
1 <= k <= nums.length

//Brute Force solutions
class Solution {
    public int minKBitFlips(int[] nums, int k) {
        int n=nums.length;
        int flip=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                if((i+k-1)>=n){
                    return -1;
                }

                for(int j=i;j<=i+k-1;j++){
                    if(nums[j]==0){
                        nums[j]=1;
                    }
                    else{
                        nums[j]=0;
                    }
                }
                flip++;
            }
        }

        return flip;
    }
}


//Optimal solution
class Solution {
    public int minKBitFlips(int[] nums, int k) {
        int n=nums.length;
        int flip=0;
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(!q.isEmpty() && q.peek()<i){
                q.remove();
            }
            if(q.size()%2==nums[i]){
                if(i+k-1>=n){
                    return -1;
                }
                q.add(i+k-1);
                flip++;
            }
        }
        return flip;
    }
}
*/