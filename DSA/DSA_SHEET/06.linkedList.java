// linked list question

/*
 * Reverse a linked list
 * EasyAccuracy: 73.11%Submissions: 283K+Points: 2
 * Internship Alert
 * New month-> Fresh Chance to top the leaderboard and get SDE Internship!
 * 
 * banner
 * Given a linked list of N nodes. The task is to reverse this list.
 * 
 * Example 1:
 * 
 * Input:
 * LinkedList: 1->2->3->4->5->6
 * Output: 6 5 4 3 2 1
 * Explanation: After reversing the list,
 * elements are 6->5->4->3->2->1.
 * Example 2:
 * 
 * Input:
 * LinkedList: 2->7->8->9->10
 * Output: 10 9 8 7 2
 * Explanation: After reversing the list,
 * elements are 10->9->8->7->2.
 * Your Task:
 * The task is to complete the function reverseList() with head reference as the
 * only argument and should return new head after reversing the list.
 * 
 * Expected Time Complexity: O(N).
 * Expected Auxiliary Space: O(1).
 * 
 * Constraints:
 * 1 <= N <= 104
 * 
 * 
 * 
 * Company Tags
 * 
 * class Solution
 * {
 * //Function to reverse a linked list.
 * Node reverseList(Node head)
 * {
 * Node curr=head;
 * Node pre=null;
 * while(curr!=null){
 * Node ford=curr.next;
 * curr.next=pre;
 * pre=curr;
 * curr=ford;
 * 
 * }
 * 
 * return pre;
 * }
 * }
*/






/*
 * Reverse a Linked List in groups of given size
 * MediumAccuracy: 57.08%Submissions: 196K+Points: 4
 * Internship Alert
 * New month-> Fresh Chance to top the leaderboard and get SDE Internship!
 * 
 * banner
 * Given a linked list of size N. The task is to reverse every k nodes (where k
 * is an input to the function) in the linked list. If the number of nodes is
 * not a multiple of k then left-out nodes, in the end, should be considered as
 * a group and must be reversed (See Example 2 for clarification).
 * 
 * Example 1:
 * 
 * Input:
 * LinkedList: 1->2->2->4->5->6->7->8
 * K = 4
 * Output: 4 2 2 1 8 7 6 5
 * Explanation:
 * The first 4 elements 1,2,2,4 are reversed first
 * and then the next 4 elements 5,6,7,8. Hence, the
 * resultant linked list is 4->2->2->1->8->7->6->5.
 * Example 2:
 * 
 * Input:
 * LinkedList: 1->2->3->4->5
 * K = 3
 * Output: 3 2 1 5 4
 * Explanation:
 * The first 3 elements are 1,2,3 are reversed
 * first and then elements 4,5 are reversed.Hence,
 * the resultant linked list is 3->2->1->5->4.
 * Your Task:
 * You don't need to read input or print anything. Your task is to complete the
 * function reverse() which should reverse the linked list in group of size k
 * and return the head of the modified linked list.
 * 
 * Expected Time Complexity : O(N)
 * Expected Auxilliary Space : O(1)
 * 
 * Constraints:
 * 1 <= N <= 105
 * 1 <= k <= N
 * Company Tags
 * class Solution
 * {
 * public static Node reverse(Node node, int k)
 * {
 * 
 * if(node==null){
 * return node;
 * }
 * 
 * 
 * Node curr=node;
 * Node prev=null;
 * Node forword=null;
 * int c=1;
 * while(curr!=null && c<=k){
 * forword=curr.next;
 * curr.next=prev;
 * prev=curr;
 * curr=forword;
 * c++;
 * 
 * }
 * 
 * if(forword!=null){
 * node.next=reverse(forword,k);
 * 
 * }
 * 
 * return prev;
 * 
 * }
 * }
 */

/*
 * Detect Loop in linked list
 * EasyAccuracy: 43.49%Submissions: 402K+Points: 2
 * Internship Alert
 * New month-> Fresh Chance to top the leaderboard and get SDE Internship!
 * 
 * banner
 * Given a linked list of N nodes. The task is to check if the linked list has a
 * loop. Linked list can contain self loop.
 * 
 * Example 1:
 * 
 * Input:
 * N = 3
 * value[] = {1,3,4}
 * x(position at which tail is connected) = 2
 * Output: True
 * Explanation: In above test case N = 3.
 * The linked list with nodes N = 3 is
 * given. Then value of x=2 is given which
 * means last node is connected with xth
 * node of linked list. Therefore, there
 * exists a loop.
 * Example 2:
 * 
 * Input:
 * N = 4
 * value[] = {1,8,3,4}
 * x = 0
 * Output: False
 * Explanation: For N = 4 ,x = 0 means
 * then lastNode->next = NULL, then
 * the Linked list does not contains
 * any loop.
 * Your Task:
 * The task is to complete the function detectloop() which contains reference to
 * the head as only argument. This function should return true if linked list
 * contains loop, else return false.
 * 
 * Expected Time Complexity: O(N)
 * Expected Auxiliary Space: O(1)
 * 
 * Constraints:
 * 1 ≤ N ≤ 104
 * 1 ≤ Data on Node ≤ 103
 * 
 * Company Tags
 * 
 * class Solution {
 * //Function to check if the linked list has a loop.
 * public static boolean detectLoop(Node head){
 * Node f=head;
 * Node s=head;
 * 
 * while(f!=null && f.next!=null){
 * f=f.next.next;
 * s=s.next;
 * if(s==f){
 * return true;
 * }
 * }
 * 
 * return false;
 * 
 * }
 * }
 */

/*
 * Remove loop in Linked List
 * MediumAccuracy: 27.66%Submissions: 431K+Points: 4
 * Internship Alert
 * New month-> Fresh Chance to top the leaderboard and get SDE Internship!
 * 
 * banner
 * Given a linked list of N nodes such that it may contain a loop.
 * 
 * A loop here means that the last node of the link list is connected to the
 * node at position X(1-based index). If the link list does not have any loop,
 * X=0.
 * 
 * Remove the loop from the linked list, if it is present, i.e. unlink the last
 * node which is forming the loop.
 * 
 * 
 * Example 1:
 * 
 * Input:
 * N = 3
 * value[] = {1,3,4}
 * X = 2
 * Output: 1
 * Explanation: The link list looks like
 * 1 -> 3 -> 4
 * ^ |
 * |____|
 * A loop is present. If you remove it
 * successfully, the answer will be 1.
 * 
 * Example 2:
 * 
 * Input:
 * N = 4
 * value[] = {1,8,3,4}
 * X = 0
 * Output: 1
 * Explanation: The Linked list does not
 * contains any loop.
 * 
 * Example 3:
 * 
 * Input:
 * N = 4
 * value[] = {1,2,3,4}
 * X = 1
 * Output: 1
 * Explanation: The link list looks like
 * 1 -> 2 -> 3 -> 4
 * ^ |
 * |______________|
 * A loop is present.
 * If you remove it successfully,
 * the answer will be 1.
 * 
 * Your Task:
 * You don't need to read input or print anything. Your task is to complete the
 * function removeLoop() which takes the head of the linked list as the input
 * parameter. Simply remove the loop in the list (if present) without
 * disconnecting any nodes from the list.
 * Note: The generated output will be 1 if your submitted code is correct.
 * 
 * 
 * Expected time complexity: O(N)
 * Expected auxiliary space: O(1)
 * 
 * 
 * Constraints:
 * 1 ≤ N ≤ 10^4
 * 
 * Company Tags
 * class Solution
 * {
 * //Function to remove a loop in the linked list.
 * public static void removeLoop(Node head){
 * Node s=head;
 * Node f=head;
 * int fl=0;
 * while(f!=null && f.next!=null){
 * s=s.next;
 * f=f.next.next;
 * 
 * if(s==f){
 * fl=1;
 * break;
 * }
 * }
 * 
 * if(fl==0){
 * return;
 * }
 * 
 * if(s==head){
 * while(f.next!=s){
 * f=f.next;
 * 
 * }
 * f.next=null;
 * }
 * else{
 * s=head;
 * Node pre=null;
 * while(s!=f){
 * pre=f;
 * s=s.next;
 * f=f.next;
 * }
 * 
 * pre.next=null;
 * }
 * 
 * }
 * }
 */

