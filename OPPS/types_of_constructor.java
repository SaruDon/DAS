public class types_of_constructor {
    public static void main(String[] args) {
    Student s0 = new Student();    
    Student s1 = new Student("sarvesh");
    Student s2 = new Student(5020124);    
    }
}

class Student{
    String name;
    int roll_no;

    Student(){   ////non-parameteriezed constructor
        System.out.println("Non parameterized constructor is called");
    }
    Student(String name){  //parameteriezed constructor
        this.name = name;
    }
    Student(int roll_no){
        this.roll_no = roll_no;
    }   
}