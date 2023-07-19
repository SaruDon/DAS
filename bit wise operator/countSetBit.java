<<<<<<< HEAD
public class countSetBit {

    public static int countSetBit(int n) {
        int count =0;
        while( n> 0){
            if( (n & 1) != 0){
                count++;
            }
            n = n>> 1;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.print(countSetBit(10));
    }
}
=======
public class countSetBit {

    public static int countSetBit(int n) {
        int count =0;
        while( n> 0){
            if( (n & 1) != 0){
                count++;
            }
            n = n>> 1;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.print(countSetBit(10));
    }
}
>>>>>>> 5f7b76f325310b072c0710ea99305cfd482d2e1f
