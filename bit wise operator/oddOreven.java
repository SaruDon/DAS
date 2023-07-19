
public class oddOreven {
     public static void oddffOreven(int n) {
        int bitmask =1;
        if( (bitmask & n) == 0){
            System.out.println(" no is even");
        }else{
            System.out.println(" no is odd");
        }
     }
    public static void main(String[] args) {
        oddffOreven(0);
        oddffOreven(101);
    }
}
