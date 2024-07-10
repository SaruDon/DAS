public class fibo {

    public static int finonacci(int n) {
        if( n==0 || n==1){
            return n;
        }
        int fNm1 = finonacci(n-1);
        int fNm2 = finonacci(n-2);
        int fib = fNm1 +fNm2;
        return fib;
    }
    public static void main(String[] args) {
        int n =5;
        System.out.println(finonacci(n));
    }
}
