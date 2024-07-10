import java.util.LinkedList; 

public class Linkedlistp2 {
    
    public static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public static boolean cycle() {
        Node slow= head;
        Node fast = head;
        while (fast != null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
               return true;
            }
        }
        return false;
    }
    

    public static void remvoeCycle() {
        //dedtect
        Node slow = head;
        Node fast = head;
        boolean cycle1= false;
        while( fast != null & fast .next != null){
            slow= slow.next;
            fast = fast.next.next;
            if(fast == slow){
                cycle1= true;
                break;
            }
        }
        //

        if (cycle1= false) {
            return ;
        }
        slow = head;
        Node prev = null;
        while ( fast != slow) {
            slow= slow.next;
            prev =fast;
            fast = fast.next;
        }

        prev.next = null;

    }



    private Node merge(Node head1, Node head2) {
            Node mergeLL = new Node(-1);
            Node temp = mergeLL;

            while (head1 != null && head2!=null) {
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
            while (head != null) {
                    temp.next = head1;
                    head1 = head1.next;
                    temp= temp.next;
            }
            while (head2!=null) {
                    temp.next =head2;
                    head2 = head2.next;
                    temp = temp.next;
            }

            return mergeLL.next;
    }

    private Node getmid(Node head) {
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
        Node mid = getmid(head);
        //left half and right half 
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft =mergeSort(head);
        Node newRight = mergeSort(rightHead);
        
        
        return merge(newLeft,newRight);
        
    }
    

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

    public void print() { 
        Node temp = head ;
        while (temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    
    public static void main(String[] args) {
        // head = new Node(1);
        // Node temp = new Node(2);
        // head.next =temp;
        // head.next.next =new Node(3);
        // head.next.next.next =temp;
        // System.out.println(cycle());
        // remvoeCycle();
        // System.out.println(cycle());

        Linkedlistp2 ll = new Linkedlistp2();
        ll.addfirst(1);
        ll.addfirst(2);
        ll.addfirst(3);
        ll.addfirst(4);
        ll.addfirst(5);
        ll.print();
        ll.head = ll.mergeSort(ll.head);
        ll.print();
        
    }


    
}
