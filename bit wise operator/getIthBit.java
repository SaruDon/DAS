<<<<<<< HEAD

public class getIthBit {

    public static int getithBit(int n , int i){
        int maskBit = (1<<i);
        if((maskBit & n )==0){
            return 0;
        }
    else{
        return 1;
    }
    }

    public static int setIthbit(int n, int i) {
        int bitmask = (1<<i);
        return n | bitmask;
    }

    public static int  clearBit(int n ,int i) {
        int bitMask = ~(1<<i);
        return n & bitMask;
    }

    public static int updateIthBit(int n, int i, int newBit) {
        if(newBit ==0){
            return clearBit(n, i);
        }else{
            return setIthbit(n, i);
        }
    }
    
    
    public static void main(String[] args) {
        //System.out.print(getithBit(10, 2));
        //System.out.print(setIthbit(10, 2));
      //  System.out.print(clearBit(10, 1));
        System.out.print(updateIthBit(10,2, 1));


    }
}
=======

public class getIthBit {

    public static int getithBit(int n , int i){
        int maskBit = (1<<i);
        if((maskBit & n )==0){
            return 0;
        }
    else{
        return 1;
    }
    }

    public static int setIthbit(int n, int i) {
        int bitmask = (1<<i);
        return n | bitmask;
    }

    public static int  clearBit(int n ,int i) {
        int bitMask = ~(1<<i);
        return n & bitMask;
    }

    public static int updateIthBit(int n, int i, int newBit) {
        if(newBit ==0){
            return clearBit(n, i);
        }else{
            return setIthbit(n, i);
        }
    }
    
    
    public static void main(String[] args) {
        //System.out.print(getithBit(10, 2));
        //System.out.print(setIthbit(10, 2));
      //  System.out.print(clearBit(10, 1));
        System.out.print(updateIthBit(10,2, 1));


    }
}
>>>>>>> 5f7b76f325310b072c0710ea99305cfd482d2e1f
