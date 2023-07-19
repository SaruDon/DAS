import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Q2 {
    public static void main(String[] args) {
        int val[] ={60,100,120};
        int weight [] ={10,20,30};
        int capacity =50;

        double ratio [][] = new double [val.length][2];
        //1st col is index 
        //2nd col is ratio
        for (int i = 0; i < ratio.length; i++) {
            ratio[i][0] = i;
            ratio [i][1] = val[i]/(double)weight[i];
        }

        Arrays.sort(ratio,Comparator.comparingDouble(o ->o[1]));

        int finalVal =0;
        for (int i = ratio.length-1; i >= 0; i--) {
            int indx = (int)ratio[i][0];
            if (capacity >=weight[indx]) {
                finalVal += val[indx];
                capacity -= weight[indx];
            }else{
                finalVal += (ratio[i][1]*capacity);
                capacity =0;
                break;
            }
        }
        System.out.println(finalVal);
    }
}
