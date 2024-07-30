
public class subString {

    //Q)36
    public static void subString(String str, String ans, int i) {

        if (i == str.length()) {
            System.out.println(ans);
            return;
        }

        //yes
        subString(str, ans + str.charAt(i), i + 1);
        //no
        subString(str, ans, i + 1);
    }

    public static void main(String[] args) {
        String str = "abc";
        subString(str, "", 0);
    }
}
