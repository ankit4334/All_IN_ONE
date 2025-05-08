/*
Copy first list to second list
Given a pointer to the head node of a linked list, copy all the elements in another list and return the head of second list.

Input Format:

First line contains one integer denoting the number of test cases.
For each test case, first line contains the total number of nodes in list i.e. N and next N lines contains the elements of nodes.
The function copyList() takes the head node of a linked list as a parameter and return the head pointer of copied list.
Note: Do not read any input from stdin/console. Each test case calls the copyList method individually and passes it the head of a list.

Output Format:

Print the integer data for each element of the linked list separated by space.
Sample Input

1  // Test Cases
3  // No. of nodes
1  // List Elements
2
3
Sample Output

1 2 3



 
//   class Node {
//     int data;
//     Node next;
//     Node(){}
//     Node(int d) {
//       data=d;
//     }
//   }
//   The above class defines the linked list node.

static Node copyList(Node head) {
    Node t=head;
    Node ans=new Node(-1);
    Node m=ans;
    while(t!=null){
      m.next=new Node(t.data);
      m=m.next;
      t=t.next;
    }
    m.next=null;
    return ans.next;
  }
-------------------------------------------------
Move the Smallest and largest to head and tail of list
Given a pointer to the head node of a linked list, find the smallest and the largest element of this list. Now, move the smallest node to the front and move the largest node to the end of the list.

Example:

Input list:  head -> 5 -> 4 -> 7 -> 3 -> 2 -> 6 -> NULL
Output list: head -> 2 -> 5 -> 4 -> 3 -> 6 -> 7 -> NULL
Complete the function shiftSmallLarge(), which takes the head node of the linked list as a parameter, and returns the updated head pointer after doing both the shifts.

Input Format:

First line contains one integer denoting the number of test cases.
For each test case, first line contains the total number of nodes in list i.e. N and next N lines contains the elements of nodes.
Output Format:

Print the integer data for each element of the linked list separated by space.
Constraints:

1 <= no. of testcases <= 10
0 <= no. of nodes <= 100
0 <= node data <= 1000
Sample Input

1   // Test Cases
7   // N (testcase 1)
12  // linked list elements
8
6
20
1
50
16
Sample Output

1 12 8 6 20 16 50



// * 
//  *  class Node {
//  *    int data;
//  *    Node next;
//  *  };
//  *
//  *  The above class defines the linked list node.
//  *
// // Return the head of updated list
static Node shiftSmallLarge(Node head) {
    if(head==null || head.next==null){
      return head;
    }
    Node max=head;
    Node min=head;
    Node t=head;
    while(t!=null){
      if(t.data>max.data){
        max=t;
      }
      if(t.data<min.data){
        min=t;
      }
      t=t.next;
    }
    if(head!=min){
      t=head;
      while(t.next!=min){
        t=t.next;
      }
      t.next=min.next;
      min.next=head;
      head=min;  
    }
    t=head;
    while(t.next!=max){
      t=t.next;
    }
    t.next=max.next;
    t=head;
    while(t.next!=null){
      t=t.next;
    }
    max.next=null;
    t.next=max;
    return head;
  }
-------------------------------------------------
Find the loop in Linked list
A linked list is a collection of nodes stored in memory through pointers. These pointers may or may not be replicated, which might result in a loop of nodes.

Given a linked-list as input, check whether it contains a loop or not. If there is a loop return the number of nodes in the loop, otherwise return 0.

Complete the function loopInList() which takes the head node of a linked list as a parameter, and returns the number of nodes in loop if exists, 0 otherwise.

Input Format

First line contains the number of Test cases i.e. T.
Each test case contains the following:
  First line will contain N, denoting the number of nodes.
  Next N lines will contain the node's data.
  Last line will contain the starting position of loop in the list. If no loop exists, then this input will be -1.
Output Format

Print the number of nodes in the list involved in a loop.
Constraints

1 <= no. of testcases <= 10
0 <= no. of nodes <= 10^5
﻿0 <= node data <= 1000
Sample Input

1  // test cases
8    // no. of nodes (TC-1)
5 4 9 3 10 2 6 7
2    // This signifies the starting position of the loop (consider 0-based indexing)
Sample Output

6
Explanation

As 9 -> 3 -> 10 -> 2 -> 6



/* 
 *  class Node {
 *    int data;
 *    Node next;
 *  };
 *
 *  The above class defines the linked list node.
 *
class Result {
    static int loopInList(Node head) {
     if(head==null){
       return 0;
     }
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
        return 0;
      }
      int c=1;
      s=s.next;
      while(s!=f){
        s=s.next;
        c++;
      }
      return c;
    }
  }
-------------------------------------------------
Delete a Node in Linked list given access to only that Node
A linked list is a collection of nodes. Where each node contains some data address of the next node, if it is the last node then it contains the data only. This way we can access all the nodes if we have the address of first node.

Now the task is that given a pointer to some node in a linked list, delete it if it is not the last node of the list.

Complete the function deleteNode() which takes the address of the node of a linked list as a parameter and delete this node from the list. (If given node is the last node of the list or if the list is empty, then do nothing.)

Input Format

First line will contain the number of test cases T.
Each test case contains 3 lines. First line has the total number of nodes and second line contains the N values for the nodes.
Third line contains the node number after the head node to be deleted.
Output Format

Print the integer data for each element of the modified linked list separated by space.
Constraints

1 <= no. of testcases <= 10
0 <= no. of nodes <= 10^5
﻿﻿0 <= node data <= 10^6
Sample Input

1  // Test Cases
4
1 5 6 8
2
Sample Output

1 5 8
Explanation:

2 means 2nd node after 


class Result {
  static void deleteNode(Node n1) {
    Node t=n1;
    if(t!=null && t.next!=null){
      t.data=t.next.data;
      t.next=t.next.next;
    }
  }
}
-------------------------------------------------
Swap Two Nodes of Doubly Linked List
Given a pointer to the head node of a doubly linked list and two keys, x and y respectively, swap these two nodes of the list (if these nodes exists in the list).

Note: All the linked list nodes contain distinct data.

Complete the function swapNodes(), which takes the head node of a doubly linked list along with x and y as a parameter, and returns the head of updated list after swapping the two nodes.

Input Format:

First line contains an integer denoting number of test cases.
Each test case has 4 lines. First line contains the number of elements in list, Second line contains the list elements separated by space.
Third and Fourth lines contains the node numbers to be swapped.
Output Format:

Print the integer data for each element of the modified linked list separated by space.
Constraints:

1 <= no. of testcases <= 10
0 <= no. of nodes <= 10^5
﻿﻿0 <= node data <= 10^6
0 <= x, y <= 10^6﻿
Sample Input

1             // test cases
6             // no. of nodes (TC-1)
1 2 3 4 5 6   // node's data
3             // x
5             // y
Sample Output

1 2 5 4 3 6

 
Node swapNodes(Node head, int x, int y) {
  Node t=head;
  Node x1=null;
  Node y1=null;
  while(t!=null){
    if(t.data==x){
      x1=t;
    }
    if(t.data==y){
      y1=t;
    }
    t=t.next;
  }
  if(x1!=null && y1!=null){
    x1.data=y;
    y1.data=x;
  }
  return head;
}
-------------------------------------------------
Given list is circular or not star_border
In circular list the last node points to the first node creating a loop of nodes. Now, given a pointer to the head node of a linked list, find out if it is circular or not.

Complete the function isCircular() given in the editor, which takes the head of the list as parameter and returns 1 if the linked list is circular and 0 otherwise.

Note: If the linked list is empty, then consider it as a circular linked list.

Input

The functions isCircular() takes the head node of a linked list as input.
Output

Return 1 if the given list is circular, else return 0.
Constraints

0 <= no. of nodes <= 10^5
0 <= node data <= 10^6


static int isCircular(Node head) {
  if(head==null){
    return 1;
  }
  Node s=head;
  Node f=head;
  while(f!=null && f.next!=null){
    s=s.next;
    f=f.next.next;
    if(s==f){
     if(s==head){
      return 1;
     }
      return 0;
    }
  }
  return 0;
}
-------------------------------------------------
Insert Nodes in a Circular Linked List
Given a pointer to the head node of a circular linked list, insert the new nodes at beginning or end.

Complete The functions insertBeg() & insertEnd() takes the head node of a linked list and the data to be inserted as parameters insert the specified node and return the new head.

Note: Do not read any input from stdin/console. Each test case calls the insertBeg & insertEnd method individually and passes it the head of a list.

Input Format:

The first line of input consists of an integer T denoting the number of test cases
Then T test cases follow.
First Line of each test contains number of Queries Q
A Query is of 2 types
(a) 1 data: Inserts the data at the beginning of the circular linked list.
(b) 2 data: Inserts the data at the end of the circular linked list.
Output Format:

Print the integer data for each element of the linked list separated by space.
Sample Input

2 // No of Testcases
5 // No of Queries in test case-1
1 // Query-1
1
1 // Query-2
2
1 // Query-3
3
2 // Query -4
4
2 // Query -5
5
3 // No of Queries in test case-2
2 // Query -1
4
1 // Query -2
2
2 // Query -3
6
Sample Output

3 2 1 4 5 
2 4 6


static LinkList insertBeg(LinkList head, int data) {
        LinkList newNode = new LinkList(data);
        if (head == null) {
            newNode.next = newNode;
            return newNode;
        }
        LinkList current = head;
        while (current.next != head) {
            current = current.next;
        }
        newNode.next = head;
        current.next = newNode;
        return newNode;
    }
    static LinkList insertEnd(LinkList head, int data) {
      LinkList newNode = new LinkList(data);
        if (head == null) {
            newNode.next = newNode; 
            return newNode;
        }
        LinkList current = head;
        while (current.next != head) {
            current = current.next;
        }
        current.next = newNode;
        newNode.next = head;
        return head;
    }
-------------------------------------------------
Delete in Circular Linked List
Given a pointer to the head node of a circular linked list, delete the nodes from beginning or end.

Complete the functions deleteBeg() & deleteEnd() that takes the head node of a linked list as parameters delete the specified node and return the new head.

Note: Do not read any input from stdin/console. Each test case calls the deleteBeg & deleteEnd method individually and passes it the head of a list.

Input Format:

First Line contains the number of Nodes in the linked list,N.
Then in the next line, N spaced integers are provided , denoting the elements of the linked list, inserted in beginning of the linked list.
In the next line , an integer , Q is given, denoting the number of queries.
Then Q lines follow, denoting the Query

Query is of 2 types:
(a) 1 : deletes the starting element from the linked list
(b) 2 : deletes the ending element from the linked list 
﻿Output Format:

Print the integer data for each element of the linked list separated by space after performing all the queries.
Sample Input

10 // Number of Nodes in linked list
10 9 8 7 6 5 4 3 2 1 // Nodes in linked list
4 // Number of Queries
1 // Query - 1
2 // Query -2
1 // Query -3
2 // Query -4
﻿Sample Output

3 4 5 6 7 8
Explanation:

Initially the list is 1->2->3->4->5->6->7->8->9->10
After Query-1 list is 2->3->4->5->6->7->8->9->10
After Query-2 list is 2->3->4->5->6->7->8->9
After Query-3 list is 3->4->5->6->7->8->9
After Query-4 list is 3->4->5->6->7->8
The output is 3->4->5->6->7->8



static LinkList deleteBeg(LinkList head){
   if (head == null) {
            return null;
        }
        LinkList last = head;
        while (last.next != head) {
            last = last.next;
        }
        last.next = head.next;
        head = head.next;
        return head;
}
static LinkList deleteEnd(LinkList head){
  if (head == null) {
            return null;
        }
        LinkList current = head;
        while (current.next.next != head) {
            current = current.next;
        }
        current.next = head;
        return head;
}
-------------------------------------------------
Count the Number of Nodes in Circular Linked List star_border
In circular list the last node points to the first node creating a loop of nodes. Now, given a pointer to the head node of a circular linked list, count the total number of elements in it.

Complete the function countNodes() which takes the head node of a circular linked list as a parameter and return the number of nodes in the list.

Input Format:

First line will contain the total number of test cases.
Each test case consists of 2 lines, First line has the number of nodes and second line contains the node values separated by spaces.
Constraints:

1 <= Test Cases <= 100
0 <= no. of nodes <= 10^5
0 <= node data﻿ <= 10^9
Output Format:

Print the total number of nodes in circular list.
Sample Input

1  // Test Cases
3      // no. of nodes (TC-1)
1 2 3  // node's data
Sample Output

3





class Result {
  static int countNodes(Node head) {
    if(head==null){
      return 0;
    }
    int c=1;
    Node t=head;
    while(t.next!=head){
      t=t.next;
      c++;
    }
    return c;
  }
}

-------------------------------------------------
Insert in a sorted circular linked list star_border
A list is called sorted if all successive nodes have non-decreasing/non-increasing values. Now given a pointer to the head node of a sorted circular linked list, insert an element in it.

Complete the function insertSorted() which takes the head node of a circular linked list and the data to be inserted and insert the data in a new node at proper position preserving the sorted property and return the new head.

Input Format:

First line contains an integer denoting the number of test cases.
Each test case has 3 lines. First line has the number of nodes in sorted list, second line contains the elements of list in non-increasing order.
Third line contains a new integer to be inserted in the list.
Output Format:

Print the nodes of circular lists separated by space.
Sample Input

1
5
7 5 4 2 1
6
Sample Output

1 2 4 5 6 7







-------------------------------------------------
Split the Circular Linked List in two parts
A circular linked list is a list in which the last node points back to the first node. It creates a kind of loop in the list hence it is called circular list.

Now, given a pointer to the head node of a circular linked list with even number of nodes, cut it from middle and return the two lists as two separate circular linked lists.

Complete the function listCut() which takes the head node of a circular linked list, so you need to cut the list in two parts and return the pointer to second half of list. The first part will remain in the pointer head.

Input Format:

First line will contain an integer denoting number of test cases.
Each test case will have 2 lines, In first line total number of nodes is written and in 2nd line the node values are given.
Output Format:

Print the nodes of two circular lists separated by space on two lines.
Sample Input

1
4
1 2 3 4
Sample Output

1 2
3 4





class Result {
  static LinkList listCut(LinkList head) {
   if (head == null || head.next == head) {
            return null;
        }
        LinkList slow = head;
        LinkList fast = head;
        while (fast.next != head && fast.next.next != head) {
            slow = slow.next;
            fast = fast.next.next;
        }
        LinkList head2 = slow.next;
    	LinkList head1=head;
        slow.next = head1;
        if (fast.next == head) {
            fast.next = head2;
        } else {
            fast.next.next = head2;
        }
        return head2;
  }
}


-------------------------------------------------

*/