public class fuctionOverloading {
  public static void main(String[] args) {
    Calculator casio =new Calculator();
    System.out.println(casio.sum(1,2 ));
    System.out.println(casio.sum((float)1.3,(float)2.7 ));
    System.out.println(casio.sum(1,2,3 ));
  }  
}

class Calculator{
    
    int sum( int a ,int b){
        return a+b;
    }
    float sum( float a, float b){
        return a+b;
    }

    int sum( int a, int b ,int c){
        return a+b+c;
    }
}
