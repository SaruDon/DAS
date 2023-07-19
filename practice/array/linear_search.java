import java.util.*;

public class linear_search {

    public static int linearSearch(int number[], int key) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int largestNo(int number[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {
            if (number[i] > largest) {
                largest = number[i];
            }
        }
        return largest;
    }

    public static int binarySearch(int number[], int key) {
        int start = 0;
        int end = number.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (number[mid] == key) {
                return mid;
            }
            if (number[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void pairInArray(int number[]) {
        for (int i = 0; i < number.length; i++) {
            int curr = number[i];
            for (int j = i + 1; j < number.length; j++) {
                System.out.println("(" + curr + "," + number[j] + ")");
            }
        }
        System.out.println();
    }

    public static void reversArray(int number[]) {
        int start = 0;
        int end = number.length - 1;

        while (start < end) {
            // swap
            int temp = number[start];
            number[start] = number[end];
            number[end] = temp;

            start++;
            end--;
        }
        System.out.println(number);
    }

    public static void printSubArray(int number[]) {
        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = 1; j < number.length; j++) {
                int end = j;
                for (int k = start; k < end; k++) {
                    System.out.print(number[k] + "");
                }
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void maxSumOfSubAraay(int[] number) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i; j < number.length; j++) {
                int end = j;
                int cout = 0;
                for (int k = start; k < end; k++) {
                    cout = number[k] + cout;
                }
                if (cout > max) {
                    max = cout;
                }
                System.out.println(cout);
            }
        }
        System.out.println(max);

    }

    public static void kadans(int numkber[]) {
        int ms = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int i=0;i<numkber.length;i++){
            currentSum += numkber[i];
            if(currentSum<0){
                currentSum=0;
            }
            ms = Math.max(currentSum, ms);
        }
        System.out.println("Max"+ms);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array");
        int size = sc.nextInt();
        int marks[] = new int[size];
        System.out.println("Enter the elememts:");

        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }

        // System.out.println("Enter the value you want to search:");
        // int key = sc.nextInt();
        // System.out.println(linearSearch(marks, key));
        // System.out.println(largestNo(marks));
        // System.out.println(binarySearch(marks, key));
        // reversArray(marks);
        /*
         * for (int i = 0; i < marks.length; i++) {
         * System.out.print(marks[i]);
         * }
         */

        // pairInArray(marks);
        // printSubArray(marks);
        //maxSumOfSubAraay(marks);
        kadans(marks);
    }
}
