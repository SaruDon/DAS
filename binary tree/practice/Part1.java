import java.lang.reflect.Array;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TooManyListenersException;

public class Part1 {
    
    public static class Node {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            right = null;
            left = null;
        }
    }
    public static class Binarytree{
        static int indx =-1;
        public static Node createTree(int [] nodes){
            indx++;
            if (nodes[indx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[indx]);
            newNode.left = createTree(nodes);
            newNode.right =createTree(nodes);

            return newNode;
        }
    } 

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        preOrder(root.left);
        System.out.print(root.data+" ");
        preOrder(root.right);
    }

    public static void postOrder(Node root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }

    public static void levelOrder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode== null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(currNode.data+" ");
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        return Math.max(height(root.left) , height(root.right))+1;
    }

    public static int countOfNode(Node root) {
        if (root == null) {
            return 0;
        }
        int leftCount = countOfNode(root.left);
        int rightCount = countOfNode(root.right);
        return rightCount+leftCount+1;
    }

    public static int sum(Node root) {
        if (root == null) {
            return 0;
        }
        return sum(root.left)+sum(root.right)+root.data;
    }

    public static int diameter(Node root) {
        if (root == null) {
            return 1;
        }

        int ld = diameter(root.left);
        int rd = diameter(root.right);

        int lh = height(root.left);
        int rh= height(root.right);

        int self = lh+rh+1;
        return Math.max(Math.max(ld,rd),self);
        }

        public static class Info{
            int height;
            int diameter;
            Info(int height, int diameter){
                this.height = height;
                this.diameter= diameter;
            }
        }

        public static Info diameter2(Node root) {
            if (root == null) {
                return  new Info(0, 0);
            }

            Info leftInfo = diameter2(root.left);
            Info rightInfo = diameter2(root.right);
            
            int height = leftInfo.height+rightInfo.height+1;
            int diameter = Math.max(Math.max(leftInfo.diameter, rightInfo.diameter), leftInfo.height+rightInfo.height+1);

            return new Info(height,diameter);

        }

        public static boolean isIdentical(Node root,Node subRoot) {
            if (root == null & subRoot == null) {
                return true;
            }
            if (root == null || subRoot == null || root.data!= subRoot.data) {
                return false;
            }

            if (!isIdentical(root.left, subRoot.left)) {
                return false;
            }
            if (!isIdentical(root.right, subRoot.right)) {
                return false;
            }
            return true;
        }

        public static boolean isSubtree(Node root, Node subRoot) {
            if (root == null) {
                return false;
            }

            boolean leftPart = isSubtree(root.left, subRoot);
            boolean rightPart = isSubtree(root.right, subRoot);

            if (root.data == subRoot.data) {
                if (isIdentical(root, subRoot)) {
                    return true;
                }else{
                    return false;
                }
            }

            return leftPart || rightPart; 
        }

    public static void printKth(Node root, int level, int k) {
        if (root == null) {
            System.out.println("is empty");
            return;
        }
        if (level == k) {
            System.out.print(root.data+" ");
            return;
        }
        printKth(root.left, level+1, k);
        printKth(root.right, level+1, k);
    }

    private static boolean getPath(Node root, int k, ArrayList<Node> q) {
        if (root == null) {
            return false;
        }   
        if (root.data ==  k) {
            return true;
        }
        q.add(root);
        if (getPath(root.left, k, q) || getPath(root.right, k, q)) {
            return true; 
        }
        q.remove(q.size()-1);
        return false;
    }
    
    
    public static Node lca(Node root,int k1, int k2) {
        if (root == null) {
            return null;
        }
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getPath(root, k1, path1);
        getPath(root,k2,path2);
        int i=0;
        for(;i<path1.size() && i<path2.size();i++){
            if (path1.get(i)!=path2.get(i)) {
                break;
            }
        }
        Node max = path1.get(i-1);
        return max;
    }

    public static Node lca2(Node root,int k1, int k2) {
        if (root == null || root.data == k1 || root.data == k2) {
            return root;
        }
        if (lca2(root.left, k1, k2) == null) {
            return lca2(root.right, k1, k2);
        }
        if (lca2(root.right, k1, k2) == null) {
            return lca2(root.left, k1, k2);
        }
        return root;
    }

    public static int lcaDiastnce(Node root,int k) {
        if (root == null) {
            return -1;
        }
        if (root.data == k) {
            return 0;
        }
        int leftDist = lcaDiastnce(root.left, k);
        int rightdist = lcaDiastnce(root.right, k);
        if (leftDist==-1 && rightdist ==-1) {
            return -1;
        }
        if(leftDist==-1){
            return rightdist+1;
        }
        else{
            return leftDist+1;
        }
    }

    public static int distance(Node root, int k1, int k2) {
        Node lca = lca2(root, k1, k2);

        int lcaLeft = lcaDiastnce(lca,k1);
        int lcaRight = lcaDiastnce(lca, k2);
        
        return lcaLeft+lcaRight+1;
    }

    public static void main(String[] args) {
        // int nodes [] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        // Binarytree tree = new Binarytree();
        // Node root = tree.createTree(nodes);
        // // System.out.println(tree.createTree(nodes).data);    
        // // preOrder(root);
        // // inOrder(root);
        // // postOrder(root);
        // // levelOrder(root);
        // // System.out.println(height(root));
        // // System.out.println(countOfNode(root));
        // // System.out.println(sum(root));
        // // System.out.println(diameter(root));
        // System.out.println(diameter2(root).diameter);


        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        Node subRoot = new Node(2);
        subRoot.left= new Node(4);
        subRoot.right = new Node(5);
        // System.out.println(isSubtree(root, subRoot));
        // int k =2;
        // printKth(root, 0, k);
        int k1 = 4,k2=6;
        // System.out.println(lca2(root, k1, k2).data);
        System.out.println(distance(root, k1, k2));
    }
}
