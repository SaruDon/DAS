

public class Q1 {
    
    public static int jumpsCount (int x ,int y,int arr[]){
        int jumps=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<x) {
                jumps++;
            }
            int h = arr[i];
            while (h>x) {
                jumps++;
                h= h-(x-y);
            }
            jumps++;

        }
        return jumps;
    }
    public static void main(String[] args) {
        int arr[] ={11,11};
        int x =10;
        int y= 1;
        System.out.println(jumpsCount(x, y, arr));
    }
}
