public class string {
    

    public static String toupperCase(String str) {
     StringBuilder sb = new StringBuilder("");

     char ch = Character.toUpperCase(str.charAt(0));
     sb.append(ch);

     for( int i=1;i<str.length();i++){
        if(str.charAt(i)== ' '){
            sb.append(str.charAt(i));
            i++;
            sb.append(Character.toUpperCase(str.charAt(i)));
        }else{
            sb.append(str.charAt(i));
        }
     }
     return sb.toString();
    }
    public static double compass(String path) {
        int x= 0;
        int y =0;
        int dist=0;
        for( int i=0; i<path.length();i++){
            char direction = path.charAt(i);
            if(direction=='W'){
                x--;
            }
            if(direction=='N'){
                y++;
            }
            if(direction=='S'){
                y--;
            }
            else{
                x++;
            }
        }
        double X2 = x*x;
        double Y2 = y*y;
        double shortestpath = Math.sqrt(X2+Y2);
        return  shortestpath;
    }
    public static boolean palindrome(String str) {
        for( int i =0 ; i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-1)){
                return false;
            }  
        }
        return true;
    }
    
    public static void main(String[] args) {
      /*   String str = "racecaiir";
        System.out.println(palindrome(str));*/
    //     String path = "WNEENESENNN";
    // System.out.println(compass(path));
    String str = "I am sarvesh";
    System.out.println(toupperCase(str));
    }
}
