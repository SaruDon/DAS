import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Contest {

    // public static int  numberOfSpecialChars(String word) {
    //     int ans =0;
    //     HashSet<Character>normal = new HashSet<>();
    //     HashSet<Character>reduced = new HashSet<>();
    //     for(int i =0; i<word.length();i++){
    //         char ch = word.charAt(i);
    //         normal.add(ch);
    //         if (Character.isLowerCase(ch)) {
    //             reduced.add(ch); 
    //         }        
    //     }
    //     for (Character ch : reduced) {
    //         char check = Character.toUpperCase(ch);
    //         if (normal.contains(check)) {
    //             ans++;
    //         }
    //     }
    //     return ans;
    // }


    public static int numberOfSpecialChars(String word) {
        // Base case: if the length of the word is less than or equal to 1, return 0
        if (word.length() <= 1) {
            return 0;
        }

        char[] charArray = word.toCharArray();
        Arrays.sort(charArray);

        // Find the middle index of the word
        int mid = word.length() / 2;

        int leftSpecialChars = countSpecialChars(charArray, 0, mid);
        int rightSpecialChars = countSpecialChars(charArray, mid, word.length());


        return leftSpecialChars + rightSpecialChars;
    }


    private static int countSpecialChars(char[] charArray, int start, int end) {
        int count = 0;
        boolean[] lowercaseFound = new boolean[26]; 

        for (int i = start; i < end; i++) {
            char ch = charArray[i];
            if (Character.isLowerCase(ch)) {
                lowercaseFound[ch - 'a'] = true; 
            } else if (Character.isUpperCase(ch) && lowercaseFound[ch - 'A']) {
                count++; 
            }
        }

        return count;
    }


    public static String countAndSay(int n) {
        if(n==1){
            return say("");
        }
        return say(countAndSay(n - 1));
    }

    public static String say(String str){
        if(str.isEmpty()){
            return "1";
        }
        if(str.length()==1){
            return "1"+str;
        } 
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            int count =1;
            for (int j = i+1; j < str.length(); j++) {
                if (str.charAt(i)!=str.charAt(j)) {
                    i=count-1;
                    break;
                }   
                count++;
            }
            sb.append(count);
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        // System.out.println(countAndSay(4));
        System.out.println(say("111221"));
    }
}
