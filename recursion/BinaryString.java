public class BinaryString {

    public static void printBinString(int n ,int lastDigit,String str) {
        if (n==0) {
            System.out.println(str);
            return;
        }

        printBinString(n-1, 0, str+"0");
        if (lastDigit==0) {
            printBinString(n-1, 1, str+"1");
        }
    }

    public static void main(String[] args) {
        int n =3;
        printBinString(n,0,new String());
    }
}
