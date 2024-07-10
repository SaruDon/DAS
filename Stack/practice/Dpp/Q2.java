import java.util.Stack;

public class Q2 {
    
    
    public static void path(String str){
        Stack<String>s = new Stack<>();
        StringBuilder sb = new StringBuilder("");
        String p [] = str.split("/");
        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i]);
        }
    }

    public static void main(String[] args) {
        path("/a/./b/../../c/");
    }
}
