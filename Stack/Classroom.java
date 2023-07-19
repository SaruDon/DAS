import java.util.*;

import javax.swing.plaf.TextUI;

public class Classroom {
    
    
    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>(); 
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == '(' || ch=='[' || ch =='{') {
                s.push(ch);
            }else{
                //for closing bracket
                if (s.empty()) {   // special case for "))))" all clsoing string
                    return false;   
                }
                if(s.peek()=='(' && ch ==')' || s.peek()=='{' && ch =='}' || s.peek()=='[' && ch ==']'){
                    s.pop();
                }else{
                    return false;   
                }
            
            }
        }
        if (s.empty()) {
            return true;
        }else{
            return false;
        }
    }


    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>(); 
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch ==')'){
                int count=0;
                while (s.peek() !='(') {
                    s.pop();
                    count++;
                }
                if (count <1) {
                    return true;
                }else{
                    s.pop();    
                }
            }else{
                s.push(ch); //opening 
            }
        }
        return false;
    }

    public static int area(int arr[]) {
        int maxArea = 0;
        //next smallerright
        Stack<Integer> s= new Stack<>();
        int[] nsr = new int[arr.length];
        for (int i = arr.length-1; i >= 0; i--) {
            while (!s.empty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.empty()) {
                nsr[i]=arr.length;
            }else{
                nsr[i]= s.peek();
            }
            s.push(i);
        }
        //next smller left
        int[] nsl = new int[arr.length];
        s= new Stack<>();
        for (int i =0 ; i < arr.length; i++) {
            while (!s.empty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.empty()) {
                nsl[i]=-1;
            }else{
                nsl[i]= s.peek();
            }
            s.push(i);
        }
        //area
        for (int j = 0; j < arr.length; j++) {
           int height =arr[j];
           int width =nsr[j]-nsl[j]-1;
            int area = height*width;
           maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }
    public static void main(String[] args) {
        
        //Quetion5
        // Stack<Integer> s = new Stack<>();

        // int arr[] ={6,8,0,1,3};
        // int nextgreater []= new int[arr.length];
        

        // for (int i = arr.length-1; i >= 0; i--) {
        //     while (!s.empty()  && arr[s.peek()]<=arr[i]) {
        //         s.pop();
        //     }
        //     if (s.empty()) {
        //         nextgreater[i]=-1;
        //     }else{
        //         nextgreater [i] = arr[s.pop()];
        //     }

        //     s.push(i);
        // }

        // for (int i = 0; i < nextgreater.length; i++) {
        //     System.out.print(nextgreater[i] +" ");
        // }

        //Quetion 6
        
        // String str = "({()})(){})";
        // System.out.println(isValid(str));

        // //Q7
        // String str ="(a+b)";
        // System.out.println(isDuplicate(str));


        // Q 8
        int arr[] ={2,1,5,6,2,5};
        System.out.println(area(arr));

    }
}