/*
 * Find the first node of loop in linked list
 * EasyAccuracy: 55.49%Submissions: 42K+Points: 2
 * Internship Alert
 * New month-> Fresh Chance to top the leaderboard and get SDE Internship!
 * 
 * banner
 * Given a singly linked list of N nodes. Find the first node of the loop if the
 * linked list has a loop. If a loop is present return the node data of the
 * first node of the loop else return -1.
 * 
 * Example 1:
 * 
 * Input:
 * 
 * Output: 3
 * Explanation:
 * We can see that there exists a loop
 * in the given linked list and the first
 * node of the loop is 3.
 * 
 * 
 * Example 2:
 * 
 * Input:
 * 
 * Output: -1
 * Explanation: No loop exists in the above
 * linked list.So the output is -1.
 * 
 * 
 * Your Task:
 * The task is to complete the function findFirstNode() which contains reference
 * to the head as only argument. This function should return the value of the
 * first node of the loop if the linked list contains a loop, else return -1.
 * 
 * 
 * 
 * Expected Time Complexity: O(N)
 * Expected Auxiliary Space: O(1)
 * 
 * 
 * 
 * Constraints:
 * 1 <= N <= 105
 * 1 <= Data on Node <= 106
 * 0 <= pos <= N
 * 
 * Topic Tags
 * 
 * class Solution {
 * //Function to find first node if the linked list has a loop.
 * public static int findFirstNode(Node head){
 * if(head==null || head.next==null){
 * return -1;
 * }
 * 
 * Node s=head;
 * Node f=head;
 * int fl=0;
 * while(f!=null && f.next!=null){
 * s=s.next;
 * f=f.next.next;
 * if(s==f){
 * fl=1;
 * break;
 * }
 * }
 * 
 * if(fl==0){
 * return -1;
 * }
 * 
 * s=head;
 * while(s!=f){
 * s=s.next;
 * f=f.next;
 * }
 * return s.data;
 * }
 * }
 */

/*
 * Remove duplicate element from sorted Linked List
 * EasyAccuracy: 49.37%Submissions: 271K+Points: 2
 * Internship Alert
 * New month-> Fresh Chance to top the leaderboard and get SDE Internship!
 * 
 * banner
 * Given a singly linked list consisting of N nodes. The task is to remove
 * duplicates (nodes with duplicate values) from the given list (if exists).
 * Note: Try not to use extra space. The nodes are arranged in a sorted way.
 * 
 * Example 1:
 * 
 * Input:
 * LinkedList: 2->2->4->5
 * Output: 2 4 5
 * Explanation: In the given linked list
 * 2 ->2 -> 4-> 5, only 2 occurs more
 * than 1 time. So we need to remove it once.
 * Example 2:
 * 
 * Input:
 * LinkedList: 2->2->2->2->2
 * Output: 2
 * Explanation: In the given linked list
 * 2 ->2 ->2 ->2 ->2, 2 is the only element
 * and is repeated 5 times. So we need to remove
 * any four 2.
 * Your Task:
 * The task is to complete the function removeDuplicates() which takes the head
 * of input linked list as input. The function should remove the duplicates from
 * linked list and return the head of the linkedlist.
 * 
 * Expected Time Complexity : O(N)
 * Expected Auxilliary Space : O(1)
 * 
 * Constraints:
 * 1 <= Number of nodes <= 105
 * 
 * Company Tags
 * 
 * class GfG
 * {
 * //Function to remove duplicates from sorted linked list.
 * Node removeDuplicates(Node head)
 * {
 * if(head==null){
 * return head;
 * }
 * 
 * Node s=head;
 * // Node f=head.next;
 * while(s!=null && s.next!=null){
 * if(s.data==s.next.data){
 * s.next=s.next.next;
 * }
 * else{
 * s=s.next;
 * }
 * }
 * 
 * return head;
 * }
 * }
 */

/*
 * Remove duplicates from an unsorted linked list
 * EasyAccuracy: 45.95%Submissions: 219K+Points: 2
 * Internship Alert
 * New month-> Fresh Chance to top the leaderboard and get SDE Internship!
 * 
 * banner
 * Given an unsorted linked list of N nodes. The task is to remove duplicate
 * elements from this unsorted Linked List. When a value appears in multiple
 * nodes, the node which appeared first should be kept, all others duplicates
 * are to be removed.
 * 
 * Example 1:
 * 
 * Input:
 * N = 4
 * value[] = {5,2,2,4}
 * Output: 5 2 4
 * Explanation:Given linked list elements are
 * 5->2->2->4, in which 2 is repeated only.
 * So, we will delete the extra repeated
 * elements 2 from the linked list and the
 * resultant linked list will contain 5->2->4
 * Example 2:
 * 
 * Input:
 * N = 5
 * value[] = {2,2,2,2,2}
 * Output: 2
 * Explanation:Given linked list elements are
 * 2->2->2->2->2, in which 2 is repeated. So,
 * we will delete the extra repeated elements
 * 2 from the linked list and the resultant
 * linked list will contain only 2.
 * Your Task:
 * You have to complete the method removeDuplicates() which takes 1 argument:
 * the head of the linked list. Your function should return a pointer to a
 * linked list with no duplicate element.
 * 
 * Expected Time Complexity: O(N)
 * Expected Auxiliary Space: O(N)
 * 
 * Constraints:
 * 1 <= size of linked lists <= 106
 * 0 <= numbers in list <= 104
 * 
 * 
 * 
 * Company Tags
 * 
 * class Solution
 * {
 * //Function to remove duplicates from unsorted linked list.
 * public Node removeDuplicates(Node head)
 * {
 * HashSet<Integer> h=new HashSet<>();
 * Node t=head;
 * 
 * Node m=new Node(-1);
 * Node d=m;
 * 
 * while(t!=null){
 * if(!h.contains(t.data)){
 * h.add(t.data);
 * d.next=t;
 * t=t.next;
 * d=d.next;
 * 
 * }
 * else{
 * t=t.next;
 * }
 * 
 * }
 * d.next=null;
 * return m.next;
 * }
 * }
 */

/*
 * Deleting and Adding the last node
 * Easy
 * 40/40
 * Average time to solve is 10m
 * Contributed by
 * 11 upvotes
 * Asked in companies
 * Problem statement
 * You are provided with a singly linked list, all you have to do is to delete
 * the last node of the linked list and add it to the front of the linked list.
 * 
 * Example:
 * 
 * 
 * Please note that the linked list will only contain numeric values.
 * 
 * Detailed explanation ( Input/output format, Notes, Images )
 * Constraints:
 * 1 <= T <= 10
 * 0 <= N <= 10000
 * -10^4 <= LIST[i] <= 10^4
 * 
 * Where 'N' is the total number of nodes in the given linked list. ‘LIST[i]’
 * represents the node value of the node ‘i’.
 * 
 * Time limit: 1 sec
 * Sample Input 1:
 * 2
 * 2 5 3 11 1 -1
 * 2 -1
 * Sample Output 1:
 * 1 2 5 3 11 -1
 * 2 -1
 * Explanation of Sample Output 1:
 * In test case 1, the new linked list after doing delete and add operations to
 * the last node: 1 2 5 3 11 -1.
 * 
 * In test case 2, the linked list has only one node and so, the last node is
 * itself at the front.
 * Sample Input 2:
 * 2
 * 4 3 -1
 * 1 1 1 1 -1
 * Sample Output 2:
 * 3 4 -1
 * 1 1 1 1 -1
 * Explanation for Sample Output 2:
 * In test case 1, the new linked list after doing delete and add operations to
 * the last node: 3 4 -1.
 * 
 * In test case 2, the new linked list after swapping first and last nodes: 1 1
 * 1 1 -1.
 * 
 * 
 * Node *delAddLastNode(Node *head){
 * if(head == NULL || head->next == NULL){
 * return head;
 * }
 * 
 * Node *temp = head;
 * Node *prev = NULL;
 * 
 * while(temp->next != NULL){
 * prev = temp;
 * temp = temp->next;
 * }
 * 
 * prev->next = NULL;
 * temp->next = head;
 * return temp;
 * }
 */

