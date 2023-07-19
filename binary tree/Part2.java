import java.util.*;
public class Part2 {
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
        public static class Biranrytree{

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

            public static int height(Node root) {
                if (root == null) {
                    return 1;
                }
                int lh = height(root.left);
                int rh = height(root.right);

                return Math.min(lh, rh)+1;
            }


            public static int diaMter(Node root) {
                if (root == null) {
                    return 0;
                }

                int ld = diaMter(root.left);
                int lh = height(root.left);
                int rd = diaMter(root.right);
                int rh = height(root.right);

                int seldDiameter = lh+rh +1;

                return Math.max(seldDiameter,Math.max(ld,rd));
            }


            public static class Info{
                int diameter;
                int height;
                Info(int diameter, int height){
                    this.diameter = diameter;
                    this.height = height;
                }
            }
            public static Info diaMter2(Node root) {
                if ( root == null) {
                    return new Info(0,0);
                }

                Info lI = diaMter2(root.left);
                Info rI = diaMter2(root.right);

                int diameter = Math.max((Math.max(lI.diameter, rI.diameter)),rI.height+lI.height+1);
                int height = Math.max(rI.height,lI.height)+1;

                return new Info(diameter,height);
            }
        }

        public static boolean isIdentical(Node root,Node subRoot) {
            if (root == null && subRoot==null) {
                return true;
            }
            else if(root== null || subRoot== null || root.data!=subRoot.data){
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
        
        public static boolean isSubtree(Node root,Node subRoot ) {
            if (root== null) {
                return false;
            }

            if (root.data == subRoot.data) {
                if (isIdentical(root, subRoot)) {
                    return true;
                }
            }

            return isSubtree(root.left, subRoot)  || isSubtree(root.right, subRoot);
        }

        public static class Info{
            int hd;
            Node node;
            Info(Node node, int hd){
                this.node = node;
                this.hd = hd;
            }
        }

        public static void topView(Node root) {
            Queue<Info> q = new LinkedList<>();
            HashMap<Integer,Node> map = new HashMap<>();
            int min =0;
            int max = 0;
            q.add(new Info(root, 0));
            q.add(null);

            while (!q.isEmpty()) {
                Info cuur = q.remove();
                if (cuur == null) {
                    if (q.isEmpty()) {
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    if (!map.containsKey(cuur.hd)) {
                        map.put(cuur.hd,cuur.node);
                    }

                    if (cuur.node.left != null) {
                        q.add(new Info(cuur.node.left, cuur.hd-1));
                        min = Math.min(min, cuur.hd-1);
                    }
                    if (cuur.node.right != null) {
                        q.add(new Info(cuur.node.right, cuur.hd+1));
                        max = Math.max(max, cuur.hd+1);
                    }
                }
            }

            for (int i = min; i <= max; i++) {
                System.out.println(map.get(i).data+" ");
            }
        }

        


    public static void main(String[] args) {
        // int nodes [] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        // Biranrytree tree = new Biranrytree();

        // Node root = tree.buildtree(nodes);
        // // System.out.println(root.data);
        // // System.out.println(tree.height(root));
        // // System.out.println(tree.diaMter(root));
        // System.out.println(tree.diaMter2(root).diameter);


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
        // topView(root);
        // sumTres(root);
        // preOrder(root);
    }
}
