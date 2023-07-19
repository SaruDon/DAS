public class grid {
    
    public static int noWays(int i ,int j,int n,int m) {
        if(i==n-1 && j==m-1){
            return 1;
        }else if( i==n || j==m){
            return 0;
        }
        return noWays(i, j+1, n, m)+ noWays(i+1, j, n, m);

    }
    
    public static void main(String[] args) {
        int n =4; int m =4;
        System.out.println(noWays(0,0,n,m));
    }
}
