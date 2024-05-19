import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Q{
    
    static int[] power ={1,2,4,8,16,32,64,128};

    public static ArrayList<Integer> printBinNos(int n){
        ArrayList<Integer>aa = new ArrayList<>();
        for (int i = 1; i <=n; i++) {
            aa.add(printBinary(i, 0, power));
        }
        return aa;
    } 

    public static int printBinary(int num , int ans,int arr[]){
            if (num==1) {
                ans += 1;
                return ans;
            }
            if (num==0) {
                return ans;
            }
            int pwr=0;
            for (int i = 1; i < arr.length; i++) {
                if (num<arr[i]) {
                    i--; 
                    pwr=i;
                    break;
                }
            }
            num  = num- arr[pwr];
            ans = (int) (1*Math.pow(10, pwr));
            return printBinary(num, ans, arr);
    }


    public static void generatePrintBin(int n){
        Queue<String>q = new LinkedList<>();
        q.add("1");
        while (n>0) {
            String s1 = q.peek();
            q.remove();
            System.out.println(s1);
            String s2 = s1;
            q.add(s1+"0");
            q.add(s2+"1");
            n--;
        }
    }
    
    public static void main(String arg[]){
        // System.out.println(printBinary(4, 0,power));
        // System.out.println(printBinNos(5));
        generatePrintBin(5);
    }
}