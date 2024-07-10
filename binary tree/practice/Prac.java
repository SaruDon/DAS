import java.util.LinkedList;
import java.util.Queue;

import javax.management.Query;

public class Prac {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left=null;
            this.right=null;
        }
    }

    static int indx=-1;
    public static Node createBtree(int nodes[]){
        indx++;
        if (nodes[indx]==-1) {
            return null;
        }
        Node newNode = new Node(nodes[indx]);
        newNode.left = createBtree(nodes);
        newNode.right = createBtree(nodes);

        return newNode;
    }
    
    public static void preOrder(Node root){
        if (root== null) {
            return;
        }
        System.out.print(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void intOrder(Node root){
        if (root== null) {
            return;
        }
        intOrder(root.left);
        System.out.print(root.data);
        intOrder(root.right);
    }

    public static void postOrder(Node root){
        if (root== null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data);
    }


    public static void traversalLevel(Node root){
        if (root == null) {
            return;
        }
        Queue<Node>q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node curr = q.remove();
            if (curr ==null) {
                if (q.isEmpty()) {
                    break;
                }else{
                    q.add(curr);
                }
            }else{
                System.out.print(curr.data);
                if (curr.left!=null) {
                    q.add(curr.left);
                }
                if (curr.right!=null) {
                    q.add(curr.right);
                }
            }
        }
    }



    public static int countNodes(Node root){
        //basecase
        if (root == null) {
            return 0;
        }
        return countNodes(root.left)+ countNodes(root.right)+1;
    }


    public static int sumOfNodes(Node root){
        if (root == null) {
            return 0;
        }
        return sumOfNodes(root.left)+ sumOfNodes(root.right)+root.data;
    }

    public static void main(String[] args) {
        int arr[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Prac p = new Prac();
        Node root = p.createBtree(arr);
        System.out.println(root.data);
       // System.out.println(sumOfNodes(root));
    }
}
