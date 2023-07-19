<<<<<<< HEAD
import java.security.Key;
import java.util.*;

public class binary_search {

    public static int number(int number[], int key) {
        int start = 0;
        int end = number.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;


            if (mid == key) {
                return mid;
            }
            if (mid > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
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
        System.out.println("Enter the key u want to search:");
        int a = sc.nextInt();
        number(nums, a);
    }
}
=======
import java.security.Key;
import java.util.*;

public class binary_search {

    public static int number(int number[], int key) {
        int start = 0;
        int end = number.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;


            if (mid == key) {
                return mid;
            }
            if (mid > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
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
        System.out.println("Enter the key u want to search:");
        int a = sc.nextInt();
        number(nums, a);
    }
}
>>>>>>> 5f7b76f325310b072c0710ea99305cfd482d2e1f
