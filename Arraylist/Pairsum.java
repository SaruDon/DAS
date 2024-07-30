
import java.util.ArrayList;

public class Pairsum {
    //Q)22

    // public static boolean sum(ArrayList<Integer>sum, int target) {
    //     for (int i = 0; i < sum.size(); i++) {
    //         for (int j = 0; j < sum.size(); j++) {
    //             if(sum.get(i)+sum.get(j)==target){
    //                 return true;
    //             }
    //         }            
    //     }
    //     return false;
    // }
    public static boolean sum(ArrayList<Integer> sum, int target) {
        int lp = 0;
        int rp = sum.size() - 1;
        while (lp < rp) {
            if (sum.get(rp) + sum.get(lp) == target) {
                return true;
            }
            if (sum.get(rp) + sum.get(lp) < target) {
                lp++;
            } else {
                rp--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int target = 5;
        System.out.println(sum(list, target));
    }
}
