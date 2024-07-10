public class Fibbonaci{
    
    public static int fib(int f[], int n){
        if (n==0 ||n==1) {
            return n;
        }
        if (f[n]!=0) {
            return f[n];
        }
        f[n] =fib(f,n-1)+fib(f,n-2);
        return f[n];
    }
    

    public static int fibTabulation(int n){
        int arr[] = new int [n+1];
        arr[0]=0;
        arr[1]=1;
        for (int i = 2; i <=n; i++) {
            arr[i]= arr[i-1]+arr[i-2];
        }
        return arr[n];
    }
    public static void main(String[] args) {
        int n =6;
        int f[]= new int [n+1];
        // System.out.println(fib(f,n));
        System.out.println(fibTabulation(n));
    }
}