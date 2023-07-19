<<<<<<< HEAD
public class spiral {


    public static void spiral(int arr[][]) {
        int startRow =0;
        int startCol =0;
        int endRow = arr.length-1;
        int endCol = arr[0].length-1;

        while(startRow<= endRow &&startCol<= endCol){


            //top
            for( int i =startCol; i<=endCol;i++){
                System.out.print(arr[startRow][i]+" ");
                
            }
            //right
            for( int j =startRow+1; j<=endRow;j++){
                System.out.print(arr[j][endRow]+" ");
                
            }
            //bottom
            for( int j=endCol-1;j>=startCol;j--){
                if(startCol==endCol){
                    break;
                }else{
                    System.out.print(arr[endRow][j]+" ");
                    
                }
            }
            //left
            for(int i =endRow-1;i>=startRow+1;i--){
                if(startRow==endRow){
                    break;
                }else{
                    System.out.print(arr[i][startCol]+" ");
                }
            }  
            startRow++;
            startCol++;
            endCol--;
            endRow--;
            }
            
            System.out.println();
        }
        

    public static void main(String[] args) {
        int arr [][] ={{1,2,3,4},
                       {5,6,7,8},
                       {9,10,11,12},
                       {13,14,15,16}};
    
        spiral(arr);               
    }
}
=======
public class spiral {


    public static void spiral(int arr[][]) {
        int startRow =0;
        int startCol =0;
        int endRow = arr.length-1;
        int endCol = arr[0].length-1;

        while(startRow<= endRow &&startCol<= endCol){


            //top
            for( int i =startCol; i<=endCol;i++){
                System.out.print(arr[startRow][i]+" ");
                
            }
            //right
            for( int j =startRow+1; j<=endRow;j++){
                System.out.print(arr[j][endRow]+" ");
                
            }
            //bottom
            for( int j=endCol-1;j>=startCol;j--){
                if(startCol==endCol){
                    break;
                }else{
                    System.out.print(arr[endRow][j]+" ");
                    
                }
            }
            //left
            for(int i =endRow-1;i>=startRow+1;i--){
                if(startRow==endRow){
                    break;
                }else{
                    System.out.print(arr[i][startCol]+" ");
                }
            }  
            startRow++;
            startCol++;
            endCol--;
            endRow--;
            }
            
            System.out.println();
        }
        

    public static void main(String[] args) {
        int arr [][] ={{1,2,3,4},
                       {5,6,7,8},
                       {9,10,11,12},
                       {13,14,15,16}};
    
        spiral(arr);               
    }
}
>>>>>>> 5f7b76f325310b072c0710ea99305cfd482d2e1f
