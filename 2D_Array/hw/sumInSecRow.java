
public class sumInSecRow {

    //Q6
    public static int sum(int arr[][]) {
        int sum = 0;
        for (int j = 0; j < arr[0].length; j++) {
            sum += arr[1][j];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] nums = {{1, 4, 9},
        {11, 4, 3},
        {2, 2, 3}};
        System.out.println(sum(nums));
    }
}