/*
 * Add 1 to a number represented as linked list
 * MediumAccuracy: 31.91%Submissions: 182K+Points: 4
 * Internship Alert
 * New month-> Fresh Chance to top the leaderboard and get SDE Internship!
 * 
 * banner
 * A number N is represented in Linked List such that each digit corresponds to
 * a node in linked list. You need to add 1 to it.
 * 
 * Example 1:
 * 
 * Input:
 * LinkedList: 4->5->6
 * Output: 457
 * Explanation: 4->5->6 represents 456 and when 1 is added it becomes 457.
 * Example 2:
 * 
 * Input:
 * LinkedList: 1->2->3
 * Output: 124
 * Your Task:
 * Your task is to complete the function addOne() which takes the head of the
 * linked list as the only argument and returns the head of the modified linked
 * list. The driver code prints the number.
 * Note: The head represents the left-most digit of the number.
 * 
 * Expected Time Complexity: O(N).
 * Expected Auxiliary Space: O(1).
 * 
 * Constraints:
 * 1 <= N <= 1021
 * 
 * Company Tags
 * 
 * class Solution
 * {
 * 
 * public static Node reverse(Node head)
 * {
 * Node pre=null;
 * Node curr=head;
 * Node ford=null;
 * while(curr!=null){
 * ford=curr.next;
 * curr.next=pre;
 * pre=curr;
 * curr=ford;
 * }
 * return pre;
 * }
 * 
 * public static Node addOne(Node head)
 * {
 * // head=reverse(head);
 * // Node t=head;
 * // while(t!=null){
 * // if((t.next==null) && (t.data==9)){
 * // t.data=0;
 * // Node d=new Node(1);
 * // t.next=d;
 * // t=t.next;
 * // break;
 * // }
 * // else if(t.data==9){
 * // t.data=0;
 * // t=t.next;
 * // }
 * // else{
 * // t.data=t.data+1;
 * // t=t.next;
 * // break;
 * // }
 * // }
 * 
 * // return reverse(head);
 * 
 * 
 * 
 * 
 * 
 * 
 * head=reverse(head);
 * boolean f=true;
 * Node curr=head;
 * while(curr!=null && f==true){
 * if(curr.next==null && curr.data==9){
 * curr.data=1;
 * Node t=new Node(0);
 * t.next=head;
 * head=t;
 * curr=curr.next;
 * }
 * else if(curr.data==9){
 * curr.data=0;
 * curr=curr.next;
 * }
 * else{
 * curr.data=curr.data+1;
 * curr=curr.next;
 * f=false;
 * }
 * }
 * 
 * head=reverse(head);
 * return head;
 * 
 * 
 * 
 * 
 * 
 * 
 * }
 * }
 */

/*
 * Add two numbers represented by linked lists
 * MediumAccuracy: 34.52%Submissions: 226K+Points: 4
 * Internship Alert
 * New month-> Fresh Chance to top the leaderboard and get SDE Internship!
 * 
 * banner
 * Given two decimal numbers represented by two linked lists of size N and M
 * respectively. The task is to return a linked list that represents the sum of
 * these two numbers.
 * 
 * For example, the number 190 will be represented by the linked list,
 * 1->9->0->null, similarly 25 by 2->5->null. Sum of these two numbers is 190 +
 * 25 = 215, which will be represented by 2->1->5->null. You are required to
 * return the head of the linked list 2->1->5->null.
 * 
 * Example 1:
 * 
 * Input:
 * N = 2
 * valueN[] = {4,5}
 * M = 3
 * valueM[] = {3,4,5}
 * Output: 3 9 0
 * Explanation: For the given two linked
 * list (4 5) and (3 4 5), after adding
 * the two linked list resultant linked
 * list will be (3 9 0).
 * Example 2:
 * 
 * Input:
 * N = 2
 * valueN[] = {6,3}
 * M = 1
 * valueM[] = {7}
 * Output: 7 0
 * Explanation: For the given two linked
 * list (6 3) and (7), after adding the
 * two linked list resultant linked list
 * will be (7 0).
 * Your Task:
 * The task is to complete the function addTwoLists() which has node reference
 * of both the linked lists and returns the head of the sum list.
 * 
 * Expected Time Complexity: O(N+M)
 * Expected Auxiliary Space: O(Max(N,M)) for the resultant list.
 * 
 * Constraints:
 * 1 <= N, M <= 5000
 * 
 * Company Tags
 * 
 * class Solution{
 * 
 * static Node reverse(Node head){
 * Node curr=head;
 * Node ford=null;
 * Node pre=null;
 * while(curr!=null){
 * ford=curr.next;
 * curr.next=pre;
 * pre=curr;
 * curr=ford;
 * }
 * return pre;
 * }
 * 
 * static Node addTwoLists(Node first, Node second){
 * 
 * 
 * first=reverse(first);
 * second=reverse(second);
 * 
 * int c=0;
 * Node ans=new Node(-1);
 * Node t=ans;
 * while(first!=null || second!=null || c==1){
 * int sum=0;
 * 
 * if(first!=null){
 * sum+=first.data;
 * first=first.next;
 * }
 * 
 * if(second!=null){
 * sum+=second.data;
 * second=second.next;
 * }
 * 
 * sum+=c;
 * c=sum/10;
 * Node node=new Node(sum%10);
 * t.next=node;
 * t=t.next;
 * 
 * 
 * }
 * 
 * return reverse(ans.next);
 * 
 * }
 * }
 */

/*
 * Intersection of two sorted Linked lists
 * EasyAccuracy: 48.63%Submissions: 132K+Points: 2
 * Internship Alert
 * New month-> Fresh Chance to top the leaderboard and get SDE Internship!
 * 
 * banner
 * Given two linked lists sorted in increasing order, create a new linked list
 * representing the intersection of the two linked lists. The new linked list
 * should be made with without changing the original lists.
 * 
 * Note: The elements of the linked list are not necessarily distinct.
 * 
 * Example 1:
 * 
 * Input:
 * LinkedList1 = 1->2->3->4->6
 * LinkedList2 = 2->4->6->8
 * Output: 2 4 6
 * Explanation: For the given two
 * linked list, 2, 4 and 6 are the elements
 * in the intersection.
 * Example 2:
 * 
 * Input:
 * LinkedList1 = 10->20->40->50
 * LinkedList2 = 15->40
 * Output: 40
 * Your Task:
 * You don't have to take any input of print anything. Your task is to complete
 * the function findIntersection(), which will take head of both of the linked
 * lists as input and should find the intersection of two linked list and add
 * all the elements in intersection to the third linked list and return the head
 * of the third linked list.
 * 
 * Expected Time Complexity : O(n+m)
 * Expected Auxilliary Space : O(n+m)
 * Note: n, m are the size of the respective linked lists.
 * 
 * Constraints:
 * 1 <= size of linked lists <= 5000
 * 1 <= Data in linked list nodes <= 104
 * 
 * Company Tags
 * 
 * class Solution
 * {
 * public static Node findIntersection(Node head1, Node head2)
 * {
 * Node temp1=head1;
 * Node temp2=head2;
 * 
 * Node d=new Node(-1);
 * Node t=d;
 * while(temp1!=null && temp2!=null){
 * if(temp1.data==temp2.data){
 * t.next=new Node(temp1.data);
 * temp1=temp1.next;
 * temp2=temp2.next;
 * t=t.next;
 * }
 * else if(temp1.data<temp2.data){
 * temp1=temp1.next;
 * }
 * else{
 * temp2=temp2.next;
 * }
 * }
 * 
 * return d.next;
 * }
 * }
 */

