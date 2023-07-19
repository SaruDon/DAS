import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Q1{
    public static void main(String[] args) {
       int start []  = {1,3,0,5,8,6} ;
       int end [] =     {2,4,6,7,9,9};

       int activites [][] = new int[start.length][3];
       for (int i = 0; i < activites.length; i++) {
          activites[i][0]= i;
          activites[i][1]= start[i];
          activites[i][2] = end[i];
       }
       Arrays.sort(activites,Comparator.comparingDouble(o ->o[2]));

       ArrayList<Integer> ans = new ArrayList<>();

       int maxAct =1;
       int lastEnd = activites[0][2];
       ans.add(activites[0][0]);
       for (int i = 1; i < activites.length; i++) {
            if (activites[i][1] >= lastEnd ) {
                maxAct++;
                ans.add(activites[i][0]);
                lastEnd = activites[i][2];
            }
       }

       for (int i = 0; i < ans.size(); i++) {
            System.out.print("A"+ans.get(i)+" ");
       }
       System.out.println();
    }

}