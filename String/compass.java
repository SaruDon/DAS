
public class compass {
    public static double compass(String str ) {
        int x =0;
        int y =0;
        for( int i =0; i<str.length()-1;i++){
            if(str.charAt(i)=='N'){
                y++;
            }
            else if(str.charAt(i)=='S'){
                y--;
            }
            else if(str.charAt(i)=='E'){
                x++;
            }
            else if(str.charAt(i)=='W'){
                x--;
            }
        }
        int ans2 = (int)Math.pow(x,2)+(int)Math.pow(y, 2);
        return  Math.pow(ans2, 1/2);
        
    }
    public static void main(String[] args) {
        String str ="WNEENESENNN";
    System.out.println(compass(str));
    }
}
