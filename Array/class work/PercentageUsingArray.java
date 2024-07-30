
import java.util.Scanner;

public class PercentageUsingArray {
    //Q)16

    public static void main(String arg[]) {
        int marks[] = new int[100];
        System.out.println("Enter marks of Maths:");
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        System.out.println("Enter marks of Pht:");
        marks[1] = sc.nextInt();
        System.out.println("Enter marks of Chem:");
        marks[2] = sc.nextInt();

        float percentage = (marks[0] + marks[1] + marks[2]) / 3;

        System.out.println("Percentage u got is:" + percentage + "%");
    }
}
>>>>>>> 5f7b76f325310b072c0710ea99305cfd482d2e1f