/*
 * Intersection Point in Y Shaped Linked Lists
 * MediumAccuracy: 44.67%Submissions: 256K+Points: 4
 * Internship Alert
 * New month-> Fresh Chance to top the leaderboard and get SDE Internship!
 * 
 * banner
 * Given two singly linked lists of size N and M, write a program to get the
 * point where two linked lists intersect each other.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input:
 * LinkList1 = 3->6->9->common
 * LinkList2 = 10->common
 * common = 15->30->NULL
 * Output: 15
 * Explanation:
 * Y ShapedLinked List
 * Example 2:
 * 
 * Input:
 * Linked List 1 = 4->1->common
 * Linked List 2 = 5->6->1->common
 * common = 8->4->5->NULL
 * Output: 8
 * Explanation:
 * 
 * 4 5
 * | |
 * 1 6
 * \ /
 * 8 ----- 1
 * |
 * 4
 * |
 * 5
 * |
 * NULL
 * Your Task:
 * You don't need to read input or print anything. The task is to complete the
 * function intersectPoint() which takes the pointer to the head of
 * linklist1(head1) and linklist2(head2) as input parameters and returns data
 * value of a node where two linked lists intersect. If linked list do not merge
 * at any point, then it should return -1.
 * Challenge : Try to solve the problem without using any extra space.
 * 
 * 
 * 
 * Expected Time Complexity: O(N+M)
 * Expected Auxiliary Space: O(1)
 * 
 * 
 * 
 * Constraints:
 * Length of Both linkedList before intersection(if any) is greater than 0.
 * 2 ≤ N + M ≤ 2*105
 * -1000 ≤ value ≤ 1000
 * 
 * 
 * 
 * Company Tags
 * 
 * 
 * class Intersect
 * {
 * //Function to find intersection point in Y shaped Linked Lists.
 * int intersectPoint(Node head1, Node head2)
 * {
 * int l1=len(head1);
 * int l2=len(head2);
 * while(l1>l2){
 * head1=head1.next;
 * l1--;
 * }
 * while(l1<l2){
 * head2=head2.next;
 * l2--;
 * }
 * while(head1!=null && head2!=null){
 * if(head1==head2){
 * return head1.data;
 * }
 * head1=head1.next;
 * head2=head2.next;
 * }
 * return -1;
 * }
 * 
 * static int len(Node head){
 * Node t=head;
 * int c=0;
 * while(t!=null){
 * c++;
 * t=t.next;
 * }
 * return c;
 * }
 * 
 * }
 * 
 */

/*
* Merge Sort for Linked List
 * MediumAccuracy: 74.76%Submissions: 66K+Points: 4
 * Internship Alert
 * New month-> Fresh Chance to top the leaderboard and get SDE Internship!
 * 
 * banner
 * Given Pointer/Reference to the head of the linked list, the task is to Sort
 * the given linked list using Merge Sort.
 * Note: If the length of linked list is odd, then the extra node should go in
 * the first list while splitting.
 * 
 * Example 1:
 * 
 * Input:
 * N = 5
 * value[] = {3,5,2,4,1}
 * Output: 1 2 3 4 5
 * Explanation: After sorting the given
 * linked list, the resultant matrix
 * will be 1->2->3->4->5.
 * Example 2:
 * 
 * Input:
 * N = 3
 * value[] = {9,15,0}
 * Output: 0 9 15
 * Explanation: After sorting the given
 * linked list , resultant will be
 * 0->9->15.
 * Your Task:
 * For C++ and Python: The task is to complete the function mergeSort() which
 * sort the linked list using merge sort function.
 * For Java: The task is to complete the function mergeSort() and return the
 * node which can be used to print the sorted linked list.
 * 
 * Expected Time Complexity: O(N*Log(N))
 * Expected Auxiliary Space: O(N)
 * 
 * Constraints:
 * 1 <= N <= 105
 * 
 * 
 * 
 * Company Tags
 * 
 * class Solution
 * {
 * //Function to sort the given linked list using Merge Sort.
 * static Node mergeSort(Node head)
 * {
 * // add your code here
 * if (head == null || head.next == null) {
 * return head;
 * }
 * 
 * Node mid = findMiddleNode(head);
 * Node leftHead = head;
 * Node rightHead = mid.next;
 * mid.next = null;
 * 
 * leftHead = mergeSort(leftHead);
 * rightHead = mergeSort(rightHead);
 * return merge(leftHead, rightHead);
 * }
 * static Node findMiddleNode(Node head) {
 * if (head == null || head.next == null) {
 * return head;
 * }
 * Node slow = head;
 * Node fast = head.next;
 * 
 * while (fast != null && fast.next != null) {
 * slow = slow.next;
 * fast = fast.next.next;
 * }
 * return slow;
 * }
 * 
 * // merge linked list function
 * static Node merge(Node list1Head, Node list2Head) {
 * Node dummyNode = new Node(-1); // can be any value
 * Node temp = dummyNode;
 * 
 * while (list1Head != null && list2Head != null) {
 * if (list1Head.data <= list2Head.data) {
 * temp.next = list1Head;
 * temp = list1Head;
 * list1Head = list1Head.next;
 * }
 * else
 * {
 * temp.next = list2Head;
 * temp = list2Head;
 * list2Head = list2Head.next;
 * }
 * }
 * 
 * // if list1 still has elements left
 * while (list1Head != null) {
 * temp.next = list1Head;
 * temp = list1Head;
 * list1Head = list1Head.next;
 * }
 * 
 * // if list2 still has elements left
 * while (list2Head != null) {
 * temp.next = list2Head;
 * temp = list2Head;
 * list2Head = list2Head.next;
 * }
 * return dummyNode.next;
 * }
 * }


    /* 
    









   //clean Code.............
    
class Solution
{
    //Function to sort the given linked list using Merge Sort.
    static Node mergeSort(Node head)
    {
        // add your code here
        if (head == null || head.next == null) {
        return head;
    }

    Node mid = findMiddleNode(head);
    Node leftHead = head;
    Node rightHead = mid.next;
    mid.next = null; 

    leftHead = mergeSort(leftHead);
    rightHead = mergeSort(rightHead);
    return merge(leftHead, rightHead);
    }
    static Node findMiddleNode(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node slow = head;
        Node fast = head.next; 

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // merge linked list function

    static Node merge(Node list1Head, Node list2Head) {
    Node dummyNode = new Node(-1); // can be any value
    Node temp = dummyNode;

    while (list1Head != null && list2Head != null) {
        if (list1Head.data <= list2Head.data) {
            temp.next = list1Head;
            temp = list1Head;
            list1Head = list1Head.next;
        }
        else
        {
            temp.next = list2Head;
             temp = list2Head;
            list2Head = list2Head.next;
        }
    }

    // if list1 still has elements left
        while (list1Head != null) {
            temp.next = list1Head;
            temp = list1Head;
            list1Head = list1Head.next;
        }

    // if list2 still has elements left
        while (list2Head != null) {
            temp.next = list2Head;
            temp = list2Head;
            list2Head = list2Head.next;
        }
    return dummyNode.next;
}
}



    */



*/

