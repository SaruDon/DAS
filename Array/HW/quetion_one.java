<<<<<<< HEAD
public class quetion_one {
    public static boolean ans(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String arg[]) {
        int number[] = { 1, 2, 3, 4 };
        System.out.println(ans(number));
    }
}
=======
public class quetion_one {
    public static boolean ans(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String arg[]) {
        int number[] = { 1, 2, 3, 4 };
        System.out.println(ans(number));
    }
}
>>>>>>> 5f7b76f325310b072c0710ea99305cfd482d2e1f
