import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Q5 {
    public static void main(String[] args) {
        


        Integer coin[]={1,2,5,10,20,50,100,500,2000};

        Arrays.sort(coin,Comparator.reverseOrder());

        ArrayList<Integer> ans = new ArrayList<>();

        int curCountOfCoin = 0;
        int amount = 590;
        for (int i = 0; i < coin.length; i++) {
                while (coin[i]<=amount) {
                    curCountOfCoin++;
                    ans.add(coin[i]);
                    amount -= coin[i];
                } 
        }

        System.out.println(curCountOfCoin);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i)+" ");
        }
    }
}
