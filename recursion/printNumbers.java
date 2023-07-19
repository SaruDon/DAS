

public class printNumbers {
    public static void printDec(int n) {
        if( n == 1){
            System.out.print(1);
            return;
        }
        System.out.print(" "+ n);
        printDec(n-1);
    }

    public static void printInc(int n) {
        if( n==1){
            System.out.println(n);
            return;
        }
        printInc(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        int n =10;
        printDec(n);
        System.out.println();
        printInc(n);
    }
}
