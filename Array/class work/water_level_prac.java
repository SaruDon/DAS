<<<<<<< HEAD
public class water_level_prac {

    public static int waterLevel(int number[]) {
        int n = number.length;
        int lefMax[] = new int[n];
        lefMax[0] = number[0];
        for (int i = 1; i < n; i++) {
            lefMax[i] = Math.max(number[i], lefMax[i - 1]);
        }

        int rightMax[] = new int[n];
        rightMax[n - 1] = number[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(number[i], rightMax[i + 1]);
        }

        int trapedwater = 0;
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(rightMax[i], lefMax[i]);
            trapedwater += waterLevel - number[i];
        }
        return trapedwater;
    }

    public static void main(String arg[]) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(waterLevel(height));
    }
}
=======
public class water_level_prac {

    public static int waterLevel(int number[]) {
        int n = number.length;
        int lefMax[] = new int[n];
        lefMax[0] = number[0];
        for (int i = 1; i < n; i++) {
            lefMax[i] = Math.max(number[i], lefMax[i - 1]);
        }

        int rightMax[] = new int[n];
        rightMax[n - 1] = number[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(number[i], rightMax[i + 1]);
        }

        int trapedwater = 0;
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(rightMax[i], lefMax[i]);
            trapedwater += waterLevel - number[i];
        }
        return trapedwater;
    }

    public static void main(String arg[]) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(waterLevel(height));
    }
}
>>>>>>> 5f7b76f325310b072c0710ea99305cfd482d2e1f
