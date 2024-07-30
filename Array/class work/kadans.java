
import java.util.*;

public class kadans {

    //Q)10
    public static void kads(int number[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for (int i = 0; i < number.length; i++) {
            cs += number[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println(ms);
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int nums[] = new int[size];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println();
        kads(nums);
    }
}
