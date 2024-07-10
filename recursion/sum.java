public class sum {


    public static int sumOf(int n) {
        
        if( n==1){
            return 1;
        }

        int sumNm1 = sumOf(n-1);
        int sum = n+ sumNm1;
        return sum;
    }   
    public static void main(String[] args) {
        int n=5;
        System.out.println(sumOf(n));
    }
}