/*
 * 876. Middle of the Linked List
 * Solved
 * Easy
 * Topics
 * Companies
 * Given the head of a singly linked list, return the middle node of the linked
 * list.
 * 
 * If there are two middle nodes, return the second middle node.
 * 
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: head = [1,2,3,4,5]
 * Output: [3,4,5]
 * Explanation: The middle node of the list is node 3.
 * Example 2:
 * 
 * 
 * Input: head = [1,2,3,4,5,6]
 * Output: [4,5,6]
 * Explanation: Since the list has two middle nodes with values 3 and 4, we
 * return the second one.
 * 
 * 
 * Constraints:
 * 
 * The number of nodes in the list is in the range [1, 100].
 * 1 <= Node.val <= 100
 * 
 * 
 * class Solution {
 * public ListNode middleNode(ListNode head) {
 * ListNode f=head;
 * ListNode s=head;
 * while(f!=null && f.next!=null){
 * f=f.next.next;
 * s=s.next;
 * }
 * return s;
 * }
 * }
 */

/*
 * Check If Circular Linked List
 * BasicAccuracy: 54.26%Submissions: 147K+Points: 1
 * Internship Alert
 * New month-> Fresh Chance to top the leaderboard and get SDE Internship!
 * 
 * banner
 * Given head, the head of a singly linked list, find if the linked list is
 * circular or not. A linked list is called circular if it not NULL terminated
 * and all nodes are connected in the form of a cycle. An empty linked list is
 * considered as circular.
 * 
 * Note: The linked list does not contains any inner loop.
 * 
 * Example 1:
 * 
 * Input:
 * LinkedList: 1->2->3->4->5
 * (the first and last node is connected,
 * i.e. 5 --> 1)
 * Output: 1
 * Example 2:
 * 
 * Input:
 * LinkedList: 2->4->6->7->5->1
 * Output: 0
 * Your Task:
 * The task is to complete the function isCircular() which checks if the given
 * linked list is circular or not. It should return true or false accordingly.
 * (the driver code prints 1 if the returned values is true, otherwise 0)
 * 
 * Expected Time Complexity: O(N).
 * Expected Auxiliary Space: O(1).
 * 
 * Constraints:
 * 1 <=Number of nodes<= 100
 * 
 * Company Tags
 * 
 * class GfG
 * {
 * boolean isCircular(Node head)
 * {
 * 
 * Node s=head;
 * Node f=head;
 * while(f!=null && f.next!=null){
 * f=f.next.next;
 * s=s.next;
 * 
 * if(s==f){
 * if(s==head){
 * return true;
 * }
 * return false;
 * }
 * 
 * }
 * 
 * return false;
 * 
 * }
 * }
 */

/*
 * Split a Circular Linked List into two halves
 * EasyAccuracy: 61.63%Submissions: 52K+Points: 2
 * Internship Alert
 * New month-> Fresh Chance to top the leaderboard and get SDE Internship!
 * 
 * banner
 * Given a Cirular Linked List of size N, split it into two halves circular
 * lists. If there are odd number of nodes in the given circular linked list
 * then out of the resulting two halved lists, first list should have one node
 * more than the second list. The resultant lists should also be circular lists
 * and not linear lists.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input:
 * Circular LinkedList: 1->5->7
 * Output:
 * 1 5
 * 7
 * 
 * 
 * Example 2:
 * 
 * Input:
 * Circular LinkedList: 2->6->1->5
 * Output:
 * 2 6
 * 1 5
 * 
 * Your Task:
 * Your task is to complete the given function splitList(), which takes 3 input
 * parameters: The address of the head of the linked list, addresses of the head
 * of the first and second halved resultant lists and Set the head1_ref and
 * head2_ref to the first resultant list and second resultant list respectively.
 * 
 * 
 * Expected Time Complexity: O(N)
 * Expected Auxilliary Space: O(1)
 * 
 * 
 * Constraints:
 * 2 <= N <= 100
 * 
 * Company Tags
 * 
 * class gfg
 * {
 * // Function to split a circular LinkedList
 * void splitList(circular_LinkedList list)
 * {
 * //DO NOT REMOVE THESE 3 LINES
 * Node head=list.head;
 * Node head1=null;
 * Node head2=null;
 * 
 * //Modify these head1 and head2 here, head is the starting point of our
 * original linked list.
 * 
 * Node s=head;
 * Node f=head;
 * while(f.next!=head && f.next.next!=head){
 * s=s.next;
 * f=f.next.next;
 * }
 * 
 * head2=s.next;
 * head1=head;
 * s.next=head1;
 * if(f.next==head){
 * f.next=head2;
 * }
 * 
 * else{
 * f.next.next=head2;
 * }
 * 
 * 
 * 
 * 
 * 
 * //DO NOT REMOVE THESE 2 LINES
 * list.head1=head1;
 * list.head2=head2;
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * }
 * }
 */

/*
 * Check if Linked List is Palindrome
 * MediumAccuracy: 41.48%Submissions: 298K+Points: 4
 * Internship Alert
 * New month-> Fresh Chance to top the leaderboard and get SDE Internship!
 * 
 * banner
 * Given a singly linked list of size N of integers. The task is to check if the
 * given linked list is palindrome or not.
 * 
 * Example 1:
 * 
 * Input:
 * N = 3
 * value[] = {1,2,1}
 * Output: 1
 * Explanation: The given linked list is
 * 1 2 1 , which is a palindrome and
 * Hence, the output is 1.
 * Example 2:
 * 
 * Input:
 * N = 4
 * value[] = {1,2,3,4}
 * Output: 0
 * Explanation: The given linked list
 * is 1 2 3 4 , which is not a palindrome
 * and Hence, the output is 0.
 * Your Task:
 * The task is to complete the function isPalindrome() which takes head as
 * reference as the only parameter and returns true or false if linked list is
 * palindrome or not respectively.
 * 
 * Expected Time Complexity: O(N)
 * Expected Auxialliary Space Usage: O(1) (ie, you should not use the recursive
 * stack space as well)
 * 
 * Constraints:
 * 1 <= N <= 105
 * 
 * Company Tags
 * 
 * class Solution
 * {
 * //Function to check whether the list is palindrome.
 * boolean isPalindrome(Node head)
 * {
 * if(head==null){
 * return true;
 * }
 * 
 * Node s=head;
 * Node f=head;
 * while(f!=null && f.next!=null){
 * f=f.next.next;
 * s=s.next;
 * }
 * 
 * Node pre=null;
 * Node curr=s;
 * Node ford=null;
 * while(curr!=null){
 * ford=curr.next;
 * curr.next=pre;
 * pre=curr;
 * curr=ford;
 * }
 * 
 * Node r=head;
 * Node l=pre;
 * while(l!=null){
 * if(r.data!=l.data){
 * return false;
 * }
 * r=r.next;
 * l=l.next;
 * }
 * return true;
 * }
 * }
 */

/*
 * Reverse a Doubly Linked List
 * EasyAccuracy: 70.38%Submissions: 105K+Points: 2
 * Internship Alert
 * New month-> Fresh Chance to top the leaderboard and get SDE Internship!
 * 
 * banner
 * Given a doubly linked list of n elements. Your task is to reverse the doubly
 * linked list in-place.
 * 
 * Example 1:
 * 
 * Input:
 * LinkedList: 3 <--> 4 <--> 5
 * Output: 5 4 3
 * Example 2:
 * 
 * Input:
 * LinkedList: 75 <--> 122 <--> 59 <--> 196
 * Output: 196 59 122 75
 * Your Task:
 * Your task is to complete the given function reverseDLL(), which takes head
 * reference as argument and this function should reverse the elements such that
 * the tail becomes the new head and all pointers are pointing in the right
 * order. You need to return the new head of the reversed list. The printing and
 * verification is done by the driver code.
 * 
 * Expected Time Complexity: O(n).
 * Expected Auxiliary Space: O(1).
 * 
 * Constraints:
 * 1 <= number of nodes <= 104
 * 0 <= value of nodes <= 104
 * 
 * Company Tags
 * public static Node reverseDLL(Node head)
 * {
 * Node prev = null;
 * Node next = null;
 * Node curr = head;
 * 
 * while(curr != null){
 * next = curr.next;
 * curr.next = prev;
 * curr.prev = next;
 * prev = curr;
 * curr = next;
 * }
 * 
 * return prev;
 * }
*/





