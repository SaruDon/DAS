
public class dec_bin {

    public static void decBin(int n) {
        int pow = 0;
        int bin = 0;
        while (n > 0) {
            int remainder = n % 2;
            bin = bin + (remainder * (int) Math.pow(10, pow));
            pow++;
            n = n / 2;
        }
        System.out.println(bin);
    }

    public static void main(String[] args) {
        decBin(10);
    }
}
