public class palindrome {

    public static boolean palindrom(String str) {
        int n = str.length()-1;
        for( int i =0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(n-i)){
                return false;
            }
        }
        return true;
    }

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
    public static boolean equal(String str1,String str2) {
        if(str1.equals(str2)){
            return true;
        }
        return false;
    }
   
 public static void main(String[] args) {
    // String str = "madam";
    // System.out.println(palindrom(str));
    String fruit[] ={"apple","mango","banana"};

    String largest = fruit[0];
    for( int i=1;i<fruit.length;i++){
            if(largest.compareTo(fruit[i])<0){
                largest = fruit[i];
            }
        }
        System.out.println(largest); 
}
}