/*
 Find pairs with given sum in doubly linked list
 Easy
 0/40
 Average time to solve is 10m
 Contributed by
 63 upvotes
 Asked in companies
 Problem statement
 A doubly-linked list is a data structure that consists of sequentially linked
 nodes, and the nodes have reference to both the previous and the next nodes
 in the sequence of nodes.
 
 
 
 You are given a sorted doubly linked list of size 'n', consisting of distinct
 positive integers, and a number 'k'.
 
 
 
 Find out all the pairs in the doubly linked list with sum equal to 'k'.
 
 
 
 Example :
 Input: Linked List: 1 <-> 2 <-> 3 <-> 4 <-> 9 and 'k' = 5
 
 Output: (1, 4) and (2, 3)
 
 Explanation: There are 2 pairs in the linked list having sum 'k' = 5.
 Detailed explanation ( Input/output format, Notes, Images )
 Sample input 1:
 5
 1 2 3 4 9
 5
 
 
 Sample output 1
 2
 1 4
 2 3
 
 
 Explanation for sample input 1 :
 There are 2 pairs in the linked list having sum equal to 'k' (= 5).
 
 
 Sample input 2:
 5
 1 10 11 12 27
 7
 
 
 Sample output 2:
 0
 
 
 Explanation for sample output 2
 There is no pair in the linked list with sum equal to 'k' (= 7).
 
 
 Expected time complexity :
 The expected time complexity is O('n').
 
 
 Constraints:
 2 <= 'n' <= 10 ^ 4
 1 <= 'data' in any node <= 10 ^ 4
 1 <= 'k' <= 10 ^ 4
 
 'data' in every node is distinct.
 
 Time limit: 1 second
 
 public class Solution {
 
 public static boolean findPair(Node<Integer> head, int k) {
 
 
 if (head == null || head.next == null)
 return 0;
 
 Node<Integer> last=head;
 while(last.next!=null){
 last=last.next;
 }
 
 
 Node<Integer> first=head;
 
 while(first != null && last != null && first != last && first.prev != last){
 if(first.data+last.data==k){
 return true;
 }
 else if(first.data+last.data>k){
 last=last.prev;
 }
 
 else if(first.data+last.data==k){
 first=first.next;
 }
 }
 
 return false;
 }
 
 }
 */

/*
 * Count Triplets
 * Easy
 * 40/40
 * Average time to solve is 15m
 * Contributed by
 * 23 upvotes
 * Asked in companies
 * Problem statement
 * You have been given an integer ‘X’ and a non-decreasing sorted doubly linked
 * list with distinct nodes.
 * 
 * Your task is to return the number of triplets in the list that sum up to the
 * value ‘X’.
 * 
 * Detailed explanation ( Input/output format, Notes, Images )
 * Constraints :
 * 1 <= T <= 5
 * 1 <= N <= 10 ^ 3
 * - 3 * 10 ^ 5 <= X <= 3 * 10 ^ 5
 * - 10 ^ 5 <= data <= 10 ^ 5 and data != - 1
 * 
 * Where ‘N’ is the number of nodes in the given linked list, and ‘X’ is the
 * required triplet sum value.
 * 
 * Time limit: 1 sec
 * Sample Input 1:
 * 2
 * 13
 * -4 2 3 8 9 -1
 * 5
 * -4 -2 3 4 5 -1
 * Sample Output 1:
 * 2
 * 2
 * Explanation to Sample Input 1:
 * In the first test case, there are two possible triplets {2,3,8} and {-4,8,9},
 * whose sum is 13.
 * In the second test case there are two triplets possible {-4,4,5} and {-2,3,4}
 * whose sum is 5.
 * Sample Input 2:
 * 2
 * -4
 * -3 8 10 -1
 * 12
 * 1 4 6 2 -1
 * Sample Output 2:
 * 0
 * 1
 * Explanation to Sample Input 2:
 * In the first test case, there is no triplet whose sum is -4.
 * In the second test case, there is only one triplet {6,4,2}, whose sum is 12.
 * public class Solution {
 * public static int countAllTripletSum(Node head, int x) {
 * ArrayList<Integer> arr=new ArrayList<>();
 * Node curr=head;
 * while(curr!=null){
 * arr.add(curr.data);
 * curr=curr.next;
 * }
 * int ans=0;
 * int i=0;
 * while(i<arr.size()-1){
 * int a=arr.get(i);
 * int k=arr.size()-1,j=i+1;
 * while(j<k){
 * int b=arr.get(j),c=arr.get(k);
 * if(a+b+c==x){
 * ans++;
 * j++;
 * k--;
 * }else if(a+b+c>x) k--;
 * else j++;
 * }
 * i++;
 * }
 * return ans;
 * }
 * }
 */

/*
 * Rotate DLL
 * Moderate
 * 80/80
 * Average time to solve is 10m
 * Contributed by
 * 16 upvotes
 * Asked in company
 * Problem statement
 * You are given a doubly-linked list with 'N' nodes, rotate the linked list
 * counter-clockwise by 'K' nodes. 'K' is a positive integer and is smaller than
 * the number of nodes in the linked list, that is 'N'.
 * 
 * A doubly linked List (DLL) contains an extra pointer, called the previous
 * pointer, together with the next pointer and data which are there in the
 * singly linked list such that both forward and backward navigation is
 * possible.
 * 
 * For example
 * The given linked list is -
 * 
 * If K = 3, then the list after rotating it by K nodes is:
 * 
 * Note:
 * 1. The value of any node in the linked list will not be equal to -1.
 * Detailed explanation ( Input/output format, Notes, Images )
 * Constraints:
 * 1 <= T <= 5
 * 1 <= N <= 3000
 * 1 <= K < N
 * -10 ^ 7 <= data <= 10 ^ 7
 * 
 * where ‘T’ is the total number of test cases, 'N' is the total number of nodes
 * in the linked list and ‘data’ is the value of any node of the linked list.
 * Sample Input 1 :
 * 2
 * 4 3 9 1 7 8 -1
 * 4
 * 1 2 3 4 5 -1
 * 2
 * Sample Output 1 :
 * 7 8 4 3 9 1
 * 3 4 5 1 2
 * Explanation of The Sample Input 1:
 * For the first test case:
 * The given linked list is :
 * 4 <-> 3 <-> 9 <-> 1 <-> 7 <-> 8 <-> NULL
 * 
 * And K = 4 therefore we have to rotate the linked list by 4 nodes. So after
 * the rotation, list will become
 * 7 <-> 8 <-> 4 <-> 3 <-> 9 <-> 1 <-> NULL
 * 
 * For the second test case:
 * The given linked list is
 * 1 <-> 2 <-> 3 <-> 4 <-> 5 <-> NULL
 * And K = 2 therefore we have to rotate the linked list by 2 nodes. So after
 * the rotation, list will become
 * 3 <-> 4 <-> 5 <-> 1 <-> 2 <-> NULL
 * Sample Input 2 :
 * 2
 * 6 2 4 2 1 4 -1
 * 2
 * 12 33 55 11 22 -1
 * 3
 * Sample Output 2 :
 * 4 2 1 4 6 2
 * 11 22 12 33 55
 * public class Solution
 * {
 * public static DLLNode rotateDLL(DLLNode head, int k)
 * {
 * 
 * DLLNode last=head;
 * int c=1;
 * while(c<k && last!=null){
 * last=last.next;
 * c++;
 * }
 * 
 * DLLNode kth=last;
 * 
 * 
 * while(last.next!=null){
 * last=last.next;
 * }
 * 
 * last.next=head;
 * head.prev=last;
 * head=kth.next;
 * head.prev=null;
 * kth.next=null;
 * 
 * return head;
 * 
 * }
 * }
 * 
 * 
 */

