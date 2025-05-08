//understanding DoublyLinkedList

public class DoubleLL {
    public class Node {
        int data;
        Node next;
        Node pre;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.pre = null;
        }
    }

    // add
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.pre = newNode;
        head = newNode;
    }

    // print
    public void print() {
        Node t = head;
        while (t != null) {
            System.out.print(t.data + "<->");
            t = t.next;
        }
        System.out.println("null");
    }


    //remove - first
    public int removeFirst(){
        if(head==null){
            return -1;
        }


        if(size==1){
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }


        int val=head.data;
        head=head.next;
        head.pre=null;
        size--;
        return val;
    }

    //reverse Doubly linked list
    public void reverse(){
        Node ford=null;
        Node pre=null;
        Node curr=head;
        while(curr!=null){
            ford=curr.next;
            curr.next=pre;
            curr.pre=ford;

            pre=curr;
            curr=ford;
        }
        head=pre;
    }


    public static Node head;
    public static Node tail;
    public static int size;

    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();
        dll.addFirst(3);
        dll.addFirst(5);
        dll.addFirst(9);
        dll.print();
        System.out.println(size);

        // dll.removeFirst();
        // dll.print();
        // System.out.println(size);

        dll.reverse();
        dll.print();
    }
}
