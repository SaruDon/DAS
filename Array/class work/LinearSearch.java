
import java.util.Scanner;

public class LinearSearch {
    //Q)12

    public static int search(int number[], int key) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int roll_num[] = new int[size];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < size; i++) {
            roll_num[i] = sc.nextInt();
        }
        System.out.println("Enter the number you want to search:");
        int want_to_find = sc.nextInt();
        int index = search(roll_num, want_to_find);
        if (index == -1) {
            System.out.println("number is not in array");
        } else {
            System.out.println("index number is: " + index);
        }
    }
}
