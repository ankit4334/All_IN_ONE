/* 
 Queue:-queue is a type of data structure in the Java programming language that stores elements of the same kind. 
 The components in a queue are stored in a FIFO (First In, First Out) behavior. 


 *Queue is also known as FIFO(first in first out);
 ->Operatiions
 1.Add O(1) Enque
 2.Remove O(1) Dequeue
 3.Peek O(1) Front
*/



/* 
//Implementation of queue using Array(array is fixed size)
public class part01 {
    static class Queue{
       static int arr[];
       static int size;
       static int rear;
       
       Queue(int n){
        arr=new int[n];
        size=n;
        rear=-1;
       }

       //isEmpty
       public static boolean isEmpty(){
        return rear==-1;
       }

         

       //add function
       public static void add(int data){
        if(rear==size-1){
            System.out.println("queue is full");
            return;
        }
        rear=rear+1;
        arr[rear]=data;
       }


       //remove function
       public static int remove(){
        if(isEmpty()){
            System.out.println("Empty queue");
            return -1;
        }
        int front=arr[0];
        for(int i=0;i<rear;i++){
            arr[i]=arr[i+1];
        }
        rear=rear-1;
        return front;
       }


       //peek function
       public static int peek(){
        if(isEmpty()){
            System.out.println("empty queue");
            return -1;
        }
        return arr[0];
       }


    }
    public static void main(String[] args) {
        Queue q=new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
*/







//Implement Queue with two pointer front and rear;
import java.util.*;
public class part01 {
    static class Queue{
        int size;
        int arr[];
        int front;
        int rear;

        Queue(int n){
            size=n;
            arr=new int[size];
            front=-1;
            rear=-1;
        }

        public boolean isEmpty(){
            return front==-1;
        }

        public boolean isFull(){
            return rear==size-1;
        }

        public void push(int x){
           if(isFull()) return;
           
           if(front==-1) front=0;

           arr[++rear]=x;
        }

        public void pop(){
            if(isEmpty()) return;

            else{
                if(front==rear){
                    front=rear=-1;
                }
                else{
                   front+=1; 
                }
            }

        }

        public int peek(){
            if(isEmpty()) return -1;
            return arr[front];
        }
    }
    public static void main(String[] args) {
        
        Queue q=new Queue(100);
        q.push(1);
        q.push(2);
        q.push(83);
        q.push(21);
        q.push(23);
        q.push(43);
  
        q.pop();

       while(!q.isEmpty()){
        System.out.println(q.peek());
        q.pop();
       }

    }
}









/*

//Circular Queue Implemenntions
public class part01 {
    static class Queue{
       static int arr[];
       static int size;
       static int rear;
       static int front;

       Queue(int n){
        arr=new int[n];
        size=n;
        rear=-1;
        front=-1;
       }

       //isEmpty
       public static boolean isEmpty(){
        return rear==-1 && front==-1;
       }


       //isFull
       public static boolean isFull(){
        return (rear+1)%size==front;
       }

       

       //add function
       public static void add(int data){
        if(isFull()){
            System.out.println("queue is full");
            return;
        }

        //add 1st elemnet
        if(front==-1){
            front=0;
        }

        rear=(rear+1) % size;
        arr[rear]=data;
       }


       //remove function
       public static int remove(){
        if(isEmpty()){
            System.out.println("Empty queue");
            return -1;
        }
       
        int result=arr[front];

        //last ele delete
        if(rear==front){
            rear=front=-1;
        }
        else{
            front=(front+1)%size;
        }

        return result;

       }


       //peek function
       public static int peek(){
        if(isEmpty()){
            System.out.println("empty queue");
            return -1;
        }
        return arr[front];
       }


    }
    public static void main(String[] args) {
        Queue q=new Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());

        q.add(5);   

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}

*/











/* 
//Implementions of queue using  Linked List
public class part01 {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    static class Queue{
       static Node head=null;
       static Node tail=null;


       //isEmpty
       public static boolean isEmpty(){
        return head==null && tail==null;
       }


       //add function
       public static void add(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
            return;
        }

        tail.next=newNode;
        tail=newNode;

       }


       //remove function
       public static int remove(){
        if(isEmpty()){
            System.out.println("Empty queue");
            return -1;
        }
       
        int front=head.data;
        //single element in linked list
        if(tail==head){
            tail=head=null;
        }
        else{
            head=head.next;
        }
        return front;

       }


       //peek function
       public static int peek(){
        if(isEmpty()){
            System.out.println("empty queue");
            return -1;
        }
        return head.data;
       }
    }
    public static void main(String[] args) {
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
*/




 









