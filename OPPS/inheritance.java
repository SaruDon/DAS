import java.sql.ShardingKeyBuilder;

public class inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.swims();
        shark.eat();
    }
}


class Animal{
    String color;
    
    void eat (){
        System.out.println("eat");
    }
     
    void breath() {
        System.out.println(" Breaths");
    }
}

class Fish extends Animal{
    int fins;
    void swims(){
        System.out.println("Fish  Swims  in water");
    }
}