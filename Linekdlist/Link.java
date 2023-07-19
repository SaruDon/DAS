import java.util.LinkedList;

public class Link {
public static class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}   
public static Node head;
public static Node tail;
public static int size =1;

public void addFirst(int data){
    Node newNode = new Node(data);
    size++;
    if(head == null){
        head = tail= newNode;
        return;
    }
    newNode.next= head;
    head = newNode;
}

public void printLL() {
    Node temp = head;
    while (temp != null) {
        System.out.print(temp.data+"->");
        temp =temp.next;
    }
    System.out.println();
}


public boolean isSycle(Node head) {
    Node slow= head;
    Node fast= head;
    boolean cycle= false;
    while (fast!=null && fast.next!=null) {
        if (fast != slow) {
            return true;
        }
        slow= slow.next;
        fast = fast.next.next;
    }
    return cycle;
}

public void remove() {
    Node slow= head;
    Node fast= head;
    Boolean cycle = false;
    while (fast!=null && fast.next!=null) {
        if (fast != slow) {
            cycle = true;
            break;
        }
        slow= slow.next;
        fast = fast.next.next;
    }
    if ( cycle== false) {
        return;
    }

    Node prev= null;
    slow = head;
    while (fast != slow) {
        slow= slow.next;
        prev = fast;
        fast = fast.next;
    }
    prev.next = null;
    //
}


private Node getMid(Node head) {
    if (head == null) {
        return null; // or handle the empty list case accordingly
    }
    
    Node slow = head;
    Node fast = head.next;

    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }
    
    return slow;
}


private Node merge( Node h1, Node h2){
    Node megerLL = new Node(-1);
    Node temp= megerLL;

    while ( h1 != null && h2!= null) {
        if (h1.data<= h2.data) {
            temp.next= h1;
            h1= h1.next;
            temp = temp.next;
        }else{
            temp.next = h2;
            h2= h2.next;
            temp= temp.next;
        }

        while (h1 != null) {
            temp.next= h1;
            h1= h1.next;
            temp = temp.next;
        }
        while (h2!= null) {
            temp.next = h2;
            h2= h2.next;
            temp= temp.next;
        }
    }
    return megerLL.next;
}

public Node mergeSort(Node head) {
    if (head == null || head.next == null) {
        return head;
    }

    //find mid
    Node mid = getMid(head);
    
    // left and right
    Node rightNode = mid.next;
    mid.next=null;
    Node newLeft = mergeSort(head);
    Node newRight = mergeSort(rightNode);

    return merge(newLeft,newRight);

}

public void zigZag() {
    //mid
    Node slow = head;
    Node fast = head.next;

    while (fast != null) {
        slow = slow.next;
        fast = fast.next.next;
    }
    Node mid = slow;     
    
    //reverse 2nd half
    Node curr = mid.next;
    mid.next= null;
    Node prev = null;
    Node next;
    while ( curr!= null) {
        next = curr.next;
        curr.next = prev;
        prev=curr;
        curr = next;
    }
    
    Node left = head;
    Node right= prev;
    Node nextL, nextR;
    while (left != null && right != null) {
        nextL =left.next;
        left.next= right;
        nextR = right.next;
        nextR.next=nextL;

        left= nextL;
        right= nextR;

    }
}

public static void main(String[] args) {
    Link li = new Link();
    li.addFirst(5);
    li.addFirst(4);
    li.addFirst(3);
    li.addFirst(2);
    li.addFirst(1);
    
    
    
    li.printLL();
    // head = new Node(1);
    // Node temp = new Node(2);
    // head.next =temp;
    // head.next.next =new Node(3);
    // head.next.next.next =temp;
    // System.out.println(li.isSycle(head));
    // li.printLL();
    // li.remove();
    // li.printLL();
    
    // LinkedList<Integer> ll = new LinkedList<>();
    // ll.addFirst(5);
    // ll.addFirst(4);
    // ll.addFirst(3);
    // ll.addFirst(2);
    // System.out.println(ll);
    // li.head= li.mergeSort(li.head);
    li.zigZag();
    li.printLL();
}
}