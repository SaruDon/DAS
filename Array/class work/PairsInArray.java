
import java.util.Scanner;

public class PairsInArray {

    //Q)15
    public static void pairs(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + numbers[i] + "," + numbers[j] + ")");
            }
        }
        System.out.println();

    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int number[] = new int[size];
        System.out.println("Enter Elements");
        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }
        pairs(number);
    }
}
