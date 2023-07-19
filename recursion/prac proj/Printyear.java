import java.util.HashMap;

public class Printyear { 
    // public static void printYear(String str){
    //     HashMap<Character,String>hm = new HashMap<>();
    //     hm.put('1', "One");
    //     hm.put('2',"Two");
    //     hm.put('3',"Three");
    //     hm.put('4',"Four");
    //     hm.put('0',"zero");
    //     hm.put('9',"Nine");

    //     for (int i = 0; i < str.length(); i++) {
    //         for (Character key : hm.keySet()) {
    //             if (str.charAt(i)==key) {
    //                 System.out.print(hm.get(key)+" ");
    //                 break;
    //             }
    //         }
    //     }
    // }

    public static void printYear(String str,int i){
        if (i==str.length()) {
            return;
        }

        if (str.charAt(i)=='2') {
            System.out.println("Two");
        }
        if (str.charAt(i)=='0') {
            System.out.println("Zero");
        }
        if (str.charAt(i)=='1') {
            System.out.println("One");
        }
        if (str.charAt(i)=='9') {
            System.out.println("Nine");
        }
        printYear(str, i+1);

    }
    
    public static void main(String[] args) {
        String Str = "2019"; 
        printYear(Str,0);   
    }
}
