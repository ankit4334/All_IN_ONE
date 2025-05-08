//understanding linked list
/* 
linked list:-A linked list defined as a linear data structure which can store a collection of node.



 ->Which type of memory allocation is referred for Linked List?
  ans->Dynamic memory allocation is referred for Linked List.



  ->What are the main differences between the Linked List and Linear Array?
   Linked list                                             Linear Array
   1.Deletion and insertion are easy.                      1.Deletion and insertion are tough.
   2.In the Linked List, space is not wasted.              2.In Linear Array, space is wasted.
   3.To reach a particular node, we need to                3.We can reach any particular element directly.
   go through all the nodes that come before 
   that particular node.
*/

/* 
import java.util.LinkedList;

public class singlyll {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    //insertion at first
    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return ;
        }

        newNode.next=head;
        head=newNode;
    }


    //insertion at last
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return; 
        }
        tail.next=newNode;
        tail=newNode;
    }



    //insertion at middle
    public void addMiddle(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }

        Node s=head;
        Node f=head;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }

        newNode.next=s.next;
        s.next=newNode;
    }

    //add at index
    public void addAtIndex(int data,int idx){

        if(idx==0){
            addFirst(data);
            return;
        }

        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
        }

        Node t=head;
        int i=0;
        while(i<idx-1){
            t=t.next;
            i++;
        }
        newNode.next=t.next;
        t.next=newNode;
    }



    //Deletion Method
    //01 remove first
    public int deleteFirst(){

        //special case if node is null
        if(head==null){
            return 0;
        }

        //special case if node size is one
        // else{
        //     int val=head.data;
        //     head=tail=null;
        //     return val;
        // }

        int val=head.data;
        head=head.next;
        return val;
    }  

    //02remove last
    public void deleteLast(){
        Node p=head;
        Node q=head.next;
        while(q!=null && q.next!=null){
            q=q.next;
            p=p.next;
        }
        p.next=null;
        tail=p;
    }


    public void Printfuc(){
        if(head==null){
            System.out.println("ll is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    
    public static Node head;
    public static Node tail;
    public static void main(String args[]){
        singlyll ll=new singlyll();
       
        //for addfirst
        ll.addFirst(1);
        ll.addFirst(2 );
        ll.addFirst((6));
        ll.addFirst((8));
        ll.addFirst((7));

        //for addlast
        ll.addLast(3);
        ll.addLast(4);


        //for at middle
        ll.addMiddle(33);


        //insetion at position
        ll.addAtIndex(28,5);
        ll.addAtIndex(12, 0);

        ll.Printfuc();

        System.out.println();

        //deletion function
        ll.deleteFirst();
        ll.Printfuc();

        System.out.println();

        ll.deleteLast();
        ll.Printfuc();
        
    }
    
}
*/




















/*
//Question 01:-Search(Iterative)
->Search for a key in a linked list.return the position where it is found.
if not  found,return -1
*/

/* 
public class singlyll {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    
    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return ;
        }

        newNode.next=head;
        head=newNode;
    }


    
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return; 
        }
        tail.next=newNode;
        tail=newNode;
    }

    public void printfuc(){
        if(head==null){
            System.out.println("ll is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }


    //serch function
    public int linearSearch(int key){
        if(head==null){
            return -1;
        }
        int i=0;
        Node t=head;
        while(t!=null){
            if(t.data==key){
                return i;
            }
            t=t.next;
            i++;
        }
        return -1;

    }

    
    public static Node head;
    public static Node tail;
    public static void main(String args[]){
        singlyll ll=new singlyll();
       
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.printfuc();

        System.out.println();
        System.out.println(ll.linearSearch(3));
        ll.printfuc();
        
    }
    
}

*/




















/*
//Question 01:-Search(Recursive)
->Search for a key in a linked list.return the position where it is found.
if not  found,return -1
*/

/* 
public class singlyll {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    
    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return ;
        }

        newNode.next=head;
        head=newNode;
    }


    
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return; 
        }
        tail.next=newNode;
        tail=newNode;
    }

    public void printfuc(){
        if(head==null){
            System.out.println("ll is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }


    //serch function

    public int helper(Node head,int key){  //O(n)
        if(head==null){
            return -1;
        }

        if(head.data==key){
            return 0;
        }

        int idx=helper(head.next, key);
        if(idx==-1){
            return -1;
        }
        return idx+1;

    }

    public int RecursivelinearSearch(int key){
       
        return helper(head,key);

    }

    
    public static Node head;
    public static Node tail;
    public static void main(String args[]){
        singlyll ll=new singlyll();
       
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.printfuc();

        System.out.println();
        System.out.println(ll.RecursivelinearSearch(4));
        
        
    }
    
}
*/




















