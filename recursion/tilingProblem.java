public class tilingProblem {

    public static int tiling(int n) {
        if(n==1 || n==0){
            return 1;
        }
        //vertical
        int fnm1 = tiling(n-1);
        //horizontal
        int fnm2 = tiling(n-2);
        //total number of ways
        int totalWays = fnm1+fnm2;
        return totalWays;
    }
    
    public static void main(String[] args) {
        System.out.println(tiling(4));
    }
}
