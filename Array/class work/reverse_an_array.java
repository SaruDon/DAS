<<<<<<< HEAD
import java.util.*;

public class reverse_an_array {

    public static void reverse(int number[]) {
        int first = 0;
        int last = number.length - 1;
        while (first < last) {
            int temp;
            temp = number[last];
            number[last] = number[first];
            number[first] = temp;
            first++;
            last--;
        }
        System.out.print("Numbers in reverse order:");
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
        System.out.println();
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

        reverse(nums);
    }
}
=======
import java.util.*;

public class reverse_an_array {

    public static void reverse(int number[]) {
        int first = 0;
        int last = number.length - 1;
        while (first < last) {
            int temp;
            temp = number[last];
            number[last] = number[first];
            number[first] = temp;
            first++;
            last--;
        }
        System.out.print("Numbers in reverse order:");
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
        System.out.println();
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

        reverse(nums);
    }
}
>>>>>>> 5f7b76f325310b072c0710ea99305cfd482d2e1f
