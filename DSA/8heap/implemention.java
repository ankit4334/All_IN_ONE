/*
 ->Heaps/Priority Queues
 with the help of heap created proority queues;


 ->if Integer value less then priority values is high.

*/



/* 
import java.util.PriorityQueue;
//for implements the priorityQueue import priorityQueue;
import java.util.*;
public class implemention {
    public static void main(String[] args) {
        
        //add()  O(logn)
        //remove O(logn)
        //peek() O(1)

        //creation of priorityQueue
        // PriorityQueue<Integer> p=new PriorityQueue<>();

        //it is use for reverse ordering
        PriorityQueue<Integer> p=new PriorityQueue<>(Comparator.reverseOrder());
        p.add(3);
        p.add(4);
        p.add(1);
        p.add(9);

        //print the element
        while(!p.isEmpty()){
            System.out.println(p.peek());
            p.remove(); 
        }
         

    }
    
}


*/










/* 

//add object type data in priorityQueue;

import java.util.PriorityQueue;
import java.util.*;
public class implemention {
    static class Student implements Comparable<Student>{
        String name;
        int rank;

        public Student(String name,int rank){
            this.name=name;
            this.rank=rank;
        }

        @Override
        public int compareTo(Student s2){
            return this.rank-s2.rank;
        }


    }
    public static void main(String[] args) {
        
        PriorityQueue<Student> p=new PriorityQueue<>();

        p.add(new Student("A", 4));
        p.add(new Student("c", 9));
        p.add(new Student("z", 1));
        p.add(new Student("q", 7));

        //print the element
        while(!p.isEmpty()){
            System.out.println(p.peek().name+"->"+p.peek().rank);
            p.remove(); 
        }
         

    }
    
}


*/







/*
  -> Heap:-A Heap is a complete binary tree data structure that 
    satisfies the heap property: for every node, the value of 
    its children is less than or equal to its own value. Heaps 
    are usually used to implement priority queues, where the 
    smallest (or largest) element is always at the root of the tree.


   -> Types of Heaps
    Ans:-There are two main types of heaps:
    1.Max Heap: The root node contains the maximum value, 
    and the values decrease as you move down the tree.

    2.Min Heap: The root node contains the minimum value, 
    and the values increase as you move down the tree.
    
  ->Binary Tree:-at most 2 children
 
 ->complete binary tree(CBT):-cbt is a bt in which all the levels are completely filled except
  possibly the last once, which one,which is filled from the left to right.


 *Heap Order Property:-
 children >=parent(minHeap)
 children <=parent(maxHeap)
 
*/













/* 
//creating heap time complexity is TC=O(NlogN);
import java.util.*;
public class implemention{
    static class Heap{
        ArrayList<Integer> arr=new ArrayList<>();


        public void add(int data){
            arr.add(data);

            int x=arr.size()-1;   //x is child index;
            int par=(x-1)/2;    //parent index

            while(arr.get(x) < arr.get(par)){
                //swap
                int t=arr.get(x);
                arr.set(x,arr.get(par));
                arr.set(par,t);

                x=par;
                par=(x-1)/2;

            }
        } 

        public int peek(){
            return arr.get(0);
        }


        private void heapify(int i){  //O(logn)
            int left=2*i+1;
            int right=2*i+2;
            int minIdx=i;

            if(left < arr.size() && arr.get(minIdx) > arr.get(left)){
                minIdx=left;
            }

            if(right < arr.size() && arr.get(minIdx) > arr.get(right)){
                minIdx=right;
            }

            if(minIdx!=i){
                //swap
                int t=arr.get(i);
                arr.set(i,arr.get(minIdx));
                arr.set(minIdx,t);

                heapify(minIdx);
            }
        }


        public int remove(){
            int data=arr.get(0);

            //step1-swap first & last
            int temp=arr.get(0);
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1,temp);

            //step2-delete last
            arr.remove(arr.size()-1);

            //step3-heapify
            heapify(0);
            return data;
        }

        public boolean isEmpty(){
            return arr.size()==0;
        }

    }
    public static void main(String[] args) {
       Heap h=new Heap();
       h.add(3);
       h.add(4);
       h.add(1);
       h.add(5);


       while(!h.isEmpty()){
        System.out.println(h.peek());
        h.remove();
       }
       

    }
}
*/







//creating heap using arr by coder army;
class implemention{
    static class MaxHeap{
        int arr[];
        int size;   //total element in heap;
        int total_size; //total size of array;

        MaxHeap(int n){
            arr=new int[n];
            size=0;
            total_size=n;
        }


        //insert into the heap
        public void insert(int value){
            //if heap size is available or not
            if(size==total_size){
                System.out.print("Heap OverFlow \n");
                return;
            }

            arr[size]=value;
            int index=size; //here index is child index
            size++;
            //Compare it with its parent
            while(index > 0 && arr[(index-1)/2] < arr[index]){
                int ele=arr[index];
                arr[index]=arr[(index-1)/2];
                arr[(index-1)/2]=ele;
                index=(index-1)/2;
            }

            System.out.println(arr[index]+" is inserted into the heap");

        }

        //delete in heap
        public void delete(){
            if(size==0){
                System.out.println("Heap UnderFlow");
                return;
            }

            System.out.println(arr[0]+"deleted form the heap");
            arr[0]=arr[size-1];
            size--;

            if(size==0) return;

            heapify(0);

        }

        //heapify funtion
        public void heapify(int index){
            int largest=index;
            int left=2*index+1;
            int right=2*index+2;

            //Largest will store the index of the element which
            //is greate between parent,left and right child;
            if(left<size && arr[left] > arr[largest]){
                largest=left;
            }
            if(right < size && arr[right] > arr[largest]){
                largest=right;
            }

            if(largest!=index){
                int t=arr[index];
                arr[index]=arr[largest];
                arr[largest]=t;
                heapify(largest);
            }
        }

        void print(){
            for(int i=0;i<size;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        
    }

    
    public static void main(String[] args) {
        MaxHeap h=new MaxHeap(6);  
        h.insert(4);
        h.insert(14);
        h.insert(11);
        h.delete();
        h.print();
        h.insert(114);
        h.insert(24);
        h.insert(1);
        h.insert(10);
        h.delete();
        h.delete();
        h.delete();

        h.print();
            

    }
}