public class prac {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left = null;
            right=null;
        }
    }
    public static class Info{
        int diameter;
        int height;
        Info(int diameter,int height){
            this.diameter = diameter;
            this.height = height;
        }
    }
    
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

    public static Info diameter1(Node root) {
        if (root == null) {
            return new Info(0, 0);
        }

        Info leftInfo = diameter1(root.left);
        Info rightinfo =diameter1(root.right);

        int diameter = Math.max(Math.max(leftInfo.diameter, rightinfo.diameter), leftInfo.height+rightinfo.height+1);
        int height = Math.max(leftInfo.height, rightinfo.height)+1;
        
        return new Info(diameter, height);
    }


    public static void main(String[] args) {
        int nodes [] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        prac tree = new prac();

        Node root = tree.buildtree(nodes);
        System.out.println(tree.diameter1(root).diameter);
    }
}
