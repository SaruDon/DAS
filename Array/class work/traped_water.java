import java.util.regex.MatchResult;

public class traped_water {

    public static int trappedWater(int number[]) {
        int n = number.length;
        // 1st define left max boundary
        int leftMaxBoundary[] = new int[n];
        leftMaxBoundary[0] = number[0];

        // Calculationg laftmax boundary
        for (int i = 1; i < n; i++) {
            leftMaxBoundary[i] = Math.max(number[i], leftMaxBoundary[i - 1]);
        }

        // Calculationg rightmax boundary
        int rightMaxBoundary[] = new int[n];
        rightMaxBoundary[n - 1] = number[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMaxBoundary[i] = Math.max(number[i], rightMaxBoundary[i + 1]);
        }

        // loop for calculating water
        int trapedWater = 0;
        for (int i = 0; i < n; i++) {
            int Waterlevel = Math.min(rightMaxBoundary[i], leftMaxBoundary[i]);
            trapedWater += Waterlevel - number[i];
        }
        return trapedWater;
    }

    public static void main(String arg[]) {
        int hight[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(trappedWater(hight));
    }
}
