public class abstraction {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();

        Chicken broiler = new Chicken();
        broiler.eat();
        broiler.walk();

        Mustang ford = new Mustang();
        
    }
}


abstract class Animal{
    String color;
    Animal(){
        System.out.println("animal constructor called");
    }
    /*Animal(){
        color =" Brown";
    }*/

    void eat(){
        System.out.println("eats food");
    }
    abstract void walk();
}

class Horse extends Animal{
Horse(){
    System.out.println("Horse constructor called");
}

    void changeColor(){
        color="black";
    }
    void walk(){
        System.out.println("watks on 4 legs");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor called");
    }
}

class Chicken extends Animal{

    void changeColor(){
        color="White";
    }

    void walk(){
        System.out.println("watks on 2 legs");
    }
}