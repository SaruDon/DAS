
import java.util.*;

public class QueOne {

    public static void main(String main[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter th number");
        int a = sc.nextInt();
        if (a > 0) {
            System.out.println(+a + " No is positive");
        } else {
            System.out.println(+a + " No is Negative");
        }
    }
}
