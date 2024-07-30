
import java.util.*;

public class MaxOfSubArray2 {
    //Q)14

    public static void maxSubArray(int number[]) {
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[number.length];

        prefix[0] = number[0];

        for (int i = 1; i < number.length; i++) {
            prefix[i] = prefix[i - 1] - number[i];
        }

        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i; j < number.length; j++) {
                int end = j;
                int currSum = 0;

                if (start == 0) {
                    currSum = prefix[end];
                }
                currSum = prefix[end] - prefix[start - 1];

                System.out.println(currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }

            }
        }
        System.out.print("Max of subArray is:");
        System.out.print(maxSum);
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
        maxSubArray(nums);
    }
}
>>>>>>> 5f7b76f325310b072c0710ea99305cfd482d2e1f
