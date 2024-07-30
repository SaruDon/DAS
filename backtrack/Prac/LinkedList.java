
import Pack.Node;

public class LinkedList {

    //Q)38
    public static void main(String[] args) {
        Node.add1st(2);
        Node.add1st(1);
        Node.addLast(3);
        Node.addLast(4);

        Node.printLL();

        System.out.println();

        Node.zigZag();
        Node.printLL();
        // System.out.println(Node.isPalindrome());
    }

}
