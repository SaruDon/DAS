public class Q2 {

    public static void print (String str,StringBuilder sb){
        int i =0; 
        while(i<str.length()-1){
            int curr=1;
            if(str.charAt(i)==str.charAt(i+1)){
                curr++;
                i++;
            }
            sb.append(str.charAt(i));
            sb.append(curr);
            i++;
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        String str ="aabbcddd";
        print(str,new StringBuilder(""));
    }
}
