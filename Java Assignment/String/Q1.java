import java.util.Arrays;

public class Q1{
    
    public static boolean palindrome(String str1,String str2){
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length()==str2.length()) {
            char str1CharString [] = str1.toCharArray();
            char str2CharString [] = str2.toCharArray();

            Arrays.sort(str1CharString);
            Arrays.sort(str2CharString);
            if (Arrays.equals(str1CharString, str2CharString)) {
                return true;
            }
        }
        return false;
    }
    
    
    
    public static void main(String args[]){
       String str1 ="race";
       String str2 ="carb";
       System.out.print(palindrome(str1,str2));
    }
}