
public class selection_sort {

    public static void selection(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            int minPos =i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }

            // swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int nums[] = { 5, 4, 1, 2, 3, 6 };
        selection(nums);
    }
}