/*
//Question 02:-Reverse a Linked List


public class singlyll {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    
    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return ;
        }

        newNode.next=head;
        head=newNode;
    }


    
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return; 
        }
        tail.next=newNode;
        tail=newNode;
    }

    public void printfuc(){
        if(head==null){
            System.out.println("ll is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }


    //reverse a linked list

    public void reverse(){  //O(n)
        
        Node ford=null;
        Node pre=null;
        Node curr=head;

        while(curr!=null){
            ford=curr.next;
            curr.next=pre;
            pre=curr;
            curr=ford;
        }

        head=pre;

    }

    
    public static Node head;
    public static Node tail;
    public static void main(String args[]){
        singlyll ll=new singlyll();
       
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.printfuc();

        System.out.println();
        ll.reverse();
        ll.printfuc();
        
    }
    
}
*/
















/*
//Question 03:-find and Remove Nth node from End;


public class singlyll {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    
    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return ;
        }

        newNode.next=head;
        head=newNode;
    }


    
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return; 
        }
        tail.next=newNode;
        tail=newNode;
    }

    public void printfuc(){
        if(head==null){
            System.out.println("ll is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }


    //find and remove nth node from end;

    public void deleteNthfromEnd(int n){  //O(n)
        
        Node t=head;
        int c=0;
        while(t!=null){
            
            t=t.next;
            c++;
        }


        if(n==c){
            head=head.next; //remove First
            return;
        }



        //given n is from last 
        int sn=c-n;
        int i=1;
        Node p=head;
        while(i<sn){
           
            p=p.next;
            i++;
        }
        p.next=p.next.next;
        return;

    }

    
    public static Node head;
    public static Node tail;
    public static void main(String args[]){
        singlyll ll=new singlyll();
       
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.printfuc();

        System.out.println();
        ll.deleteNthfromEnd(3);
        ll.printfuc();
        
    }
    
}
*/
















/*
//Question 04:-Check if Linked list is a Palindrome;


public class singlyll {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    
    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return ;
        }

        newNode.next=head;
        head=newNode;
    }


    
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return; 
        }
        tail.next=newNode;
        tail=newNode;
    }

    public void printfuc(){
        if(head==null){
            System.out.println("ll is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }


    //cheack if ll is a palindrome 
    public void palindrome(){

        //step 1 find mid
        Node s=head;
        Node f=head;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }

        //step-2 reverse
        Node curr=s;
        Node ford=null;
        Node pre=null;
        while(curr!=null){
            ford=curr.next;
            curr.next=pre;
            pre=curr;
            curr=ford;
        }

        int fl=0;
        Node l=pre;
        Node r=head;
        while(l!=null){
            if(l.data!=r.data){
                fl=1;
            }
            l=l.next;
            r=r.next;
        }

        if(fl==1){
            System.out.println("list is not palindrom");
        }
        else{
            System.out.println("list is palindrom");
        }
       
    }

    
    public static Node head;
    public static Node tail;
    public static void main(String args[]){
        singlyll ll=new singlyll();
       
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(2);
        ll.addLast(1);
        ll.printfuc();

        ll.palindrome();
        
        
    }
    
}
*/






/*
//Question 05:-Detect a Loop/Cycle in a linkedList:-
public class singlyll {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    
    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return ;
        }

        newNode.next=head;
        head=newNode;
    }


    
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return; 
        }
        tail.next=newNode;
        tail=newNode;
    }

    public void printfuc(){
        if(head==null){
            System.out.println("ll is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }


    //Detect a loop/cycle in a ll ->floyd's cycle finding Algorithm
    public boolean isCycle(){
        Node s=head;
        Node f=head;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
            if(s==f){
                return true;  //cycle exists
            }
        }

        return false;
    }
    
    
    public static Node head;
    public static Node tail;
    public static void main(String args[]){
        singlyll ll=new singlyll();
       
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(2);
        ll.addLast(1);
        ll.printfuc();

        System.out.println(ll.isCycle());
        
        
    }
    
}
*/













