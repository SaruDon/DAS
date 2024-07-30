
public class oddOreven {

    public static void OddffOreven(int n) {
        int bitmask = 1;
        if ((bitmask & n) == 0) {
            System.out.println(" no is even");
        } else {
            System.out.println(" no is odd");
        }
    }

    public static void main(String[] args) {
        OddffOreven(0);
        OddffOreven(101);
    }
}