/* 
//Queue implemention using javaframework
import java.util.*;
public class part01 {
    public static void main(String[] args) {
        //Queue<Integer> q=new LinkedList<>();
        Queue<Integer> q=new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
*/










/* 

//Question 01:-Queue using 2 stacks
import java.util.*;
public class part01 {

    static class Queue{
        static Stack<Integer> s1=new Stack<>();
        static Stack<Integer> s2=new Stack<>();

        public static boolean isEmpty(){
            return s1.isEmpty();
        }


        //add O(n)
        public static void add(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            
            s1.push(data);

            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }

        //remove function O(1)
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }

            return s1.pop();
        }



        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return s1.peek();
        }

    }

    public static void main(String[] args) {
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
*/












/* 

//Question 02:-Stack using 2 Queues
import java.util.*;

import javax.swing.plaf.nimbus.State;
public class part01 {

    static class Stack{
        static Queue<Integer> q1=new LinkedList<>();
        static Queue<Integer> q2=new LinkedList<>();

        public static boolean isEmpty(){
            return q1.isEmpty() && q2.isEmpty();
        }


        //add 
        public static void push(int data){
            if(!q1.isEmpty()){
                q1.add(data);
            }
            else{
                q2.add(data);
            }
        }

        //pop function 
        public static int pop(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }

            int top=-1;
            //case 1
            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                    top=q1.remove();
                    if(q1.isEmpty()){
                        break;
                    }
                    q2.add(top);
                }
            }
            else{//case 2
                while(!q2.isEmpty()){
                    top=q2.remove();
                    if(q2.isEmpty()){
                        break;
                    }
                    q1.add(top);
                }
            }
            return top;
        }



        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }

            int top=-1;
            //case 1
            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                    top=q1.remove();
                    q2.add(top);
                }
            }
            else{//case 2
                while(!q2.isEmpty()){
                    top=q2.remove();
                    q1.add(top);
                }
            }
            return top;
        }

    }

    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

    }
}
*/



















/* 
//Question 03:-first Non-repeating Letter in a stream of characters.

input:-a a b c c x b  ---->output--->a -1 b b b b x 
a              a
aa            -1
aab            b
aabc           b
aabcc          b
aabccx         b
aabccxb        x


import java.util.*;

public class part01 {

    public static void printNonRepeating(String str){
        int freq[]=new int[26];  //'a' - 'z'
        Queue<Character> q=new LinkedList<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            q.add(ch);
            freq[ch-'a']++;

            while(!q.isEmpty() && freq[q.peek()-'a'] > 1){
                q.remove();
            }

            if(q.isEmpty()){
                System.out.print(-1+" ");
            }
            else{
                System.out.print(q.peek()+" ");
            }

        }
        System.out.println();
    }
    public static void main(String[] args) {
        
        String str="aabccxb";
        printNonRepeating(str);
    }
}
*/

















/* 
Question 05:-Interleave 2 halves of a Queue (even lenght)
1 2 3 4 5 6 7 8 9 10:-input
1 6 2 7 3 8 4 9 5 10:output

import java.util.*;
public class part01 {

    public static void Interleave(Queue<Integer> q){
       Queue<Integer> firstHalf=new LinkedList<>();
       int size=q.size();

       for(int i=0;i<size/2;i++){
        firstHalf.add(q.remove());
       }

       while(!firstHalf.isEmpty()){
        q.add(firstHalf.remove());
        q.add(q.remove());
       }
        
    }
    public static void main(String[] args) {
        
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);

        Interleave(q);
        while(!q.isEmpty()){
            System.out.print(q.remove() + " ");
        }

    }
}
*/


















/* 
Question 05:-Queue REversal
1 2 3 4 5 :-input
5 4 3 2 1:output

import java.util.*;
public class part01 {

    public static void reversal(Queue<Integer> q){
       Stack<Integer> s=new Stack<>();
       while(!q.isEmpty()){
        int c=q.remove();
        s.push(c);
       }

       while(!s.isEmpty()){
        int k=s.peek();
        q.add(k);
        s.pop();
       }
        
    }
    public static void main(String[] args) {
        
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        

        reversal(q);
        while(!q.isEmpty()){
            System.out.print(q.remove() + " ");
        }

    }
}

*/












/* 
----------------------------------------------------------
----------------------------------------------------------
----------------------------------------------------------
----------------------------------------------------------
----------------------------------------------------------
----------------------------------------------------------
----------------------------------------------------------
----------------------------------------------------------
*/

//dequeue and deque are not same
//dequeue means remove element
//enqueue means add element

//Deque:-Double ended queue
/* 
 *Operation of Deque
 1.addFirst()
 2.addLast()
 3.removeFirst()
 4.removeLast()
 5.getFirst()
 6.getLast()

import java.util.*;
public class part01 {
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
*/















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