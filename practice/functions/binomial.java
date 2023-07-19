
public class binomial {

    public static int fact(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = i * fact;
        }
        return fact;
    }

    public static int binomail(int n, int r) {
        int fact_r = fact(r);
        int fact_n = fact(n);
        int fact_nr = fact(n - r);

        int binomai_coeff = fact_n / (fact_r * fact_nr);

        return binomai_coeff;

    }

    public static void main(String[] args) {
        fact(3);
        System.out.println(binomail(5, 2));
    }
}