/*
 * Flattening a Linked List
 * MediumAccuracy: 51.53%Submissions: 136K+Points: 4
 * Internship Alert
 * New month-> Fresh Chance to top the leaderboard and get SDE Internship!
 * 
 * banner
 * Given a Linked List of size N, where every node represents a sub-linked-list
 * and contains two pointers:
 * (i) a next pointer to the next node,
 * (ii) a bottom pointer to a linked list where this node is head.
 * Each of the sub-linked-list is in sorted order.
 * Flatten the Link List such that all the nodes appear in a single level while
 * maintaining the sorted order.
 * 
 * Note: The flattened list will be printed using the bottom pointer instead of
 * the next pointer.
 * For more clarity have a look at the printList() function in the driver code.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input:
 * 5 -> 10 -> 19 -> 28
 * | | | |
 * 7 20 22 35
 * | | |
 * 8 50 40
 * | |
 * 30 45
 * Output: 5-> 7-> 8- > 10 -> 19-> 20->
 * 22-> 28-> 30-> 35-> 40-> 45-> 50.
 * Explanation:
 * The resultant linked lists has every
 * node in a single level.
 * (Note: | represents the bottom pointer.)
 * 
 * 
 * Example 2:
 * 
 * Input:
 * 5 -> 10 -> 19 -> 28
 * | |
 * 7 22
 * | |
 * 8 50
 * |
 * 30
 * Output: 5->7->8->10->19->22->28->30->50
 * Explanation:
 * The resultant linked lists has every
 * node in a single level.
 * 
 * (Note: | represents the bottom pointer.)
 * 
 * 
 * Your Task:
 * You do not need to read input or print anything. Complete the function
 * flatten() that takes the head of the linked list as input parameter and
 * returns the head of flattened link list.
 * 
 * Expected Time Complexity: O(N*N*M)
 * Expected Auxiliary Space: O(N)
 * 
 * Constraints:
 * 0 <= N <= 50
 * 1 <= Mi <= 20
 * 1 <= Element of linked list <= 103
 * 
 * Company Tags
 * class GfG
 * {
 * 
 * Node merge(Node a, Node b) {
 * 
 * Node temp = new Node(0);
 * Node res = temp;
 * 
 * while(a != null && b != null) {
 * if(a.data < b.data) {
 * temp.bottom = a;
 * temp = temp.bottom;
 * a = a.bottom;
 * } else {
 * temp.bottom = b;
 * temp = temp.bottom;
 * b = b.bottom;
 * }
 * }
 * 
 * if(a != null){
 * temp.bottom = a;
 * } else {
 * temp.bottom = b;
 * }
 * 
 * return res.bottom;
 * }
 * 
 * Node flatten(Node root)
 * {
 * 
 * if(root==null || root.next==null){
 * return root;
 * }
 * 
 * root.next=flatten(root.next);
 * root=merge(root,root.next);
 * 
 * return root;
 * 
 * }
 * }
 */

/*
 * Given a linked list of 0s, 1s and 2s, sort it.
 * EasyAccuracy: 60.75%Submissions: 160K+Points: 2
 * Internship Alert
 * New month-> Fresh Chance to top the leaderboard and get SDE Internship!
 * 
 * banner
 * Given a linked list of N nodes where nodes can contain values 0s, 1s, and 2s
 * only. The task is to segregate 0s, 1s, and 2s linked list such that all zeros
 * segregate to head side, 2s at the end of the linked list, and 1s in the mid
 * of 0s and 2s.
 * 
 * Example 1:
 * 
 * Input:
 * N = 8
 * value[] = {1,2,2,1,2,0,2,2}
 * Output: 0 1 1 2 2 2 2 2
 * Explanation: All the 0s are segregated
 * to the left end of the linked list,
 * 2s to the right end of the list, and
 * 1s in between.
 * Example 2:
 * 
 * Input:
 * N = 4
 * value[] = {2,2,0,1}
 * Output: 0 1 2 2
 * Explanation: After arranging all the
 * 0s,1s and 2s in the given format,
 * the output will be 0 1 2 2.
 * Your Task:
 * The task is to complete the function segregate() which segregates the nodes
 * in the linked list as asked in the problem statement and returns the head of
 * the modified linked list. The printing is done automatically by the driver
 * code.
 * 
 * Expected Time Complexity: O(N).
 * Expected Auxiliary Space: O(N).
 * 
 * Constraints:
 * 1 <= N <= 106
 * 
 * Company Tags
 * class Solution
 * {
 * //Function to sort a linked list of 0s, 1s and 2s.
 * static Node segregate(Node head)
 * {
 * // add your code here
 * 
 * Node curr = head;
 * int zero =0;
 * int one = 0;
 * int two =0;
 * 
 * while(curr!= null)
 * {
 * if(curr.data==0)
 * zero++;
 * else if(curr.data ==1)
 * one++;
 * else
 * two++;
 * 
 * curr = curr.next;
 * }
 * 
 * curr = head;
 * while(curr!=null)
 * {
 * if(zero !=0)
 * {
 * curr.data = 0;
 * zero--;
 * }
 * else if(one!=0)
 * {
 * curr.data = 1;
 * one--;
 * }
 * else if(two!=0)
 * {
 * curr.data = 2;
 * two--;
 * }
 * 
 * curr = curr.next;
 * }
 * return head;
 * }
 * }
 * 
*/

/*
 * Multiply two linked lists
 * EasyAccuracy: 46.33%Submissions: 46K+Points: 2
 * Internship Alert
 * New month-> Fresh Chance to top the leaderboard and get SDE Internship!
 * 
 * banner
 * Given elements as nodes of the two linked lists. The task is to multiply
 * these two linked lists, say L1 and L2.
 * 
 * Note: The output could be large take modulo 109+7.
 * 
 * Example:
 * 
 * Input:
 * 2
 * 2
 * 3 2
 * 1
 * 2
 * 3
 * 1 0 0
 * 2
 * 1 0
 * Output:
 * 64
 * 1000
 * 
 * Explanation:
 * Testcase 1: 32*2 = 64.
 * Testcase 2: 100*10 = 1000.
 * Input:
 * The first line of input contains an integer T denoting the number of test
 * cases. Then T test cases follow, the first line of each test case contains an
 * integer N denoting the size of the first linked list (L1). In the next line
 * are the space-separated values of the first linked list. The third line of
 * each test case contains an integer M denoting the size of the second linked
 * list (L2). In the fourth line is space-separated values of the second linked
 * list.
 * 
 * Output:
 * For each test case output will be an integer denoting the product of the two
 * linked lists.
 * 
 * Your Task:
 * The task is to complete the function multiplyTwoLists() which should multiply
 * the given two linked lists and return the result.
 * 
 * Constraints:
 * 1 <= T <= 100
 * 1 <= N, M <= 100
 * 
 * 
 * Company Tags
 * class GfG{
 * 
 * public static long m=1000000007;
 * public long sum(Node l1){
 * if(l1==null){
 * return 0;
 * }
 * 
 * Node p=l1;
 * //long i=1;
 * long s=0;
 * 
 * while(p!=null){
 * long k=p.data;
 * long r=k%m;
 * s=((s*10)+r)%m;
 * p=p.next;
 * //i=i*10;
 * }
 * 
 * return s;
 * 
 * }
 * 
 * 
 * public long multiplyTwoLists(Node l1,Node l2){
 * 
 * long a=sum(l1);
 * long b=sum(l2);
 * return (a*b)%m;
 * }
 * }
 */

