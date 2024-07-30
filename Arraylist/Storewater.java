
import java.util.ArrayList;

public class Storewater {
    //Q)24

    // public static int  capacity(ArrayList<Integer> height) {
    //     int max =0;
    //     for (int i = 0; i < height.size(); i++) {   
    //         for (int j = i+1; j < height.size(); j++) {
    //             int width = j-i;
    //             int ht =Math.min(height.get(i), height.get(j));
    //             int total_capacity = ht*width;
    //             max = Math.max(max, total_capacity);
    //         }
    //     }
    //     return max;
    // }
    public static int capacity(ArrayList<Integer> height) {
        int max = 0;
        int lp = 0;
        int rp = height.size() - 1;
        while (lp < rp) {
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp - lp;
            int totalCapacity = ht * width;
            max = Math.max(max, totalCapacity);
            if (lp < rp) {
                lp++;
            } else {
                rp--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(capacity(height));
    }
}
