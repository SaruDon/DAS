public class BST {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data= data;
            this.left= null;
            this.right= null;
        }
    }


    public static Node insert(Node root, int val){
        if (root== null) {
            root = new Node(val);
            return root;
        }
        if (root.data>val) {
            root.left = insert(root.left, val);
        }else{
            root.right = insert(root.right, val);
        }
        return root;
    }


    public static void inOrder(Node root){
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data);
        inOrder(root.right);
    }
 
    public static boolean search(Node root ,int key){
        if (root == null) {
            return false;
        }
        else if (root.data == key) {
            return true;
        }
        else if (root.data>key) {
           return search(root.left, key);
        }else{
           return search(root.right, key);
        }
    }


    public static Node deleteNode(Node root, int val){
        if (root.data>val) {
           root.left =  deleteNode(root.left, val);
        }
        else if (root.data<val) {
            root.right =  deleteNode(root.right, val);
        }else{// root.data == val
            //case 1
            if (root.left==null &&root.right==null) {
                return null;
            }
            //case 2
            else if (root.left==null) {
                return root.right;
            }
            else if (root.right==null) {
                return root.left;
            }

            //case3
            Node IS = inorderSuccesor(root.right);
            root.data = IS.data;
            root.right = deleteNode(root.right, IS.data);
        }
        return root;
    }
    public static Node inorderSuccesor(Node root){
        while (root.left!=null) {
            root = root.left;
        }
        return root;
    }

    public static void main(String[] args) {
        int values[]= {5,1,3,4,2,7};
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        // System.out.println(search(root, 10));
        deleteNode(root, 2);
        inOrder(root);
    }

}
