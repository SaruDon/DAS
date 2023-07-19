public class Q5 {
    
    public static int get(int n,int i) {
        if ((1<<i)==0) {
            return 0;
        }
        else{
            return 1;
        }
    }
    public static int set(int n, int i) {
        return n |(1<<i);
    }
    public static int clear(int n ,int i) {
        return n&~(1<<i);
    }

    public static int update(int n ,int i,int k) {
        if (k ==0) {
           return clear(n, i);
        }else{
            return set(n, i);
        }
    }

    public static int clearNBits(int n ,int i ,int j) {
        int bitA =  ((~0)<<j);
        int bitB = ~((~0)<<i);
        int Bitmask = bitA+bitB;
        return Bitmask& n;
    }

    public static boolean powOfTwo(int n) {
        if ((n&n-1)==0) {
            return true;
        }
        return false;
    }

    public static int countSetBit(int n) {
        int count=0;
        while (n>0) {
            if ((n&1)!=0) {
                count++;
            }
            n = (n>>1);
        }
        return count;
    }
    public static void main(String[] args) {
        int n = 10;
        // System.out.println(clearNBits(10, 2, 4));;
        // System.out.println(powOfTwo(n));
        System.out.println(countSetBit(9));
    }
}
