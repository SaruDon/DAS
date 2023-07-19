import java.util.*;

public class factroial {

    public static void fact(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = i * fact;
        }
        System.out.println(fact);
    }

    public static void main(String[] args) {
        fact(3);
    }
}
