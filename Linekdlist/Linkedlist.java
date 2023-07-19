import javax.xml.crypto.Data;

public class Linkedlist{

    public static class Node{
        int data;
        Node next;
        
        public Node(int data){
            this.data = data;
            this.next= null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addfirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail =newNode;
            return;
        }
        newNode.next = head;
        head= newNode;
    }

    public void addlast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
             head = tail =newNode;
             return;
        }
        tail.next =newNode;
        tail= newNode;
    }

    public void print() { 
        Node temp = head ;
        while (temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }


    public void addInMiddle(int indx,int data) {
        
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i =0;
        while(i<indx-1){
            temp = temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

    public int removeFirst() {
        if(size==0){
            System.out.println("LL is empty");
            return -1;
        }
        if(size == 1){
            int val = head.data;
            head= tail = null;
            return val;
        }
        
        int val = head.data;
        head = head.next;
        size--;
        return val;

    }
    public int removedlast() {
        if(size==0){
            System.out.println("LL is empty");
            return -1;
        }
        if(size == 1){
            int val = head.data;
            head= tail = null;
            return val;
        }
        
        
        Node temp =head;
        for (int i = 0; i < size-2; i++) {
            temp= temp.next;
        }
        int val = temp.data;
        temp.next = null;
        return val;
    }

    public int searchIT(int key) {
        Node temp = head;
        int i =0;
        while (i<size) {
            if (temp.data == key) {
                return i;
            }
            temp =temp.next;
            i++;
        }
        return -1;
    }
    
    public int helper(Node head, int key) {
        if(head==null){
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int indx = helper(head.next, key);
        return indx+1;
    }
    
    public int searchRec(int key) {
        return helper(head, key);
    }


    public void reverse() {
        Node prev = null;
        Node curr= head;
        Node next; 
        while (curr != null) {
            next = curr.next;
            curr.next= prev;
            prev =curr;
            curr= next;
        }
        head= prev;
    }

    public Node mid(Node head) {
        Node slow= head;
        Node fast = head;
        while(fast !=null && fast.next != null){
            slow= slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean palindrome() {
        if (head == null || head.next == null) {
            return true;
        }
        //find mid
        Node midNode = mid(head);
        //reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev= curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;

        //check if 1st half is equal to sencond half
        while ( right != null) {
            if ( left.data != right.data) {
                return false;
            }
            left = left.next;
            right= right.next;
        }
        return true;
    }



    private static Node merge(Node head1,Node head2) {
        Node mergeLL = new Node(-1);
        Node temp = mergeLL;
        while (head1 != null && head2 !=null) {
                if (head1.data<=head2.data) {
                    temp.next = head1;
                    head1 = head1.next;
                    temp= temp.next;
                }else{
                    temp.next =head2;
                    head2 = head2.next;
                    temp = temp.next;
                }
        }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp= temp.next;
        }
        while ( head2 !=null) {
            temp.next =head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergeLL.next;
        }


    private Node getMid(){
        Node slow = head;
        Node fast = head.next;
        while (fast!= null && fast.next!= null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
    
    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }   

        //find mid
        Node mid = getMid();

        //left half and right half 
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft =mergeSort(head);
        Node newRight = mergeSort(rightHead);
        return merge(newLeft,newRight);
        
    }

    public void zigZag() {
    // find mid
    Node mid = getMid();
    //revserse 2nd half
    Node curr = mid.next;
    mid.next = null;
    Node prev = null;
    Node next;
    while(curr != null){
        next = curr.next;
        curr.next= prev;
        prev = curr;
        curr= next;
    } 
    Node left = head;
    Node right = prev;
    Node nxtLeft, nxtRight;
    // alt merge - zig zag merge
    while (left != null && right != null) {
        nxtLeft= left.next;
        left.next= right;
        nxtRight = right.next;
        right.next=nxtLeft;

        right=nxtRight;
        left=nxtLeft;
    }
    }
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        // ll.addfirst(2);
        // ll.addfirst(1);
        // ll.addlast(3);
        // ll.addlast(4);
        // //1234
        // // ll.print();
        // ll.addInMiddle(2, 10);
        // // ll.print();
        // // System.out.println("size of ll is :"+ll.size);
        // ll.addInMiddle(5, 5);
        // // ll.print();
        // // System.out.println("size of ll is :"+ll.size);
        // // System.out.println("1st element removed  from ll: "+ll.removeFirst());
        // // System.out.println("Last element removed ll: "+ll.removedlast());
        // // ll.print();
        // // System.out.println("element is at index:"+ll.searchIT(10));
        // // System.out.println("ele is at: "+ll.searchRec(10));
        // ll.reverse();
        // ll.print();
        ll.addlast(1);
        ll.addlast(2);
        ll.addlast(3);
        ll.addlast(4);
        ll.addlast(5);
        // System.out.println(ll.palindrome());
        ll.print();
        // ll.head =ll.mergeSort(ll.head);
        ll.zigZag();
        ll.print();
        
    }
}