/*

//Question 06:-Remove a Loop/Cycle in a linkedList:-
public class singlyll {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    
    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return ;
        }

        newNode.next=head;
        head=newNode;
    }


    
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return; 
        }
        tail.next=newNode;
        tail=newNode;
    }

    public void printfuc(){
        if(head==null){
            System.out.println("ll is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }


    //Remove Cycle
    public static void removeCycle(){
        //detect cycle
        Node s=head;
        Node f=head;
        int fl=0;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
            if(s==f){
                fl=1;
                break;
            }
        }
        if(fl==0){
            System.out.println("cycle not presant");
        }

        //find meeting point
        s=head;
        Node pre=null;
        while(s!=f){
            pre=f;
            s=s.next;
            f=f.next;
        }

        //remove cycle ->last.next=null;
        pre.next=null;
    }
    
    
    public static Node head;
    public static Node tail;
    public static void main(String args[]){
        singlyll ll=new singlyll();
       
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(2);
        ll.addLast(1);
        ll.printfuc();

        ll.removeCycle();
        
        
    }
    
}
*/













/* 
//ll in java Collections Framework
import java.util.LinkedList;
import java.util.*;
public class singlyll{
    public static void main(String[] args) {
       //create 
       LinkedList<Integer> ll=new LinkedList<>();
       //add
       ll.addLast(1);
       ll.addLast(2);
       ll.addFirst(0);
       System.out.println(ll);

       //remove
       ll.removeLast();
       ll.removeFirst();
       System.out.println(ll);
    }
}
*/















/*
*Question->Merge Sort on linked list:-


public class singlyll {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    
    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return ;
        }

        newNode.next=head;
        head=newNode;
    }


    
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return; 
        }
        tail.next=newNode;
        tail=newNode;
    }

    public void printfuc(){
        if(head==null){
            System.out.println("ll is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }


    //MergeSort
    public Node getMid(){
        Node s=head;
        Node f=head.next; //here head.next isliye le rahe hai taki hum even number node wale me mid ko null kar sake
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        return s;
    }

    public Node merge(Node newLeft,Node newRight){
        Node mergeNode=new Node(-1);
        Node t=mergeNode;

        while(newLeft!=null && newRight!=null){
            if(newLeft.data<=newRight.data){
                t.next=newLeft.next;
                newLeft=newLeft.next;
                t=t.next;
            }
            else{
                t.next=newRight.next;
                newRight=newRight.next;
                t=t.next;

            }
        }



        while(newLeft!=null){
            t.next=newLeft.next;
            newLeft=newLeft.next;
            t=t.next;
        }


        while( newRight!=null){
            t.next=newRight.next;
            newRight=newRight.next;
            t=t.next;
        }

        return mergeNode.next; //because hame -1 ke aage ke element chahiye

    }

    public Node mergeSort(Node head){
        if(head==null || head.next==null){
            return head;
        }
        //find mid
        Node mid=getMid();

        //left && right mergeSort
        Node righHead=mid.next;
        mid.next=null;
        Node newLeft=mergeSort(head);
        Node newRight=mergeSort(righHead);

        //merge
        return merge(newLeft,newRight);



    }
    
    
    
    public static Node head;
    public static Node tail;
    public static void main(String args[]){
        singlyll ll=new singlyll();
       
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.printfuc();

        System.out.println();

        ll.head=ll.mergeSort(ll.head);
        ll.printfuc();
        
        
    }
    
}

*/














/*
*Question->Zig-Zag Linked list->
for a linked list of the form:1-2-3-4-....n-1-n
convert it into a zig-zag form i.e:1,n,2,n-1,3,..
*/

public class singlyll {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    
    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return ;
        }

        newNode.next=head;
        head=newNode;
    }


    
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return; 
        }
        tail.next=newNode;
        tail=newNode;
    }

    public void printfuc(){
        if(head==null){
            System.out.println("ll is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }


    //zigZag
    public void zigZag(){
        //find mid
        Node s=head;
        Node f=head.next;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        
        Node mid=s;

        //reverse 2nd half
        Node curr=mid.next;
        mid.next=null;
        Node pre=null;
        Node ford=null;
        while(curr!=null){
            ford=curr.next;
            curr.next=pre;
            pre=curr;
            curr=ford;
        }

        Node left=head;
        Node right=pre;
        Node nextL,nextR;

        //alternate merge/zigZag merge
        while(left!=null && right!=null){
            nextL=left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextL;

            left=nextL;
            right=nextR;
        }
    }
    
    
    
    public static Node head;
    public static Node tail;
    public static void main(String args[]){
        singlyll ll=new singlyll();
       
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.printfuc();

        System.out.println();

        ll.zigZag();       
        ll.printfuc();
        
        
    }
    
}
