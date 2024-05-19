package Pack;
import javax.swing.plaf.nimbus.State;

public class Node{
    int data;
    Node next;
    Node(int data){
        this.data= data;
        this.next= null;
    }


    static Node head =null;
    static Node tail = null;
    static int size =0;

    public static void add1st(int data){
        Node newNode = new Node(data);
        size++;
        if (head== null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public static void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if (head== null) {
            head = tail = newNode;
            return;
        }
        tail.next= newNode;
        tail = newNode;
    }

    public static void printLL(){
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    public static int remove1St(){
        if (head== null) {
            System.out.println("LL is empty");
            return -1;
        }
        if (size==1) {
            int val = head.data;
            head= null;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public static int removeLast(){
        if (head== null) {
            System.out.println("LL is empty");
            return -1;
        }
        if (size==1) {
            int val = head.data;
            head= null;
            return val;
        }
        Node temp = head;
        for (int i = 0; i < size-1; i++) {
            temp =temp.next;
        }
        int val = temp.data;
        temp.next = null;
        tail = temp;
        size--;
        return val;
    }


    public static void addAtIndex(int index, int data){
        Node newNode = new Node(data);
        size++;
        if (head== null) {
            head = tail = newNode;
            return;
        }
        Node temp = head;
        for (int i = 0; i < index-1; i++) {
            temp= temp.next;
        }
        newNode.next= temp.next;
        temp.next= newNode;
    }

    public static void reverse(){
        Node curr = head;
        Node prev = null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }


    public static Node midNode(){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public static boolean isPalindrome(){
        Node curr = midNode().next;    
        Node prev = null ;
        Node next;
        while (curr!=null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr= next;
        }
        Node nextL = head;
        Node nextR = prev;
        while (nextR!=null) {
            if (nextL.data != nextR.data) {
                return false;
            }
            nextL=nextL.next;
            nextR=nextR.next;
        }
        return true;
    } 
    public static void zigZag(){
        Node curr = midNode().next;
        midNode().next= null;
        Node prev = null;
        Node next;
        while (curr!=null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node Lhead = head;
        Node Rhead = prev;
        Node Lnext, Rnext;
        while (Lhead!=null && Rhead!=null) {
            Lnext = Lhead.next;
            Lhead.next = Rhead;

            Rnext = Rhead.next;
            Rhead.next = Lnext;

            Rhead = Rnext;
            Lhead = Lnext;
        }      
    }
}
