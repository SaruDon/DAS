import java.util.ArrayList;

public class Prac3 {
  
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            right = null;
            left = null;
        }
    }
    


    public static void prinK(Node root,int level,int k) {
        if (root == null) {
            System.out.println("error");
            return;
        }
        if (level == k) {
            System.out.print(root.data+ " ");
            return;
        }

        prinK(root.left, level+1, k);
        prinK(root.right, level+1, k);
    }


  public static boolean getpath(Node root,int n,ArrayList<Node> path) {
        if (root == null) {
            return false;
        }
        if (root.data == n) {
            return true;
        }

        path.add(root);
        boolean leftpath = getpath(root.left, n, path);   
        boolean rightpath = getpath(root.right, n, path); 
        
        if (rightpath || leftpath) {
            return true;
        }
        path.remove(root);
        return false;
    }


    public static Node lca(Node root ,int k1,int k2) {
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getpath(root,k1,path1);
        getpath(root, k2, path2);
        System.out.println(k1);
        System.out.println(k2);
        int i = 0;
        for (; i < path1.size() && i< path2.size(); i++) {
            if (path1.get(i) != path2.get(i)) {
                break;
            }
        }   
        Node lca = path1.get(i-1);
        return lca;
    }

    public static Node lca2(Node root, int k1, int k2) {
        if (root == null || root.data == k1 ||  root.data==k2) {
            return root;
        }
        Node leftSide = lca2(root.left, k1, k2);
        Node rightSide = lca2(root.left,k1,k2);

        if (leftSide == null) {
            return rightSide;
        }
        if (rightSide == null) {
            return leftSide;
        }
        return root;
    }

    public static int lcaDistance(Node root,int n) {
        if (root==null) {
            return -1;
        }
        if (root.data ==n) {
            return 0;
        }
        int leftDist = lcaDistance(root.left, n);
        int rightdist =lcaDistance(root.right, n);
        if (leftDist==-1 && rightdist==-1) {
            return -1;
        }else if(leftDist ==-1){
            return rightdist+1;
        }else{
            return leftDist+1;
        }
    }
    
    public static int distace(Node root, int n1, int n2) {
        Node lca = lca2(root, n1, n2);

        int dist1 =lcaDistance(root, n1);
        int dist2 =lcaDistance(root, n2);
        return dist1+dist2;
    }


    public static int lAncestor(Node root, int n, int k) {
        if (root == null) {
            return -1;
        }
        if (root.data == n){
            return 0;
        }
        int leftDistance = lAncestor(root.left, n, k);
        int rightDistance = lAncestor(root.right, leftDistance, k);

        int max = Math.max(leftDistance, rightDistance)+1;
        if (max == k) {
            return root.data;
        }
        return max;
    }
    
    public static int sumTres(Node root) {
            if (root == null) {
                return 0;
            }

            int leftSum = sumTres(root.left);
            int rightSum = sumTres(root.right);
            int data =root.data;
            int newLeft = root.left == null ? 0 : root.left.data;
            int newright = root.right == null ? 0 : root.right.data;
            root.data = leftSum +newLeft + rightSum  + newright;
            return data;
        }


        public static void preOrder(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);      

        // int k =2;
        // prinK(root, 0, k);
        int k1=4, k2=7;
        // System.out.println(lca(root, k1, k2).data);
        // System.out.println(lca2(root, k1, k2).data);s
        // System.out.println(distace(root, k1, k2));
        int n=5, k=2;
        System.out.println(lAncestor(root, n, k));
        System.out.println(lcaDistance(root, n));
        // System.out.println(sumTres(root));
        // preOrder(root); 
    }
} 