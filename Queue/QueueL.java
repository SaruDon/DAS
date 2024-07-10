import java.util.*;

public class QueueL {
    
    public static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next= null;
        }
    }
    // public static class Queue{
    //     public static Node head= null;
    //     public static Node tail= null;

    //     public static boolean isEmpty() {
    //         return head ==null && tail== null;
    //     }

    //     public static void add(int data) {
    //         Node newNode = new Node(data);
    //         if (head== null) {
    //             head = tail= newNode;
    //             return;
    //         }
    //         tail.next = newNode;
    //         tail = newNode;  //cheack  
    //     }

    //     public static int remove() {
    //         int val =head.data;
    //         if (isEmpty()) {
    //             System.out.println("Queue is empty");
    //             return -1;
    //         }
            
            
            
    //         if (head==tail) {
    //             head=tail= null;
    //         }else{
    //             head= head.next;
    //         }
    //         return val;
    //     }


    //     public static int peek() {
    //         int val =head.data;
    //         if (isEmpty()) {
    //             System.out.println("Queue is empty");
    //             return -1;
    //         }
    //         return val;
    //     }
    // }


    
    public static void main(String[] args) {
        // Queue q = new Queue();
        Queue<Integer> q= new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }

    }
}
