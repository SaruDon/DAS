<<<<<<< HEAD
public class search_in_sorted_matrix {
    
    public static boolean stairCaseapproch(int matrix[][],int key){
        int row=0;
        int col =matrix[0].length-1;

        while(row < matrix.length && col>= 0){
            if(matrix[row][col]==key){
                System.out.print("value rount at ("+row+","+col+")");
                return true;
            }
            else if( key <  matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("key not found");
        return false;
    }
    
    public static void main(String[] args) {
        int matrix [] [] ={{10,20,30,40},
                           {15,25,35,45},
                           {27,29,37,48},
                           {32,33,39,50}};
         
        int key =29;
        stairCaseapproch(matrix, key);
    }
}
=======
public class search_in_sorted_matrix {
    
    public static boolean stairCaseapproch(int matrix[][],int key){
        int row=0;
        int col =matrix[0].length-1;

        while(row < matrix.length && col>= 0){
            if(matrix[row][col]==key){
                System.out.print("value rount at ("+row+","+col+")");
                return true;
            }
            else if( key <  matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("key not found");
        return false;
    }
    
    public static void main(String[] args) {
        int matrix [] [] ={{10,20,30,40},
                           {15,25,35,45},
                           {27,29,37,48},
                           {32,33,39,50}};
         
        int key =29;
        stairCaseapproch(matrix, key);
    }
}
>>>>>>> 5f7b76f325310b072c0710ea99305cfd482d2e1f
