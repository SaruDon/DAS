import java.util.ArrayList;
import java.util.Map;

public class main{
    
    public static void Decending(int n) {
        if (n==1) {
            System.out.print(1+" ");
            return;
        }
        Decending(n-1);
        System.out.print(n +" ");
    }

    private static int printNoSum(int n) {
        if(n==1){
            return 1;
        }

        //kam 
        return printNoSum(n-1) +n;
    }



    private static int fact(int n) {
        if(n==0 || n==1){
            return 1;
        }
        // kam
        return fact(n-1)*n;
    }


    private static int fib(int n) {
        // base
        if(n==0 || n==1){
            return n;
        }
        //kam 
        return fib(n-1)+fib(n-2);
    }

    public static boolean isSorted(ArrayList<Integer>list,int i) {
        //base case
        if (i==list.size()-1) {
            return true;
        }
        //kam 
        if (list.get(i)>list.get(i+1)) {
            return false;
        }
        return isSorted(list,i+1);
    }


    public static int firstOcc(ArrayList<Integer>list,int i,int target) {
        //base case
        if (i==list.size()) {
            return -1;
        }
        //kam
        if (list.get(i)==target) {
            return i;
        }
        return firstOcc(list, i+1, target);
    }

    public static int power(int n , int x) {
        //base case
        if(x==1){
            return n;
        }if (x==0) {
            return 1;
        }
        //kam
        return n * power(n, x-1);
    }


    public static  int  tile(int  n) {
        if(n==1|| n ==0){
            return 1;
        }

        return tile(n-1)+tile(n-2);
    }


    public static void removeDuplicate(String str,StringBuilder sb,int i,boolean map []) {
        // base case
        if(i==str.length()){
            System.out.println(sb);
            return;
        }
        // kam
        char curr = str.charAt(i);
        if(map[curr-'a']== true){
           removeDuplicate(str,sb, i+1, map);
        }
        else{
            map[curr-'a']= true;
            removeDuplicate(str,sb.append(curr), i+1, map);
        }
        
    }

    public static int pairParty(int n) {
        //base case
        if(n==0 ||n==1){
            return 1;
        }
        //kam
        return pairParty(n-1) + (n-1)*pairParty(n-2);
    }
    

    public static void noConcOne(int n,int lastElement,StringBuilder sb) {
        //base
        if(n==0){
            System.out.println(sb);
            return;
        }
        //kam
        if(lastElement==0){
            noConcOne(n-1, 0,sb.append(0));
            noConcOne(n-1, 1,sb.append(1));
        }else{
            noConcOne(n-1,0,sb.append(0));
        }
    }
    public static void main(String[] args) {
        int n=10;
        // Decending(n);
        // System.out.println(printNoSum(n));
        // System.out.println(fact(5));
        // System.out.println(fib(5));
        // ArrayList<Integer> list= new ArrayList<>();
        // for( int i =1; i<6;i++){
        //     list.add(i);
        // }
        // list.set(1, 10);
        // System.out.println(isSorted(list, 0));
        // System.out.println(firstOcc(list, 0, 5));
        // System.out.println(power(2, 0));
        // System.out.println(tile(3));
        // String str = "appnacollege";
        // removeDuplicate(str,new StringBuilder(""),0,new boolean[26]);
        // System.out.println(pairParty(3));

        noConcOne(3,1, new StringBuilder());
    }
}