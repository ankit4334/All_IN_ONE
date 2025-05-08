//implemention Stack using  Doubly LinkedList. in the class

import java.util.Stack;

public class part2 {
    static class Node{
        int data;
        Node pre;
        Node next;

        Node(int data){
            this.data=data;
            this.pre=null;
            this.next=null;
        }


        static class Stack{
           static Node head=null;

            public static boolean isEmpty(){
                return head==null;
            }

            public static void add(int d){

                Node newNode=new Node(d);
                if(head==null){
                    head=newNode;
                    return;
                }

                else{
                    head.next=newNode;
                    newNode.next=null;
                    newNode.pre=head;
                    head=newNode;
                }


            }


            public static int remove(){
                if(isEmpty()){
                    return -1;
                }

                
                int val=head.data;
                head.pre=null;
                return val;

                
            }

            public static int peek(){
                return head.data;
            }



        }

    }
    public static void main(String[] args) {
        
        Stack s=new Stack<>();

        s.add(4);
        s.add(5);
        s.add(8);
        s.remove(2);


        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }

        //System.out.println(s.isEmpty());


    }
}
