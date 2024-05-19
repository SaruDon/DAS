import java.util.LinkedList;
import java.util.Queue;

public class Create{
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }
    public static class Binarytree{
        static int indx =-1;
        public static Node buildtree(int nodes[]) {
            indx++;
            if (nodes[indx]==-1) {
                return null;
            }
            Node newNode = new Node(nodes[indx]);
            newNode.left = buildtree(nodes);
            newNode.right = buildtree(nodes);
            return newNode;
        }
        public static void preOrder(Node root) {
            if (root == null) {
                System.out.print(-1+" ");
                return; 
            }
            System.out.print(root.data +" ");
            preOrder(root.left);
            preOrder(root.right);
        }

        public static void inOrder(Node root) {
            if (root == null) {
                return;
            }
            inOrder(root.left);
            System.out.print(root.data+ " ");;
            inOrder(root.right);
        }
        public static void postOrder(Node root) {
            if (root == null) {
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data);
        }

        public static void levelOrder(Node root) {
            if (root == null) {
                return;
            }
             Queue<Node> q = new LinkedList<>();
             q.add(root);
             q.add(null);

             while (!q.isEmpty()) {
                Node curNode = q.remove();
                if (curNode== null) {
                   System.out.println();
                   if (q.isEmpty()) {
                    break;
                   }else{
                    q.add(null);
                   } 
                }else{
                    System.out.print(curNode.data+ " ");
                    if (curNode.left!= null) {
                        q.add(curNode.left);
                    }
                     if (curNode.right!= null) {
                        q.add(curNode.right);
                    }
                }
             }
        }
        
        public static int height(Node root) {
            if ( root == null) {
                return 0;
            }
            int lh = height(root.left);
            int rh = height(root.right);
            return Math.max(lh, rh)+1;
        }

        public static int count(Node root) {
            if (root == null) {
                return 0;
            }
            int ls = count(root.left);
            int rs = count(root.right);
            return ls+rs+1;
        }

        public static int sum(Node root) {
            if (root == null) {
                return 0;
            }

            int ls = sum(root.left);
            int rs = sum(root.right);

            return ls+rs+root.data;
        }
    }
    
    public static void main(String[] args) {
        int nodes [] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binarytree tree = new Binarytree();

        Node root = tree.buildtree(nodes);
        // System.out.println(root.data);
        // tree.preOrder(root);
        // tree.inOrder(root);
        // tree.postOrder(root);
        // tree.levelOrder(root);
        // System.out.println(tree.height(root));

        // System.out.println(tree.count(root));
        System.out.println(tree.sum(root));
    }
}