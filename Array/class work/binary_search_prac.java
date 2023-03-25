import java.util.Scanner;

public class binary_search_prac {

    public static int binary_Search(int num[], int key) {
        int start = 0;
        int end = num.length-1;
        while (start <= end) {
            int mid = start + end / 2;
            if (key == num[mid]) {
                return mid;
            }
            if (num[mid] < key) {
                start = mid + 1;

            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = sc.nextInt();
        int number[] = new int[size];
        System.out.println(":Enter the numbers");
        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }
        System.out.println("Enter the key u want to search:");
        int key = sc.nextInt();
        System.out.println("Number u want to search is at index:" + binary_Search(number, key));
    }
}
