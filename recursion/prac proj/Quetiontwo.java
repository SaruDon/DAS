public class Quetiontwo {
    
    // public static void year(String str,int i) {
    //     //base
    //     if(i==str.length()){
    //         return;
    //     }
    //     //kam
    //     if(str.charAt(i)=='0'){
    //         System.out.print("zero"+" ");
    //     }
    //     if(str.charAt(i)=='1'){
    //         System.out.print("one"+" ");
    //     }
    //     if(str.charAt(i)=='2'){
    //         System.out.print("two"+" ");
    //     }
    //     if(str.charAt(i)=='3'){
    //         System.out.print("three"+" ");
    //     }
    //     if(str.charAt(i)=='4'){
    //         System.out.print("four"+" ");
    //     }
    //     if(str.charAt(i)=='5'){
    //         System.out.print("five"+" ");
    //     }
    //     if(str.charAt(i)=='6'){
    //         System.out.print("six"+" ");
    //     }
    //     if(str.charAt(i)=='7'){
    //         System.out.print("seven"+" ");
    //     }
    //     if(str.charAt(i)=='8'){
    //         System.out.print("eight"+" ");
    //     }
    //     if(str.charAt(i)=='9'){
    //         System.out.print("nine"+" ");
    //     }
    //     year(str, i+1);
    // }

    public static void year(int n) {
        String arr[] ={"zero","one","two","three","four","five","six","seven","eight","nine"};

        //base case
        if(n==0){
            return;
        }

        //kam
        int lastligit =n%10;
        int chnageNo = n/10;
        year(chnageNo);
        System.out.print(arr[lastligit] +" ");
    }
    
    public static void main(String[] args) {
        String str ="2019";
        // year(str, 0);
        int n = 2019;
        year(n);
    }
}