/*
 * Delete nodes having greater value on right
 * EasyAccuracy: 35.51%Submissions: 134K+Points: 2
 * Internship Alert
 * New month-> Fresh Chance to top the leaderboard and get SDE Internship!
 * 
 * banner
 * Given a singly linked list, remove all the nodes in the list which have any
 * node on their right whose value is greater. (Not just immediate Right , but
 * entire List on the Right)
 * 
 * Example 1:
 * 
 * Input:
 * LinkedList = 12->15->10->11->5->6->2->3
 * Output: 15 11 6 3
 * Explanation: Since, 12, 10, 5 and 2 are
 * the elements which have greater elements
 * on the following nodes. So, after deleting
 * them, the linked list would like be 15,
 * 11, 6, 3.
 * Example 2:
 * 
 * Input:
 * LinkedList = 10->20->30->40->50->60
 * Output: 60
 * Explanation: All the nodes except the last
 * node has a greater value node on its right,
 * so all the nodes except the last node must
 * be removed.
 * Your Task:
 * The task is to complete the function compute() which should modify the list
 * as required and return the head of the modified linked list.
 * The printing is done by the driver code,
 * 
 * Expected Time Complexity: O(N)
 * Expected Auxiliary Space: O(1)
 * 
 * Constraints:
 * 1 ≤ size of linked list ≤ 105
 * 1 ≤ element of linked list ≤ 105
 * 
 * Note: Try to solve the problem without using any extra space.
 * 
 * Company Tags
 * class Solution
 * {
 * Node compute(Node head)
 * {
 * Node curr = head;
 * 
 * while(curr.next!=null){
 * if(curr.data<curr.next.data){
 * curr.data = curr.next.data;
 * curr.next = curr.next.next;
 * curr = head;
 * }
 * else
 * {
 * curr = curr.next;
 * }
 * }
 * return head;
 * 
 * }
 * }
 */

/*
 * Segregate even and odd nodes in a Linked List
 * MediumAccuracy: 49.8%Submissions: 82K+Points: 4
 * Internship Alert
 * New month-> Fresh Chance to top the leaderboard and get SDE Internship!
 * 
 * banner
 * Given a link list of size N, modify the list such that all the even numbers
 * appear before all the odd numbers in the modified list. The order of
 * appearance of numbers within each segregation should be same as that in the
 * original list.
 * 
 * NOTE: Don't create a new linked list, instead rearrange the provided one.
 * 
 * 
 * Example 1:
 * 
 * Input:
 * N = 7
 * Link List:
 * 17 -> 15 -> 8 -> 9 -> 2 -> 4 -> 6 -> NULL
 * 
 * Output: 8 2 4 6 17 15 9
 * 
 * Explaination: 8,2,4,6 are the even numbers
 * so they appear first and 17,15,9 are odd
 * numbers that appear later.
 * 
 * Example 2:
 * 
 * Input:
 * N = 4
 * Link List:
 * 1 -> 3 -> 5 -> 7
 * 
 * Output: 1 3 5 7
 * 
 * Explaination: There is no even number.
 * So no need for modification.
 * 
 * Your Task:
 * You do not need to read input or print anything. Your task is to complete the
 * function divide() which takes N and head of Link List as input parameters and
 * returns the head of modified link list. Don't create a new linked list,
 * instead rearrange the provided one.
 * 
 * 
 * Expected Time Complexity: O(N)
 * Expected Auxiliary Space: O(1)
 * 
 * 
 * Constraints:
 * 1 ≤ N ≤ 105
 * 1 ≤ Each element of the list ≤ 105
 * 
 * Topic Tags
 * 
 * class Solution{
 * Node divide(int N, Node head){
 * Node ans=new Node(-1);
 * Node d=ans;
 * Node t=head;
 * while(t!=null){
 * if(t.data%2==0){
 * d.next=new Node(t.data);
 * d=d.next;
 * }
 * t=t.next;
 * }
 * 
 * t=head;
 * while(t!=null){
 * if(t.data%2!=0){
 * d.next=new Node(t.data);
 * d=d.next;
 * }
 * t=t.next;
 * }
 * 
 * return ans.next;
 * }
 * }
 */

/*
 * Nth node from end of linked list
 * EasyAccuracy: 41.18%Submissions: 362K+Points: 2
 * Internship Alert
 * New month-> Fresh Chance to top the leaderboard and get SDE Internship!
 * 
 * banner
 * Given a linked list consisting of L nodes and given a number N. The task is
 * to find the Nth node from the end of the linked list.
 * 
 * Example 1:
 * 
 * Input:
 * N = 2
 * LinkedList: 1->2->3->4->5->6->7->8->9
 * Output: 8
 * Explanation: In the first example, there
 * are 9 nodes in linked list and we need
 * to find 2nd node from end. 2nd node
 * from end is 8.
 * Example 2:
 * 
 * Input:
 * N = 5
 * LinkedList: 10->5->100->5
 * Output: -1
 * Explanation: In the second example, there
 * are 4 nodes in the linked list and we
 * need to find 5th from the end. Since 'n'
 * is more than the number of nodes in the
 * linked list, the output is -1.
 * Your Task:
 * The task is to complete the function getNthFromLast() which takes two
 * arguments: reference to head and N and you need to return Nth from the end or
 * -1 in case node doesn't exist.
 * 
 * Note:
 * Try to solve in a single traversal.
 * 
 * Expected Time Complexity: O(N).
 * Expected Auxiliary Space: O(1).
 * 
 * Constraints:
 * 1 <= L <= 106
 * 1 <= N <= 106
 * 
 * Company Tags
 * 
 * class Solution
 * {
 * //Function to find the data of nth node from the end of a linked list.
 * int getNthFromLast(Node head, int n)
 * {
 * int size=0;
 * Node p=head;
 * while(p!=null){
 * size++;
 * p=p.next;
 * }
 * 
 * if(size<n){
 * return -1;
 * }
 * 
 * if(head==null){
 * return -1;
 * }
 * 
 * int s=size-n;
 * 
 * int i=1;
 * Node t=head;
 * while(i<=s){
 * t=t.next;
 * i++;
 * }
 * 
 * return t.data;
 * }
 * }
 */






 /* 
 * Rotate a Linked List
MediumAccuracy: 39.95%Submissions: 210K+Points: 4
Internship Alert
New month-> Fresh Chance to top the leaderboard and get SDE Internship! 

banner
Given a singly linked list of size N. The task is to left-shift the linked list by k nodes, where k is a given positive integer smaller than or equal to length of the linked list.

Example 1:

Input:
N = 5
value[] = {2, 4, 7, 8, 9}
k = 3
Output: 8 9 2 4 7
Explanation:
Rotate 1: 4 -> 7 -> 8 -> 9 -> 2
Rotate 2: 7 -> 8 -> 9 -> 2 -> 4
Rotate 3: 8 -> 9 -> 2 -> 4 -> 7
Example 2:

Input:
N = 8
value[] = {1, 2, 3, 4, 5, 6, 7, 8}
k = 4
Output: 5 6 7 8 1 2 3 4

Your Task:
You don't need to read input or print anything. Your task is to complete the function rotate() which takes a head reference as the first argument and k as the second argument, and returns the head of the rotated linked list.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).

Constraints:
1 <= N <= 103
1 <= k <= N

Company Tags

class Solution{
    //Function to rotate a linked list.
    public Node rotate(Node head, int k) {
        
         if(head == null || head.next == null)
         return head;
        
        Node last=head;
        int i=1;
        while(last!=null && i<k){
            i++;
            last=last.next;
        }
        Node kth=last;
        
        while(last.next!=null){
            last=last.next;
        }
        
        last.next=head;
        head=kth.next;
        kth.next=null;
        
        return head;
        
        
    }
}



*/






 

/* 
 * 
*/

/* 
 * 
*/

/* 
 * 
*/