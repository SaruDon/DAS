public class LinkedList{
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data= data;
            this.next= null;
        }
    }
    static Node head;
    static Node tail;
    static int size;
    
    public static void add1st(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
        }
        newNode.next= head;
        head = newNode;
    }

    public static void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }
    
    public static void printLL(){
        if (head==null) {
            System.out.println("ll is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    public static void addMid(int data, int indx){
        if (head== null) {
            addLast(data);
        }
        Node temp = head;
        Node newNode = new Node(data);
        for (int i = 0; i < indx; i++) {
            temp = temp.next;
            if (i == indx-2) {
                newNode.next=temp.next;
                temp.next= newNode;
            }
        }
    }

    public static int remove1st(){
        if (size==0) {
            System.out.println("ll is empty");
        }
        if (size == 1) {
            int val = head.data;
            head=null;
        }
        int val= head.data;
        head = head.next;
        size--;
        return val;
    }

    public static int removeLast(){
        if (size==0) {
            System.out.println("ll is empty");
        }
        if (size == 1) {
            int val = head.data;
            head=null;
            size--;
        }
        Node temp = head;
        for (int i = 0; i < size-2; i++) {
            temp= temp.next;
        }
            int val = temp.data;
            tail = temp;
            tail.next=null;
            size--;

        return val;
    }


    public static int search(int key){
        int i=0;
        Node temp= head;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }


    public static int searchLLR(Node head, int key,int i){
        Node temp = head;
        if (temp==null) {
            return -1;
        }
        if (temp.data==key) {
            return i;
        }
        return searchLLR(temp.next, key, i+1);
    }

    public static void addAtIndex(int indx, int data){
        Node newNode = new Node(data);
        if (head == null) {
            newNode= head = tail;
            return;
        }
        Node temp = head;
        for (int i = 0; i < indx-1; i++) {
            temp= temp.next;
        }
        newNode.next= temp.next;
        temp.next=newNode;
    }
    
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add1st(1);
        ll.add1st(0);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        // ll.printLL();
        // ll.removeLast();
        // System.out.println();
        // ll.printLL();
        // System.out.println(search(5));
        // System.out.println(searchLLR(head, 2, 0));
        ll.printLL();
        ll.addAtIndex(2, 7);
        System.out.println();
        ll.printLL();
    }
}